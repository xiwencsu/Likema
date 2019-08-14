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
        Portfolio clairPortfolio = new Portfolio();
        clairPortfolio.setUser("Clair");
        clairPortfolio.setName("ClairPortfolio");
        clairPortfolio.setSummary("ClairPortfolio includes abx and acas. Have a good performance recent!");
        ArrayList<String> clairStockNames = new ArrayList<>();
//        clairStockNames.add("abt");
        clairStockNames.add("abx");
        clairStockNames.add("acas");
        clairPortfolio.setStockNames(clairStockNames);
        portfolioArrayList.add(clairPortfolio);

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


        // RawPortfolio
        Portfolio rawPortfolio = new Portfolio();
        rawPortfolio.setUser("Raw");
        rawPortfolio.setName("RawPortfolio");
        rawPortfolio.setSummary("RawPortfolio includes adi, adm , adp and ads. Have a good performance recent!");
        ArrayList<String> rawStockNames = new ArrayList<>();
        rawStockNames.add("adi");
        rawStockNames.add("adm");
        rawStockNames.add("adp");
        rawStockNames.add("ads");
        rawPortfolio.setStockNames(rawStockNames);
        portfolioArrayList.add(rawPortfolio);
        return portfolioArrayList;
    }

}
