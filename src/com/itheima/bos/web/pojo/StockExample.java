package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("productno is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("productno is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("productno =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("productno <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("productno >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("productno >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("productno <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("productno <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("productno like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("productno not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("productno in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("productno not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("productno between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("productno not between", value1, value2, "productno");
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

        public Criteria andProductppIsNull() {
            addCriterion("productpp is null");
            return (Criteria) this;
        }

        public Criteria andProductppIsNotNull() {
            addCriterion("productpp is not null");
            return (Criteria) this;
        }

        public Criteria andProductppEqualTo(String value) {
            addCriterion("productpp =", value, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppNotEqualTo(String value) {
            addCriterion("productpp <>", value, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppGreaterThan(String value) {
            addCriterion("productpp >", value, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppGreaterThanOrEqualTo(String value) {
            addCriterion("productpp >=", value, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppLessThan(String value) {
            addCriterion("productpp <", value, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppLessThanOrEqualTo(String value) {
            addCriterion("productpp <=", value, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppLike(String value) {
            addCriterion("productpp like", value, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppNotLike(String value) {
            addCriterion("productpp not like", value, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppIn(List<String> values) {
            addCriterion("productpp in", values, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppNotIn(List<String> values) {
            addCriterion("productpp not in", values, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppBetween(String value1, String value2) {
            addCriterion("productpp between", value1, value2, "productpp");
            return (Criteria) this;
        }

        public Criteria andProductppNotBetween(String value1, String value2) {
            addCriterion("productpp not between", value1, value2, "productpp");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("factory is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("factory is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("factory =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("factory <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("factory >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("factory >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("factory <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("factory <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("factory like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("factory not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("factory in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("factory not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("factory between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("factory not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNull() {
            addCriterion("staffid is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffid is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(String value) {
            addCriterion("staffid =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(String value) {
            addCriterion("staffid <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(String value) {
            addCriterion("staffid >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("staffid >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(String value) {
            addCriterion("staffid <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(String value) {
            addCriterion("staffid <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLike(String value) {
            addCriterion("staffid like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotLike(String value) {
            addCriterion("staffid not like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<String> values) {
            addCriterion("staffid in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<String> values) {
            addCriterion("staffid not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(String value1, String value2) {
            addCriterion("staffid between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(String value1, String value2) {
            addCriterion("staffid not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStockdateIsNull() {
            addCriterion("stockdate is null");
            return (Criteria) this;
        }

        public Criteria andStockdateIsNotNull() {
            addCriterion("stockdate is not null");
            return (Criteria) this;
        }

        public Criteria andStockdateEqualTo(Date value) {
            addCriterion("stockdate =", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateNotEqualTo(Date value) {
            addCriterion("stockdate <>", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateGreaterThan(Date value) {
            addCriterion("stockdate >", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateGreaterThanOrEqualTo(Date value) {
            addCriterion("stockdate >=", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateLessThan(Date value) {
            addCriterion("stockdate <", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateLessThanOrEqualTo(Date value) {
            addCriterion("stockdate <=", value, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateIn(List<Date> values) {
            addCriterion("stockdate in", values, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateNotIn(List<Date> values) {
            addCriterion("stockdate not in", values, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateBetween(Date value1, Date value2) {
            addCriterion("stockdate between", value1, value2, "stockdate");
            return (Criteria) this;
        }

        public Criteria andStockdateNotBetween(Date value1, Date value2) {
            addCriterion("stockdate not between", value1, value2, "stockdate");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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