<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.serializejson.js"></script>
<%--<script src="${pageContext.request.contextPath}/js/jquery.form.js"></script>--%>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/echarts/echarts.js"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/bootstrap3-editable/js/bootstrap-editable.js"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/extensions/resizable/jquery.resizableColumns.js"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/extensions/resizable/bootstrap-table-resizable.js"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/extensions/fixed-columns/bootstrap-table-fixed-columns.js"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/extensions/editable/bootstrap-table-editable.js"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/locale/bootstrap-table-zh-CN.min.js"></script>

<script src="${pageContext.request.contextPath}/js/moment-with-locales.js"></script>
<script src="${pageContext.request.contextPath}/js/nprogress.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrapValidator.js"></script>
<script src="${pageContext.request.contextPath}/js/zh_CN.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap-datepicker/locales/bootstrap-datepicker.zh-CN.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js"
        charset="UTF-8"></script>
<script src="${pageContext.request.contextPath}/bootstrap-datetimepicker/local/bootstrap-datetimepicker.zh-CN.js"
        charset="UTF-8"></script>
<script src="${pageContext.request.contextPath}/bootstraptable/extensions/export/bootstrap-table-export.js"></script>
<script src="${pageContext.request.contextPath}/js/tableExport.js"></script>
<script src="${pageContext.request.contextPath}/js/xlsx.core.min.js"></script>
<script src="${pageContext.request.contextPath}/js/FileSaver.min.js"></script>
<script src="${pageContext.request.contextPath}/js/tip.js"></script>
<script src="${pageContext.request.contextPath}/bTabs/jquery-ui.min.js"></script>
<script src="${pageContext.request.contextPath}/bTabs/b.tabs.js"></script>


<script type="text/javascript">
    $(document).ready(function () {
        getMenu();
        // 定位菜单
        // menuPosition();

        //导航区域项目点击增加标签页处理
        $('.myMenu .dropdown-menu li a', $('#sidebar-wrapper')).on('click', function (e) {
            e.stopPropagation();
            var li = $(this).closest('li');
            var menuId = $(li).attr('mid');
            var url = $(this).attr('funurl');
            var title = $(this).text();
            $('#mainFrameTabs').bTabsAdd(menuId, title, url);
        });

        //页面table化插件的初始化
        $('#mainFrameTabs').bTabs({
            'resize': function () {
                $('#mainFrameTabs').height(document.body.clientHeight);
            },
            'sortable': true
        });

        $.fn.editable.defaults.emptytext = '——';
    });

    // 加载菜单
    function getMenu() {
        jQuery.ajax({
            type: "post",
            url: "/getMenu.action",
            dataType: "json",
            async: false,
            success: function (data) {
                var menu = "";
                var list = "";
                data.forEach(function (value) {
                    list = value.menuList;
                    menu += "  <li class=\"dropdown\">\n" +
                        "           <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">" +
                        "               <i class=\"fa fa-fw fa-plus\"></i>" + value.menu + "\n<span class=\"caret\"></span>" +
                        "           </a>\n" +
                        "           <ul class=\"dropdown-menu\" role=\"menu\">\n" +
                        "                <li class=\"dropdown-header\"></li>\n";
                    list.forEach(function (value2) {
                        menu += "<li mid='" + value2.id + "'>" +
                            "<a tabindex=\"-1\" style='text-align:center;margin-left:-20%;'  data-stopPropagation=\"true\" funurl='${pageContext.request.contextPath}/" + value2.pageAction + "'>" + value2.name + "</a>" +
                            "</li>";
                    })
                    menu += "</ul></li>\n";
                });
                jQuery(".myMenu").append(menu);
            }
        });
    }

    // 定位菜单
    function menuPosition(url) {
        jQuery('.myMenu li ul li a').toArray().filter(function (dom) {
            return dom.pathname == url;
        }).forEach(function (dom) {
            var $target = $($(dom).parent()).parent();
            $target.toggle('dropdown');
        })
    }

    var tableHeight=900;

    $(".datetimepicker").datetimepicker({
        language: 'zh-CN',
        format:'yyyy-mm-dd hh:ii:ss',
        weekStart: 1,
        todayBtn: 1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        forceParse: 0,
        showMeridian: 1
    });

    $(".datepicker").datepicker({
        language: 'zh-CN',
        format:'yyyy-mm-dd',
        autoclose: 1,
    });




    // 输入框回车事件
    function focusNextInput(thisInput) {
        var inputs = document.getElementsByTagName("input");
        for (var i = 0; i < inputs.length; i++) {
            // 如果是最后一个，则焦点回到第一个
            if (i == (inputs.length - 1)) {
                inputs[0].focus();
                break;
            } else if (thisInput == inputs[i]) {
                inputs[i + 1].focus();
                break;
            }
        }
    }

    $('#loading').hide();
    $(document).ajaxStart(function () {
        $('#loading').show();
        NProgress.start();
    });
    $(document).ajaxStop(function () {
        $('#loading').hide();
        NProgress.done();
        // NProgress.remove();
    });


    // 表单序列化
    $.fn.serializeJson = function () {
        var serializeObj = {};
        var array = this.serializeArray();
        $(array).each(function () {
            if (serializeObj[this.name]) {
                if ($.isArray(serializeObj[this.name])) {
                    serializeObj[this.name].push(this.value);
                } else {
                    serializeObj[this.name] = [serializeObj[this.name], this.value];
                }
            } else {
                serializeObj[this.name] = this.value;
            }
        });
        return serializeObj;
    };



</script>
