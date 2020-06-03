package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order2stockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Order2stockExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderproductidIsNull() {
            addCriterion("orderproductid is null");
            return (Criteria) this;
        }

        public Criteria andOrderproductidIsNotNull() {
            addCriterion("orderproductid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderproductidEqualTo(String value) {
            addCriterion("orderproductid =", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotEqualTo(String value) {
            addCriterion("orderproductid <>", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidGreaterThan(String value) {
            addCriterion("orderproductid >", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidGreaterThanOrEqualTo(String value) {
            addCriterion("orderproductid >=", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidLessThan(String value) {
            addCriterion("orderproductid <", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidLessThanOrEqualTo(String value) {
            addCriterion("orderproductid <=", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidLike(String value) {
            addCriterion("orderproductid like", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotLike(String value) {
            addCriterion("orderproductid not like", value, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidIn(List<String> values) {
            addCriterion("orderproductid in", values, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotIn(List<String> values) {
            addCriterion("orderproductid not in", values, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidBetween(String value1, String value2) {
            addCriterion("orderproductid between", value1, value2, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andOrderproductidNotBetween(String value1, String value2) {
            addCriterion("orderproductid not between", value1, value2, "orderproductid");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andWcztIsNull() {
            addCriterion("wczt is null");
            return (Criteria) this;
        }

        public Criteria andWcztIsNotNull() {
            addCriterion("wczt is not null");
            return (Criteria) this;
        }

        public Criteria andWcztEqualTo(String value) {
            addCriterion("wczt =", value, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztNotEqualTo(String value) {
            addCriterion("wczt <>", value, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztGreaterThan(String value) {
            addCriterion("wczt >", value, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztGreaterThanOrEqualTo(String value) {
            addCriterion("wczt >=", value, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztLessThan(String value) {
            addCriterion("wczt <", value, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztLessThanOrEqualTo(String value) {
            addCriterion("wczt <=", value, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztLike(String value) {
            addCriterion("wczt like", value, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztNotLike(String value) {
            addCriterion("wczt not like", value, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztIn(List<String> values) {
            addCriterion("wczt in", values, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztNotIn(List<String> values) {
            addCriterion("wczt not in", values, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztBetween(String value1, String value2) {
            addCriterion("wczt between", value1, value2, "wczt");
            return (Criteria) this;
        }

        public Criteria andWcztNotBetween(String value1, String value2) {
            addCriterion("wczt not between", value1, value2, "wczt");
            return (Criteria) this;
        }

        public Criteria andChangdateIsNull() {
            addCriterion("changdate is null");
            return (Criteria) this;
        }

        public Criteria andChangdateIsNotNull() {
            addCriterion("changdate is not null");
            return (Criteria) this;
        }

        public Criteria andChangdateEqualTo(Date value) {
            addCriterion("changdate =", value, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateNotEqualTo(Date value) {
            addCriterion("changdate <>", value, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateGreaterThan(Date value) {
            addCriterion("changdate >", value, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateGreaterThanOrEqualTo(Date value) {
            addCriterion("changdate >=", value, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateLessThan(Date value) {
            addCriterion("changdate <", value, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateLessThanOrEqualTo(Date value) {
            addCriterion("changdate <=", value, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateIn(List<Date> values) {
            addCriterion("changdate in", values, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateNotIn(List<Date> values) {
            addCriterion("changdate not in", values, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateBetween(Date value1, Date value2) {
            addCriterion("changdate between", value1, value2, "changdate");
            return (Criteria) this;
        }

        public Criteria andChangdateNotBetween(Date value1, Date value2) {
            addCriterion("changdate not between", value1, value2, "changdate");
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