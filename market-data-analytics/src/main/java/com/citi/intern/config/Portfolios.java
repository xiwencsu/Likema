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
        ericOnePortfolio.setSummary("!!!The Best Portfolio!!!Eric1Portfolio includes a and aa. Have a good performance recent!");
        ArrayList<String> ericOneStockNames = new ArrayList<>();
        ericOneStockNames.add("a");
        ericOneStockNames.add("aa");
//        ericOneStockNames.add("aap");
        ericOnePortfolio.setStockNames(ericOneStockNames);
        portfolioArrayList.add(ericOnePortfolio);

        // clairPortfolio
        Portfolio clairePortfolio = new Portfolio();
        clairePortfolio.setUser("Claire");
        clairePortfolio.setName("ClairePortfolio");
        clairePortfolio.setSummary("ClairePortfolio includes abx and acas. Have a good performance recent!");
        ArrayList<String> claireStockNames = new ArrayList<>();
//        clairStockNames.add("abt");
        claireStockNames.add("abx");
        claireStockNames.add("acas");
        clairePortfolio.setStockNames(claireStockNames);
        portfolioArrayList.add(clairePortfolio);

        // MoniPortfolio
        Portfolio moniPortfolio = new Portfolio();
        moniPortfolio.setUser("Moni");
        moniPortfolio.setName("MoniPortfolio");
        moniPortfolio.setSummary("MoniPortfolio includes adm, acn and adbe. Have a good performance recent!");
        ArrayList<String> moniStockNames = new ArrayList<>();
        moniStockNames.add("adm");
        moniStockNames.add("acn");
        moniStockNames.add("adbe");
        moniPortfolio.setStockNames(moniStockNames);
        portfolioArrayList.add(moniPortfolio);


        // KayPortfolio
        Portfolio kayPortfolio = new Portfolio();
        kayPortfolio.setUser("Kay");
        kayPortfolio.setName("KayPortfolio");
        kayPortfolio.setSummary("KayPortfolio includes adi, adm , adp and ads. Have a good performance recent!");
        ArrayList<String> kayStockNames = new ArrayList<>();
        kayStockNames.add("adi");
        kayStockNames.add("adm");
        kayStockNames.add("adp");
        kayStockNames.add("ads");
        kayPortfolio.setStockNames(kayStockNames);
        portfolioArrayList.add(kayPortfolio);
        return portfolioArrayList;
    }

}
