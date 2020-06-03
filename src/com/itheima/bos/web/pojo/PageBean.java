package com.itheima.bos.web.pojo;

import java.util.List;

public class PageBean<T> {

    private Integer pageSize ;//每页显示的条数
    private Integer total ;//总记录数
    private Integer cruPage;//当前页数
    private List<T> rows; //返回结果街
    private Integer beginIndex;

    @Override
    public String toString() {
        return "PageBean{" +
                "pageSize=" + pageSize +
                ", total=" + total +
                ", cruPage=" + cruPage +
                ", rows=" + rows +
                ", beginIndex=" + beginIndex +
                '}';
    }

    public Integer getPageSize() {
        if(this.pageSize == null){
            this.pageSize=30;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCruPage() {
        if(this.cruPage == null){
            this.cruPage = 1;
        }
        return cruPage;
    }

    public void setCruPage(Integer cruPage) {
        this.cruPage = cruPage;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Integer getBeginIndex() {
        this.setBeginIndex((this.getCruPage()-1)*this.getPageSize());
        return beginIndex;
    }

    public void setBeginIndex(Integer beginIndex) {
        this.beginIndex = beginIndex;
    }
}
