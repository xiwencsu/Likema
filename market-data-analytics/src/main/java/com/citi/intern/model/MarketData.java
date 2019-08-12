package com.citi.intern.model;

import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MarketData {

    private String stockName;

    private String date;

    private Date time;

    private Double openPrice;

    private Double highPrice;

    private Double lowPrice;

    private Double closePrice;

    private Double tradeVolume;

    private Double splitFactor;

    private Double earnings;

    private Double dividends;

    private Double extrapolation;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm");
        return ft.format(time);
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Double highPrice) {
        this.highPrice = highPrice;
    }

    public Double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Double getTradeVolume() {
        return tradeVolume;
    }

    public void setTradeVolume(Double tradeVolume) {
        this.tradeVolume = tradeVolume;
    }

    public Double getSplitFactor() {
        return splitFactor;
    }

    public void setSplitFactor(Double splitFactor) {
        this.splitFactor = splitFactor;
    }

    public Double getEarnings() {
        return earnings;
    }

    public void setEarnings(Double earnings) {
        this.earnings = earnings;
    }

    public Double getDividends() {
        return dividends;
    }

    public void setDividends(Double dividends) {
        this.dividends = dividends;
    }

    public Double getExtrapolation() {
        return extrapolation;
    }

    public void setExtrapolation(Double extrapolation) {
        this.extrapolation = extrapolation;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
