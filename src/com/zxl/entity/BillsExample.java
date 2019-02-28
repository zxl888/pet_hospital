package com.zxl.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillsExample() {
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

        public Criteria andBillidIsNull() {
            addCriterion("billId is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("billId is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(Integer value) {
            addCriterion("billId =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(Integer value) {
            addCriterion("billId <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(Integer value) {
            addCriterion("billId >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("billId >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(Integer value) {
            addCriterion("billId <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(Integer value) {
            addCriterion("billId <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<Integer> values) {
            addCriterion("billId in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<Integer> values) {
            addCriterion("billId not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(Integer value1, Integer value2) {
            addCriterion("billId between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(Integer value1, Integer value2) {
            addCriterion("billId not between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("payStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("payStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(String value) {
            addCriterion("payStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(String value) {
            addCriterion("payStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(String value) {
            addCriterion("payStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("payStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(String value) {
            addCriterion("payStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(String value) {
            addCriterion("payStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLike(String value) {
            addCriterion("payStatus like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotLike(String value) {
            addCriterion("payStatus not like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<String> values) {
            addCriterion("payStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<String> values) {
            addCriterion("payStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(String value1, String value2) {
            addCriterion("payStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(String value1, String value2) {
            addCriterion("payStatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPetidIsNull() {
            addCriterion("petId is null");
            return (Criteria) this;
        }

        public Criteria andPetidIsNotNull() {
            addCriterion("petId is not null");
            return (Criteria) this;
        }

        public Criteria andPetidEqualTo(Integer value) {
            addCriterion("petId =", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotEqualTo(Integer value) {
            addCriterion("petId <>", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThan(Integer value) {
            addCriterion("petId >", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("petId >=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThan(Integer value) {
            addCriterion("petId <", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidLessThanOrEqualTo(Integer value) {
            addCriterion("petId <=", value, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidIn(List<Integer> values) {
            addCriterion("petId in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotIn(List<Integer> values) {
            addCriterion("petId not in", values, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidBetween(Integer value1, Integer value2) {
            addCriterion("petId between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andPetidNotBetween(Integer value1, Integer value2) {
            addCriterion("petId not between", value1, value2, "petid");
            return (Criteria) this;
        }

        public Criteria andChinesepricesIsNull() {
            addCriterion("ChinesePrices is null");
            return (Criteria) this;
        }

        public Criteria andChinesepricesIsNotNull() {
            addCriterion("ChinesePrices is not null");
            return (Criteria) this;
        }

        public Criteria andChinesepricesEqualTo(Double value) {
            addCriterion("ChinesePrices =", value, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesNotEqualTo(Double value) {
            addCriterion("ChinesePrices <>", value, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesGreaterThan(Double value) {
            addCriterion("ChinesePrices >", value, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesGreaterThanOrEqualTo(Double value) {
            addCriterion("ChinesePrices >=", value, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesLessThan(Double value) {
            addCriterion("ChinesePrices <", value, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesLessThanOrEqualTo(Double value) {
            addCriterion("ChinesePrices <=", value, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesIn(List<Double> values) {
            addCriterion("ChinesePrices in", values, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesNotIn(List<Double> values) {
            addCriterion("ChinesePrices not in", values, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesBetween(Double value1, Double value2) {
            addCriterion("ChinesePrices between", value1, value2, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andChinesepricesNotBetween(Double value1, Double value2) {
            addCriterion("ChinesePrices not between", value1, value2, "chineseprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesIsNull() {
            addCriterion("westermPrices is null");
            return (Criteria) this;
        }

        public Criteria andWestermpricesIsNotNull() {
            addCriterion("westermPrices is not null");
            return (Criteria) this;
        }

        public Criteria andWestermpricesEqualTo(Double value) {
            addCriterion("westermPrices =", value, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesNotEqualTo(Double value) {
            addCriterion("westermPrices <>", value, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesGreaterThan(Double value) {
            addCriterion("westermPrices >", value, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesGreaterThanOrEqualTo(Double value) {
            addCriterion("westermPrices >=", value, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesLessThan(Double value) {
            addCriterion("westermPrices <", value, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesLessThanOrEqualTo(Double value) {
            addCriterion("westermPrices <=", value, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesIn(List<Double> values) {
            addCriterion("westermPrices in", values, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesNotIn(List<Double> values) {
            addCriterion("westermPrices not in", values, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesBetween(Double value1, Double value2) {
            addCriterion("westermPrices between", value1, value2, "westermprices");
            return (Criteria) this;
        }

        public Criteria andWestermpricesNotBetween(Double value1, Double value2) {
            addCriterion("westermPrices not between", value1, value2, "westermprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesIsNull() {
            addCriterion("materialPrices is null");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesIsNotNull() {
            addCriterion("materialPrices is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesEqualTo(Double value) {
            addCriterion("materialPrices =", value, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesNotEqualTo(Double value) {
            addCriterion("materialPrices <>", value, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesGreaterThan(Double value) {
            addCriterion("materialPrices >", value, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesGreaterThanOrEqualTo(Double value) {
            addCriterion("materialPrices >=", value, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesLessThan(Double value) {
            addCriterion("materialPrices <", value, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesLessThanOrEqualTo(Double value) {
            addCriterion("materialPrices <=", value, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesIn(List<Double> values) {
            addCriterion("materialPrices in", values, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesNotIn(List<Double> values) {
            addCriterion("materialPrices not in", values, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesBetween(Double value1, Double value2) {
            addCriterion("materialPrices between", value1, value2, "materialprices");
            return (Criteria) this;
        }

        public Criteria andMaterialpricesNotBetween(Double value1, Double value2) {
            addCriterion("materialPrices not between", value1, value2, "materialprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesIsNull() {
            addCriterion("exaninePrices is null");
            return (Criteria) this;
        }

        public Criteria andExaninepricesIsNotNull() {
            addCriterion("exaninePrices is not null");
            return (Criteria) this;
        }

        public Criteria andExaninepricesEqualTo(Double value) {
            addCriterion("exaninePrices =", value, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesNotEqualTo(Double value) {
            addCriterion("exaninePrices <>", value, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesGreaterThan(Double value) {
            addCriterion("exaninePrices >", value, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesGreaterThanOrEqualTo(Double value) {
            addCriterion("exaninePrices >=", value, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesLessThan(Double value) {
            addCriterion("exaninePrices <", value, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesLessThanOrEqualTo(Double value) {
            addCriterion("exaninePrices <=", value, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesIn(List<Double> values) {
            addCriterion("exaninePrices in", values, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesNotIn(List<Double> values) {
            addCriterion("exaninePrices not in", values, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesBetween(Double value1, Double value2) {
            addCriterion("exaninePrices between", value1, value2, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andExaninepricesNotBetween(Double value1, Double value2) {
            addCriterion("exaninePrices not between", value1, value2, "exanineprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesIsNull() {
            addCriterion("registrationPrices is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesIsNotNull() {
            addCriterion("registrationPrices is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesEqualTo(Double value) {
            addCriterion("registrationPrices =", value, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesNotEqualTo(Double value) {
            addCriterion("registrationPrices <>", value, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesGreaterThan(Double value) {
            addCriterion("registrationPrices >", value, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesGreaterThanOrEqualTo(Double value) {
            addCriterion("registrationPrices >=", value, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesLessThan(Double value) {
            addCriterion("registrationPrices <", value, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesLessThanOrEqualTo(Double value) {
            addCriterion("registrationPrices <=", value, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesIn(List<Double> values) {
            addCriterion("registrationPrices in", values, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesNotIn(List<Double> values) {
            addCriterion("registrationPrices not in", values, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesBetween(Double value1, Double value2) {
            addCriterion("registrationPrices between", value1, value2, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andRegistrationpricesNotBetween(Double value1, Double value2) {
            addCriterion("registrationPrices not between", value1, value2, "registrationprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesIsNull() {
            addCriterion("OPSPrices is null");
            return (Criteria) this;
        }

        public Criteria andOpspricesIsNotNull() {
            addCriterion("OPSPrices is not null");
            return (Criteria) this;
        }

        public Criteria andOpspricesEqualTo(Double value) {
            addCriterion("OPSPrices =", value, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesNotEqualTo(Double value) {
            addCriterion("OPSPrices <>", value, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesGreaterThan(Double value) {
            addCriterion("OPSPrices >", value, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesGreaterThanOrEqualTo(Double value) {
            addCriterion("OPSPrices >=", value, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesLessThan(Double value) {
            addCriterion("OPSPrices <", value, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesLessThanOrEqualTo(Double value) {
            addCriterion("OPSPrices <=", value, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesIn(List<Double> values) {
            addCriterion("OPSPrices in", values, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesNotIn(List<Double> values) {
            addCriterion("OPSPrices not in", values, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesBetween(Double value1, Double value2) {
            addCriterion("OPSPrices between", value1, value2, "opsprices");
            return (Criteria) this;
        }

        public Criteria andOpspricesNotBetween(Double value1, Double value2) {
            addCriterion("OPSPrices not between", value1, value2, "opsprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesIsNull() {
            addCriterion("totalPrices is null");
            return (Criteria) this;
        }

        public Criteria andTotalpricesIsNotNull() {
            addCriterion("totalPrices is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpricesEqualTo(Double value) {
            addCriterion("totalPrices =", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesNotEqualTo(Double value) {
            addCriterion("totalPrices <>", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesGreaterThan(Double value) {
            addCriterion("totalPrices >", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesGreaterThanOrEqualTo(Double value) {
            addCriterion("totalPrices >=", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesLessThan(Double value) {
            addCriterion("totalPrices <", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesLessThanOrEqualTo(Double value) {
            addCriterion("totalPrices <=", value, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesIn(List<Double> values) {
            addCriterion("totalPrices in", values, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesNotIn(List<Double> values) {
            addCriterion("totalPrices not in", values, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesBetween(Double value1, Double value2) {
            addCriterion("totalPrices between", value1, value2, "totalprices");
            return (Criteria) this;
        }

        public Criteria andTotalpricesNotBetween(Double value1, Double value2) {
            addCriterion("totalPrices not between", value1, value2, "totalprices");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeIsNull() {
            addCriterion("billCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeIsNotNull() {
            addCriterion("billCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeEqualTo(Date value) {
            addCriterion("billCreateTime =", value, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeNotEqualTo(Date value) {
            addCriterion("billCreateTime <>", value, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeGreaterThan(Date value) {
            addCriterion("billCreateTime >", value, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("billCreateTime >=", value, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeLessThan(Date value) {
            addCriterion("billCreateTime <", value, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("billCreateTime <=", value, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeIn(List<Date> values) {
            addCriterion("billCreateTime in", values, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeNotIn(List<Date> values) {
            addCriterion("billCreateTime not in", values, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeBetween(Date value1, Date value2) {
            addCriterion("billCreateTime between", value1, value2, "billcreatetime");
            return (Criteria) this;
        }

        public Criteria andBillcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("billCreateTime not between", value1, value2, "billcreatetime");
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