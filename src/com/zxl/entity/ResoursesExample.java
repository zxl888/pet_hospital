package com.zxl.entity;

import java.util.ArrayList;
import java.util.List;

public class ResoursesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResoursesExample() {
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

        public Criteria andReidIsNull() {
            addCriterion("reId is null");
            return (Criteria) this;
        }

        public Criteria andReidIsNotNull() {
            addCriterion("reId is not null");
            return (Criteria) this;
        }

        public Criteria andReidEqualTo(Integer value) {
            addCriterion("reId =", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotEqualTo(Integer value) {
            addCriterion("reId <>", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThan(Integer value) {
            addCriterion("reId >", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reId >=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThan(Integer value) {
            addCriterion("reId <", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidLessThanOrEqualTo(Integer value) {
            addCriterion("reId <=", value, "reid");
            return (Criteria) this;
        }

        public Criteria andReidIn(List<Integer> values) {
            addCriterion("reId in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotIn(List<Integer> values) {
            addCriterion("reId not in", values, "reid");
            return (Criteria) this;
        }

        public Criteria andReidBetween(Integer value1, Integer value2) {
            addCriterion("reId between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andReidNotBetween(Integer value1, Integer value2) {
            addCriterion("reId not between", value1, value2, "reid");
            return (Criteria) this;
        }

        public Criteria andRenameIsNull() {
            addCriterion("reName is null");
            return (Criteria) this;
        }

        public Criteria andRenameIsNotNull() {
            addCriterion("reName is not null");
            return (Criteria) this;
        }

        public Criteria andRenameEqualTo(String value) {
            addCriterion("reName =", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameNotEqualTo(String value) {
            addCriterion("reName <>", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameGreaterThan(String value) {
            addCriterion("reName >", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameGreaterThanOrEqualTo(String value) {
            addCriterion("reName >=", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameLessThan(String value) {
            addCriterion("reName <", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameLessThanOrEqualTo(String value) {
            addCriterion("reName <=", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameLike(String value) {
            addCriterion("reName like", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameNotLike(String value) {
            addCriterion("reName not like", value, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameIn(List<String> values) {
            addCriterion("reName in", values, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameNotIn(List<String> values) {
            addCriterion("reName not in", values, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameBetween(String value1, String value2) {
            addCriterion("reName between", value1, value2, "rename");
            return (Criteria) this;
        }

        public Criteria andRenameNotBetween(String value1, String value2) {
            addCriterion("reName not between", value1, value2, "rename");
            return (Criteria) this;
        }

        public Criteria andRepicIsNull() {
            addCriterion("rePic is null");
            return (Criteria) this;
        }

        public Criteria andRepicIsNotNull() {
            addCriterion("rePic is not null");
            return (Criteria) this;
        }

        public Criteria andRepicEqualTo(String value) {
            addCriterion("rePic =", value, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicNotEqualTo(String value) {
            addCriterion("rePic <>", value, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicGreaterThan(String value) {
            addCriterion("rePic >", value, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicGreaterThanOrEqualTo(String value) {
            addCriterion("rePic >=", value, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicLessThan(String value) {
            addCriterion("rePic <", value, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicLessThanOrEqualTo(String value) {
            addCriterion("rePic <=", value, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicLike(String value) {
            addCriterion("rePic like", value, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicNotLike(String value) {
            addCriterion("rePic not like", value, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicIn(List<String> values) {
            addCriterion("rePic in", values, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicNotIn(List<String> values) {
            addCriterion("rePic not in", values, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicBetween(String value1, String value2) {
            addCriterion("rePic between", value1, value2, "repic");
            return (Criteria) this;
        }

        public Criteria andRepicNotBetween(String value1, String value2) {
            addCriterion("rePic not between", value1, value2, "repic");
            return (Criteria) this;
        }

        public Criteria andRepriceIsNull() {
            addCriterion("rePrice is null");
            return (Criteria) this;
        }

        public Criteria andRepriceIsNotNull() {
            addCriterion("rePrice is not null");
            return (Criteria) this;
        }

        public Criteria andRepriceEqualTo(Double value) {
            addCriterion("rePrice =", value, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceNotEqualTo(Double value) {
            addCriterion("rePrice <>", value, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceGreaterThan(Double value) {
            addCriterion("rePrice >", value, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("rePrice >=", value, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceLessThan(Double value) {
            addCriterion("rePrice <", value, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceLessThanOrEqualTo(Double value) {
            addCriterion("rePrice <=", value, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceIn(List<Double> values) {
            addCriterion("rePrice in", values, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceNotIn(List<Double> values) {
            addCriterion("rePrice not in", values, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceBetween(Double value1, Double value2) {
            addCriterion("rePrice between", value1, value2, "reprice");
            return (Criteria) this;
        }

        public Criteria andRepriceNotBetween(Double value1, Double value2) {
            addCriterion("rePrice not between", value1, value2, "reprice");
            return (Criteria) this;
        }

        public Criteria andRefuncIsNull() {
            addCriterion("reFunc is null");
            return (Criteria) this;
        }

        public Criteria andRefuncIsNotNull() {
            addCriterion("reFunc is not null");
            return (Criteria) this;
        }

        public Criteria andRefuncEqualTo(String value) {
            addCriterion("reFunc =", value, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncNotEqualTo(String value) {
            addCriterion("reFunc <>", value, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncGreaterThan(String value) {
            addCriterion("reFunc >", value, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncGreaterThanOrEqualTo(String value) {
            addCriterion("reFunc >=", value, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncLessThan(String value) {
            addCriterion("reFunc <", value, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncLessThanOrEqualTo(String value) {
            addCriterion("reFunc <=", value, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncLike(String value) {
            addCriterion("reFunc like", value, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncNotLike(String value) {
            addCriterion("reFunc not like", value, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncIn(List<String> values) {
            addCriterion("reFunc in", values, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncNotIn(List<String> values) {
            addCriterion("reFunc not in", values, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncBetween(String value1, String value2) {
            addCriterion("reFunc between", value1, value2, "refunc");
            return (Criteria) this;
        }

        public Criteria andRefuncNotBetween(String value1, String value2) {
            addCriterion("reFunc not between", value1, value2, "refunc");
            return (Criteria) this;
        }

        public Criteria andRecateIsNull() {
            addCriterion("reCate is null");
            return (Criteria) this;
        }

        public Criteria andRecateIsNotNull() {
            addCriterion("reCate is not null");
            return (Criteria) this;
        }

        public Criteria andRecateEqualTo(String value) {
            addCriterion("reCate =", value, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateNotEqualTo(String value) {
            addCriterion("reCate <>", value, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateGreaterThan(String value) {
            addCriterion("reCate >", value, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateGreaterThanOrEqualTo(String value) {
            addCriterion("reCate >=", value, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateLessThan(String value) {
            addCriterion("reCate <", value, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateLessThanOrEqualTo(String value) {
            addCriterion("reCate <=", value, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateLike(String value) {
            addCriterion("reCate like", value, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateNotLike(String value) {
            addCriterion("reCate not like", value, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateIn(List<String> values) {
            addCriterion("reCate in", values, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateNotIn(List<String> values) {
            addCriterion("reCate not in", values, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateBetween(String value1, String value2) {
            addCriterion("reCate between", value1, value2, "recate");
            return (Criteria) this;
        }

        public Criteria andRecateNotBetween(String value1, String value2) {
            addCriterion("reCate not between", value1, value2, "recate");
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