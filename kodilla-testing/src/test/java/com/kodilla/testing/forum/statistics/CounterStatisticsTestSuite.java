package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CounterStatisticsTestSuite {
    @Test
    // test dla zerowych wartości
    public void testCalculateForecastWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 0; i++) {
            usersNames.add("name" + i);
        }
        int postsQuantity = 0;
        int commentsQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CounterStatistics counterStatistics = new CounterStatistics();
        counterStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageCommentsPerUsers = counterStatistics.getAverageCommentsPerUsers();
        double averagePostsPerUsers = counterStatistics.getAveragePostsPerUsers();
        double averageCommentsPerPosts = counterStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(0.0, averageCommentsPerUsers, 0.001);
        Assert.assertEquals(0.0, averagePostsPerUsers, 0.001);
        Assert.assertEquals(0.0, averageCommentsPerPosts, 0.001);
    }

    @Test
    // test gdy liczba postów = 1000 && liczba comentarzy > liczba postów && liczba użytkowników = 100
    public void testCalculateForecastWithMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add("name" + i);
        }
        int postsQuantity = 1000;
        int commentsQuantity = 5550;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CounterStatistics counterStatistics = new CounterStatistics();
        counterStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageCommentsPerUsers = counterStatistics.getAverageCommentsPerUsers();
        double averagePostsPerUsers = counterStatistics.getAveragePostsPerUsers();
        double averageCommentsPerPosts = counterStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(55.5, averageCommentsPerUsers, 0.001);
        Assert.assertEquals(10.0, averagePostsPerUsers, 0.001);
        Assert.assertEquals(5.55, averageCommentsPerPosts, 0.001);
    }

    @Test
    // test gdy liczba komentarzy = 0
    public void testCalculateForecastWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add("name" + i);
        }
        int postsQuantity = 1000;
        int commentsQuantity = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CounterStatistics counterStatistics = new CounterStatistics();
        counterStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageCommentsPerUsers = counterStatistics.getAverageCommentsPerUsers();
        double averagePostsPerUsers = counterStatistics.getAveragePostsPerUsers();
        double averageCommentsPerPosts = counterStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(0.0, averageCommentsPerUsers, 0.001);
        Assert.assertEquals(10.0, averagePostsPerUsers, 0.001);
        Assert.assertEquals(0.0, averageCommentsPerPosts, 0.001);
    }

    @Test
    // test gdy liczba komentarzy < liczba postów
    public void testCalculateForecastWithMock4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add("name" + i);
        }
        int postsQuantity = 1000;
        int commentsQuantity = 550;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CounterStatistics counterStatistics = new CounterStatistics();
        counterStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageCommentsPerUsers = counterStatistics.getAverageCommentsPerUsers();
        double averagePostsPerUsers = counterStatistics.getAveragePostsPerUsers();
        double averageCommentsPerPosts = counterStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(5.5, averageCommentsPerUsers, 0.001);
        Assert.assertEquals(10.0, averagePostsPerUsers, 0.001);
        Assert.assertEquals(0.55, averageCommentsPerPosts, 0.001);
    }

    @Test
    // test gdy liczba użytkowników = 0
    public void testCalculateForecastWithMock5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 0; i++) {
            usersNames.add("name" + i);
        }
        int postsQuantity = 1000;
        int commentsQuantity = 5550;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CounterStatistics counterStatistics = new CounterStatistics();
        counterStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageCommentsPerUsers = counterStatistics.getAverageCommentsPerUsers();
        double averagePostsPerUsers = counterStatistics.getAveragePostsPerUsers();
        double averageCommentsPerPosts = counterStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(0.0, averageCommentsPerUsers, 0.001);
        Assert.assertEquals(0.0, averagePostsPerUsers, 0.001);
        Assert.assertEquals(5.55, averageCommentsPerPosts, 0.001);
    }

    @Test
    // test gdy liczba postów = 0
    public void testCalculateForecastWithMock6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            usersNames.add("name" + i);
        }
        int postsQuantity = 0;
        int commentsQuantity = 5550;
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postsQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentsQuantity);

        CounterStatistics counterStatistics = new CounterStatistics();
        counterStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averageCommentsPerUsers = counterStatistics.getAverageCommentsPerUsers();
        double averagePostsPerUsers = counterStatistics.getAveragePostsPerUsers();
        double averageCommentsPerPosts = counterStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(55.5, averageCommentsPerUsers, 0.001);
        Assert.assertEquals(0.0, averagePostsPerUsers, 0.001);
        Assert.assertEquals(0.0, averageCommentsPerPosts, 0.001);
    }
}