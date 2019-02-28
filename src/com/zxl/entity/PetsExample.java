package com.zxl.entity;

import java.util.ArrayList;
import java.util.List;

public class PetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetsExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pId is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pId is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pId =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pId <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pId >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pId >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pId <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pId <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pId in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pId not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pId between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pId not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pName is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pName is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pName =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pName <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pName >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pName >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pName <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pName <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pName like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pName not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pName in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pName not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pName between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pName not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPownerIsNull() {
            addCriterion("pOwner is null");
            return (Criteria) this;
        }

        public Criteria andPownerIsNotNull() {
            addCriterion("pOwner is not null");
            return (Criteria) this;
        }

        public Criteria andPownerEqualTo(String value) {
            addCriterion("pOwner =", value, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerNotEqualTo(String value) {
            addCriterion("pOwner <>", value, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerGreaterThan(String value) {
            addCriterion("pOwner >", value, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerGreaterThanOrEqualTo(String value) {
            addCriterion("pOwner >=", value, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerLessThan(String value) {
            addCriterion("pOwner <", value, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerLessThanOrEqualTo(String value) {
            addCriterion("pOwner <=", value, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerLike(String value) {
            addCriterion("pOwner like", value, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerNotLike(String value) {
            addCriterion("pOwner not like", value, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerIn(List<String> values) {
            addCriterion("pOwner in", values, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerNotIn(List<String> values) {
            addCriterion("pOwner not in", values, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerBetween(String value1, String value2) {
            addCriterion("pOwner between", value1, value2, "powner");
            return (Criteria) this;
        }

        public Criteria andPownerNotBetween(String value1, String value2) {
            addCriterion("pOwner not between", value1, value2, "powner");
            return (Criteria) this;
        }

        public Criteria andPoidcardIsNull() {
            addCriterion("pOIdCard is null");
            return (Criteria) this;
        }

        public Criteria andPoidcardIsNotNull() {
            addCriterion("pOIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andPoidcardEqualTo(String value) {
            addCriterion("pOIdCard =", value, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardNotEqualTo(String value) {
            addCriterion("pOIdCard <>", value, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardGreaterThan(String value) {
            addCriterion("pOIdCard >", value, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardGreaterThanOrEqualTo(String value) {
            addCriterion("pOIdCard >=", value, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardLessThan(String value) {
            addCriterion("pOIdCard <", value, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardLessThanOrEqualTo(String value) {
            addCriterion("pOIdCard <=", value, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardLike(String value) {
            addCriterion("pOIdCard like", value, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardNotLike(String value) {
            addCriterion("pOIdCard not like", value, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardIn(List<String> values) {
            addCriterion("pOIdCard in", values, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardNotIn(List<String> values) {
            addCriterion("pOIdCard not in", values, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardBetween(String value1, String value2) {
            addCriterion("pOIdCard between", value1, value2, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPoidcardNotBetween(String value1, String value2) {
            addCriterion("pOIdCard not between", value1, value2, "poidcard");
            return (Criteria) this;
        }

        public Criteria andPsexIsNull() {
            addCriterion("pSex is null");
            return (Criteria) this;
        }

        public Criteria andPsexIsNotNull() {
            addCriterion("pSex is not null");
            return (Criteria) this;
        }

        public Criteria andPsexEqualTo(String value) {
            addCriterion("pSex =", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotEqualTo(String value) {
            addCriterion("pSex <>", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThan(String value) {
            addCriterion("pSex >", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexGreaterThanOrEqualTo(String value) {
            addCriterion("pSex >=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThan(String value) {
            addCriterion("pSex <", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLessThanOrEqualTo(String value) {
            addCriterion("pSex <=", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexLike(String value) {
            addCriterion("pSex like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotLike(String value) {
            addCriterion("pSex not like", value, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexIn(List<String> values) {
            addCriterion("pSex in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotIn(List<String> values) {
            addCriterion("pSex not in", values, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexBetween(String value1, String value2) {
            addCriterion("pSex between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPsexNotBetween(String value1, String value2) {
            addCriterion("pSex not between", value1, value2, "psex");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("pAge is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("pAge is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(Double value) {
            addCriterion("pAge =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(Double value) {
            addCriterion("pAge <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(Double value) {
            addCriterion("pAge >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(Double value) {
            addCriterion("pAge >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(Double value) {
            addCriterion("pAge <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(Double value) {
            addCriterion("pAge <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<Double> values) {
            addCriterion("pAge in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<Double> values) {
            addCriterion("pAge not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(Double value1, Double value2) {
            addCriterion("pAge between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(Double value1, Double value2) {
            addCriterion("pAge not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andBreidIsNull() {
            addCriterion("breId is null");
            return (Criteria) this;
        }

        public Criteria andBreidIsNotNull() {
            addCriterion("breId is not null");
            return (Criteria) this;
        }

        public Criteria andBreidEqualTo(Integer value) {
            addCriterion("breId =", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidNotEqualTo(Integer value) {
            addCriterion("breId <>", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidGreaterThan(Integer value) {
            addCriterion("breId >", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidGreaterThanOrEqualTo(Integer value) {
            addCriterion("breId >=", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidLessThan(Integer value) {
            addCriterion("breId <", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidLessThanOrEqualTo(Integer value) {
            addCriterion("breId <=", value, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidIn(List<Integer> values) {
            addCriterion("breId in", values, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidNotIn(List<Integer> values) {
            addCriterion("breId not in", values, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidBetween(Integer value1, Integer value2) {
            addCriterion("breId between", value1, value2, "breid");
            return (Criteria) this;
        }

        public Criteria andBreidNotBetween(Integer value1, Integer value2) {
            addCriterion("breId not between", value1, value2, "breid");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andDietaryIsNull() {
            addCriterion("dietary is null");
            return (Criteria) this;
        }

        public Criteria andDietaryIsNotNull() {
            addCriterion("dietary is not null");
            return (Criteria) this;
        }

        public Criteria andDietaryEqualTo(String value) {
            addCriterion("dietary =", value, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryNotEqualTo(String value) {
            addCriterion("dietary <>", value, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryGreaterThan(String value) {
            addCriterion("dietary >", value, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryGreaterThanOrEqualTo(String value) {
            addCriterion("dietary >=", value, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryLessThan(String value) {
            addCriterion("dietary <", value, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryLessThanOrEqualTo(String value) {
            addCriterion("dietary <=", value, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryLike(String value) {
            addCriterion("dietary like", value, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryNotLike(String value) {
            addCriterion("dietary not like", value, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryIn(List<String> values) {
            addCriterion("dietary in", values, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryNotIn(List<String> values) {
            addCriterion("dietary not in", values, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryBetween(String value1, String value2) {
            addCriterion("dietary between", value1, value2, "dietary");
            return (Criteria) this;
        }

        public Criteria andDietaryNotBetween(String value1, String value2) {
            addCriterion("dietary not between", value1, value2, "dietary");
            return (Criteria) this;
        }

        public Criteria andSterilizingIsNull() {
            addCriterion("sterilizing is null");
            return (Criteria) this;
        }

        public Criteria andSterilizingIsNotNull() {
            addCriterion("sterilizing is not null");
            return (Criteria) this;
        }

        public Criteria andSterilizingEqualTo(String value) {
            addCriterion("sterilizing =", value, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingNotEqualTo(String value) {
            addCriterion("sterilizing <>", value, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingGreaterThan(String value) {
            addCriterion("sterilizing >", value, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingGreaterThanOrEqualTo(String value) {
            addCriterion("sterilizing >=", value, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingLessThan(String value) {
            addCriterion("sterilizing <", value, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingLessThanOrEqualTo(String value) {
            addCriterion("sterilizing <=", value, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingLike(String value) {
            addCriterion("sterilizing like", value, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingNotLike(String value) {
            addCriterion("sterilizing not like", value, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingIn(List<String> values) {
            addCriterion("sterilizing in", values, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingNotIn(List<String> values) {
            addCriterion("sterilizing not in", values, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingBetween(String value1, String value2) {
            addCriterion("sterilizing between", value1, value2, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andSterilizingNotBetween(String value1, String value2) {
            addCriterion("sterilizing not between", value1, value2, "sterilizing");
            return (Criteria) this;
        }

        public Criteria andPpicIsNull() {
            addCriterion("pPic is null");
            return (Criteria) this;
        }

        public Criteria andPpicIsNotNull() {
            addCriterion("pPic is not null");
            return (Criteria) this;
        }

        public Criteria andPpicEqualTo(String value) {
            addCriterion("pPic =", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotEqualTo(String value) {
            addCriterion("pPic <>", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicGreaterThan(String value) {
            addCriterion("pPic >", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicGreaterThanOrEqualTo(String value) {
            addCriterion("pPic >=", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLessThan(String value) {
            addCriterion("pPic <", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLessThanOrEqualTo(String value) {
            addCriterion("pPic <=", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicLike(String value) {
            addCriterion("pPic like", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotLike(String value) {
            addCriterion("pPic not like", value, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicIn(List<String> values) {
            addCriterion("pPic in", values, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotIn(List<String> values) {
            addCriterion("pPic not in", values, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicBetween(String value1, String value2) {
            addCriterion("pPic between", value1, value2, "ppic");
            return (Criteria) this;
        }

        public Criteria andPpicNotBetween(String value1, String value2) {
            addCriterion("pPic not between", value1, value2, "ppic");
            return (Criteria) this;
        }

        public Criteria andOwnertelIsNull() {
            addCriterion("ownerTel is null");
            return (Criteria) this;
        }

        public Criteria andOwnertelIsNotNull() {
            addCriterion("ownerTel is not null");
            return (Criteria) this;
        }

        public Criteria andOwnertelEqualTo(Byte value) {
            addCriterion("ownerTel =", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotEqualTo(Byte value) {
            addCriterion("ownerTel <>", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelGreaterThan(Byte value) {
            addCriterion("ownerTel >", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelGreaterThanOrEqualTo(Byte value) {
            addCriterion("ownerTel >=", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelLessThan(Byte value) {
            addCriterion("ownerTel <", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelLessThanOrEqualTo(Byte value) {
            addCriterion("ownerTel <=", value, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelIn(List<Byte> values) {
            addCriterion("ownerTel in", values, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotIn(List<Byte> values) {
            addCriterion("ownerTel not in", values, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelBetween(Byte value1, Byte value2) {
            addCriterion("ownerTel between", value1, value2, "ownertel");
            return (Criteria) this;
        }

        public Criteria andOwnertelNotBetween(Byte value1, Byte value2) {
            addCriterion("ownerTel not between", value1, value2, "ownertel");
            return (Criteria) this;
        }

        public Criteria andDocidIsNull() {
            addCriterion("docId is null");
            return (Criteria) this;
        }

        public Criteria andDocidIsNotNull() {
            addCriterion("docId is not null");
            return (Criteria) this;
        }

        public Criteria andDocidEqualTo(Integer value) {
            addCriterion("docId =", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotEqualTo(Integer value) {
            addCriterion("docId <>", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThan(Integer value) {
            addCriterion("docId >", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docId >=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThan(Integer value) {
            addCriterion("docId <", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThanOrEqualTo(Integer value) {
            addCriterion("docId <=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidIn(List<Integer> values) {
            addCriterion("docId in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotIn(List<Integer> values) {
            addCriterion("docId not in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidBetween(Integer value1, Integer value2) {
            addCriterion("docId between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotBetween(Integer value1, Integer value2) {
            addCriterion("docId not between", value1, value2, "docid");
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