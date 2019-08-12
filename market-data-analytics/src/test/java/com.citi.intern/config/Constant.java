package com.citi.intern.config;

public final class Constant {
//    public static final String MARKET_DATA_ROOT_DIR = "D:\\sogoDownload\\DataAnalytics\\Data Analytics\\Test Data\\Quant Quote Market Data - Jan to Mar 2016";
    public static final String MARKET_DATA_ROOT_DIR = "D:\\入职training\\Data Analytics\\Test Data";

    public static final String DATE_DIR_PREFIX = "allstocks_";

    public static String getStockFileName(String stockName){
        return "table_"+stockName+".csv";
    }

    public static String getStockFileAbsPath(String date, String stockName){
        return MARKET_DATA_ROOT_DIR+"\\"+DATE_DIR_PREFIX+date+"\\"+getStockFileName(stockName);
    }

    public static final String DAILY_SETTLEMENT_DATA_ROOT_DIR = "C:\\Users\\HP\\tmp\\Likema\\Day Data By Company";

    public static String getDailySettlementDataFileAbsPath(String stockName){
        return DAILY_SETTLEMENT_DATA_ROOT_DIR+"\\"+stockName+".csv";
    }
}
