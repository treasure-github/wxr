package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderbackExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNull() {
            addCriterion("storename is null");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNotNull() {
            addCriterion("storename is not null");
            return (Criteria) this;
        }

        public Criteria andStorenameEqualTo(String value) {
            addCriterion("storename =", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotEqualTo(String value) {
            addCriterion("storename <>", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThan(String value) {
            addCriterion("storename >", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("storename >=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThan(String value) {
            addCriterion("storename <", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThanOrEqualTo(String value) {
            addCriterion("storename <=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLike(String value) {
            addCriterion("storename like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotLike(String value) {
            addCriterion("storename not like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameIn(List<String> values) {
            addCriterion("storename in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotIn(List<String> values) {
            addCriterion("storename not in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameBetween(String value1, String value2) {
            addCriterion("storename between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotBetween(String value1, String value2) {
            addCriterion("storename not between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoIsNull() {
            addCriterion("customerinfo is null");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoIsNotNull() {
            addCriterion("customerinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoEqualTo(String value) {
            addCriterion("customerinfo =", value, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoNotEqualTo(String value) {
            addCriterion("customerinfo <>", value, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoGreaterThan(String value) {
            addCriterion("customerinfo >", value, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoGreaterThanOrEqualTo(String value) {
            addCriterion("customerinfo >=", value, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoLessThan(String value) {
            addCriterion("customerinfo <", value, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoLessThanOrEqualTo(String value) {
            addCriterion("customerinfo <=", value, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoLike(String value) {
            addCriterion("customerinfo like", value, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoNotLike(String value) {
            addCriterion("customerinfo not like", value, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoIn(List<String> values) {
            addCriterion("customerinfo in", values, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoNotIn(List<String> values) {
            addCriterion("customerinfo not in", values, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoBetween(String value1, String value2) {
            addCriterion("customerinfo between", value1, value2, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andCustomerinfoNotBetween(String value1, String value2) {
            addCriterion("customerinfo not between", value1, value2, "customerinfo");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNull() {
            addCriterion("oldno is null");
            return (Criteria) this;
        }

        public Criteria andOldnoIsNotNull() {
            addCriterion("oldno is not null");
            return (Criteria) this;
        }

        public Criteria andOldnoEqualTo(String value) {
            addCriterion("oldno =", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotEqualTo(String value) {
            addCriterion("oldno <>", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThan(String value) {
            addCriterion("oldno >", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoGreaterThanOrEqualTo(String value) {
            addCriterion("oldno >=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThan(String value) {
            addCriterion("oldno <", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLessThanOrEqualTo(String value) {
            addCriterion("oldno <=", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoLike(String value) {
            addCriterion("oldno like", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotLike(String value) {
            addCriterion("oldno not like", value, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoIn(List<String> values) {
            addCriterion("oldno in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotIn(List<String> values) {
            addCriterion("oldno not in", values, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoBetween(String value1, String value2) {
            addCriterion("oldno between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andOldnoNotBetween(String value1, String value2) {
            addCriterion("oldno not between", value1, value2, "oldno");
            return (Criteria) this;
        }

        public Criteria andBacknoIsNull() {
            addCriterion("backno is null");
            return (Criteria) this;
        }

        public Criteria andBacknoIsNotNull() {
            addCriterion("backno is not null");
            return (Criteria) this;
        }

        public Criteria andBacknoEqualTo(String value) {
            addCriterion("backno =", value, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoNotEqualTo(String value) {
            addCriterion("backno <>", value, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoGreaterThan(String value) {
            addCriterion("backno >", value, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoGreaterThanOrEqualTo(String value) {
            addCriterion("backno >=", value, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoLessThan(String value) {
            addCriterion("backno <", value, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoLessThanOrEqualTo(String value) {
            addCriterion("backno <=", value, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoLike(String value) {
            addCriterion("backno like", value, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoNotLike(String value) {
            addCriterion("backno not like", value, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoIn(List<String> values) {
            addCriterion("backno in", values, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoNotIn(List<String> values) {
            addCriterion("backno not in", values, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoBetween(String value1, String value2) {
            addCriterion("backno between", value1, value2, "backno");
            return (Criteria) this;
        }

        public Criteria andBacknoNotBetween(String value1, String value2) {
            addCriterion("backno not between", value1, value2, "backno");
            return (Criteria) this;
        }

        public Criteria andRegistnameIsNull() {
            addCriterion("registname is null");
            return (Criteria) this;
        }

        public Criteria andRegistnameIsNotNull() {
            addCriterion("registname is not null");
            return (Criteria) this;
        }

        public Criteria andRegistnameEqualTo(String value) {
            addCriterion("registname =", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameNotEqualTo(String value) {
            addCriterion("registname <>", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameGreaterThan(String value) {
            addCriterion("registname >", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameGreaterThanOrEqualTo(String value) {
            addCriterion("registname >=", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameLessThan(String value) {
            addCriterion("registname <", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameLessThanOrEqualTo(String value) {
            addCriterion("registname <=", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameLike(String value) {
            addCriterion("registname like", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameNotLike(String value) {
            addCriterion("registname not like", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameIn(List<String> values) {
            addCriterion("registname in", values, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameNotIn(List<String> values) {
            addCriterion("registname not in", values, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameBetween(String value1, String value2) {
            addCriterion("registname between", value1, value2, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameNotBetween(String value1, String value2) {
            addCriterion("registname not between", value1, value2, "registname");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNull() {
            addCriterion("registtime is null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNotNull() {
            addCriterion("registtime is not null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeEqualTo(Date value) {
            addCriterion("registtime =", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotEqualTo(Date value) {
            addCriterion("registtime <>", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThan(Date value) {
            addCriterion("registtime >", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registtime >=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThan(Date value) {
            addCriterion("registtime <", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThanOrEqualTo(Date value) {
            addCriterion("registtime <=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIn(List<Date> values) {
            addCriterion("registtime in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotIn(List<Date> values) {
            addCriterion("registtime not in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeBetween(Date value1, Date value2) {
            addCriterion("registtime between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotBetween(Date value1, Date value2) {
            addCriterion("registtime not between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegistmarkIsNull() {
            addCriterion("registmark is null");
            return (Criteria) this;
        }

        public Criteria andRegistmarkIsNotNull() {
            addCriterion("registmark is not null");
            return (Criteria) this;
        }

        public Criteria andRegistmarkEqualTo(String value) {
            addCriterion("registmark =", value, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkNotEqualTo(String value) {
            addCriterion("registmark <>", value, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkGreaterThan(String value) {
            addCriterion("registmark >", value, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkGreaterThanOrEqualTo(String value) {
            addCriterion("registmark >=", value, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkLessThan(String value) {
            addCriterion("registmark <", value, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkLessThanOrEqualTo(String value) {
            addCriterion("registmark <=", value, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkLike(String value) {
            addCriterion("registmark like", value, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkNotLike(String value) {
            addCriterion("registmark not like", value, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkIn(List<String> values) {
            addCriterion("registmark in", values, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkNotIn(List<String> values) {
            addCriterion("registmark not in", values, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkBetween(String value1, String value2) {
            addCriterion("registmark between", value1, value2, "registmark");
            return (Criteria) this;
        }

        public Criteria andRegistmarkNotBetween(String value1, String value2) {
            addCriterion("registmark not between", value1, value2, "registmark");
            return (Criteria) this;
        }

        public Criteria andHandlenameIsNull() {
            addCriterion("handlename is null");
            return (Criteria) this;
        }

        public Criteria andHandlenameIsNotNull() {
            addCriterion("handlename is not null");
            return (Criteria) this;
        }

        public Criteria andHandlenameEqualTo(String value) {
            addCriterion("handlename =", value, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameNotEqualTo(String value) {
            addCriterion("handlename <>", value, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameGreaterThan(String value) {
            addCriterion("handlename >", value, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameGreaterThanOrEqualTo(String value) {
            addCriterion("handlename >=", value, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameLessThan(String value) {
            addCriterion("handlename <", value, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameLessThanOrEqualTo(String value) {
            addCriterion("handlename <=", value, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameLike(String value) {
            addCriterion("handlename like", value, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameNotLike(String value) {
            addCriterion("handlename not like", value, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameIn(List<String> values) {
            addCriterion("handlename in", values, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameNotIn(List<String> values) {
            addCriterion("handlename not in", values, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameBetween(String value1, String value2) {
            addCriterion("handlename between", value1, value2, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlenameNotBetween(String value1, String value2) {
            addCriterion("handlename not between", value1, value2, "handlename");
            return (Criteria) this;
        }

        public Criteria andHandlereasonIsNull() {
            addCriterion("handlereason is null");
            return (Criteria) this;
        }

        public Criteria andHandlereasonIsNotNull() {
            addCriterion("handlereason is not null");
            return (Criteria) this;
        }

        public Criteria andHandlereasonEqualTo(String value) {
            addCriterion("handlereason =", value, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonNotEqualTo(String value) {
            addCriterion("handlereason <>", value, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonGreaterThan(String value) {
            addCriterion("handlereason >", value, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonGreaterThanOrEqualTo(String value) {
            addCriterion("handlereason >=", value, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonLessThan(String value) {
            addCriterion("handlereason <", value, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonLessThanOrEqualTo(String value) {
            addCriterion("handlereason <=", value, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonLike(String value) {
            addCriterion("handlereason like", value, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonNotLike(String value) {
            addCriterion("handlereason not like", value, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonIn(List<String> values) {
            addCriterion("handlereason in", values, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonNotIn(List<String> values) {
            addCriterion("handlereason not in", values, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonBetween(String value1, String value2) {
            addCriterion("handlereason between", value1, value2, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandlereasonNotBetween(String value1, String value2) {
            addCriterion("handlereason not between", value1, value2, "handlereason");
            return (Criteria) this;
        }

        public Criteria andHandletimeIsNull() {
            addCriterion("handletime is null");
            return (Criteria) this;
        }

        public Criteria andHandletimeIsNotNull() {
            addCriterion("handletime is not null");
            return (Criteria) this;
        }

        public Criteria andHandletimeEqualTo(Date value) {
            addCriterion("handletime =", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeNotEqualTo(Date value) {
            addCriterion("handletime <>", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeGreaterThan(Date value) {
            addCriterion("handletime >", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handletime >=", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeLessThan(Date value) {
            addCriterion("handletime <", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeLessThanOrEqualTo(Date value) {
            addCriterion("handletime <=", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeIn(List<Date> values) {
            addCriterion("handletime in", values, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeNotIn(List<Date> values) {
            addCriterion("handletime not in", values, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeBetween(Date value1, Date value2) {
            addCriterion("handletime between", value1, value2, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeNotBetween(Date value1, Date value2) {
            addCriterion("handletime not between", value1, value2, "handletime");
            return (Criteria) this;
        }

        public Criteria andBasenameIsNull() {
            addCriterion("basename is null");
            return (Criteria) this;
        }

        public Criteria andBasenameIsNotNull() {
            addCriterion("basename is not null");
            return (Criteria) this;
        }

        public Criteria andBasenameEqualTo(String value) {
            addCriterion("basename =", value, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameNotEqualTo(String value) {
            addCriterion("basename <>", value, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameGreaterThan(String value) {
            addCriterion("basename >", value, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameGreaterThanOrEqualTo(String value) {
            addCriterion("basename >=", value, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameLessThan(String value) {
            addCriterion("basename <", value, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameLessThanOrEqualTo(String value) {
            addCriterion("basename <=", value, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameLike(String value) {
            addCriterion("basename like", value, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameNotLike(String value) {
            addCriterion("basename not like", value, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameIn(List<String> values) {
            addCriterion("basename in", values, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameNotIn(List<String> values) {
            addCriterion("basename not in", values, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameBetween(String value1, String value2) {
            addCriterion("basename between", value1, value2, "basename");
            return (Criteria) this;
        }

        public Criteria andBasenameNotBetween(String value1, String value2) {
            addCriterion("basename not between", value1, value2, "basename");
            return (Criteria) this;
        }

        public Criteria andSignstatuIsNull() {
            addCriterion("signstatu is null");
            return (Criteria) this;
        }

        public Criteria andSignstatuIsNotNull() {
            addCriterion("signstatu is not null");
            return (Criteria) this;
        }

        public Criteria andSignstatuEqualTo(String value) {
            addCriterion("signstatu =", value, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuNotEqualTo(String value) {
            addCriterion("signstatu <>", value, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuGreaterThan(String value) {
            addCriterion("signstatu >", value, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuGreaterThanOrEqualTo(String value) {
            addCriterion("signstatu >=", value, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuLessThan(String value) {
            addCriterion("signstatu <", value, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuLessThanOrEqualTo(String value) {
            addCriterion("signstatu <=", value, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuLike(String value) {
            addCriterion("signstatu like", value, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuNotLike(String value) {
            addCriterion("signstatu not like", value, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuIn(List<String> values) {
            addCriterion("signstatu in", values, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuNotIn(List<String> values) {
            addCriterion("signstatu not in", values, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuBetween(String value1, String value2) {
            addCriterion("signstatu between", value1, value2, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignstatuNotBetween(String value1, String value2) {
            addCriterion("signstatu not between", value1, value2, "signstatu");
            return (Criteria) this;
        }

        public Criteria andSignmarkIsNull() {
            addCriterion("signmark is null");
            return (Criteria) this;
        }

        public Criteria andSignmarkIsNotNull() {
            addCriterion("signmark is not null");
            return (Criteria) this;
        }

        public Criteria andSignmarkEqualTo(String value) {
            addCriterion("signmark =", value, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkNotEqualTo(String value) {
            addCriterion("signmark <>", value, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkGreaterThan(String value) {
            addCriterion("signmark >", value, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkGreaterThanOrEqualTo(String value) {
            addCriterion("signmark >=", value, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkLessThan(String value) {
            addCriterion("signmark <", value, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkLessThanOrEqualTo(String value) {
            addCriterion("signmark <=", value, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkLike(String value) {
            addCriterion("signmark like", value, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkNotLike(String value) {
            addCriterion("signmark not like", value, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkIn(List<String> values) {
            addCriterion("signmark in", values, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkNotIn(List<String> values) {
            addCriterion("signmark not in", values, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkBetween(String value1, String value2) {
            addCriterion("signmark between", value1, value2, "signmark");
            return (Criteria) this;
        }

        public Criteria andSignmarkNotBetween(String value1, String value2) {
            addCriterion("signmark not between", value1, value2, "signmark");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNull() {
            addCriterion("signtime is null");
            return (Criteria) this;
        }

        public Criteria andSigntimeIsNotNull() {
            addCriterion("signtime is not null");
            return (Criteria) this;
        }

        public Criteria andSigntimeEqualTo(Date value) {
            addCriterion("signtime =", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotEqualTo(Date value) {
            addCriterion("signtime <>", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThan(Date value) {
            addCriterion("signtime >", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signtime >=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThan(Date value) {
            addCriterion("signtime <", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeLessThanOrEqualTo(Date value) {
            addCriterion("signtime <=", value, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeIn(List<Date> values) {
            addCriterion("signtime in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotIn(List<Date> values) {
            addCriterion("signtime not in", values, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeBetween(Date value1, Date value2) {
            addCriterion("signtime between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andSigntimeNotBetween(Date value1, Date value2) {
            addCriterion("signtime not between", value1, value2, "signtime");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}