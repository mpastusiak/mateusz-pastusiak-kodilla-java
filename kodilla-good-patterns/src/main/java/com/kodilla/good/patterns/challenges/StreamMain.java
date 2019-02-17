package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println(getListPositionsAsString());
    }

    private static String getListPositionsAsString() {
        return MovieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));
    }
}