package com.lcbw.pojo;

import java.util.ArrayList;
import java.util.List;

public class RfidNumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RfidNumExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRfidNumIsNull() {
            addCriterion("rfid_num is null");
            return (Criteria) this;
        }

        public Criteria andRfidNumIsNotNull() {
            addCriterion("rfid_num is not null");
            return (Criteria) this;
        }

        public Criteria andRfidNumEqualTo(String value) {
            addCriterion("rfid_num =", value, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumNotEqualTo(String value) {
            addCriterion("rfid_num <>", value, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumGreaterThan(String value) {
            addCriterion("rfid_num >", value, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumGreaterThanOrEqualTo(String value) {
            addCriterion("rfid_num >=", value, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumLessThan(String value) {
            addCriterion("rfid_num <", value, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumLessThanOrEqualTo(String value) {
            addCriterion("rfid_num <=", value, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumLike(String value) {
            addCriterion("rfid_num like", value, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumNotLike(String value) {
            addCriterion("rfid_num not like", value, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumIn(List<String> values) {
            addCriterion("rfid_num in", values, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumNotIn(List<String> values) {
            addCriterion("rfid_num not in", values, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumBetween(String value1, String value2) {
            addCriterion("rfid_num between", value1, value2, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andRfidNumNotBetween(String value1, String value2) {
            addCriterion("rfid_num not between", value1, value2, "rfidNum");
            return (Criteria) this;
        }

        public Criteria andExpansion1IsNull() {
            addCriterion("expansion1 is null");
            return (Criteria) this;
        }

        public Criteria andExpansion1IsNotNull() {
            addCriterion("expansion1 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansion1EqualTo(String value) {
            addCriterion("expansion1 =", value, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1NotEqualTo(String value) {
            addCriterion("expansion1 <>", value, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1GreaterThan(String value) {
            addCriterion("expansion1 >", value, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1GreaterThanOrEqualTo(String value) {
            addCriterion("expansion1 >=", value, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1LessThan(String value) {
            addCriterion("expansion1 <", value, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1LessThanOrEqualTo(String value) {
            addCriterion("expansion1 <=", value, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1Like(String value) {
            addCriterion("expansion1 like", value, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1NotLike(String value) {
            addCriterion("expansion1 not like", value, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1In(List<String> values) {
            addCriterion("expansion1 in", values, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1NotIn(List<String> values) {
            addCriterion("expansion1 not in", values, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1Between(String value1, String value2) {
            addCriterion("expansion1 between", value1, value2, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion1NotBetween(String value1, String value2) {
            addCriterion("expansion1 not between", value1, value2, "expansion1");
            return (Criteria) this;
        }

        public Criteria andExpansion2IsNull() {
            addCriterion("expansion2 is null");
            return (Criteria) this;
        }

        public Criteria andExpansion2IsNotNull() {
            addCriterion("expansion2 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansion2EqualTo(String value) {
            addCriterion("expansion2 =", value, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2NotEqualTo(String value) {
            addCriterion("expansion2 <>", value, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2GreaterThan(String value) {
            addCriterion("expansion2 >", value, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2GreaterThanOrEqualTo(String value) {
            addCriterion("expansion2 >=", value, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2LessThan(String value) {
            addCriterion("expansion2 <", value, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2LessThanOrEqualTo(String value) {
            addCriterion("expansion2 <=", value, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2Like(String value) {
            addCriterion("expansion2 like", value, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2NotLike(String value) {
            addCriterion("expansion2 not like", value, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2In(List<String> values) {
            addCriterion("expansion2 in", values, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2NotIn(List<String> values) {
            addCriterion("expansion2 not in", values, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2Between(String value1, String value2) {
            addCriterion("expansion2 between", value1, value2, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion2NotBetween(String value1, String value2) {
            addCriterion("expansion2 not between", value1, value2, "expansion2");
            return (Criteria) this;
        }

        public Criteria andExpansion3IsNull() {
            addCriterion("expansion3 is null");
            return (Criteria) this;
        }

        public Criteria andExpansion3IsNotNull() {
            addCriterion("expansion3 is not null");
            return (Criteria) this;
        }

        public Criteria andExpansion3EqualTo(String value) {
            addCriterion("expansion3 =", value, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3NotEqualTo(String value) {
            addCriterion("expansion3 <>", value, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3GreaterThan(String value) {
            addCriterion("expansion3 >", value, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3GreaterThanOrEqualTo(String value) {
            addCriterion("expansion3 >=", value, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3LessThan(String value) {
            addCriterion("expansion3 <", value, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3LessThanOrEqualTo(String value) {
            addCriterion("expansion3 <=", value, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3Like(String value) {
            addCriterion("expansion3 like", value, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3NotLike(String value) {
            addCriterion("expansion3 not like", value, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3In(List<String> values) {
            addCriterion("expansion3 in", values, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3NotIn(List<String> values) {
            addCriterion("expansion3 not in", values, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3Between(String value1, String value2) {
            addCriterion("expansion3 between", value1, value2, "expansion3");
            return (Criteria) this;
        }

        public Criteria andExpansion3NotBetween(String value1, String value2) {
            addCriterion("expansion3 not between", value1, value2, "expansion3");
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