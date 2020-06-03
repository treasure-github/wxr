package com.itheima.bos.web.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdersproductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersproductExample() {
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

        public Criteria andOrdersidIsNull() {
            addCriterion("ordersid is null");
            return (Criteria) this;
        }

        public Criteria andOrdersidIsNotNull() {
            addCriterion("ordersid is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersidEqualTo(String value) {
            addCriterion("ordersid =", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotEqualTo(String value) {
            addCriterion("ordersid <>", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThan(String value) {
            addCriterion("ordersid >", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThanOrEqualTo(String value) {
            addCriterion("ordersid >=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThan(String value) {
            addCriterion("ordersid <", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThanOrEqualTo(String value) {
            addCriterion("ordersid <=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLike(String value) {
            addCriterion("ordersid like", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotLike(String value) {
            addCriterion("ordersid not like", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidIn(List<String> values) {
            addCriterion("ordersid in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotIn(List<String> values) {
            addCriterion("ordersid not in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidBetween(String value1, String value2) {
            addCriterion("ordersid between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotBetween(String value1, String value2) {
            addCriterion("ordersid not between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("producttype is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("producttype is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(String value) {
            addCriterion("producttype =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(String value) {
            addCriterion("producttype <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(String value) {
            addCriterion("producttype >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("producttype >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(String value) {
            addCriterion("producttype <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(String value) {
            addCriterion("producttype <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLike(String value) {
            addCriterion("producttype like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotLike(String value) {
            addCriterion("producttype not like", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<String> values) {
            addCriterion("producttype in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<String> values) {
            addCriterion("producttype not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(String value1, String value2) {
            addCriterion("producttype between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(String value1, String value2) {
            addCriterion("producttype not between", value1, value2, "producttype");
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

        public Criteria andSdnumIsNull() {
            addCriterion("sdnum is null");
            return (Criteria) this;
        }

        public Criteria andSdnumIsNotNull() {
            addCriterion("sdnum is not null");
            return (Criteria) this;
        }

        public Criteria andSdnumEqualTo(Integer value) {
            addCriterion("sdnum =", value, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumNotEqualTo(Integer value) {
            addCriterion("sdnum <>", value, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumGreaterThan(Integer value) {
            addCriterion("sdnum >", value, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdnum >=", value, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumLessThan(Integer value) {
            addCriterion("sdnum <", value, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumLessThanOrEqualTo(Integer value) {
            addCriterion("sdnum <=", value, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumIn(List<Integer> values) {
            addCriterion("sdnum in", values, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumNotIn(List<Integer> values) {
            addCriterion("sdnum not in", values, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumBetween(Integer value1, Integer value2) {
            addCriterion("sdnum between", value1, value2, "sdnum");
            return (Criteria) this;
        }

        public Criteria andSdnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sdnum not between", value1, value2, "sdnum");
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

        public Criteria andSendnumIsNull() {
            addCriterion("sendnum is null");
            return (Criteria) this;
        }

        public Criteria andSendnumIsNotNull() {
            addCriterion("sendnum is not null");
            return (Criteria) this;
        }

        public Criteria andSendnumEqualTo(Integer value) {
            addCriterion("sendnum =", value, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumNotEqualTo(Integer value) {
            addCriterion("sendnum <>", value, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumGreaterThan(Integer value) {
            addCriterion("sendnum >", value, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendnum >=", value, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumLessThan(Integer value) {
            addCriterion("sendnum <", value, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumLessThanOrEqualTo(Integer value) {
            addCriterion("sendnum <=", value, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumIn(List<Integer> values) {
            addCriterion("sendnum in", values, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumNotIn(List<Integer> values) {
            addCriterion("sendnum not in", values, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumBetween(Integer value1, Integer value2) {
            addCriterion("sendnum between", value1, value2, "sendnum");
            return (Criteria) this;
        }

        public Criteria andSendnumNotBetween(Integer value1, Integer value2) {
            addCriterion("sendnum not between", value1, value2, "sendnum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andLesspriceIsNull() {
            addCriterion("lessprice is null");
            return (Criteria) this;
        }

        public Criteria andLesspriceIsNotNull() {
            addCriterion("lessprice is not null");
            return (Criteria) this;
        }

        public Criteria andLesspriceEqualTo(BigDecimal value) {
            addCriterion("lessprice =", value, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceNotEqualTo(BigDecimal value) {
            addCriterion("lessprice <>", value, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceGreaterThan(BigDecimal value) {
            addCriterion("lessprice >", value, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lessprice >=", value, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceLessThan(BigDecimal value) {
            addCriterion("lessprice <", value, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lessprice <=", value, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceIn(List<BigDecimal> values) {
            addCriterion("lessprice in", values, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceNotIn(List<BigDecimal> values) {
            addCriterion("lessprice not in", values, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lessprice between", value1, value2, "lessprice");
            return (Criteria) this;
        }

        public Criteria andLesspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lessprice not between", value1, value2, "lessprice");
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

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(String value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(String value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(String value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(String value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(String value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(String value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLike(String value) {
            addCriterion("isdelete like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotLike(String value) {
            addCriterion("isdelete not like", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<String> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<String> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(String value1, String value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(String value1, String value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andFahuoqkIsNull() {
            addCriterion("fahuoqk is null");
            return (Criteria) this;
        }

        public Criteria andFahuoqkIsNotNull() {
            addCriterion("fahuoqk is not null");
            return (Criteria) this;
        }

        public Criteria andFahuoqkEqualTo(String value) {
            addCriterion("fahuoqk =", value, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkNotEqualTo(String value) {
            addCriterion("fahuoqk <>", value, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkGreaterThan(String value) {
            addCriterion("fahuoqk >", value, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkGreaterThanOrEqualTo(String value) {
            addCriterion("fahuoqk >=", value, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkLessThan(String value) {
            addCriterion("fahuoqk <", value, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkLessThanOrEqualTo(String value) {
            addCriterion("fahuoqk <=", value, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkLike(String value) {
            addCriterion("fahuoqk like", value, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkNotLike(String value) {
            addCriterion("fahuoqk not like", value, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkIn(List<String> values) {
            addCriterion("fahuoqk in", values, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkNotIn(List<String> values) {
            addCriterion("fahuoqk not in", values, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkBetween(String value1, String value2) {
            addCriterion("fahuoqk between", value1, value2, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andFahuoqkNotBetween(String value1, String value2) {
            addCriterion("fahuoqk not between", value1, value2, "fahuoqk");
            return (Criteria) this;
        }

        public Criteria andSkqkIsNull() {
            addCriterion("skqk is null");
            return (Criteria) this;
        }

        public Criteria andSkqkIsNotNull() {
            addCriterion("skqk is not null");
            return (Criteria) this;
        }

        public Criteria andSkqkEqualTo(String value) {
            addCriterion("skqk =", value, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkNotEqualTo(String value) {
            addCriterion("skqk <>", value, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkGreaterThan(String value) {
            addCriterion("skqk >", value, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkGreaterThanOrEqualTo(String value) {
            addCriterion("skqk >=", value, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkLessThan(String value) {
            addCriterion("skqk <", value, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkLessThanOrEqualTo(String value) {
            addCriterion("skqk <=", value, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkLike(String value) {
            addCriterion("skqk like", value, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkNotLike(String value) {
            addCriterion("skqk not like", value, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkIn(List<String> values) {
            addCriterion("skqk in", values, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkNotIn(List<String> values) {
            addCriterion("skqk not in", values, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkBetween(String value1, String value2) {
            addCriterion("skqk between", value1, value2, "skqk");
            return (Criteria) this;
        }

        public Criteria andSkqkNotBetween(String value1, String value2) {
            addCriterion("skqk not between", value1, value2, "skqk");
            return (Criteria) this;
        }

        public Criteria andClqkIsNull() {
            addCriterion("clqk is null");
            return (Criteria) this;
        }

        public Criteria andClqkIsNotNull() {
            addCriterion("clqk is not null");
            return (Criteria) this;
        }

        public Criteria andClqkEqualTo(String value) {
            addCriterion("clqk =", value, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkNotEqualTo(String value) {
            addCriterion("clqk <>", value, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkGreaterThan(String value) {
            addCriterion("clqk >", value, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkGreaterThanOrEqualTo(String value) {
            addCriterion("clqk >=", value, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkLessThan(String value) {
            addCriterion("clqk <", value, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkLessThanOrEqualTo(String value) {
            addCriterion("clqk <=", value, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkLike(String value) {
            addCriterion("clqk like", value, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkNotLike(String value) {
            addCriterion("clqk not like", value, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkIn(List<String> values) {
            addCriterion("clqk in", values, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkNotIn(List<String> values) {
            addCriterion("clqk not in", values, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkBetween(String value1, String value2) {
            addCriterion("clqk between", value1, value2, "clqk");
            return (Criteria) this;
        }

        public Criteria andClqkNotBetween(String value1, String value2) {
            addCriterion("clqk not between", value1, value2, "clqk");
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