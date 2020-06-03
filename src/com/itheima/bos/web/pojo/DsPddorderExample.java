package com.itheima.bos.web.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DsPddorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DsPddorderExample() {
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

        public Criteria andPddorderidIsNull() {
            addCriterion("pddorderid is null");
            return (Criteria) this;
        }

        public Criteria andPddorderidIsNotNull() {
            addCriterion("pddorderid is not null");
            return (Criteria) this;
        }

        public Criteria andPddorderidEqualTo(String value) {
            addCriterion("pddorderid =", value, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidNotEqualTo(String value) {
            addCriterion("pddorderid <>", value, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidGreaterThan(String value) {
            addCriterion("pddorderid >", value, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidGreaterThanOrEqualTo(String value) {
            addCriterion("pddorderid >=", value, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidLessThan(String value) {
            addCriterion("pddorderid <", value, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidLessThanOrEqualTo(String value) {
            addCriterion("pddorderid <=", value, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidLike(String value) {
            addCriterion("pddorderid like", value, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidNotLike(String value) {
            addCriterion("pddorderid not like", value, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidIn(List<String> values) {
            addCriterion("pddorderid in", values, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidNotIn(List<String> values) {
            addCriterion("pddorderid not in", values, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidBetween(String value1, String value2) {
            addCriterion("pddorderid between", value1, value2, "pddorderid");
            return (Criteria) this;
        }

        public Criteria andPddorderidNotBetween(String value1, String value2) {
            addCriterion("pddorderid not between", value1, value2, "pddorderid");
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

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderstatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(String value) {
            addCriterion("orderstatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(String value) {
            addCriterion("orderstatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(String value) {
            addCriterion("orderstatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(String value) {
            addCriterion("orderstatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(String value) {
            addCriterion("orderstatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(String value) {
            addCriterion("orderstatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLike(String value) {
            addCriterion("orderstatus like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotLike(String value) {
            addCriterion("orderstatus not like", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<String> values) {
            addCriterion("orderstatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<String> values) {
            addCriterion("orderstatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(String value1, String value2) {
            addCriterion("orderstatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(String value1, String value2) {
            addCriterion("orderstatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceIsNull() {
            addCriterion("productsumprice is null");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceIsNotNull() {
            addCriterion("productsumprice is not null");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceEqualTo(BigDecimal value) {
            addCriterion("productsumprice =", value, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceNotEqualTo(BigDecimal value) {
            addCriterion("productsumprice <>", value, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceGreaterThan(BigDecimal value) {
            addCriterion("productsumprice >", value, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("productsumprice >=", value, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceLessThan(BigDecimal value) {
            addCriterion("productsumprice <", value, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("productsumprice <=", value, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceIn(List<BigDecimal> values) {
            addCriterion("productsumprice in", values, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceNotIn(List<BigDecimal> values) {
            addCriterion("productsumprice not in", values, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productsumprice between", value1, value2, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andProductsumpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("productsumprice not between", value1, value2, "productsumprice");
            return (Criteria) this;
        }

        public Criteria andStorediscountIsNull() {
            addCriterion("storediscount is null");
            return (Criteria) this;
        }

        public Criteria andStorediscountIsNotNull() {
            addCriterion("storediscount is not null");
            return (Criteria) this;
        }

        public Criteria andStorediscountEqualTo(BigDecimal value) {
            addCriterion("storediscount =", value, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountNotEqualTo(BigDecimal value) {
            addCriterion("storediscount <>", value, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountGreaterThan(BigDecimal value) {
            addCriterion("storediscount >", value, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("storediscount >=", value, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountLessThan(BigDecimal value) {
            addCriterion("storediscount <", value, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("storediscount <=", value, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountIn(List<BigDecimal> values) {
            addCriterion("storediscount in", values, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountNotIn(List<BigDecimal> values) {
            addCriterion("storediscount not in", values, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("storediscount between", value1, value2, "storediscount");
            return (Criteria) this;
        }

        public Criteria andStorediscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("storediscount not between", value1, value2, "storediscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountIsNull() {
            addCriterion("platformdiscount is null");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountIsNotNull() {
            addCriterion("platformdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountEqualTo(BigDecimal value) {
            addCriterion("platformdiscount =", value, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountNotEqualTo(BigDecimal value) {
            addCriterion("platformdiscount <>", value, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountGreaterThan(BigDecimal value) {
            addCriterion("platformdiscount >", value, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platformdiscount >=", value, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountLessThan(BigDecimal value) {
            addCriterion("platformdiscount <", value, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platformdiscount <=", value, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountIn(List<BigDecimal> values) {
            addCriterion("platformdiscount in", values, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountNotIn(List<BigDecimal> values) {
            addCriterion("platformdiscount not in", values, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platformdiscount between", value1, value2, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andPlatformdiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platformdiscount not between", value1, value2, "platformdiscount");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostIsNull() {
            addCriterion("tohomeinstallcost is null");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostIsNotNull() {
            addCriterion("tohomeinstallcost is not null");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostEqualTo(BigDecimal value) {
            addCriterion("tohomeinstallcost =", value, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostNotEqualTo(BigDecimal value) {
            addCriterion("tohomeinstallcost <>", value, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostGreaterThan(BigDecimal value) {
            addCriterion("tohomeinstallcost >", value, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tohomeinstallcost >=", value, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostLessThan(BigDecimal value) {
            addCriterion("tohomeinstallcost <", value, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tohomeinstallcost <=", value, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostIn(List<BigDecimal> values) {
            addCriterion("tohomeinstallcost in", values, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostNotIn(List<BigDecimal> values) {
            addCriterion("tohomeinstallcost not in", values, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tohomeinstallcost between", value1, value2, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeinstallcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tohomeinstallcost not between", value1, value2, "tohomeinstallcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostIsNull() {
            addCriterion("sendgoodcost is null");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostIsNotNull() {
            addCriterion("sendgoodcost is not null");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostEqualTo(BigDecimal value) {
            addCriterion("sendgoodcost =", value, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostNotEqualTo(BigDecimal value) {
            addCriterion("sendgoodcost <>", value, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostGreaterThan(BigDecimal value) {
            addCriterion("sendgoodcost >", value, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sendgoodcost >=", value, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostLessThan(BigDecimal value) {
            addCriterion("sendgoodcost <", value, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sendgoodcost <=", value, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostIn(List<BigDecimal> values) {
            addCriterion("sendgoodcost in", values, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostNotIn(List<BigDecimal> values) {
            addCriterion("sendgoodcost not in", values, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sendgoodcost between", value1, value2, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andSendgoodcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sendgoodcost not between", value1, value2, "sendgoodcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostIsNull() {
            addCriterion("tohomeandinstallcost is null");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostIsNotNull() {
            addCriterion("tohomeandinstallcost is not null");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostEqualTo(BigDecimal value) {
            addCriterion("tohomeandinstallcost =", value, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostNotEqualTo(BigDecimal value) {
            addCriterion("tohomeandinstallcost <>", value, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostGreaterThan(BigDecimal value) {
            addCriterion("tohomeandinstallcost >", value, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tohomeandinstallcost >=", value, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostLessThan(BigDecimal value) {
            addCriterion("tohomeandinstallcost <", value, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tohomeandinstallcost <=", value, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostIn(List<BigDecimal> values) {
            addCriterion("tohomeandinstallcost in", values, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostNotIn(List<BigDecimal> values) {
            addCriterion("tohomeandinstallcost not in", values, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tohomeandinstallcost between", value1, value2, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andTohomeandinstallcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tohomeandinstallcost not between", value1, value2, "tohomeandinstallcost");
            return (Criteria) this;
        }

        public Criteria andStoreincomeIsNull() {
            addCriterion("storeincome is null");
            return (Criteria) this;
        }

        public Criteria andStoreincomeIsNotNull() {
            addCriterion("storeincome is not null");
            return (Criteria) this;
        }

        public Criteria andStoreincomeEqualTo(BigDecimal value) {
            addCriterion("storeincome =", value, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeNotEqualTo(BigDecimal value) {
            addCriterion("storeincome <>", value, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeGreaterThan(BigDecimal value) {
            addCriterion("storeincome >", value, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("storeincome >=", value, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeLessThan(BigDecimal value) {
            addCriterion("storeincome <", value, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("storeincome <=", value, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeIn(List<BigDecimal> values) {
            addCriterion("storeincome in", values, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeNotIn(List<BigDecimal> values) {
            addCriterion("storeincome not in", values, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("storeincome between", value1, value2, "storeincome");
            return (Criteria) this;
        }

        public Criteria andStoreincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("storeincome not between", value1, value2, "storeincome");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNull() {
            addCriterion("productnum is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("productnum is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(Integer value) {
            addCriterion("productnum =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(Integer value) {
            addCriterion("productnum <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(Integer value) {
            addCriterion("productnum >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("productnum >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(Integer value) {
            addCriterion("productnum <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(Integer value) {
            addCriterion("productnum <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<Integer> values) {
            addCriterion("productnum in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<Integer> values) {
            addCriterion("productnum not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(Integer value1, Integer value2) {
            addCriterion("productnum between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(Integer value1, Integer value2) {
            addCriterion("productnum not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("idno is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("idno is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("idno =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("idno <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("idno >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("idno >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("idno <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("idno <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("idno like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("idno not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("idno in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("idno not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("idno between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("idno not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNull() {
            addCriterion("receivername is null");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNotNull() {
            addCriterion("receivername is not null");
            return (Criteria) this;
        }

        public Criteria andReceivernameEqualTo(String value) {
            addCriterion("receivername =", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotEqualTo(String value) {
            addCriterion("receivername <>", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThan(String value) {
            addCriterion("receivername >", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("receivername >=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThan(String value) {
            addCriterion("receivername <", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThanOrEqualTo(String value) {
            addCriterion("receivername <=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLike(String value) {
            addCriterion("receivername like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotLike(String value) {
            addCriterion("receivername not like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIn(List<String> values) {
            addCriterion("receivername in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotIn(List<String> values) {
            addCriterion("receivername not in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameBetween(String value1, String value2) {
            addCriterion("receivername between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotBetween(String value1, String value2) {
            addCriterion("receivername not between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIsexceptionIsNull() {
            addCriterion("isException is null");
            return (Criteria) this;
        }

        public Criteria andIsexceptionIsNotNull() {
            addCriterion("isException is not null");
            return (Criteria) this;
        }

        public Criteria andIsexceptionEqualTo(String value) {
            addCriterion("isException =", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionNotEqualTo(String value) {
            addCriterion("isException <>", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionGreaterThan(String value) {
            addCriterion("isException >", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionGreaterThanOrEqualTo(String value) {
            addCriterion("isException >=", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionLessThan(String value) {
            addCriterion("isException <", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionLessThanOrEqualTo(String value) {
            addCriterion("isException <=", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionLike(String value) {
            addCriterion("isException like", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionNotLike(String value) {
            addCriterion("isException not like", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionIn(List<String> values) {
            addCriterion("isException in", values, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionNotIn(List<String> values) {
            addCriterion("isException not in", values, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionBetween(String value1, String value2) {
            addCriterion("isException between", value1, value2, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionNotBetween(String value1, String value2) {
            addCriterion("isException not between", value1, value2, "isexception");
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

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeIsNull() {
            addCriterion("pdsuccesstime is null");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeIsNotNull() {
            addCriterion("pdsuccesstime is not null");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeEqualTo(Date value) {
            addCriterion("pdsuccesstime =", value, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeNotEqualTo(Date value) {
            addCriterion("pdsuccesstime <>", value, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeGreaterThan(Date value) {
            addCriterion("pdsuccesstime >", value, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pdsuccesstime >=", value, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeLessThan(Date value) {
            addCriterion("pdsuccesstime <", value, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeLessThanOrEqualTo(Date value) {
            addCriterion("pdsuccesstime <=", value, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeIn(List<Date> values) {
            addCriterion("pdsuccesstime in", values, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeNotIn(List<Date> values) {
            addCriterion("pdsuccesstime not in", values, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeBetween(Date value1, Date value2) {
            addCriterion("pdsuccesstime between", value1, value2, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andPdsuccesstimeNotBetween(Date value1, Date value2) {
            addCriterion("pdsuccesstime not between", value1, value2, "pdsuccesstime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeIsNull() {
            addCriterion("sureordertime is null");
            return (Criteria) this;
        }

        public Criteria andSureordertimeIsNotNull() {
            addCriterion("sureordertime is not null");
            return (Criteria) this;
        }

        public Criteria andSureordertimeEqualTo(Date value) {
            addCriterion("sureordertime =", value, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeNotEqualTo(Date value) {
            addCriterion("sureordertime <>", value, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeGreaterThan(Date value) {
            addCriterion("sureordertime >", value, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sureordertime >=", value, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeLessThan(Date value) {
            addCriterion("sureordertime <", value, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeLessThanOrEqualTo(Date value) {
            addCriterion("sureordertime <=", value, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeIn(List<Date> values) {
            addCriterion("sureordertime in", values, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeNotIn(List<Date> values) {
            addCriterion("sureordertime not in", values, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeBetween(Date value1, Date value2) {
            addCriterion("sureordertime between", value1, value2, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andSureordertimeNotBetween(Date value1, Date value2) {
            addCriterion("sureordertime not between", value1, value2, "sureordertime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeIsNull() {
            addCriterion("promisetime is null");
            return (Criteria) this;
        }

        public Criteria andPromisetimeIsNotNull() {
            addCriterion("promisetime is not null");
            return (Criteria) this;
        }

        public Criteria andPromisetimeEqualTo(Date value) {
            addCriterion("promisetime =", value, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeNotEqualTo(Date value) {
            addCriterion("promisetime <>", value, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeGreaterThan(Date value) {
            addCriterion("promisetime >", value, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("promisetime >=", value, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeLessThan(Date value) {
            addCriterion("promisetime <", value, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeLessThanOrEqualTo(Date value) {
            addCriterion("promisetime <=", value, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeIn(List<Date> values) {
            addCriterion("promisetime in", values, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeNotIn(List<Date> values) {
            addCriterion("promisetime not in", values, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeBetween(Date value1, Date value2) {
            addCriterion("promisetime between", value1, value2, "promisetime");
            return (Criteria) this;
        }

        public Criteria andPromisetimeNotBetween(Date value1, Date value2) {
            addCriterion("promisetime not between", value1, value2, "promisetime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeIsNull() {
            addCriterion("reallysendtime is null");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeIsNotNull() {
            addCriterion("reallysendtime is not null");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeEqualTo(String value) {
            addCriterion("reallysendtime =", value, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeNotEqualTo(String value) {
            addCriterion("reallysendtime <>", value, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeGreaterThan(String value) {
            addCriterion("reallysendtime >", value, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("reallysendtime >=", value, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeLessThan(String value) {
            addCriterion("reallysendtime <", value, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeLessThanOrEqualTo(String value) {
            addCriterion("reallysendtime <=", value, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeLike(String value) {
            addCriterion("reallysendtime like", value, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeNotLike(String value) {
            addCriterion("reallysendtime not like", value, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeIn(List<String> values) {
            addCriterion("reallysendtime in", values, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeNotIn(List<String> values) {
            addCriterion("reallysendtime not in", values, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeBetween(String value1, String value2) {
            addCriterion("reallysendtime between", value1, value2, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andReallysendtimeNotBetween(String value1, String value2) {
            addCriterion("reallysendtime not between", value1, value2, "reallysendtime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeIsNull() {
            addCriterion("surereceivertime is null");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeIsNotNull() {
            addCriterion("surereceivertime is not null");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeEqualTo(String value) {
            addCriterion("surereceivertime =", value, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeNotEqualTo(String value) {
            addCriterion("surereceivertime <>", value, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeGreaterThan(String value) {
            addCriterion("surereceivertime >", value, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeGreaterThanOrEqualTo(String value) {
            addCriterion("surereceivertime >=", value, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeLessThan(String value) {
            addCriterion("surereceivertime <", value, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeLessThanOrEqualTo(String value) {
            addCriterion("surereceivertime <=", value, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeLike(String value) {
            addCriterion("surereceivertime like", value, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeNotLike(String value) {
            addCriterion("surereceivertime not like", value, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeIn(List<String> values) {
            addCriterion("surereceivertime in", values, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeNotIn(List<String> values) {
            addCriterion("surereceivertime not in", values, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeBetween(String value1, String value2) {
            addCriterion("surereceivertime between", value1, value2, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andSurereceivertimeNotBetween(String value1, String value2) {
            addCriterion("surereceivertime not between", value1, value2, "surereceivertime");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(String value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(String value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(String value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(String value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(String value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(String value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLike(String value) {
            addCriterion("productid like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotLike(String value) {
            addCriterion("productid not like", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<String> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<String> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(String value1, String value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(String value1, String value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneIsNull() {
            addCriterion("custmoerphone is null");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneIsNotNull() {
            addCriterion("custmoerphone is not null");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneEqualTo(String value) {
            addCriterion("custmoerphone =", value, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneNotEqualTo(String value) {
            addCriterion("custmoerphone <>", value, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneGreaterThan(String value) {
            addCriterion("custmoerphone >", value, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("custmoerphone >=", value, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneLessThan(String value) {
            addCriterion("custmoerphone <", value, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneLessThanOrEqualTo(String value) {
            addCriterion("custmoerphone <=", value, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneLike(String value) {
            addCriterion("custmoerphone like", value, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneNotLike(String value) {
            addCriterion("custmoerphone not like", value, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneIn(List<String> values) {
            addCriterion("custmoerphone in", values, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneNotIn(List<String> values) {
            addCriterion("custmoerphone not in", values, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneBetween(String value1, String value2) {
            addCriterion("custmoerphone between", value1, value2, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andCustmoerphoneNotBetween(String value1, String value2) {
            addCriterion("custmoerphone not between", value1, value2, "custmoerphone");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNull() {
            addCriterion("styleid is null");
            return (Criteria) this;
        }

        public Criteria andStyleidIsNotNull() {
            addCriterion("styleid is not null");
            return (Criteria) this;
        }

        public Criteria andStyleidEqualTo(String value) {
            addCriterion("styleid =", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotEqualTo(String value) {
            addCriterion("styleid <>", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThan(String value) {
            addCriterion("styleid >", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidGreaterThanOrEqualTo(String value) {
            addCriterion("styleid >=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThan(String value) {
            addCriterion("styleid <", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLessThanOrEqualTo(String value) {
            addCriterion("styleid <=", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidLike(String value) {
            addCriterion("styleid like", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotLike(String value) {
            addCriterion("styleid not like", value, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidIn(List<String> values) {
            addCriterion("styleid in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotIn(List<String> values) {
            addCriterion("styleid not in", values, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidBetween(String value1, String value2) {
            addCriterion("styleid between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStyleidNotBetween(String value1, String value2) {
            addCriterion("styleid not between", value1, value2, "styleid");
            return (Criteria) this;
        }

        public Criteria andStoreskuIsNull() {
            addCriterion("storeSKU is null");
            return (Criteria) this;
        }

        public Criteria andStoreskuIsNotNull() {
            addCriterion("storeSKU is not null");
            return (Criteria) this;
        }

        public Criteria andStoreskuEqualTo(String value) {
            addCriterion("storeSKU =", value, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuNotEqualTo(String value) {
            addCriterion("storeSKU <>", value, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuGreaterThan(String value) {
            addCriterion("storeSKU >", value, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuGreaterThanOrEqualTo(String value) {
            addCriterion("storeSKU >=", value, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuLessThan(String value) {
            addCriterion("storeSKU <", value, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuLessThanOrEqualTo(String value) {
            addCriterion("storeSKU <=", value, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuLike(String value) {
            addCriterion("storeSKU like", value, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuNotLike(String value) {
            addCriterion("storeSKU not like", value, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuIn(List<String> values) {
            addCriterion("storeSKU in", values, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuNotIn(List<String> values) {
            addCriterion("storeSKU not in", values, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuBetween(String value1, String value2) {
            addCriterion("storeSKU between", value1, value2, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreskuNotBetween(String value1, String value2) {
            addCriterion("storeSKU not between", value1, value2, "storesku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuIsNull() {
            addCriterion("storeproductSKU is null");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuIsNotNull() {
            addCriterion("storeproductSKU is not null");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuEqualTo(String value) {
            addCriterion("storeproductSKU =", value, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuNotEqualTo(String value) {
            addCriterion("storeproductSKU <>", value, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuGreaterThan(String value) {
            addCriterion("storeproductSKU >", value, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuGreaterThanOrEqualTo(String value) {
            addCriterion("storeproductSKU >=", value, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuLessThan(String value) {
            addCriterion("storeproductSKU <", value, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuLessThanOrEqualTo(String value) {
            addCriterion("storeproductSKU <=", value, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuLike(String value) {
            addCriterion("storeproductSKU like", value, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuNotLike(String value) {
            addCriterion("storeproductSKU not like", value, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuIn(List<String> values) {
            addCriterion("storeproductSKU in", values, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuNotIn(List<String> values) {
            addCriterion("storeproductSKU not in", values, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuBetween(String value1, String value2) {
            addCriterion("storeproductSKU between", value1, value2, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andStoreproductskuNotBetween(String value1, String value2) {
            addCriterion("storeproductSKU not between", value1, value2, "storeproductsku");
            return (Criteria) this;
        }

        public Criteria andExpressnoIsNull() {
            addCriterion("expressno is null");
            return (Criteria) this;
        }

        public Criteria andExpressnoIsNotNull() {
            addCriterion("expressno is not null");
            return (Criteria) this;
        }

        public Criteria andExpressnoEqualTo(String value) {
            addCriterion("expressno =", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotEqualTo(String value) {
            addCriterion("expressno <>", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoGreaterThan(String value) {
            addCriterion("expressno >", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoGreaterThanOrEqualTo(String value) {
            addCriterion("expressno >=", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLessThan(String value) {
            addCriterion("expressno <", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLessThanOrEqualTo(String value) {
            addCriterion("expressno <=", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLike(String value) {
            addCriterion("expressno like", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotLike(String value) {
            addCriterion("expressno not like", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoIn(List<String> values) {
            addCriterion("expressno in", values, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotIn(List<String> values) {
            addCriterion("expressno not in", values, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoBetween(String value1, String value2) {
            addCriterion("expressno between", value1, value2, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotBetween(String value1, String value2) {
            addCriterion("expressno not between", value1, value2, "expressno");
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

        public Criteria andHtqgordernoIsNull() {
            addCriterion("htqgorderno is null");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoIsNotNull() {
            addCriterion("htqgorderno is not null");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoEqualTo(String value) {
            addCriterion("htqgorderno =", value, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoNotEqualTo(String value) {
            addCriterion("htqgorderno <>", value, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoGreaterThan(String value) {
            addCriterion("htqgorderno >", value, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoGreaterThanOrEqualTo(String value) {
            addCriterion("htqgorderno >=", value, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoLessThan(String value) {
            addCriterion("htqgorderno <", value, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoLessThanOrEqualTo(String value) {
            addCriterion("htqgorderno <=", value, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoLike(String value) {
            addCriterion("htqgorderno like", value, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoNotLike(String value) {
            addCriterion("htqgorderno not like", value, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoIn(List<String> values) {
            addCriterion("htqgorderno in", values, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoNotIn(List<String> values) {
            addCriterion("htqgorderno not in", values, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoBetween(String value1, String value2) {
            addCriterion("htqgorderno between", value1, value2, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andHtqgordernoNotBetween(String value1, String value2) {
            addCriterion("htqgorderno not between", value1, value2, "htqgorderno");
            return (Criteria) this;
        }

        public Criteria andPayidIsNull() {
            addCriterion("payid is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("payid is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(String value) {
            addCriterion("payid =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(String value) {
            addCriterion("payid <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(String value) {
            addCriterion("payid >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(String value) {
            addCriterion("payid >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(String value) {
            addCriterion("payid <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(String value) {
            addCriterion("payid <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLike(String value) {
            addCriterion("payid like", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotLike(String value) {
            addCriterion("payid not like", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<String> values) {
            addCriterion("payid in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<String> values) {
            addCriterion("payid not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(String value1, String value2) {
            addCriterion("payid between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(String value1, String value2) {
            addCriterion("payid not between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("payway is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("payway is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("payway =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("payway <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("payway >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("payway >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("payway <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("payway <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("payway like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("payway not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("payway in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("payway not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("payway between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("payway not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyIsNull() {
            addCriterion("iscjorzreosy is null");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyIsNotNull() {
            addCriterion("iscjorzreosy is not null");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyEqualTo(String value) {
            addCriterion("iscjorzreosy =", value, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyNotEqualTo(String value) {
            addCriterion("iscjorzreosy <>", value, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyGreaterThan(String value) {
            addCriterion("iscjorzreosy >", value, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyGreaterThanOrEqualTo(String value) {
            addCriterion("iscjorzreosy >=", value, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyLessThan(String value) {
            addCriterion("iscjorzreosy <", value, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyLessThanOrEqualTo(String value) {
            addCriterion("iscjorzreosy <=", value, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyLike(String value) {
            addCriterion("iscjorzreosy like", value, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyNotLike(String value) {
            addCriterion("iscjorzreosy not like", value, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyIn(List<String> values) {
            addCriterion("iscjorzreosy in", values, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyNotIn(List<String> values) {
            addCriterion("iscjorzreosy not in", values, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyBetween(String value1, String value2) {
            addCriterion("iscjorzreosy between", value1, value2, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andIscjorzreosyNotBetween(String value1, String value2) {
            addCriterion("iscjorzreosy not between", value1, value2, "iscjorzreosy");
            return (Criteria) this;
        }

        public Criteria andStoremarkIsNull() {
            addCriterion("storemark is null");
            return (Criteria) this;
        }

        public Criteria andStoremarkIsNotNull() {
            addCriterion("storemark is not null");
            return (Criteria) this;
        }

        public Criteria andStoremarkEqualTo(String value) {
            addCriterion("storemark =", value, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkNotEqualTo(String value) {
            addCriterion("storemark <>", value, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkGreaterThan(String value) {
            addCriterion("storemark >", value, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkGreaterThanOrEqualTo(String value) {
            addCriterion("storemark >=", value, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkLessThan(String value) {
            addCriterion("storemark <", value, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkLessThanOrEqualTo(String value) {
            addCriterion("storemark <=", value, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkLike(String value) {
            addCriterion("storemark like", value, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkNotLike(String value) {
            addCriterion("storemark not like", value, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkIn(List<String> values) {
            addCriterion("storemark in", values, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkNotIn(List<String> values) {
            addCriterion("storemark not in", values, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkBetween(String value1, String value2) {
            addCriterion("storemark between", value1, value2, "storemark");
            return (Criteria) this;
        }

        public Criteria andStoremarkNotBetween(String value1, String value2) {
            addCriterion("storemark not between", value1, value2, "storemark");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusIsNull() {
            addCriterion("salesafterstatus is null");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusIsNotNull() {
            addCriterion("salesafterstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusEqualTo(String value) {
            addCriterion("salesafterstatus =", value, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusNotEqualTo(String value) {
            addCriterion("salesafterstatus <>", value, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusGreaterThan(String value) {
            addCriterion("salesafterstatus >", value, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusGreaterThanOrEqualTo(String value) {
            addCriterion("salesafterstatus >=", value, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusLessThan(String value) {
            addCriterion("salesafterstatus <", value, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusLessThanOrEqualTo(String value) {
            addCriterion("salesafterstatus <=", value, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusLike(String value) {
            addCriterion("salesafterstatus like", value, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusNotLike(String value) {
            addCriterion("salesafterstatus not like", value, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusIn(List<String> values) {
            addCriterion("salesafterstatus in", values, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusNotIn(List<String> values) {
            addCriterion("salesafterstatus not in", values, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusBetween(String value1, String value2) {
            addCriterion("salesafterstatus between", value1, value2, "salesafterstatus");
            return (Criteria) this;
        }

        public Criteria andSalesafterstatusNotBetween(String value1, String value2) {
            addCriterion("salesafterstatus not between", value1, value2, "salesafterstatus");
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

        public Criteria andGlhpbmIsNull() {
            addCriterion("glhpbm is null");
            return (Criteria) this;
        }

        public Criteria andGlhpbmIsNotNull() {
            addCriterion("glhpbm is not null");
            return (Criteria) this;
        }

        public Criteria andGlhpbmEqualTo(String value) {
            addCriterion("glhpbm =", value, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmNotEqualTo(String value) {
            addCriterion("glhpbm <>", value, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmGreaterThan(String value) {
            addCriterion("glhpbm >", value, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmGreaterThanOrEqualTo(String value) {
            addCriterion("glhpbm >=", value, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmLessThan(String value) {
            addCriterion("glhpbm <", value, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmLessThanOrEqualTo(String value) {
            addCriterion("glhpbm <=", value, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmLike(String value) {
            addCriterion("glhpbm like", value, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmNotLike(String value) {
            addCriterion("glhpbm not like", value, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmIn(List<String> values) {
            addCriterion("glhpbm in", values, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmNotIn(List<String> values) {
            addCriterion("glhpbm not in", values, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmBetween(String value1, String value2) {
            addCriterion("glhpbm between", value1, value2, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andGlhpbmNotBetween(String value1, String value2) {
            addCriterion("glhpbm not between", value1, value2, "glhpbm");
            return (Criteria) this;
        }

        public Criteria andHpnameIsNull() {
            addCriterion("hpname is null");
            return (Criteria) this;
        }

        public Criteria andHpnameIsNotNull() {
            addCriterion("hpname is not null");
            return (Criteria) this;
        }

        public Criteria andHpnameEqualTo(String value) {
            addCriterion("hpname =", value, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameNotEqualTo(String value) {
            addCriterion("hpname <>", value, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameGreaterThan(String value) {
            addCriterion("hpname >", value, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameGreaterThanOrEqualTo(String value) {
            addCriterion("hpname >=", value, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameLessThan(String value) {
            addCriterion("hpname <", value, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameLessThanOrEqualTo(String value) {
            addCriterion("hpname <=", value, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameLike(String value) {
            addCriterion("hpname like", value, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameNotLike(String value) {
            addCriterion("hpname not like", value, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameIn(List<String> values) {
            addCriterion("hpname in", values, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameNotIn(List<String> values) {
            addCriterion("hpname not in", values, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameBetween(String value1, String value2) {
            addCriterion("hpname between", value1, value2, "hpname");
            return (Criteria) this;
        }

        public Criteria andHpnameNotBetween(String value1, String value2) {
            addCriterion("hpname not between", value1, value2, "hpname");
            return (Criteria) this;
        }

        public Criteria andHptypeIsNull() {
            addCriterion("hptype is null");
            return (Criteria) this;
        }

        public Criteria andHptypeIsNotNull() {
            addCriterion("hptype is not null");
            return (Criteria) this;
        }

        public Criteria andHptypeEqualTo(String value) {
            addCriterion("hptype =", value, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeNotEqualTo(String value) {
            addCriterion("hptype <>", value, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeGreaterThan(String value) {
            addCriterion("hptype >", value, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeGreaterThanOrEqualTo(String value) {
            addCriterion("hptype >=", value, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeLessThan(String value) {
            addCriterion("hptype <", value, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeLessThanOrEqualTo(String value) {
            addCriterion("hptype <=", value, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeLike(String value) {
            addCriterion("hptype like", value, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeNotLike(String value) {
            addCriterion("hptype not like", value, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeIn(List<String> values) {
            addCriterion("hptype in", values, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeNotIn(List<String> values) {
            addCriterion("hptype not in", values, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeBetween(String value1, String value2) {
            addCriterion("hptype between", value1, value2, "hptype");
            return (Criteria) this;
        }

        public Criteria andHptypeNotBetween(String value1, String value2) {
            addCriterion("hptype not between", value1, value2, "hptype");
            return (Criteria) this;
        }

        public Criteria andSunhpIsNull() {
            addCriterion("sunhp is null");
            return (Criteria) this;
        }

        public Criteria andSunhpIsNotNull() {
            addCriterion("sunhp is not null");
            return (Criteria) this;
        }

        public Criteria andSunhpEqualTo(String value) {
            addCriterion("sunhp =", value, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpNotEqualTo(String value) {
            addCriterion("sunhp <>", value, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpGreaterThan(String value) {
            addCriterion("sunhp >", value, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpGreaterThanOrEqualTo(String value) {
            addCriterion("sunhp >=", value, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpLessThan(String value) {
            addCriterion("sunhp <", value, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpLessThanOrEqualTo(String value) {
            addCriterion("sunhp <=", value, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpLike(String value) {
            addCriterion("sunhp like", value, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpNotLike(String value) {
            addCriterion("sunhp not like", value, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpIn(List<String> values) {
            addCriterion("sunhp in", values, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpNotIn(List<String> values) {
            addCriterion("sunhp not in", values, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpBetween(String value1, String value2) {
            addCriterion("sunhp between", value1, value2, "sunhp");
            return (Criteria) this;
        }

        public Criteria andSunhpNotBetween(String value1, String value2) {
            addCriterion("sunhp not between", value1, value2, "sunhp");
            return (Criteria) this;
        }

        public Criteria andStocknameIsNull() {
            addCriterion("stockname is null");
            return (Criteria) this;
        }

        public Criteria andStocknameIsNotNull() {
            addCriterion("stockname is not null");
            return (Criteria) this;
        }

        public Criteria andStocknameEqualTo(String value) {
            addCriterion("stockname =", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotEqualTo(String value) {
            addCriterion("stockname <>", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameGreaterThan(String value) {
            addCriterion("stockname >", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameGreaterThanOrEqualTo(String value) {
            addCriterion("stockname >=", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLessThan(String value) {
            addCriterion("stockname <", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLessThanOrEqualTo(String value) {
            addCriterion("stockname <=", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameLike(String value) {
            addCriterion("stockname like", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotLike(String value) {
            addCriterion("stockname not like", value, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameIn(List<String> values) {
            addCriterion("stockname in", values, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotIn(List<String> values) {
            addCriterion("stockname not in", values, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameBetween(String value1, String value2) {
            addCriterion("stockname between", value1, value2, "stockname");
            return (Criteria) this;
        }

        public Criteria andStocknameNotBetween(String value1, String value2) {
            addCriterion("stockname not between", value1, value2, "stockname");
            return (Criteria) this;
        }

        public Criteria andStockaddrIsNull() {
            addCriterion("stockaddr is null");
            return (Criteria) this;
        }

        public Criteria andStockaddrIsNotNull() {
            addCriterion("stockaddr is not null");
            return (Criteria) this;
        }

        public Criteria andStockaddrEqualTo(String value) {
            addCriterion("stockaddr =", value, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrNotEqualTo(String value) {
            addCriterion("stockaddr <>", value, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrGreaterThan(String value) {
            addCriterion("stockaddr >", value, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrGreaterThanOrEqualTo(String value) {
            addCriterion("stockaddr >=", value, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrLessThan(String value) {
            addCriterion("stockaddr <", value, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrLessThanOrEqualTo(String value) {
            addCriterion("stockaddr <=", value, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrLike(String value) {
            addCriterion("stockaddr like", value, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrNotLike(String value) {
            addCriterion("stockaddr not like", value, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrIn(List<String> values) {
            addCriterion("stockaddr in", values, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrNotIn(List<String> values) {
            addCriterion("stockaddr not in", values, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrBetween(String value1, String value2) {
            addCriterion("stockaddr between", value1, value2, "stockaddr");
            return (Criteria) this;
        }

        public Criteria andStockaddrNotBetween(String value1, String value2) {
            addCriterion("stockaddr not between", value1, value2, "stockaddr");
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

        public Criteria andFixcostEqualTo(String value) {
            addCriterion("fixcost =", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostNotEqualTo(String value) {
            addCriterion("fixcost <>", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostGreaterThan(String value) {
            addCriterion("fixcost >", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostGreaterThanOrEqualTo(String value) {
            addCriterion("fixcost >=", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostLessThan(String value) {
            addCriterion("fixcost <", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostLessThanOrEqualTo(String value) {
            addCriterion("fixcost <=", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostLike(String value) {
            addCriterion("fixcost like", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostNotLike(String value) {
            addCriterion("fixcost not like", value, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostIn(List<String> values) {
            addCriterion("fixcost in", values, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostNotIn(List<String> values) {
            addCriterion("fixcost not in", values, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostBetween(String value1, String value2) {
            addCriterion("fixcost between", value1, value2, "fixcost");
            return (Criteria) this;
        }

        public Criteria andFixcostNotBetween(String value1, String value2) {
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