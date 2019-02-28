package com.zxl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticlesExample() {
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

        public Criteria andArtidIsNull() {
            addCriterion("artId is null");
            return (Criteria) this;
        }

        public Criteria andArtidIsNotNull() {
            addCriterion("artId is not null");
            return (Criteria) this;
        }

        public Criteria andArtidEqualTo(Integer value) {
            addCriterion("artId =", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotEqualTo(Integer value) {
            addCriterion("artId <>", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidGreaterThan(Integer value) {
            addCriterion("artId >", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("artId >=", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidLessThan(Integer value) {
            addCriterion("artId <", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidLessThanOrEqualTo(Integer value) {
            addCriterion("artId <=", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidIn(List<Integer> values) {
            addCriterion("artId in", values, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotIn(List<Integer> values) {
            addCriterion("artId not in", values, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidBetween(Integer value1, Integer value2) {
            addCriterion("artId between", value1, value2, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotBetween(Integer value1, Integer value2) {
            addCriterion("artId not between", value1, value2, "artid");
            return (Criteria) this;
        }

        public Criteria andArtauthIsNull() {
            addCriterion("artAuth is null");
            return (Criteria) this;
        }

        public Criteria andArtauthIsNotNull() {
            addCriterion("artAuth is not null");
            return (Criteria) this;
        }

        public Criteria andArtauthEqualTo(String value) {
            addCriterion("artAuth =", value, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthNotEqualTo(String value) {
            addCriterion("artAuth <>", value, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthGreaterThan(String value) {
            addCriterion("artAuth >", value, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthGreaterThanOrEqualTo(String value) {
            addCriterion("artAuth >=", value, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthLessThan(String value) {
            addCriterion("artAuth <", value, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthLessThanOrEqualTo(String value) {
            addCriterion("artAuth <=", value, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthLike(String value) {
            addCriterion("artAuth like", value, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthNotLike(String value) {
            addCriterion("artAuth not like", value, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthIn(List<String> values) {
            addCriterion("artAuth in", values, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthNotIn(List<String> values) {
            addCriterion("artAuth not in", values, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthBetween(String value1, String value2) {
            addCriterion("artAuth between", value1, value2, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtauthNotBetween(String value1, String value2) {
            addCriterion("artAuth not between", value1, value2, "artauth");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeIsNull() {
            addCriterion("artCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeIsNotNull() {
            addCriterion("artCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeEqualTo(Date value) {
            addCriterion("artCreateTime =", value, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeNotEqualTo(Date value) {
            addCriterion("artCreateTime <>", value, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeGreaterThan(Date value) {
            addCriterion("artCreateTime >", value, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("artCreateTime >=", value, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeLessThan(Date value) {
            addCriterion("artCreateTime <", value, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("artCreateTime <=", value, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeIn(List<Date> values) {
            addCriterion("artCreateTime in", values, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeNotIn(List<Date> values) {
            addCriterion("artCreateTime not in", values, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeBetween(Date value1, Date value2) {
            addCriterion("artCreateTime between", value1, value2, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("artCreateTime not between", value1, value2, "artcreatetime");
            return (Criteria) this;
        }

        public Criteria andArtpicIsNull() {
            addCriterion("artPic is null");
            return (Criteria) this;
        }

        public Criteria andArtpicIsNotNull() {
            addCriterion("artPic is not null");
            return (Criteria) this;
        }

        public Criteria andArtpicEqualTo(String value) {
            addCriterion("artPic =", value, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicNotEqualTo(String value) {
            addCriterion("artPic <>", value, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicGreaterThan(String value) {
            addCriterion("artPic >", value, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicGreaterThanOrEqualTo(String value) {
            addCriterion("artPic >=", value, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicLessThan(String value) {
            addCriterion("artPic <", value, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicLessThanOrEqualTo(String value) {
            addCriterion("artPic <=", value, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicLike(String value) {
            addCriterion("artPic like", value, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicNotLike(String value) {
            addCriterion("artPic not like", value, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicIn(List<String> values) {
            addCriterion("artPic in", values, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicNotIn(List<String> values) {
            addCriterion("artPic not in", values, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicBetween(String value1, String value2) {
            addCriterion("artPic between", value1, value2, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtpicNotBetween(String value1, String value2) {
            addCriterion("artPic not between", value1, value2, "artpic");
            return (Criteria) this;
        }

        public Criteria andArtclassifyIsNull() {
            addCriterion("artClassify is null");
            return (Criteria) this;
        }

        public Criteria andArtclassifyIsNotNull() {
            addCriterion("artClassify is not null");
            return (Criteria) this;
        }

        public Criteria andArtclassifyEqualTo(String value) {
            addCriterion("artClassify =", value, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyNotEqualTo(String value) {
            addCriterion("artClassify <>", value, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyGreaterThan(String value) {
            addCriterion("artClassify >", value, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("artClassify >=", value, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyLessThan(String value) {
            addCriterion("artClassify <", value, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyLessThanOrEqualTo(String value) {
            addCriterion("artClassify <=", value, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyLike(String value) {
            addCriterion("artClassify like", value, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyNotLike(String value) {
            addCriterion("artClassify not like", value, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyIn(List<String> values) {
            addCriterion("artClassify in", values, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyNotIn(List<String> values) {
            addCriterion("artClassify not in", values, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyBetween(String value1, String value2) {
            addCriterion("artClassify between", value1, value2, "artclassify");
            return (Criteria) this;
        }

        public Criteria andArtclassifyNotBetween(String value1, String value2) {
            addCriterion("artClassify not between", value1, value2, "artclassify");
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