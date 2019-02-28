package com.zxl.entity;

import java.util.ArrayList;
import java.util.List;

public class DoctorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorsExample() {
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

        public Criteria andDoctelIsNull() {
            addCriterion("docTel is null");
            return (Criteria) this;
        }

        public Criteria andDoctelIsNotNull() {
            addCriterion("docTel is not null");
            return (Criteria) this;
        }

        public Criteria andDoctelEqualTo(String value) {
            addCriterion("docTel =", value, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelNotEqualTo(String value) {
            addCriterion("docTel <>", value, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelGreaterThan(String value) {
            addCriterion("docTel >", value, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelGreaterThanOrEqualTo(String value) {
            addCriterion("docTel >=", value, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelLessThan(String value) {
            addCriterion("docTel <", value, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelLessThanOrEqualTo(String value) {
            addCriterion("docTel <=", value, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelLike(String value) {
            addCriterion("docTel like", value, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelNotLike(String value) {
            addCriterion("docTel not like", value, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelIn(List<String> values) {
            addCriterion("docTel in", values, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelNotIn(List<String> values) {
            addCriterion("docTel not in", values, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelBetween(String value1, String value2) {
            addCriterion("docTel between", value1, value2, "doctel");
            return (Criteria) this;
        }

        public Criteria andDoctelNotBetween(String value1, String value2) {
            addCriterion("docTel not between", value1, value2, "doctel");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNull() {
            addCriterion("docName is null");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNotNull() {
            addCriterion("docName is not null");
            return (Criteria) this;
        }

        public Criteria andDocnameEqualTo(String value) {
            addCriterion("docName =", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotEqualTo(String value) {
            addCriterion("docName <>", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThan(String value) {
            addCriterion("docName >", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThanOrEqualTo(String value) {
            addCriterion("docName >=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThan(String value) {
            addCriterion("docName <", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThanOrEqualTo(String value) {
            addCriterion("docName <=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLike(String value) {
            addCriterion("docName like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotLike(String value) {
            addCriterion("docName not like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameIn(List<String> values) {
            addCriterion("docName in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotIn(List<String> values) {
            addCriterion("docName not in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameBetween(String value1, String value2) {
            addCriterion("docName between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotBetween(String value1, String value2) {
            addCriterion("docName not between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocsexIsNull() {
            addCriterion("docSex is null");
            return (Criteria) this;
        }

        public Criteria andDocsexIsNotNull() {
            addCriterion("docSex is not null");
            return (Criteria) this;
        }

        public Criteria andDocsexEqualTo(String value) {
            addCriterion("docSex =", value, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexNotEqualTo(String value) {
            addCriterion("docSex <>", value, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexGreaterThan(String value) {
            addCriterion("docSex >", value, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexGreaterThanOrEqualTo(String value) {
            addCriterion("docSex >=", value, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexLessThan(String value) {
            addCriterion("docSex <", value, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexLessThanOrEqualTo(String value) {
            addCriterion("docSex <=", value, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexLike(String value) {
            addCriterion("docSex like", value, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexNotLike(String value) {
            addCriterion("docSex not like", value, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexIn(List<String> values) {
            addCriterion("docSex in", values, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexNotIn(List<String> values) {
            addCriterion("docSex not in", values, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexBetween(String value1, String value2) {
            addCriterion("docSex between", value1, value2, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocsexNotBetween(String value1, String value2) {
            addCriterion("docSex not between", value1, value2, "docsex");
            return (Criteria) this;
        }

        public Criteria andDocageIsNull() {
            addCriterion("docAge is null");
            return (Criteria) this;
        }

        public Criteria andDocageIsNotNull() {
            addCriterion("docAge is not null");
            return (Criteria) this;
        }

        public Criteria andDocageEqualTo(Byte value) {
            addCriterion("docAge =", value, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageNotEqualTo(Byte value) {
            addCriterion("docAge <>", value, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageGreaterThan(Byte value) {
            addCriterion("docAge >", value, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageGreaterThanOrEqualTo(Byte value) {
            addCriterion("docAge >=", value, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageLessThan(Byte value) {
            addCriterion("docAge <", value, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageLessThanOrEqualTo(Byte value) {
            addCriterion("docAge <=", value, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageIn(List<Byte> values) {
            addCriterion("docAge in", values, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageNotIn(List<Byte> values) {
            addCriterion("docAge not in", values, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageBetween(Byte value1, Byte value2) {
            addCriterion("docAge between", value1, value2, "docage");
            return (Criteria) this;
        }

        public Criteria andDocageNotBetween(Byte value1, Byte value2) {
            addCriterion("docAge not between", value1, value2, "docage");
            return (Criteria) this;
        }

        public Criteria andDoctitleIsNull() {
            addCriterion("docTitle is null");
            return (Criteria) this;
        }

        public Criteria andDoctitleIsNotNull() {
            addCriterion("docTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDoctitleEqualTo(String value) {
            addCriterion("docTitle =", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleNotEqualTo(String value) {
            addCriterion("docTitle <>", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleGreaterThan(String value) {
            addCriterion("docTitle >", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleGreaterThanOrEqualTo(String value) {
            addCriterion("docTitle >=", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleLessThan(String value) {
            addCriterion("docTitle <", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleLessThanOrEqualTo(String value) {
            addCriterion("docTitle <=", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleLike(String value) {
            addCriterion("docTitle like", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleNotLike(String value) {
            addCriterion("docTitle not like", value, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleIn(List<String> values) {
            addCriterion("docTitle in", values, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleNotIn(List<String> values) {
            addCriterion("docTitle not in", values, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleBetween(String value1, String value2) {
            addCriterion("docTitle between", value1, value2, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDoctitleNotBetween(String value1, String value2) {
            addCriterion("docTitle not between", value1, value2, "doctitle");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDocfixedIsNull() {
            addCriterion("docFixed is null");
            return (Criteria) this;
        }

        public Criteria andDocfixedIsNotNull() {
            addCriterion("docFixed is not null");
            return (Criteria) this;
        }

        public Criteria andDocfixedEqualTo(String value) {
            addCriterion("docFixed =", value, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedNotEqualTo(String value) {
            addCriterion("docFixed <>", value, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedGreaterThan(String value) {
            addCriterion("docFixed >", value, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedGreaterThanOrEqualTo(String value) {
            addCriterion("docFixed >=", value, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedLessThan(String value) {
            addCriterion("docFixed <", value, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedLessThanOrEqualTo(String value) {
            addCriterion("docFixed <=", value, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedLike(String value) {
            addCriterion("docFixed like", value, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedNotLike(String value) {
            addCriterion("docFixed not like", value, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedIn(List<String> values) {
            addCriterion("docFixed in", values, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedNotIn(List<String> values) {
            addCriterion("docFixed not in", values, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedBetween(String value1, String value2) {
            addCriterion("docFixed between", value1, value2, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocfixedNotBetween(String value1, String value2) {
            addCriterion("docFixed not between", value1, value2, "docfixed");
            return (Criteria) this;
        }

        public Criteria andDocspecIsNull() {
            addCriterion("docSpec is null");
            return (Criteria) this;
        }

        public Criteria andDocspecIsNotNull() {
            addCriterion("docSpec is not null");
            return (Criteria) this;
        }

        public Criteria andDocspecEqualTo(String value) {
            addCriterion("docSpec =", value, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecNotEqualTo(String value) {
            addCriterion("docSpec <>", value, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecGreaterThan(String value) {
            addCriterion("docSpec >", value, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecGreaterThanOrEqualTo(String value) {
            addCriterion("docSpec >=", value, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecLessThan(String value) {
            addCriterion("docSpec <", value, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecLessThanOrEqualTo(String value) {
            addCriterion("docSpec <=", value, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecLike(String value) {
            addCriterion("docSpec like", value, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecNotLike(String value) {
            addCriterion("docSpec not like", value, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecIn(List<String> values) {
            addCriterion("docSpec in", values, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecNotIn(List<String> values) {
            addCriterion("docSpec not in", values, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecBetween(String value1, String value2) {
            addCriterion("docSpec between", value1, value2, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocspecNotBetween(String value1, String value2) {
            addCriterion("docSpec not between", value1, value2, "docspec");
            return (Criteria) this;
        }

        public Criteria andDocpicIsNull() {
            addCriterion("docPic is null");
            return (Criteria) this;
        }

        public Criteria andDocpicIsNotNull() {
            addCriterion("docPic is not null");
            return (Criteria) this;
        }

        public Criteria andDocpicEqualTo(String value) {
            addCriterion("docPic =", value, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicNotEqualTo(String value) {
            addCriterion("docPic <>", value, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicGreaterThan(String value) {
            addCriterion("docPic >", value, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicGreaterThanOrEqualTo(String value) {
            addCriterion("docPic >=", value, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicLessThan(String value) {
            addCriterion("docPic <", value, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicLessThanOrEqualTo(String value) {
            addCriterion("docPic <=", value, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicLike(String value) {
            addCriterion("docPic like", value, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicNotLike(String value) {
            addCriterion("docPic not like", value, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicIn(List<String> values) {
            addCriterion("docPic in", values, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicNotIn(List<String> values) {
            addCriterion("docPic not in", values, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicBetween(String value1, String value2) {
            addCriterion("docPic between", value1, value2, "docpic");
            return (Criteria) this;
        }

        public Criteria andDocpicNotBetween(String value1, String value2) {
            addCriterion("docPic not between", value1, value2, "docpic");
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