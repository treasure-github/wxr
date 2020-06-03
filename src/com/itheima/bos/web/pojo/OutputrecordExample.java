package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutputrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutputrecordExample() {
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

        public Criteria andDdrecordidIsNull() {
            addCriterion("ddrecordid is null");
            return (Criteria) this;
        }

        public Criteria andDdrecordidIsNotNull() {
            addCriterion("ddrecordid is not null");
            return (Criteria) this;
        }

        public Criteria andDdrecordidEqualTo(String value) {
            addCriterion("ddrecordid =", value, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidNotEqualTo(String value) {
            addCriterion("ddrecordid <>", value, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidGreaterThan(String value) {
            addCriterion("ddrecordid >", value, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidGreaterThanOrEqualTo(String value) {
            addCriterion("ddrecordid >=", value, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidLessThan(String value) {
            addCriterion("ddrecordid <", value, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidLessThanOrEqualTo(String value) {
            addCriterion("ddrecordid <=", value, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidLike(String value) {
            addCriterion("ddrecordid like", value, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidNotLike(String value) {
            addCriterion("ddrecordid not like", value, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidIn(List<String> values) {
            addCriterion("ddrecordid in", values, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidNotIn(List<String> values) {
            addCriterion("ddrecordid not in", values, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidBetween(String value1, String value2) {
            addCriterion("ddrecordid between", value1, value2, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andDdrecordidNotBetween(String value1, String value2) {
            addCriterion("ddrecordid not between", value1, value2, "ddrecordid");
            return (Criteria) this;
        }

        public Criteria andProductorderidIsNull() {
            addCriterion("productorderid is null");
            return (Criteria) this;
        }

        public Criteria andProductorderidIsNotNull() {
            addCriterion("productorderid is not null");
            return (Criteria) this;
        }

        public Criteria andProductorderidEqualTo(String value) {
            addCriterion("productorderid =", value, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidNotEqualTo(String value) {
            addCriterion("productorderid <>", value, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidGreaterThan(String value) {
            addCriterion("productorderid >", value, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidGreaterThanOrEqualTo(String value) {
            addCriterion("productorderid >=", value, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidLessThan(String value) {
            addCriterion("productorderid <", value, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidLessThanOrEqualTo(String value) {
            addCriterion("productorderid <=", value, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidLike(String value) {
            addCriterion("productorderid like", value, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidNotLike(String value) {
            addCriterion("productorderid not like", value, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidIn(List<String> values) {
            addCriterion("productorderid in", values, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidNotIn(List<String> values) {
            addCriterion("productorderid not in", values, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidBetween(String value1, String value2) {
            addCriterion("productorderid between", value1, value2, "productorderid");
            return (Criteria) this;
        }

        public Criteria andProductorderidNotBetween(String value1, String value2) {
            addCriterion("productorderid not between", value1, value2, "productorderid");
            return (Criteria) this;
        }

        public Criteria andOutputnumIsNull() {
            addCriterion("outputnum is null");
            return (Criteria) this;
        }

        public Criteria andOutputnumIsNotNull() {
            addCriterion("outputnum is not null");
            return (Criteria) this;
        }

        public Criteria andOutputnumEqualTo(Integer value) {
            addCriterion("outputnum =", value, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumNotEqualTo(Integer value) {
            addCriterion("outputnum <>", value, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumGreaterThan(Integer value) {
            addCriterion("outputnum >", value, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("outputnum >=", value, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumLessThan(Integer value) {
            addCriterion("outputnum <", value, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumLessThanOrEqualTo(Integer value) {
            addCriterion("outputnum <=", value, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumIn(List<Integer> values) {
            addCriterion("outputnum in", values, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumNotIn(List<Integer> values) {
            addCriterion("outputnum not in", values, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumBetween(Integer value1, Integer value2) {
            addCriterion("outputnum between", value1, value2, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputnumNotBetween(Integer value1, Integer value2) {
            addCriterion("outputnum not between", value1, value2, "outputnum");
            return (Criteria) this;
        }

        public Criteria andOutputdateIsNull() {
            addCriterion("outputdate is null");
            return (Criteria) this;
        }

        public Criteria andOutputdateIsNotNull() {
            addCriterion("outputdate is not null");
            return (Criteria) this;
        }

        public Criteria andOutputdateEqualTo(Date value) {
            addCriterion("outputdate =", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateNotEqualTo(Date value) {
            addCriterion("outputdate <>", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateGreaterThan(Date value) {
            addCriterion("outputdate >", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("outputdate >=", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateLessThan(Date value) {
            addCriterion("outputdate <", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateLessThanOrEqualTo(Date value) {
            addCriterion("outputdate <=", value, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateIn(List<Date> values) {
            addCriterion("outputdate in", values, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateNotIn(List<Date> values) {
            addCriterion("outputdate not in", values, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateBetween(Date value1, Date value2) {
            addCriterion("outputdate between", value1, value2, "outputdate");
            return (Criteria) this;
        }

        public Criteria andOutputdateNotBetween(Date value1, Date value2) {
            addCriterion("outputdate not between", value1, value2, "outputdate");
            return (Criteria) this;
        }

        public Criteria andWlnoIsNull() {
            addCriterion("wlno is null");
            return (Criteria) this;
        }

        public Criteria andWlnoIsNotNull() {
            addCriterion("wlno is not null");
            return (Criteria) this;
        }

        public Criteria andWlnoEqualTo(String value) {
            addCriterion("wlno =", value, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoNotEqualTo(String value) {
            addCriterion("wlno <>", value, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoGreaterThan(String value) {
            addCriterion("wlno >", value, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoGreaterThanOrEqualTo(String value) {
            addCriterion("wlno >=", value, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoLessThan(String value) {
            addCriterion("wlno <", value, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoLessThanOrEqualTo(String value) {
            addCriterion("wlno <=", value, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoLike(String value) {
            addCriterion("wlno like", value, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoNotLike(String value) {
            addCriterion("wlno not like", value, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoIn(List<String> values) {
            addCriterion("wlno in", values, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoNotIn(List<String> values) {
            addCriterion("wlno not in", values, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoBetween(String value1, String value2) {
            addCriterion("wlno between", value1, value2, "wlno");
            return (Criteria) this;
        }

        public Criteria andWlnoNotBetween(String value1, String value2) {
            addCriterion("wlno not between", value1, value2, "wlno");
            return (Criteria) this;
        }

        public Criteria andSkfsIsNull() {
            addCriterion("skfs is null");
            return (Criteria) this;
        }

        public Criteria andSkfsIsNotNull() {
            addCriterion("skfs is not null");
            return (Criteria) this;
        }

        public Criteria andSkfsEqualTo(String value) {
            addCriterion("skfs =", value, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsNotEqualTo(String value) {
            addCriterion("skfs <>", value, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsGreaterThan(String value) {
            addCriterion("skfs >", value, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsGreaterThanOrEqualTo(String value) {
            addCriterion("skfs >=", value, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsLessThan(String value) {
            addCriterion("skfs <", value, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsLessThanOrEqualTo(String value) {
            addCriterion("skfs <=", value, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsLike(String value) {
            addCriterion("skfs like", value, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsNotLike(String value) {
            addCriterion("skfs not like", value, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsIn(List<String> values) {
            addCriterion("skfs in", values, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsNotIn(List<String> values) {
            addCriterion("skfs not in", values, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsBetween(String value1, String value2) {
            addCriterion("skfs between", value1, value2, "skfs");
            return (Criteria) this;
        }

        public Criteria andSkfsNotBetween(String value1, String value2) {
            addCriterion("skfs not between", value1, value2, "skfs");
            return (Criteria) this;
        }

        public Criteria andPrintordernoIsNull() {
            addCriterion("printorderno is null");
            return (Criteria) this;
        }

        public Criteria andPrintordernoIsNotNull() {
            addCriterion("printorderno is not null");
            return (Criteria) this;
        }

        public Criteria andPrintordernoEqualTo(String value) {
            addCriterion("printorderno =", value, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoNotEqualTo(String value) {
            addCriterion("printorderno <>", value, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoGreaterThan(String value) {
            addCriterion("printorderno >", value, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoGreaterThanOrEqualTo(String value) {
            addCriterion("printorderno >=", value, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoLessThan(String value) {
            addCriterion("printorderno <", value, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoLessThanOrEqualTo(String value) {
            addCriterion("printorderno <=", value, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoLike(String value) {
            addCriterion("printorderno like", value, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoNotLike(String value) {
            addCriterion("printorderno not like", value, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoIn(List<String> values) {
            addCriterion("printorderno in", values, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoNotIn(List<String> values) {
            addCriterion("printorderno not in", values, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoBetween(String value1, String value2) {
            addCriterion("printorderno between", value1, value2, "printorderno");
            return (Criteria) this;
        }

        public Criteria andPrintordernoNotBetween(String value1, String value2) {
            addCriterion("printorderno not between", value1, value2, "printorderno");
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