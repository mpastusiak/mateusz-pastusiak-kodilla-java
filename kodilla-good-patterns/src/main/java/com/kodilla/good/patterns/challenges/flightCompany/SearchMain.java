package com.kodilla.good.patterns.challenges.flightCompany;

public class SearchMain {
    public static void main(String[] args) {
        SearchConnection searchConnection = new SearchConnection("Krakow", null);
        searchConnection.getSearchConnectionResult();

        SearchConnection searchConnection2 = new SearchConnection(null, "Radom");
        searchConnection2.getSearchConnectionResult();

        SearchConnection searchConnection3 = new SearchConnection("Gdansk", "Moscow");
        searchConnection3.getSearchConnectionResult();
    }
}
