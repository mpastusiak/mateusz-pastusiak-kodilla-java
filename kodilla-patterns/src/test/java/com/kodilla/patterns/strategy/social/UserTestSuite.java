package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User brian = new ZGeneration("Brian Nowobogacki");
        User adam = new Millenials("Adam Kowalski");
        User eustachy = new YGeneration("Eustachy Starobogacki");

        //When
        String brianShareBy = brian.sharePost();
        System.out.println("Brian usually share by: " + brianShareBy);
        String adamShareBy = adam.sharePost();
        System.out.println("Adam usually share by: " + adamShareBy);
        String eustachyShareBy = eustachy.sharePost();
        System.out.println("Eustachy usually share by: " + eustachyShareBy);

        //Then
        Assert.assertEquals("Snapchat", brianShareBy);
        Assert.assertEquals("Facebook", adamShareBy);
        Assert.assertEquals("Twitter", eustachyShareBy);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User brian = new ZGeneration("Brian Nowobogacki");

        //When
        String brianShareBy = brian.sharePost();
        System.out.println("Brian usually share by: " + brianShareBy);
        brian.setSocialPublisher(new TwitterPublisher());
        brianShareBy = brian.sharePost();
        System.out.println("Brian now share by " + brianShareBy);

        //Then
        Assert.assertEquals("Twitter", brianShareBy);
    }
}
