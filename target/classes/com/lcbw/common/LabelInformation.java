package com.lcbw.common;

public class LabelInformation extends BaseData {
    private String time;//采集时间，自动生成
    private String personNumber;//采集人员编号，手动输入
    private String gauge;//轨距
    private String surpassHigh;//超高
    private String railSurfaceHigh;//轨面高程
    private String questionText;//问题

    public String getTime() {
        return time;
    }

    public String getPersonNumber() {
        return personNumber;
    }

    public String getGauge() {
        return gauge;
    }

    public String getSurpassHigh() {
        return surpassHigh;
    }

    public String getRailSurfaceHigh() {
        return railSurfaceHigh;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPersonNumber(String personNumber) {
        this.personNumber = personNumber;
    }

    public void setGauge(String gauge) {
        this.gauge = gauge;
    }

    public void setSurpassHigh(String surpassHigh) {
        this.surpassHigh = surpassHigh;
    }

    public void setRailSurfaceHigh(String railSurfaceHigh) {
        this.railSurfaceHigh = railSurfaceHigh;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
}
