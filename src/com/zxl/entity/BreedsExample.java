package com.zxl.entity;

import java.util.ArrayList;
import java.util.List;

public class BreedsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BreedsExample() {
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

        public Criteria andBrenameIsNull() {
            addCriterion("breName is null");
            return (Criteria) this;
        }

        public Criteria andBrenameIsNotNull() {
            addCriterion("breName is not null");
            return (Criteria) this;
        }

        public Criteria andBrenameEqualTo(String value) {
            addCriterion("breName =", value, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameNotEqualTo(String value) {
            addCriterion("breName <>", value, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameGreaterThan(String value) {
            addCriterion("breName >", value, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameGreaterThanOrEqualTo(String value) {
            addCriterion("breName >=", value, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameLessThan(String value) {
            addCriterion("breName <", value, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameLessThanOrEqualTo(String value) {
            addCriterion("breName <=", value, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameLike(String value) {
            addCriterion("breName like", value, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameNotLike(String value) {
            addCriterion("breName not like", value, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameIn(List<String> values) {
            addCriterion("breName in", values, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameNotIn(List<String> values) {
            addCriterion("breName not in", values, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameBetween(String value1, String value2) {
            addCriterion("breName between", value1, value2, "brename");
            return (Criteria) this;
        }

        public Criteria andBrenameNotBetween(String value1, String value2) {
            addCriterion("breName not between", value1, value2, "brename");
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