package com.itheima.bos.web.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DsModelinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsModelinfoExample() {
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

        public Criteria andModelinfoidIsNull() {
            addCriterion("modelinfoid is null");
            return (Criteria) this;
        }

        public Criteria andModelinfoidIsNotNull() {
            addCriterion("modelinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andModelinfoidEqualTo(String value) {
            addCriterion("modelinfoid =", value, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidNotEqualTo(String value) {
            addCriterion("modelinfoid <>", value, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidGreaterThan(String value) {
            addCriterion("modelinfoid >", value, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("modelinfoid >=", value, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidLessThan(String value) {
            addCriterion("modelinfoid <", value, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidLessThanOrEqualTo(String value) {
            addCriterion("modelinfoid <=", value, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidLike(String value) {
            addCriterion("modelinfoid like", value, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidNotLike(String value) {
            addCriterion("modelinfoid not like", value, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidIn(List<String> values) {
            addCriterion("modelinfoid in", values, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidNotIn(List<String> values) {
            addCriterion("modelinfoid not in", values, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidBetween(String value1, String value2) {
            addCriterion("modelinfoid between", value1, value2, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andModelinfoidNotBetween(String value1, String value2) {
            addCriterion("modelinfoid not between", value1, value2, "modelinfoid");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typename is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typename is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typename =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typename <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typename >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typename >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typename <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typename <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typename like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typename not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typename in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typename not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typename between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typename not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNull() {
            addCriterion("typeno is null");
            return (Criteria) this;
        }

        public Criteria andTypenoIsNotNull() {
            addCriterion("typeno is not null");
            return (Criteria) this;
        }

        public Criteria andTypenoEqualTo(String value) {
            addCriterion("typeno =", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotEqualTo(String value) {
            addCriterion("typeno <>", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThan(String value) {
            addCriterion("typeno >", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoGreaterThanOrEqualTo(String value) {
            addCriterion("typeno >=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThan(String value) {
            addCriterion("typeno <", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLessThanOrEqualTo(String value) {
            addCriterion("typeno <=", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoLike(String value) {
            addCriterion("typeno like", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotLike(String value) {
            addCriterion("typeno not like", value, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoIn(List<String> values) {
            addCriterion("typeno in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotIn(List<String> values) {
            addCriterion("typeno not in", values, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoBetween(String value1, String value2) {
            addCriterion("typeno between", value1, value2, "typeno");
            return (Criteria) this;
        }

        public Criteria andTypenoNotBetween(String value1, String value2) {
            addCriterion("typeno not between", value1, value2, "typeno");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameIsNull() {
            addCriterion("storeproductname is null");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameIsNotNull() {
            addCriterion("storeproductname is not null");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameEqualTo(String value) {
            addCriterion("storeproductname =", value, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameNotEqualTo(String value) {
            addCriterion("storeproductname <>", value, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameGreaterThan(String value) {
            addCriterion("storeproductname >", value, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameGreaterThanOrEqualTo(String value) {
            addCriterion("storeproductname >=", value, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameLessThan(String value) {
            addCriterion("storeproductname <", value, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameLessThanOrEqualTo(String value) {
            addCriterion("storeproductname <=", value, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameLike(String value) {
            addCriterion("storeproductname like", value, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameNotLike(String value) {
            addCriterion("storeproductname not like", value, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameIn(List<String> values) {
            addCriterion("storeproductname in", values, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameNotIn(List<String> values) {
            addCriterion("storeproductname not in", values, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameBetween(String value1, String value2) {
            addCriterion("storeproductname between", value1, value2, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andStoreproductnameNotBetween(String value1, String value2) {
            addCriterion("storeproductname not between", value1, value2, "storeproductname");
            return (Criteria) this;
        }

        public Criteria andProductcostIsNull() {
            addCriterion("productcost is null");
            return (Criteria) this;
        }

        public Criteria andProductcostIsNotNull() {
            addCriterion("productcost is not null");
            return (Criteria) this;
        }

        public Criteria andProductcostEqualTo(BigDecimal value) {
            addCriterion("productcost =", value, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostNotEqualTo(BigDecimal value) {
            addCriterion("productcost <>", value, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostGreaterThan(BigDecimal value) {
            addCriterion("productcost >", value, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productcost >=", value, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostLessThan(BigDecimal value) {
            addCriterion("productcost <", value, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productcost <=", value, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostIn(List<BigDecimal> values) {
            addCriterion("productcost in", values, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostNotIn(List<BigDecimal> values) {
            addCriterion("productcost not in", values, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productcost between", value1, value2, "productcost");
            return (Criteria) this;
        }

        public Criteria andProductcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productcost not between", value1, value2, "productcost");
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