package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InputrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InputrecordExample() {
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

        public Criteria andTypenonameIsNull() {
            addCriterion("typenoname is null");
            return (Criteria) this;
        }

        public Criteria andTypenonameIsNotNull() {
            addCriterion("typenoname is not null");
            return (Criteria) this;
        }

        public Criteria andTypenonameEqualTo(String value) {
            addCriterion("typenoname =", value, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameNotEqualTo(String value) {
            addCriterion("typenoname <>", value, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameGreaterThan(String value) {
            addCriterion("typenoname >", value, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameGreaterThanOrEqualTo(String value) {
            addCriterion("typenoname >=", value, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameLessThan(String value) {
            addCriterion("typenoname <", value, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameLessThanOrEqualTo(String value) {
            addCriterion("typenoname <=", value, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameLike(String value) {
            addCriterion("typenoname like", value, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameNotLike(String value) {
            addCriterion("typenoname not like", value, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameIn(List<String> values) {
            addCriterion("typenoname in", values, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameNotIn(List<String> values) {
            addCriterion("typenoname not in", values, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameBetween(String value1, String value2) {
            addCriterion("typenoname between", value1, value2, "typenoname");
            return (Criteria) this;
        }

        public Criteria andTypenonameNotBetween(String value1, String value2) {
            addCriterion("typenoname not between", value1, value2, "typenoname");
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

        public Criteria andConfIsNull() {
            addCriterion("conf is null");
            return (Criteria) this;
        }

        public Criteria andConfIsNotNull() {
            addCriterion("conf is not null");
            return (Criteria) this;
        }

        public Criteria andConfEqualTo(String value) {
            addCriterion("conf =", value, "conf");
            return (Criteria) this;
        }

        public Criteria andConfNotEqualTo(String value) {
            addCriterion("conf <>", value, "conf");
            return (Criteria) this;
        }

        public Criteria andConfGreaterThan(String value) {
            addCriterion("conf >", value, "conf");
            return (Criteria) this;
        }

        public Criteria andConfGreaterThanOrEqualTo(String value) {
            addCriterion("conf >=", value, "conf");
            return (Criteria) this;
        }

        public Criteria andConfLessThan(String value) {
            addCriterion("conf <", value, "conf");
            return (Criteria) this;
        }

        public Criteria andConfLessThanOrEqualTo(String value) {
            addCriterion("conf <=", value, "conf");
            return (Criteria) this;
        }

        public Criteria andConfLike(String value) {
            addCriterion("conf like", value, "conf");
            return (Criteria) this;
        }

        public Criteria andConfNotLike(String value) {
            addCriterion("conf not like", value, "conf");
            return (Criteria) this;
        }

        public Criteria andConfIn(List<String> values) {
            addCriterion("conf in", values, "conf");
            return (Criteria) this;
        }

        public Criteria andConfNotIn(List<String> values) {
            addCriterion("conf not in", values, "conf");
            return (Criteria) this;
        }

        public Criteria andConfBetween(String value1, String value2) {
            addCriterion("conf between", value1, value2, "conf");
            return (Criteria) this;
        }

        public Criteria andConfNotBetween(String value1, String value2) {
            addCriterion("conf not between", value1, value2, "conf");
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

        public Criteria andStockaddressIsNull() {
            addCriterion("stockaddress is null");
            return (Criteria) this;
        }

        public Criteria andStockaddressIsNotNull() {
            addCriterion("stockaddress is not null");
            return (Criteria) this;
        }

        public Criteria andStockaddressEqualTo(String value) {
            addCriterion("stockaddress =", value, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressNotEqualTo(String value) {
            addCriterion("stockaddress <>", value, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressGreaterThan(String value) {
            addCriterion("stockaddress >", value, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressGreaterThanOrEqualTo(String value) {
            addCriterion("stockaddress >=", value, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressLessThan(String value) {
            addCriterion("stockaddress <", value, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressLessThanOrEqualTo(String value) {
            addCriterion("stockaddress <=", value, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressLike(String value) {
            addCriterion("stockaddress like", value, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressNotLike(String value) {
            addCriterion("stockaddress not like", value, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressIn(List<String> values) {
            addCriterion("stockaddress in", values, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressNotIn(List<String> values) {
            addCriterion("stockaddress not in", values, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressBetween(String value1, String value2) {
            addCriterion("stockaddress between", value1, value2, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andStockaddressNotBetween(String value1, String value2) {
            addCriterion("stockaddress not between", value1, value2, "stockaddress");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("inputdate is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("inputdate is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("inputdate =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("inputdate <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("inputdate >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("inputdate >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("inputdate <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("inputdate <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("inputdate in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("inputdate not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("inputdate between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("inputdate not between", value1, value2, "inputdate");
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