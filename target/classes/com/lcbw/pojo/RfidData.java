package com.lcbw.pojo;

import java.io.Serializable;

public class RfidData implements Serializable {
    private Long id;

    private String rfidNum;

    private String year;

    private String month;

    private String date;

    private String hour;

    private String time;

    private String personNumber;

    private String mileage;

    private String trackBedType;

    private String fastenerType;

    private String l;

    private String i;

    private String h;

    private String temperature;

    private String expansion1;

    private String expansion2;

    private String expansion3;

    private String q;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRfidNum() {
        return rfidNum;
    }

    public void setRfidNum(String rfidNum) {
        this.rfidNum = rfidNum == null ? null : rfidNum.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour == null ? null : hour.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber == null ? null : personNumber.trim();
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage == null ? null : mileage.trim();
    }

    public String getTrackBedType() {
        return trackBedType;
    }

    public void setTrackBedType(String trackBedType) {
        this.trackBedType = trackBedType == null ? null : trackBedType.trim();
    }

    public String getFastenerType() {
        return fastenerType;
    }

    public void setFastenerType(String fastenerType) {
        this.fastenerType = fastenerType == null ? null : fastenerType.trim();
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l == null ? null : l.trim();
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i == null ? null : i.trim();
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h == null ? null : h.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getExpansion1() {
        return expansion1;
    }

    public void setExpansion1(String expansion1) {
        this.expansion1 = expansion1 == null ? null : expansion1.trim();
    }

    public String getExpansion2() {
        return expansion2;
    }

    public void setExpansion2(String expansion2) {
        this.expansion2 = expansion2 == null ? null : expansion2.trim();
    }

    public String getExpansion3() {
        return expansion3;
    }

    public void setExpansion3(String expansion3) {
        this.expansion3 = expansion3 == null ? null : expansion3.trim();
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q == null ? null : q.trim();
    }
}