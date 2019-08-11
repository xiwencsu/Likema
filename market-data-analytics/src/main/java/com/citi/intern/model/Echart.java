package com.citi.intern.model;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Echart {
    private List<String> categoryData;
    private List<List<Double>> values;

    public List<String> getCategoryData() {
        return categoryData;
    }

    public void setCategoryData(List<String> categoryData) {
        this.categoryData = categoryData;
    }

    public List<List<Double>> getValues() {
        return values;
    }

    public void setValues(List<List<Double>> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
