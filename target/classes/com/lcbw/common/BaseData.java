package com.lcbw.common;

/**
 * 数据基类，用于存储每个标签的初始化信息
 */
public class BaseData {
    private String mileage;//里程
    private String track_bed_type;//道床类型
    private String fastener_type;//扣件类型
    private String temperature;//锁定温度

    public BaseData() {
    }

    public BaseData(String mileage, String track_bed_type, String fastener_type, String temperature) {
        this.mileage = mileage;
        this.track_bed_type = track_bed_type;
        this.fastener_type = fastener_type;
        this.temperature = temperature;
    }

    public String getMileage() {
        return mileage;
    }

    public String getTrack_bed_type() {
        return track_bed_type;
    }

    public String getFastener_type() {
        return fastener_type;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public void setTrack_bed_type(String track_bed_type) {
        this.track_bed_type = track_bed_type;
    }

    public void setFastener_type(String fastener_type) {
        this.fastener_type = fastener_type;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
