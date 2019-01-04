package com.lcbw.common;

import java.util.List;

public class DataResult<T> extends BaseData {

    private List<T> data;

    public DataResult() {
    }



    public DataResult(String mileage, String track_bed_type, String fastener_type, String temperature) {
        super(mileage, track_bed_type, fastener_type, temperature);
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
