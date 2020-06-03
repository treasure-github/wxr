package com.itheima.bos.web.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andCompanyphoneIsNull() {
            addCriterion("companyphone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIsNotNull() {
            addCriterion("companyphone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneEqualTo(String value) {
            addCriterion("companyphone =", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotEqualTo(String value) {
            addCriterion("companyphone <>", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThan(String value) {
            addCriterion("companyphone >", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("companyphone >=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThan(String value) {
            addCriterion("companyphone <", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThanOrEqualTo(String value) {
            addCriterion("companyphone <=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLike(String value) {
            addCriterion("companyphone like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotLike(String value) {
            addCriterion("companyphone not like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIn(List<String> values) {
            addCriterion("companyphone in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotIn(List<String> values) {
            addCriterion("companyphone not in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneBetween(String value1, String value2) {
            addCriterion("companyphone between", value1, value2, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotBetween(String value1, String value2) {
            addCriterion("companyphone not between", value1, value2, "companyphone");
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

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andHomeaddresIsNull() {
            addCriterion("homeaddres is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddresIsNotNull() {
            addCriterion("homeaddres is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddresEqualTo(String value) {
            addCriterion("homeaddres =", value, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresNotEqualTo(String value) {
            addCriterion("homeaddres <>", value, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresGreaterThan(String value) {
            addCriterion("homeaddres >", value, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresGreaterThanOrEqualTo(String value) {
            addCriterion("homeaddres >=", value, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresLessThan(String value) {
            addCriterion("homeaddres <", value, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresLessThanOrEqualTo(String value) {
            addCriterion("homeaddres <=", value, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresLike(String value) {
            addCriterion("homeaddres like", value, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresNotLike(String value) {
            addCriterion("homeaddres not like", value, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresIn(List<String> values) {
            addCriterion("homeaddres in", values, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresNotIn(List<String> values) {
            addCriterion("homeaddres not in", values, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresBetween(String value1, String value2) {
            addCriterion("homeaddres between", value1, value2, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andHomeaddresNotBetween(String value1, String value2) {
            addCriterion("homeaddres not between", value1, value2, "homeaddres");
            return (Criteria) this;
        }

        public Criteria andUrgentmanIsNull() {
            addCriterion("urgentman is null");
            return (Criteria) this;
        }

        public Criteria andUrgentmanIsNotNull() {
            addCriterion("urgentman is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentmanEqualTo(String value) {
            addCriterion("urgentman =", value, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanNotEqualTo(String value) {
            addCriterion("urgentman <>", value, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanGreaterThan(String value) {
            addCriterion("urgentman >", value, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanGreaterThanOrEqualTo(String value) {
            addCriterion("urgentman >=", value, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanLessThan(String value) {
            addCriterion("urgentman <", value, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanLessThanOrEqualTo(String value) {
            addCriterion("urgentman <=", value, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanLike(String value) {
            addCriterion("urgentman like", value, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanNotLike(String value) {
            addCriterion("urgentman not like", value, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanIn(List<String> values) {
            addCriterion("urgentman in", values, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanNotIn(List<String> values) {
            addCriterion("urgentman not in", values, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanBetween(String value1, String value2) {
            addCriterion("urgentman between", value1, value2, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanNotBetween(String value1, String value2) {
            addCriterion("urgentman not between", value1, value2, "urgentman");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneIsNull() {
            addCriterion("urgentmanphone is null");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneIsNotNull() {
            addCriterion("urgentmanphone is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneEqualTo(String value) {
            addCriterion("urgentmanphone =", value, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneNotEqualTo(String value) {
            addCriterion("urgentmanphone <>", value, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneGreaterThan(String value) {
            addCriterion("urgentmanphone >", value, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneGreaterThanOrEqualTo(String value) {
            addCriterion("urgentmanphone >=", value, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneLessThan(String value) {
            addCriterion("urgentmanphone <", value, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneLessThanOrEqualTo(String value) {
            addCriterion("urgentmanphone <=", value, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneLike(String value) {
            addCriterion("urgentmanphone like", value, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneNotLike(String value) {
            addCriterion("urgentmanphone not like", value, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneIn(List<String> values) {
            addCriterion("urgentmanphone in", values, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneNotIn(List<String> values) {
            addCriterion("urgentmanphone not in", values, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneBetween(String value1, String value2) {
            addCriterion("urgentmanphone between", value1, value2, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andUrgentmanphoneNotBetween(String value1, String value2) {
            addCriterion("urgentmanphone not between", value1, value2, "urgentmanphone");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeIsNull() {
            addCriterion("beginjobtime is null");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeIsNotNull() {
            addCriterion("beginjobtime is not null");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeEqualTo(Date value) {
            addCriterion("beginjobtime =", value, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeNotEqualTo(Date value) {
            addCriterion("beginjobtime <>", value, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeGreaterThan(Date value) {
            addCriterion("beginjobtime >", value, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beginjobtime >=", value, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeLessThan(Date value) {
            addCriterion("beginjobtime <", value, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeLessThanOrEqualTo(Date value) {
            addCriterion("beginjobtime <=", value, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeIn(List<Date> values) {
            addCriterion("beginjobtime in", values, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeNotIn(List<Date> values) {
            addCriterion("beginjobtime not in", values, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeBetween(Date value1, Date value2) {
            addCriterion("beginjobtime between", value1, value2, "beginjobtime");
            return (Criteria) this;
        }

        public Criteria andBeginjobtimeNotBetween(Date value1, Date value2) {
            addCriterion("beginjobtime not between", value1, value2, "beginjobtime");
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