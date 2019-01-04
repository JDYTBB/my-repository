package com.lcbw.pojo;

import java.io.Serializable;

public class RfidNum implements Serializable {
    private Long id;

    private String rfidNum;

    private String expansion1;

    private String expansion2;

    private String expansion3;

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
}