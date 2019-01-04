package com.lcbw.pojo;

import java.util.ArrayList;
import java.util.List;

public class RfidDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RfidDataExample() {
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("month like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("month not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andHourIsNull() {
            addCriterion("hour is null");
            return (Criteria) this;
        }

        public Criteria andHourIsNotNull() {
            addCriterion("hour is not null");
            return (Criteria) this;
        }

        public Criteria andHourEqualTo(String value) {
            addCriterion("hour =", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotEqualTo(String value) {
            addCriterion("hour <>", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourGreaterThan(String value) {
            addCriterion("hour >", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourGreaterThanOrEqualTo(String value) {
            addCriterion("hour >=", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLessThan(String value) {
            addCriterion("hour <", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLessThanOrEqualTo(String value) {
            addCriterion("hour <=", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourLike(String value) {
            addCriterion("hour like", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotLike(String value) {
            addCriterion("hour not like", value, "hour");
            return (Criteria) this;
        }

        public Criteria andHourIn(List<String> values) {
            addCriterion("hour in", values, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotIn(List<String> values) {
            addCriterion("hour not in", values, "hour");
            return (Criteria) this;
        }

        public Criteria andHourBetween(String value1, String value2) {
            addCriterion("hour between", value1, value2, "hour");
            return (Criteria) this;
        }

        public Criteria andHourNotBetween(String value1, String value2) {
            addCriterion("hour not between", value1, value2, "hour");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andPersonNumberIsNull() {
            addCriterion("person_number is null");
            return (Criteria) this;
        }

        public Criteria andPersonNumberIsNotNull() {
            addCriterion("person_number is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNumberEqualTo(String value) {
            addCriterion("person_number =", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberNotEqualTo(String value) {
            addCriterion("person_number <>", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberGreaterThan(String value) {
            addCriterion("person_number >", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberGreaterThanOrEqualTo(String value) {
            addCriterion("person_number >=", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberLessThan(String value) {
            addCriterion("person_number <", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberLessThanOrEqualTo(String value) {
            addCriterion("person_number <=", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberLike(String value) {
            addCriterion("person_number like", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberNotLike(String value) {
            addCriterion("person_number not like", value, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberIn(List<String> values) {
            addCriterion("person_number in", values, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberNotIn(List<String> values) {
            addCriterion("person_number not in", values, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberBetween(String value1, String value2) {
            addCriterion("person_number between", value1, value2, "personNumber");
            return (Criteria) this;
        }

        public Criteria andPersonNumberNotBetween(String value1, String value2) {
            addCriterion("person_number not between", value1, value2, "personNumber");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(String value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(String value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(String value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(String value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(String value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(String value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLike(String value) {
            addCriterion("mileage like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotLike(String value) {
            addCriterion("mileage not like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<String> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<String> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(String value1, String value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(String value1, String value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeIsNull() {
            addCriterion("track_bed_type is null");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeIsNotNull() {
            addCriterion("track_bed_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeEqualTo(String value) {
            addCriterion("track_bed_type =", value, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeNotEqualTo(String value) {
            addCriterion("track_bed_type <>", value, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeGreaterThan(String value) {
            addCriterion("track_bed_type >", value, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("track_bed_type >=", value, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeLessThan(String value) {
            addCriterion("track_bed_type <", value, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeLessThanOrEqualTo(String value) {
            addCriterion("track_bed_type <=", value, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeLike(String value) {
            addCriterion("track_bed_type like", value, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeNotLike(String value) {
            addCriterion("track_bed_type not like", value, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeIn(List<String> values) {
            addCriterion("track_bed_type in", values, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeNotIn(List<String> values) {
            addCriterion("track_bed_type not in", values, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeBetween(String value1, String value2) {
            addCriterion("track_bed_type between", value1, value2, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andTrackBedTypeNotBetween(String value1, String value2) {
            addCriterion("track_bed_type not between", value1, value2, "trackBedType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeIsNull() {
            addCriterion("fastener_type is null");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeIsNotNull() {
            addCriterion("fastener_type is not null");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeEqualTo(String value) {
            addCriterion("fastener_type =", value, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeNotEqualTo(String value) {
            addCriterion("fastener_type <>", value, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeGreaterThan(String value) {
            addCriterion("fastener_type >", value, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fastener_type >=", value, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeLessThan(String value) {
            addCriterion("fastener_type <", value, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeLessThanOrEqualTo(String value) {
            addCriterion("fastener_type <=", value, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeLike(String value) {
            addCriterion("fastener_type like", value, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeNotLike(String value) {
            addCriterion("fastener_type not like", value, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeIn(List<String> values) {
            addCriterion("fastener_type in", values, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeNotIn(List<String> values) {
            addCriterion("fastener_type not in", values, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeBetween(String value1, String value2) {
            addCriterion("fastener_type between", value1, value2, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andFastenerTypeNotBetween(String value1, String value2) {
            addCriterion("fastener_type not between", value1, value2, "fastenerType");
            return (Criteria) this;
        }

        public Criteria andLIsNull() {
            addCriterion("L is null");
            return (Criteria) this;
        }

        public Criteria andLIsNotNull() {
            addCriterion("L is not null");
            return (Criteria) this;
        }

        public Criteria andLEqualTo(String value) {
            addCriterion("L =", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotEqualTo(String value) {
            addCriterion("L <>", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThan(String value) {
            addCriterion("L >", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThanOrEqualTo(String value) {
            addCriterion("L >=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThan(String value) {
            addCriterion("L <", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThanOrEqualTo(String value) {
            addCriterion("L <=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLike(String value) {
            addCriterion("L like", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotLike(String value) {
            addCriterion("L not like", value, "l");
            return (Criteria) this;
        }

        public Criteria andLIn(List<String> values) {
            addCriterion("L in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLNotIn(List<String> values) {
            addCriterion("L not in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLBetween(String value1, String value2) {
            addCriterion("L between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andLNotBetween(String value1, String value2) {
            addCriterion("L not between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andIIsNull() {
            addCriterion("I is null");
            return (Criteria) this;
        }

        public Criteria andIIsNotNull() {
            addCriterion("I is not null");
            return (Criteria) this;
        }

        public Criteria andIEqualTo(String value) {
            addCriterion("I =", value, "i");
            return (Criteria) this;
        }

        public Criteria andINotEqualTo(String value) {
            addCriterion("I <>", value, "i");
            return (Criteria) this;
        }

        public Criteria andIGreaterThan(String value) {
            addCriterion("I >", value, "i");
            return (Criteria) this;
        }

        public Criteria andIGreaterThanOrEqualTo(String value) {
            addCriterion("I >=", value, "i");
            return (Criteria) this;
        }

        public Criteria andILessThan(String value) {
            addCriterion("I <", value, "i");
            return (Criteria) this;
        }

        public Criteria andILessThanOrEqualTo(String value) {
            addCriterion("I <=", value, "i");
            return (Criteria) this;
        }

        public Criteria andILike(String value) {
            addCriterion("I like", value, "i");
            return (Criteria) this;
        }

        public Criteria andINotLike(String value) {
            addCriterion("I not like", value, "i");
            return (Criteria) this;
        }

        public Criteria andIIn(List<String> values) {
            addCriterion("I in", values, "i");
            return (Criteria) this;
        }

        public Criteria andINotIn(List<String> values) {
            addCriterion("I not in", values, "i");
            return (Criteria) this;
        }

        public Criteria andIBetween(String value1, String value2) {
            addCriterion("I between", value1, value2, "i");
            return (Criteria) this;
        }

        public Criteria andINotBetween(String value1, String value2) {
            addCriterion("I not between", value1, value2, "i");
            return (Criteria) this;
        }

        public Criteria andHIsNull() {
            addCriterion("H is null");
            return (Criteria) this;
        }

        public Criteria andHIsNotNull() {
            addCriterion("H is not null");
            return (Criteria) this;
        }

        public Criteria andHEqualTo(String value) {
            addCriterion("H =", value, "h");
            return (Criteria) this;
        }

        public Criteria andHNotEqualTo(String value) {
            addCriterion("H <>", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThan(String value) {
            addCriterion("H >", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThanOrEqualTo(String value) {
            addCriterion("H >=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThan(String value) {
            addCriterion("H <", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThanOrEqualTo(String value) {
            addCriterion("H <=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLike(String value) {
            addCriterion("H like", value, "h");
            return (Criteria) this;
        }

        public Criteria andHNotLike(String value) {
            addCriterion("H not like", value, "h");
            return (Criteria) this;
        }

        public Criteria andHIn(List<String> values) {
            addCriterion("H in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHNotIn(List<String> values) {
            addCriterion("H not in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHBetween(String value1, String value2) {
            addCriterion("H between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andHNotBetween(String value1, String value2) {
            addCriterion("H not between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
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