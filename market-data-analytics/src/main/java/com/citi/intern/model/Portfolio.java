package com.citi.intern.model;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

public class Portfolio {
    private String user;
    private String name;
    private String summary;
    private ArrayList<String> stockNames = new ArrayList<>();

    public String getUser() {
        return user;

    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ArrayList<String> getStockNames() {
        return stockNames;
    }

    public void setStockNames(ArrayList<String> stockNames) {
        this.stockNames = stockNames;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
