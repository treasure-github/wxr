package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustomernameIsNull() {
            addCriterion("customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNull() {
            addCriterion("customerphone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIsNotNull() {
            addCriterion("customerphone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneEqualTo(String value) {
            addCriterion("customerphone =", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotEqualTo(String value) {
            addCriterion("customerphone <>", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThan(String value) {
            addCriterion("customerphone >", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("customerphone >=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThan(String value) {
            addCriterion("customerphone <", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLessThanOrEqualTo(String value) {
            addCriterion("customerphone <=", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneLike(String value) {
            addCriterion("customerphone like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotLike(String value) {
            addCriterion("customerphone not like", value, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneIn(List<String> values) {
            addCriterion("customerphone in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotIn(List<String> values) {
            addCriterion("customerphone not in", values, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneBetween(String value1, String value2) {
            addCriterion("customerphone between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andCustomerphoneNotBetween(String value1, String value2) {
            addCriterion("customerphone not between", value1, value2, "customerphone");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andWuliunameIsNull() {
            addCriterion("wuliuname is null");
            return (Criteria) this;
        }

        public Criteria andWuliunameIsNotNull() {
            addCriterion("wuliuname is not null");
            return (Criteria) this;
        }

        public Criteria andWuliunameEqualTo(String value) {
            addCriterion("wuliuname =", value, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameNotEqualTo(String value) {
            addCriterion("wuliuname <>", value, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameGreaterThan(String value) {
            addCriterion("wuliuname >", value, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameGreaterThanOrEqualTo(String value) {
            addCriterion("wuliuname >=", value, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameLessThan(String value) {
            addCriterion("wuliuname <", value, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameLessThanOrEqualTo(String value) {
            addCriterion("wuliuname <=", value, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameLike(String value) {
            addCriterion("wuliuname like", value, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameNotLike(String value) {
            addCriterion("wuliuname not like", value, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameIn(List<String> values) {
            addCriterion("wuliuname in", values, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameNotIn(List<String> values) {
            addCriterion("wuliuname not in", values, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameBetween(String value1, String value2) {
            addCriterion("wuliuname between", value1, value2, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliunameNotBetween(String value1, String value2) {
            addCriterion("wuliuname not between", value1, value2, "wuliuname");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneIsNull() {
            addCriterion("wuliuphone is null");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneIsNotNull() {
            addCriterion("wuliuphone is not null");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneEqualTo(String value) {
            addCriterion("wuliuphone =", value, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneNotEqualTo(String value) {
            addCriterion("wuliuphone <>", value, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneGreaterThan(String value) {
            addCriterion("wuliuphone >", value, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("wuliuphone >=", value, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneLessThan(String value) {
            addCriterion("wuliuphone <", value, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneLessThanOrEqualTo(String value) {
            addCriterion("wuliuphone <=", value, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneLike(String value) {
            addCriterion("wuliuphone like", value, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneNotLike(String value) {
            addCriterion("wuliuphone not like", value, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneIn(List<String> values) {
            addCriterion("wuliuphone in", values, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneNotIn(List<String> values) {
            addCriterion("wuliuphone not in", values, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneBetween(String value1, String value2) {
            addCriterion("wuliuphone between", value1, value2, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuphoneNotBetween(String value1, String value2) {
            addCriterion("wuliuphone not between", value1, value2, "wuliuphone");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressIsNull() {
            addCriterion("wuliuaddress is null");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressIsNotNull() {
            addCriterion("wuliuaddress is not null");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressEqualTo(String value) {
            addCriterion("wuliuaddress =", value, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressNotEqualTo(String value) {
            addCriterion("wuliuaddress <>", value, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressGreaterThan(String value) {
            addCriterion("wuliuaddress >", value, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressGreaterThanOrEqualTo(String value) {
            addCriterion("wuliuaddress >=", value, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressLessThan(String value) {
            addCriterion("wuliuaddress <", value, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressLessThanOrEqualTo(String value) {
            addCriterion("wuliuaddress <=", value, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressLike(String value) {
            addCriterion("wuliuaddress like", value, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressNotLike(String value) {
            addCriterion("wuliuaddress not like", value, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressIn(List<String> values) {
            addCriterion("wuliuaddress in", values, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressNotIn(List<String> values) {
            addCriterion("wuliuaddress not in", values, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressBetween(String value1, String value2) {
            addCriterion("wuliuaddress between", value1, value2, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andWuliuaddressNotBetween(String value1, String value2) {
            addCriterion("wuliuaddress not between", value1, value2, "wuliuaddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIsNull() {
            addCriterion("customeraddress is null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIsNotNull() {
            addCriterion("customeraddress is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressEqualTo(String value) {
            addCriterion("customeraddress =", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotEqualTo(String value) {
            addCriterion("customeraddress <>", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressGreaterThan(String value) {
            addCriterion("customeraddress >", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressGreaterThanOrEqualTo(String value) {
            addCriterion("customeraddress >=", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLessThan(String value) {
            addCriterion("customeraddress <", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLessThanOrEqualTo(String value) {
            addCriterion("customeraddress <=", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressLike(String value) {
            addCriterion("customeraddress like", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotLike(String value) {
            addCriterion("customeraddress not like", value, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressIn(List<String> values) {
            addCriterion("customeraddress in", values, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotIn(List<String> values) {
            addCriterion("customeraddress not in", values, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressBetween(String value1, String value2) {
            addCriterion("customeraddress between", value1, value2, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andCustomeraddressNotBetween(String value1, String value2) {
            addCriterion("customeraddress not between", value1, value2, "customeraddress");
            return (Criteria) this;
        }

        public Criteria andLastordertimeIsNull() {
            addCriterion("lastordertime is null");
            return (Criteria) this;
        }

        public Criteria andLastordertimeIsNotNull() {
            addCriterion("lastordertime is not null");
            return (Criteria) this;
        }

        public Criteria andLastordertimeEqualTo(Date value) {
            addCriterion("lastordertime =", value, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeNotEqualTo(Date value) {
            addCriterion("lastordertime <>", value, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeGreaterThan(Date value) {
            addCriterion("lastordertime >", value, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastordertime >=", value, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeLessThan(Date value) {
            addCriterion("lastordertime <", value, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeLessThanOrEqualTo(Date value) {
            addCriterion("lastordertime <=", value, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeIn(List<Date> values) {
            addCriterion("lastordertime in", values, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeNotIn(List<Date> values) {
            addCriterion("lastordertime not in", values, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeBetween(Date value1, Date value2) {
            addCriterion("lastordertime between", value1, value2, "lastordertime");
            return (Criteria) this;
        }

        public Criteria andLastordertimeNotBetween(Date value1, Date value2) {
            addCriterion("lastordertime not between", value1, value2, "lastordertime");
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