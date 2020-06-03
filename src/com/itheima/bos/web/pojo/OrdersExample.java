package com.itheima.bos.web.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andStaffnoIsNull() {
            addCriterion("staffno is null");
            return (Criteria) this;
        }

        public Criteria andStaffnoIsNotNull() {
            addCriterion("staffno is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnoEqualTo(String value) {
            addCriterion("staffno =", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotEqualTo(String value) {
            addCriterion("staffno <>", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoGreaterThan(String value) {
            addCriterion("staffno >", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoGreaterThanOrEqualTo(String value) {
            addCriterion("staffno >=", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLessThan(String value) {
            addCriterion("staffno <", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLessThanOrEqualTo(String value) {
            addCriterion("staffno <=", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLike(String value) {
            addCriterion("staffno like", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotLike(String value) {
            addCriterion("staffno not like", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoIn(List<String> values) {
            addCriterion("staffno in", values, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotIn(List<String> values) {
            addCriterion("staffno not in", values, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoBetween(String value1, String value2) {
            addCriterion("staffno between", value1, value2, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotBetween(String value1, String value2) {
            addCriterion("staffno not between", value1, value2, "staffno");
            return (Criteria) this;
        }

        public Criteria andFhfsIsNull() {
            addCriterion("fhfs is null");
            return (Criteria) this;
        }

        public Criteria andFhfsIsNotNull() {
            addCriterion("fhfs is not null");
            return (Criteria) this;
        }

        public Criteria andFhfsEqualTo(String value) {
            addCriterion("fhfs =", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsNotEqualTo(String value) {
            addCriterion("fhfs <>", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsGreaterThan(String value) {
            addCriterion("fhfs >", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsGreaterThanOrEqualTo(String value) {
            addCriterion("fhfs >=", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsLessThan(String value) {
            addCriterion("fhfs <", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsLessThanOrEqualTo(String value) {
            addCriterion("fhfs <=", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsLike(String value) {
            addCriterion("fhfs like", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsNotLike(String value) {
            addCriterion("fhfs not like", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsIn(List<String> values) {
            addCriterion("fhfs in", values, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsNotIn(List<String> values) {
            addCriterion("fhfs not in", values, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsBetween(String value1, String value2) {
            addCriterion("fhfs between", value1, value2, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsNotBetween(String value1, String value2) {
            addCriterion("fhfs not between", value1, value2, "fhfs");
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

        public Criteria andOrderdateIsNull() {
            addCriterion("orderdate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderdate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterion("orderdate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterion("orderdate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterion("orderdate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterion("orderdate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterion("orderdate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterion("orderdate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterion("orderdate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterion("orderdate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterion("orderdate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterion("orderdate not between", value1, value2, "orderdate");
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

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andDingjinIsNull() {
            addCriterion("dingjin is null");
            return (Criteria) this;
        }

        public Criteria andDingjinIsNotNull() {
            addCriterion("dingjin is not null");
            return (Criteria) this;
        }

        public Criteria andDingjinEqualTo(BigDecimal value) {
            addCriterion("dingjin =", value, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinNotEqualTo(BigDecimal value) {
            addCriterion("dingjin <>", value, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinGreaterThan(BigDecimal value) {
            addCriterion("dingjin >", value, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dingjin >=", value, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinLessThan(BigDecimal value) {
            addCriterion("dingjin <", value, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dingjin <=", value, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinIn(List<BigDecimal> values) {
            addCriterion("dingjin in", values, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinNotIn(List<BigDecimal> values) {
            addCriterion("dingjin not in", values, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dingjin between", value1, value2, "dingjin");
            return (Criteria) this;
        }

        public Criteria andDingjinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dingjin not between", value1, value2, "dingjin");
            return (Criteria) this;
        }

        public Criteria andSumpriceIsNull() {
            addCriterion("sumprice is null");
            return (Criteria) this;
        }

        public Criteria andSumpriceIsNotNull() {
            addCriterion("sumprice is not null");
            return (Criteria) this;
        }

        public Criteria andSumpriceEqualTo(BigDecimal value) {
            addCriterion("sumprice =", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceNotEqualTo(BigDecimal value) {
            addCriterion("sumprice <>", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceGreaterThan(BigDecimal value) {
            addCriterion("sumprice >", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sumprice >=", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceLessThan(BigDecimal value) {
            addCriterion("sumprice <", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sumprice <=", value, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceIn(List<BigDecimal> values) {
            addCriterion("sumprice in", values, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceNotIn(List<BigDecimal> values) {
            addCriterion("sumprice not in", values, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sumprice between", value1, value2, "sumprice");
            return (Criteria) this;
        }

        public Criteria andSumpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sumprice not between", value1, value2, "sumprice");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyIsNull() {
            addCriterion("collectionmoney is null");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyIsNotNull() {
            addCriterion("collectionmoney is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyEqualTo(BigDecimal value) {
            addCriterion("collectionmoney =", value, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyNotEqualTo(BigDecimal value) {
            addCriterion("collectionmoney <>", value, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyGreaterThan(BigDecimal value) {
            addCriterion("collectionmoney >", value, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collectionmoney >=", value, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyLessThan(BigDecimal value) {
            addCriterion("collectionmoney <", value, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collectionmoney <=", value, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyIn(List<BigDecimal> values) {
            addCriterion("collectionmoney in", values, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyNotIn(List<BigDecimal> values) {
            addCriterion("collectionmoney not in", values, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collectionmoney between", value1, value2, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collectionmoney not between", value1, value2, "collectionmoney");
            return (Criteria) this;
        }

        public Criteria andCollectionwayIsNull() {
            addCriterion("collectionway is null");
            return (Criteria) this;
        }

        public Criteria andCollectionwayIsNotNull() {
            addCriterion("collectionway is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionwayEqualTo(String value) {
            addCriterion("collectionway =", value, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayNotEqualTo(String value) {
            addCriterion("collectionway <>", value, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayGreaterThan(String value) {
            addCriterion("collectionway >", value, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayGreaterThanOrEqualTo(String value) {
            addCriterion("collectionway >=", value, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayLessThan(String value) {
            addCriterion("collectionway <", value, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayLessThanOrEqualTo(String value) {
            addCriterion("collectionway <=", value, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayLike(String value) {
            addCriterion("collectionway like", value, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayNotLike(String value) {
            addCriterion("collectionway not like", value, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayIn(List<String> values) {
            addCriterion("collectionway in", values, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayNotIn(List<String> values) {
            addCriterion("collectionway not in", values, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayBetween(String value1, String value2) {
            addCriterion("collectionway between", value1, value2, "collectionway");
            return (Criteria) this;
        }

        public Criteria andCollectionwayNotBetween(String value1, String value2) {
            addCriterion("collectionway not between", value1, value2, "collectionway");
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