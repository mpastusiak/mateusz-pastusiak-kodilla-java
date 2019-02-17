package com.kodilla.good.patterns.challenges.food2door;

public class UserOrderDto {
    private final User user;
    private final boolean isOrdered;

    public UserOrderDto(final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
