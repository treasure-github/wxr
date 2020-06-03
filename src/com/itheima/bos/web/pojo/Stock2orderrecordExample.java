package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Stock2orderrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Stock2orderrecordExample() {
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

        public Criteria andOldtypenameIsNull() {
            addCriterion("oldtypename is null");
            return (Criteria) this;
        }

        public Criteria andOldtypenameIsNotNull() {
            addCriterion("oldtypename is not null");
            return (Criteria) this;
        }

        public Criteria andOldtypenameEqualTo(String value) {
            addCriterion("oldtypename =", value, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameNotEqualTo(String value) {
            addCriterion("oldtypename <>", value, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameGreaterThan(String value) {
            addCriterion("oldtypename >", value, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("oldtypename >=", value, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameLessThan(String value) {
            addCriterion("oldtypename <", value, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameLessThanOrEqualTo(String value) {
            addCriterion("oldtypename <=", value, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameLike(String value) {
            addCriterion("oldtypename like", value, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameNotLike(String value) {
            addCriterion("oldtypename not like", value, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameIn(List<String> values) {
            addCriterion("oldtypename in", values, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameNotIn(List<String> values) {
            addCriterion("oldtypename not in", values, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameBetween(String value1, String value2) {
            addCriterion("oldtypename between", value1, value2, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenameNotBetween(String value1, String value2) {
            addCriterion("oldtypename not between", value1, value2, "oldtypename");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameIsNull() {
            addCriterion("oldtypenoname is null");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameIsNotNull() {
            addCriterion("oldtypenoname is not null");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameEqualTo(String value) {
            addCriterion("oldtypenoname =", value, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameNotEqualTo(String value) {
            addCriterion("oldtypenoname <>", value, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameGreaterThan(String value) {
            addCriterion("oldtypenoname >", value, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameGreaterThanOrEqualTo(String value) {
            addCriterion("oldtypenoname >=", value, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameLessThan(String value) {
            addCriterion("oldtypenoname <", value, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameLessThanOrEqualTo(String value) {
            addCriterion("oldtypenoname <=", value, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameLike(String value) {
            addCriterion("oldtypenoname like", value, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameNotLike(String value) {
            addCriterion("oldtypenoname not like", value, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameIn(List<String> values) {
            addCriterion("oldtypenoname in", values, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameNotIn(List<String> values) {
            addCriterion("oldtypenoname not in", values, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameBetween(String value1, String value2) {
            addCriterion("oldtypenoname between", value1, value2, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOldtypenonameNotBetween(String value1, String value2) {
            addCriterion("oldtypenoname not between", value1, value2, "oldtypenoname");
            return (Criteria) this;
        }

        public Criteria andOlrbrandIsNull() {
            addCriterion("olrbrand is null");
            return (Criteria) this;
        }

        public Criteria andOlrbrandIsNotNull() {
            addCriterion("olrbrand is not null");
            return (Criteria) this;
        }

        public Criteria andOlrbrandEqualTo(String value) {
            addCriterion("olrbrand =", value, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandNotEqualTo(String value) {
            addCriterion("olrbrand <>", value, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandGreaterThan(String value) {
            addCriterion("olrbrand >", value, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandGreaterThanOrEqualTo(String value) {
            addCriterion("olrbrand >=", value, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandLessThan(String value) {
            addCriterion("olrbrand <", value, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandLessThanOrEqualTo(String value) {
            addCriterion("olrbrand <=", value, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandLike(String value) {
            addCriterion("olrbrand like", value, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandNotLike(String value) {
            addCriterion("olrbrand not like", value, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandIn(List<String> values) {
            addCriterion("olrbrand in", values, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandNotIn(List<String> values) {
            addCriterion("olrbrand not in", values, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandBetween(String value1, String value2) {
            addCriterion("olrbrand between", value1, value2, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andOlrbrandNotBetween(String value1, String value2) {
            addCriterion("olrbrand not between", value1, value2, "olrbrand");
            return (Criteria) this;
        }

        public Criteria andChangnumIsNull() {
            addCriterion("changnum is null");
            return (Criteria) this;
        }

        public Criteria andChangnumIsNotNull() {
            addCriterion("changnum is not null");
            return (Criteria) this;
        }

        public Criteria andChangnumEqualTo(Integer value) {
            addCriterion("changnum =", value, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumNotEqualTo(Integer value) {
            addCriterion("changnum <>", value, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumGreaterThan(Integer value) {
            addCriterion("changnum >", value, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("changnum >=", value, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumLessThan(Integer value) {
            addCriterion("changnum <", value, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumLessThanOrEqualTo(Integer value) {
            addCriterion("changnum <=", value, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumIn(List<Integer> values) {
            addCriterion("changnum in", values, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumNotIn(List<Integer> values) {
            addCriterion("changnum not in", values, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumBetween(Integer value1, Integer value2) {
            addCriterion("changnum between", value1, value2, "changnum");
            return (Criteria) this;
        }

        public Criteria andChangnumNotBetween(Integer value1, Integer value2) {
            addCriterion("changnum not between", value1, value2, "changnum");
            return (Criteria) this;
        }

        public Criteria andWcqkIsNull() {
            addCriterion("wcqk is null");
            return (Criteria) this;
        }

        public Criteria andWcqkIsNotNull() {
            addCriterion("wcqk is not null");
            return (Criteria) this;
        }

        public Criteria andWcqkEqualTo(String value) {
            addCriterion("wcqk =", value, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkNotEqualTo(String value) {
            addCriterion("wcqk <>", value, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkGreaterThan(String value) {
            addCriterion("wcqk >", value, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkGreaterThanOrEqualTo(String value) {
            addCriterion("wcqk >=", value, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkLessThan(String value) {
            addCriterion("wcqk <", value, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkLessThanOrEqualTo(String value) {
            addCriterion("wcqk <=", value, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkLike(String value) {
            addCriterion("wcqk like", value, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkNotLike(String value) {
            addCriterion("wcqk not like", value, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkIn(List<String> values) {
            addCriterion("wcqk in", values, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkNotIn(List<String> values) {
            addCriterion("wcqk not in", values, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkBetween(String value1, String value2) {
            addCriterion("wcqk between", value1, value2, "wcqk");
            return (Criteria) this;
        }

        public Criteria andWcqkNotBetween(String value1, String value2) {
            addCriterion("wcqk not between", value1, value2, "wcqk");
            return (Criteria) this;
        }

        public Criteria andNewconfIsNull() {
            addCriterion("newconf is null");
            return (Criteria) this;
        }

        public Criteria andNewconfIsNotNull() {
            addCriterion("newconf is not null");
            return (Criteria) this;
        }

        public Criteria andNewconfEqualTo(String value) {
            addCriterion("newconf =", value, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfNotEqualTo(String value) {
            addCriterion("newconf <>", value, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfGreaterThan(String value) {
            addCriterion("newconf >", value, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfGreaterThanOrEqualTo(String value) {
            addCriterion("newconf >=", value, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfLessThan(String value) {
            addCriterion("newconf <", value, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfLessThanOrEqualTo(String value) {
            addCriterion("newconf <=", value, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfLike(String value) {
            addCriterion("newconf like", value, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfNotLike(String value) {
            addCriterion("newconf not like", value, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfIn(List<String> values) {
            addCriterion("newconf in", values, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfNotIn(List<String> values) {
            addCriterion("newconf not in", values, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfBetween(String value1, String value2) {
            addCriterion("newconf between", value1, value2, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewconfNotBetween(String value1, String value2) {
            addCriterion("newconf not between", value1, value2, "newconf");
            return (Criteria) this;
        }

        public Criteria andNewtypenameIsNull() {
            addCriterion("newtypename is null");
            return (Criteria) this;
        }

        public Criteria andNewtypenameIsNotNull() {
            addCriterion("newtypename is not null");
            return (Criteria) this;
        }

        public Criteria andNewtypenameEqualTo(String value) {
            addCriterion("newtypename =", value, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameNotEqualTo(String value) {
            addCriterion("newtypename <>", value, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameGreaterThan(String value) {
            addCriterion("newtypename >", value, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("newtypename >=", value, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameLessThan(String value) {
            addCriterion("newtypename <", value, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameLessThanOrEqualTo(String value) {
            addCriterion("newtypename <=", value, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameLike(String value) {
            addCriterion("newtypename like", value, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameNotLike(String value) {
            addCriterion("newtypename not like", value, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameIn(List<String> values) {
            addCriterion("newtypename in", values, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameNotIn(List<String> values) {
            addCriterion("newtypename not in", values, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameBetween(String value1, String value2) {
            addCriterion("newtypename between", value1, value2, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenameNotBetween(String value1, String value2) {
            addCriterion("newtypename not between", value1, value2, "newtypename");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameIsNull() {
            addCriterion("newtypenoname is null");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameIsNotNull() {
            addCriterion("newtypenoname is not null");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameEqualTo(String value) {
            addCriterion("newtypenoname =", value, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameNotEqualTo(String value) {
            addCriterion("newtypenoname <>", value, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameGreaterThan(String value) {
            addCriterion("newtypenoname >", value, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameGreaterThanOrEqualTo(String value) {
            addCriterion("newtypenoname >=", value, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameLessThan(String value) {
            addCriterion("newtypenoname <", value, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameLessThanOrEqualTo(String value) {
            addCriterion("newtypenoname <=", value, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameLike(String value) {
            addCriterion("newtypenoname like", value, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameNotLike(String value) {
            addCriterion("newtypenoname not like", value, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameIn(List<String> values) {
            addCriterion("newtypenoname in", values, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameNotIn(List<String> values) {
            addCriterion("newtypenoname not in", values, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameBetween(String value1, String value2) {
            addCriterion("newtypenoname between", value1, value2, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewtypenonameNotBetween(String value1, String value2) {
            addCriterion("newtypenoname not between", value1, value2, "newtypenoname");
            return (Criteria) this;
        }

        public Criteria andNewbrandIsNull() {
            addCriterion("newbrand is null");
            return (Criteria) this;
        }

        public Criteria andNewbrandIsNotNull() {
            addCriterion("newbrand is not null");
            return (Criteria) this;
        }

        public Criteria andNewbrandEqualTo(String value) {
            addCriterion("newbrand =", value, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandNotEqualTo(String value) {
            addCriterion("newbrand <>", value, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandGreaterThan(String value) {
            addCriterion("newbrand >", value, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandGreaterThanOrEqualTo(String value) {
            addCriterion("newbrand >=", value, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandLessThan(String value) {
            addCriterion("newbrand <", value, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandLessThanOrEqualTo(String value) {
            addCriterion("newbrand <=", value, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandLike(String value) {
            addCriterion("newbrand like", value, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandNotLike(String value) {
            addCriterion("newbrand not like", value, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandIn(List<String> values) {
            addCriterion("newbrand in", values, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandNotIn(List<String> values) {
            addCriterion("newbrand not in", values, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandBetween(String value1, String value2) {
            addCriterion("newbrand between", value1, value2, "newbrand");
            return (Criteria) this;
        }

        public Criteria andNewbrandNotBetween(String value1, String value2) {
            addCriterion("newbrand not between", value1, value2, "newbrand");
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

        public Criteria andChangetimeIsNull() {
            addCriterion("changetime is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("changetime is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterion("changetime =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterion("changetime <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterion("changetime >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("changetime >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterion("changetime <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterion("changetime <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterion("changetime in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterion("changetime not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterion("changetime between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterion("changetime not between", value1, value2, "changetime");
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