package com.citi.intern.config;

import com.citi.intern.model.Portfolio;

import java.util.ArrayList;


public final class Portfolios {
    // define default portfolios
    public  static final ArrayList<Portfolio> portfolios = getPortfolios();

    private static ArrayList<Portfolio> getPortfolios(){
        ArrayList<Portfolio> portfolioArrayList = new ArrayList<>();
        // ericOnePortfolio
        Portfolio ericOnePortfolio = new Portfolio();
        ericOnePortfolio.setUser("Eric1");
        ericOnePortfolio.setName("Eric1Portfolio");
        ericOnePortfolio.setSummary("!!!The Best Portfolio!!!Eric1Portfolio includes ADM and ABX. Have a good performance recent!");
        ArrayList<String> ericOneStockNames = new ArrayList<>();
        ericOneStockNames.add("ADM");
        ericOneStockNames.add("ABX");
//        ericOneStockNames.add("aap");
        ericOnePortfolio.setStockNames(ericOneStockNames);
        portfolioArrayList.add(ericOnePortfolio);

        // clairPortfolio
        Portfolio clairePortfolio = new Portfolio();
        clairePortfolio.setUser("Claire");
        clairePortfolio.setName("ClairePortfolio");
        clairePortfolio.setSummary("ClairePortfolio includes ABX and ACAS. Have a good performance recent!");
        ArrayList<String> claireStockNames = new ArrayList<>();
//        clairStockNames.add("abt");
        claireStockNames.add("ABX");
        claireStockNames.add("ACAS");
        clairePortfolio.setStockNames(claireStockNames);
        portfolioArrayList.add(clairePortfolio);

        // MoniPortfolio
        Portfolio moniPortfolio = new Portfolio();
        moniPortfolio.setUser("Moni");
        moniPortfolio.setName("MoniPortfolio");
        moniPortfolio.setSummary("MoniPortfolio includes ADM, ACN and ADBE. Have a good performance recent!");
        ArrayList<String> moniStockNames = new ArrayList<>();
        moniStockNames.add("ADM");
        moniStockNames.add("ACN");
        moniStockNames.add("ADBE");
        moniPortfolio.setStockNames(moniStockNames);
        portfolioArrayList.add(moniPortfolio);


        // KayPortfolio
        Portfolio kayPortfolio = new Portfolio();
        kayPortfolio.setUser("Kay");
        kayPortfolio.setName("KayPortfolio");
        kayPortfolio.setSummary("KayPortfolio includes ADI, ADM , ADP and ADS. Have a good performance recent!");
        ArrayList<String> kayStockNames = new ArrayList<>();
        kayStockNames.add("ADI");
        kayStockNames.add("ADM");
        kayStockNames.add("ADP");
        kayStockNames.add("ADS");
        kayPortfolio.setStockNames(kayStockNames);
        portfolioArrayList.add(kayPortfolio);
        return portfolioArrayList;
    }

}
