package com.itheima.bos.web.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DsExpressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsExpressExample() {
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

        public Criteria andExpressidIsNull() {
            addCriterion("expressid is null");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNotNull() {
            addCriterion("expressid is not null");
            return (Criteria) this;
        }

        public Criteria andExpressidEqualTo(String value) {
            addCriterion("expressid =", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotEqualTo(String value) {
            addCriterion("expressid <>", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThan(String value) {
            addCriterion("expressid >", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThanOrEqualTo(String value) {
            addCriterion("expressid >=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThan(String value) {
            addCriterion("expressid <", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThanOrEqualTo(String value) {
            addCriterion("expressid <=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLike(String value) {
            addCriterion("expressid like", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotLike(String value) {
            addCriterion("expressid not like", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidIn(List<String> values) {
            addCriterion("expressid in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotIn(List<String> values) {
            addCriterion("expressid not in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidBetween(String value1, String value2) {
            addCriterion("expressid between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotBetween(String value1, String value2) {
            addCriterion("expressid not between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andExpressnameIsNull() {
            addCriterion("expressname is null");
            return (Criteria) this;
        }

        public Criteria andExpressnameIsNotNull() {
            addCriterion("expressname is not null");
            return (Criteria) this;
        }

        public Criteria andExpressnameEqualTo(String value) {
            addCriterion("expressname =", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotEqualTo(String value) {
            addCriterion("expressname <>", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameGreaterThan(String value) {
            addCriterion("expressname >", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameGreaterThanOrEqualTo(String value) {
            addCriterion("expressname >=", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLessThan(String value) {
            addCriterion("expressname <", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLessThanOrEqualTo(String value) {
            addCriterion("expressname <=", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLike(String value) {
            addCriterion("expressname like", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotLike(String value) {
            addCriterion("expressname not like", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameIn(List<String> values) {
            addCriterion("expressname in", values, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotIn(List<String> values) {
            addCriterion("expressname not in", values, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameBetween(String value1, String value2) {
            addCriterion("expressname between", value1, value2, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotBetween(String value1, String value2) {
            addCriterion("expressname not between", value1, value2, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpresscostIsNull() {
            addCriterion("expresscost is null");
            return (Criteria) this;
        }

        public Criteria andExpresscostIsNotNull() {
            addCriterion("expresscost is not null");
            return (Criteria) this;
        }

        public Criteria andExpresscostEqualTo(BigDecimal value) {
            addCriterion("expresscost =", value, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostNotEqualTo(BigDecimal value) {
            addCriterion("expresscost <>", value, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostGreaterThan(BigDecimal value) {
            addCriterion("expresscost >", value, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expresscost >=", value, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostLessThan(BigDecimal value) {
            addCriterion("expresscost <", value, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expresscost <=", value, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostIn(List<BigDecimal> values) {
            addCriterion("expresscost in", values, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostNotIn(List<BigDecimal> values) {
            addCriterion("expresscost not in", values, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expresscost between", value1, value2, "expresscost");
            return (Criteria) this;
        }

        public Criteria andExpresscostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expresscost not between", value1, value2, "expresscost");
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