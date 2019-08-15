package com.citi.intern.wrapper;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Echart {
    private List<String> categoryData;
    private List<List<Double>> values;
    private List<Double> value;
    private List<Double>  TradeVolume;
    private String StockName;

    public List<String> getCategoryData() {
        return categoryData;
    }

    public List<Double> getTradeVolume() { return TradeVolume; }

    public void setTradeVolume(List<Double> tradeVolume) { TradeVolume = tradeVolume; }

    public void setCategoryData(List<String> categoryData) {
        this.categoryData = categoryData;
    }
    public List<List<Double>> getValues() {
        return values;
    }
    public List<Double> getValue() { return value; }
    public String getStockName() { return StockName; }


    public void setValues(List<List<Double>> values) {
        this.values = values;
    }
    public void setValue(List<Double> value){this.value = value;}
    public void setStockName(String stockName) { StockName = stockName; }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}