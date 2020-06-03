package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DsTotalorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsTotalorderExample() {
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

        public Criteria andTotalorderidIsNull() {
            addCriterion("totalorderid is null");
            return (Criteria) this;
        }

        public Criteria andTotalorderidIsNotNull() {
            addCriterion("totalorderid is not null");
            return (Criteria) this;
        }

        public Criteria andTotalorderidEqualTo(String value) {
            addCriterion("totalorderid =", value, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidNotEqualTo(String value) {
            addCriterion("totalorderid <>", value, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidGreaterThan(String value) {
            addCriterion("totalorderid >", value, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidGreaterThanOrEqualTo(String value) {
            addCriterion("totalorderid >=", value, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidLessThan(String value) {
            addCriterion("totalorderid <", value, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidLessThanOrEqualTo(String value) {
            addCriterion("totalorderid <=", value, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidLike(String value) {
            addCriterion("totalorderid like", value, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidNotLike(String value) {
            addCriterion("totalorderid not like", value, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidIn(List<String> values) {
            addCriterion("totalorderid in", values, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidNotIn(List<String> values) {
            addCriterion("totalorderid not in", values, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidBetween(String value1, String value2) {
            addCriterion("totalorderid between", value1, value2, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTotalorderidNotBetween(String value1, String value2) {
            addCriterion("totalorderid not between", value1, value2, "totalorderid");
            return (Criteria) this;
        }

        public Criteria andTborderidIsNull() {
            addCriterion("tborderid is null");
            return (Criteria) this;
        }

        public Criteria andTborderidIsNotNull() {
            addCriterion("tborderid is not null");
            return (Criteria) this;
        }

        public Criteria andTborderidEqualTo(String value) {
            addCriterion("tborderid =", value, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidNotEqualTo(String value) {
            addCriterion("tborderid <>", value, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidGreaterThan(String value) {
            addCriterion("tborderid >", value, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidGreaterThanOrEqualTo(String value) {
            addCriterion("tborderid >=", value, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidLessThan(String value) {
            addCriterion("tborderid <", value, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidLessThanOrEqualTo(String value) {
            addCriterion("tborderid <=", value, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidLike(String value) {
            addCriterion("tborderid like", value, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidNotLike(String value) {
            addCriterion("tborderid not like", value, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidIn(List<String> values) {
            addCriterion("tborderid in", values, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidNotIn(List<String> values) {
            addCriterion("tborderid not in", values, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidBetween(String value1, String value2) {
            addCriterion("tborderid between", value1, value2, "tborderid");
            return (Criteria) this;
        }

        public Criteria andTborderidNotBetween(String value1, String value2) {
            addCriterion("tborderid not between", value1, value2, "tborderid");
            return (Criteria) this;
        }

        public Criteria andIstrueIsNull() {
            addCriterion("istrue is null");
            return (Criteria) this;
        }

        public Criteria andIstrueIsNotNull() {
            addCriterion("istrue is not null");
            return (Criteria) this;
        }

        public Criteria andIstrueEqualTo(String value) {
            addCriterion("istrue =", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueNotEqualTo(String value) {
            addCriterion("istrue <>", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueGreaterThan(String value) {
            addCriterion("istrue >", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueGreaterThanOrEqualTo(String value) {
            addCriterion("istrue >=", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueLessThan(String value) {
            addCriterion("istrue <", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueLessThanOrEqualTo(String value) {
            addCriterion("istrue <=", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueLike(String value) {
            addCriterion("istrue like", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueNotLike(String value) {
            addCriterion("istrue not like", value, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueIn(List<String> values) {
            addCriterion("istrue in", values, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueNotIn(List<String> values) {
            addCriterion("istrue not in", values, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueBetween(String value1, String value2) {
            addCriterion("istrue between", value1, value2, "istrue");
            return (Criteria) this;
        }

        public Criteria andIstrueNotBetween(String value1, String value2) {
            addCriterion("istrue not between", value1, value2, "istrue");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIsNull() {
            addCriterion("platformtype is null");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIsNotNull() {
            addCriterion("platformtype is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeEqualTo(String value) {
            addCriterion("platformtype =", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotEqualTo(String value) {
            addCriterion("platformtype <>", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeGreaterThan(String value) {
            addCriterion("platformtype >", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeGreaterThanOrEqualTo(String value) {
            addCriterion("platformtype >=", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLessThan(String value) {
            addCriterion("platformtype <", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLessThanOrEqualTo(String value) {
            addCriterion("platformtype <=", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeLike(String value) {
            addCriterion("platformtype like", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotLike(String value) {
            addCriterion("platformtype not like", value, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeIn(List<String> values) {
            addCriterion("platformtype in", values, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotIn(List<String> values) {
            addCriterion("platformtype not in", values, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeBetween(String value1, String value2) {
            addCriterion("platformtype between", value1, value2, "platformtype");
            return (Criteria) this;
        }

        public Criteria andPlatformtypeNotBetween(String value1, String value2) {
            addCriterion("platformtype not between", value1, value2, "platformtype");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
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