package com.itheima.bos.web.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DsTborderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsTborderExample() {
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

        public Criteria andCustomervipnameIsNull() {
            addCriterion("customervipname is null");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameIsNotNull() {
            addCriterion("customervipname is not null");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameEqualTo(String value) {
            addCriterion("customervipname =", value, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameNotEqualTo(String value) {
            addCriterion("customervipname <>", value, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameGreaterThan(String value) {
            addCriterion("customervipname >", value, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameGreaterThanOrEqualTo(String value) {
            addCriterion("customervipname >=", value, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameLessThan(String value) {
            addCriterion("customervipname <", value, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameLessThanOrEqualTo(String value) {
            addCriterion("customervipname <=", value, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameLike(String value) {
            addCriterion("customervipname like", value, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameNotLike(String value) {
            addCriterion("customervipname not like", value, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameIn(List<String> values) {
            addCriterion("customervipname in", values, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameNotIn(List<String> values) {
            addCriterion("customervipname not in", values, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameBetween(String value1, String value2) {
            addCriterion("customervipname between", value1, value2, "customervipname");
            return (Criteria) this;
        }

        public Criteria andCustomervipnameNotBetween(String value1, String value2) {
            addCriterion("customervipname not between", value1, value2, "customervipname");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIsNull() {
            addCriterion("paymoney is null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIsNotNull() {
            addCriterion("paymoney is not null");
            return (Criteria) this;
        }

        public Criteria andPaymoneyEqualTo(BigDecimal value) {
            addCriterion("paymoney =", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotEqualTo(BigDecimal value) {
            addCriterion("paymoney <>", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyGreaterThan(BigDecimal value) {
            addCriterion("paymoney >", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paymoney >=", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLessThan(BigDecimal value) {
            addCriterion("paymoney <", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paymoney <=", value, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyIn(List<BigDecimal> values) {
            addCriterion("paymoney in", values, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotIn(List<BigDecimal> values) {
            addCriterion("paymoney not in", values, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paymoney between", value1, value2, "paymoney");
            return (Criteria) this;
        }

        public Criteria andPaymoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paymoney not between", value1, value2, "paymoney");
            return (Criteria) this;
        }

        public Criteria andCustomermarkIsNull() {
            addCriterion("customermark is null");
            return (Criteria) this;
        }

        public Criteria andCustomermarkIsNotNull() {
            addCriterion("customermark is not null");
            return (Criteria) this;
        }

        public Criteria andCustomermarkEqualTo(String value) {
            addCriterion("customermark =", value, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkNotEqualTo(String value) {
            addCriterion("customermark <>", value, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkGreaterThan(String value) {
            addCriterion("customermark >", value, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkGreaterThanOrEqualTo(String value) {
            addCriterion("customermark >=", value, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkLessThan(String value) {
            addCriterion("customermark <", value, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkLessThanOrEqualTo(String value) {
            addCriterion("customermark <=", value, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkLike(String value) {
            addCriterion("customermark like", value, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkNotLike(String value) {
            addCriterion("customermark not like", value, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkIn(List<String> values) {
            addCriterion("customermark in", values, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkNotIn(List<String> values) {
            addCriterion("customermark not in", values, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkBetween(String value1, String value2) {
            addCriterion("customermark between", value1, value2, "customermark");
            return (Criteria) this;
        }

        public Criteria andCustomermarkNotBetween(String value1, String value2) {
            addCriterion("customermark not between", value1, value2, "customermark");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrIsNull() {
            addCriterion("receiveraddr is null");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrIsNotNull() {
            addCriterion("receiveraddr is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrEqualTo(String value) {
            addCriterion("receiveraddr =", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrNotEqualTo(String value) {
            addCriterion("receiveraddr <>", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrGreaterThan(String value) {
            addCriterion("receiveraddr >", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrGreaterThanOrEqualTo(String value) {
            addCriterion("receiveraddr >=", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrLessThan(String value) {
            addCriterion("receiveraddr <", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrLessThanOrEqualTo(String value) {
            addCriterion("receiveraddr <=", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrLike(String value) {
            addCriterion("receiveraddr like", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrNotLike(String value) {
            addCriterion("receiveraddr not like", value, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrIn(List<String> values) {
            addCriterion("receiveraddr in", values, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrNotIn(List<String> values) {
            addCriterion("receiveraddr not in", values, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrBetween(String value1, String value2) {
            addCriterion("receiveraddr between", value1, value2, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andReceiveraddrNotBetween(String value1, String value2) {
            addCriterion("receiveraddr not between", value1, value2, "receiveraddr");
            return (Criteria) this;
        }

        public Criteria andLxphoneIsNull() {
            addCriterion("lxphone is null");
            return (Criteria) this;
        }

        public Criteria andLxphoneIsNotNull() {
            addCriterion("lxphone is not null");
            return (Criteria) this;
        }

        public Criteria andLxphoneEqualTo(String value) {
            addCriterion("lxphone =", value, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneNotEqualTo(String value) {
            addCriterion("lxphone <>", value, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneGreaterThan(String value) {
            addCriterion("lxphone >", value, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneGreaterThanOrEqualTo(String value) {
            addCriterion("lxphone >=", value, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneLessThan(String value) {
            addCriterion("lxphone <", value, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneLessThanOrEqualTo(String value) {
            addCriterion("lxphone <=", value, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneLike(String value) {
            addCriterion("lxphone like", value, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneNotLike(String value) {
            addCriterion("lxphone not like", value, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneIn(List<String> values) {
            addCriterion("lxphone in", values, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneNotIn(List<String> values) {
            addCriterion("lxphone not in", values, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneBetween(String value1, String value2) {
            addCriterion("lxphone between", value1, value2, "lxphone");
            return (Criteria) this;
        }

        public Criteria andLxphoneNotBetween(String value1, String value2) {
            addCriterion("lxphone not between", value1, value2, "lxphone");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeIsNull() {
            addCriterion("orderpaytime is null");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeIsNotNull() {
            addCriterion("orderpaytime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeEqualTo(Date value) {
            addCriterion("orderpaytime =", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeNotEqualTo(Date value) {
            addCriterion("orderpaytime <>", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeGreaterThan(Date value) {
            addCriterion("orderpaytime >", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderpaytime >=", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeLessThan(Date value) {
            addCriterion("orderpaytime <", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeLessThanOrEqualTo(Date value) {
            addCriterion("orderpaytime <=", value, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeIn(List<Date> values) {
            addCriterion("orderpaytime in", values, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeNotIn(List<Date> values) {
            addCriterion("orderpaytime not in", values, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeBetween(Date value1, Date value2) {
            addCriterion("orderpaytime between", value1, value2, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrderpaytimeNotBetween(Date value1, Date value2) {
            addCriterion("orderpaytime not between", value1, value2, "orderpaytime");
            return (Criteria) this;
        }

        public Criteria andOrdermarkIsNull() {
            addCriterion("ordermark is null");
            return (Criteria) this;
        }

        public Criteria andOrdermarkIsNotNull() {
            addCriterion("ordermark is not null");
            return (Criteria) this;
        }

        public Criteria andOrdermarkEqualTo(String value) {
            addCriterion("ordermark =", value, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkNotEqualTo(String value) {
            addCriterion("ordermark <>", value, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkGreaterThan(String value) {
            addCriterion("ordermark >", value, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkGreaterThanOrEqualTo(String value) {
            addCriterion("ordermark >=", value, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkLessThan(String value) {
            addCriterion("ordermark <", value, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkLessThanOrEqualTo(String value) {
            addCriterion("ordermark <=", value, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkLike(String value) {
            addCriterion("ordermark like", value, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkNotLike(String value) {
            addCriterion("ordermark not like", value, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkIn(List<String> values) {
            addCriterion("ordermark in", values, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkNotIn(List<String> values) {
            addCriterion("ordermark not in", values, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkBetween(String value1, String value2) {
            addCriterion("ordermark between", value1, value2, "ordermark");
            return (Criteria) this;
        }

        public Criteria andOrdermarkNotBetween(String value1, String value2) {
            addCriterion("ordermark not between", value1, value2, "ordermark");
            return (Criteria) this;
        }

        public Criteria andBbnumIsNull() {
            addCriterion("bbnum is null");
            return (Criteria) this;
        }

        public Criteria andBbnumIsNotNull() {
            addCriterion("bbnum is not null");
            return (Criteria) this;
        }

        public Criteria andBbnumEqualTo(Integer value) {
            addCriterion("bbnum =", value, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumNotEqualTo(Integer value) {
            addCriterion("bbnum <>", value, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumGreaterThan(Integer value) {
            addCriterion("bbnum >", value, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bbnum >=", value, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumLessThan(Integer value) {
            addCriterion("bbnum <", value, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumLessThanOrEqualTo(Integer value) {
            addCriterion("bbnum <=", value, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumIn(List<Integer> values) {
            addCriterion("bbnum in", values, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumNotIn(List<Integer> values) {
            addCriterion("bbnum not in", values, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumBetween(Integer value1, Integer value2) {
            addCriterion("bbnum between", value1, value2, "bbnum");
            return (Criteria) this;
        }

        public Criteria andBbnumNotBetween(Integer value1, Integer value2) {
            addCriterion("bbnum not between", value1, value2, "bbnum");
            return (Criteria) this;
        }

        public Criteria andProductattrIsNull() {
            addCriterion("productattr is null");
            return (Criteria) this;
        }

        public Criteria andProductattrIsNotNull() {
            addCriterion("productattr is not null");
            return (Criteria) this;
        }

        public Criteria andProductattrEqualTo(String value) {
            addCriterion("productattr =", value, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrNotEqualTo(String value) {
            addCriterion("productattr <>", value, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrGreaterThan(String value) {
            addCriterion("productattr >", value, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrGreaterThanOrEqualTo(String value) {
            addCriterion("productattr >=", value, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrLessThan(String value) {
            addCriterion("productattr <", value, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrLessThanOrEqualTo(String value) {
            addCriterion("productattr <=", value, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrLike(String value) {
            addCriterion("productattr like", value, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrNotLike(String value) {
            addCriterion("productattr not like", value, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrIn(List<String> values) {
            addCriterion("productattr in", values, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrNotIn(List<String> values) {
            addCriterion("productattr not in", values, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrBetween(String value1, String value2) {
            addCriterion("productattr between", value1, value2, "productattr");
            return (Criteria) this;
        }

        public Criteria andProductattrNotBetween(String value1, String value2) {
            addCriterion("productattr not between", value1, value2, "productattr");
            return (Criteria) this;
        }

        public Criteria andSendexpressIsNull() {
            addCriterion("sendexpress is null");
            return (Criteria) this;
        }

        public Criteria andSendexpressIsNotNull() {
            addCriterion("sendexpress is not null");
            return (Criteria) this;
        }

        public Criteria andSendexpressEqualTo(String value) {
            addCriterion("sendexpress =", value, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressNotEqualTo(String value) {
            addCriterion("sendexpress <>", value, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressGreaterThan(String value) {
            addCriterion("sendexpress >", value, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressGreaterThanOrEqualTo(String value) {
            addCriterion("sendexpress >=", value, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressLessThan(String value) {
            addCriterion("sendexpress <", value, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressLessThanOrEqualTo(String value) {
            addCriterion("sendexpress <=", value, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressLike(String value) {
            addCriterion("sendexpress like", value, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressNotLike(String value) {
            addCriterion("sendexpress not like", value, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressIn(List<String> values) {
            addCriterion("sendexpress in", values, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressNotIn(List<String> values) {
            addCriterion("sendexpress not in", values, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressBetween(String value1, String value2) {
            addCriterion("sendexpress between", value1, value2, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andSendexpressNotBetween(String value1, String value2) {
            addCriterion("sendexpress not between", value1, value2, "sendexpress");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
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

        public Criteria andZacostIsNull() {
            addCriterion("zacost is null");
            return (Criteria) this;
        }

        public Criteria andZacostIsNotNull() {
            addCriterion("zacost is not null");
            return (Criteria) this;
        }

        public Criteria andZacostEqualTo(BigDecimal value) {
            addCriterion("zacost =", value, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostNotEqualTo(BigDecimal value) {
            addCriterion("zacost <>", value, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostGreaterThan(BigDecimal value) {
            addCriterion("zacost >", value, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zacost >=", value, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostLessThan(BigDecimal value) {
            addCriterion("zacost <", value, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zacost <=", value, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostIn(List<BigDecimal> values) {
            addCriterion("zacost in", values, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostNotIn(List<BigDecimal> values) {
            addCriterion("zacost not in", values, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zacost between", value1, value2, "zacost");
            return (Criteria) this;
        }

        public Criteria andZacostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zacost not between", value1, value2, "zacost");
            return (Criteria) this;
        }

        public Criteria andInstallcostIsNull() {
            addCriterion("installcost is null");
            return (Criteria) this;
        }

        public Criteria andInstallcostIsNotNull() {
            addCriterion("installcost is not null");
            return (Criteria) this;
        }

        public Criteria andInstallcostEqualTo(BigDecimal value) {
            addCriterion("installcost =", value, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostNotEqualTo(BigDecimal value) {
            addCriterion("installcost <>", value, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostGreaterThan(BigDecimal value) {
            addCriterion("installcost >", value, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("installcost >=", value, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostLessThan(BigDecimal value) {
            addCriterion("installcost <", value, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("installcost <=", value, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostIn(List<BigDecimal> values) {
            addCriterion("installcost in", values, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostNotIn(List<BigDecimal> values) {
            addCriterion("installcost not in", values, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installcost between", value1, value2, "installcost");
            return (Criteria) this;
        }

        public Criteria andInstallcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installcost not between", value1, value2, "installcost");
            return (Criteria) this;
        }

        public Criteria andFixcostIsNull() {
            addCriterion("fixcost is null");
            return (Criteria) this;
        }

        public Criteria andFixcostIsNotNull() {
            addCriterion("fixcost is not null");
            return (Criteria) this;
        }

        public Criteria andFixcostEqualTo(BigDecimal value) {
            addCriterion("fixcost =", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostNotEqualTo(BigDecimal value) {
            addCriterion("fixcost <>", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostGreaterThan(BigDecimal value) {
            addCriterion("fixcost >", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fixcost >=", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostLessThan(BigDecimal value) {
            addCriterion("fixcost <", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fixcost <=", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostIn(List<BigDecimal> values) {
            addCriterion("fixcost in", values, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostNotIn(List<BigDecimal> values) {
            addCriterion("fixcost not in", values, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fixcost between", value1, value2, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fixcost not between", value1, value2, "fixcost");
            return (Criteria) this;
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