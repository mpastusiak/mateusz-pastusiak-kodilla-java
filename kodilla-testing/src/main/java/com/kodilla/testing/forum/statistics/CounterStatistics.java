package com.kodilla.testing.forum.statistics;

public class CounterStatistics {
    int usersCount;
    int postsCount;
    int commentsCount;
    double averagePostsPerUsers = 0;
    double averageCommentsPerUsers = 0;
    double averageCommentsPerPosts = 0;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();

        if (usersCount!=0) {
            this.averagePostsPerUsers = postsCount / (double)usersCount;
            this.averageCommentsPerUsers = commentsCount / (double)usersCount;
        }
        if (postsCount!=0) {
            this.averageCommentsPerPosts = commentsCount / (double)postsCount;
        }
    }

    public double getAveragePostsPerUsers() {
        return this.averagePostsPerUsers;
    }

    public double getAverageCommentsPerUsers() {
        return this.averageCommentsPerUsers;
    }

    public double getAverageCommentsPerPosts() {
        return this.averageCommentsPerPosts;
    }
}