# SEG3503_playground
| Outline | Value |
| --- | --- |
| Course | SEG 3503 |
| Date | Summer 2023 |
| Professor |  Mohamed Ali Ibrahim  |
| TA |  Abonasara Joseph |

# Grades

Stub code:


Output with stub code:


Error after Assignment2 code replacement:


# Twitter

Tests (TwitterTest.java):

    // @Test
    // void isMentionned_lookForAtSymbol() {
    //   // Assuming a tweet like "hello @me"
    //   // isMentionned("me") should be true
    //   // isMentionned("you") should be false
    // }
    @Test
    void mockMention_lookAtSymbol() {

        Twitter twitter = partialMockBuilder(Twitter.class)
          .addMockedMethod("loadTweet")
          .createMock();

        expect(twitter.loadTweet()).andReturn("hello @me").times(2);
        replay(twitter);

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(true, actual);

        actual = twitter.isMentionned("you");
        assertEquals(false, actual);
    }
    // @Test
    // void isMentionned_dontReturnSubstringMatches() {
    //   // Assuming a tweet like "hello @meat"
    //   // isMentionned("me") should be false
    //   // isMentionned("meat") should be true
    // }
    @Test
    void mockMention_noReturnSubstringMatch() {

        Twitter twitter = partialMockBuilder(Twitter.class)
          .addMockedMethod("loadTweet")
          .createMock();

        expect(twitter.loadTweet()).andReturn("hello @meat").times(2);
        replay(twitter);

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(false, actual);

        actual = twitter.isMentionned("meat");
        assertEquals(true, actual);
    }
    // @Test
    // void isMentionned_superStringNotFound() {
    //   // Assuming a tweet like "hello @me"
    //   // isMentionned("me") should be true
    //   // isMentionned("meat") should be false
    // }
    @Test
    void mockMention_noSuperstring() {

        Twitter twitter = partialMockBuilder(Twitter.class)
          .addMockedMethod("loadTweet")
          .createMock();

        expect(twitter.loadTweet()).andReturn("hello @me").times(2);
        replay(twitter);

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(true, actual);

        actual = twitter.isMentionned("meat");
        assertEquals(false, actual);
    }
    // @Test
    // void isMentionned_handleNull() {
    //   // Assuming no tweet is available (i.e. null)
    //   // isMentionned("me") should be false
    //   // isMentionned("meat") should be false
    // }
    @Test
    void mockMention_null() {

        Twitter twitter = partialMockBuilder(Twitter.class)
          .addMockedMethod("loadTweet")
          .createMock();

        expect(twitter.loadTweet()).andReturn(null).times(2);
        replay(twitter);

        boolean actual;

        actual = twitter.isMentionned("me");
        assertEquals(false, actual);

        actual = twitter.isMentionned("meat");
        assertEquals(false, actual);
    }

Result before modification Twitter.java:

![image](https://github.com/Liv-j/SEG3503_playground/assets/68886940/791efc35-e127-470a-95cd-e69cebf8edc7)

Modification/Analysis:

As loadTweet() only have three possible outputs ("I am tweet that likes to talk about @me", "Hello to @you" or null) and IsMentionned(String name) does not consider the possibility that the parameter can be null or the "name" being a substring of the parameter, both the mockMention_noReturnSubstringMatch() and mockMention_null() failed. To remedy this, I modified the IsMentionned method so that it encompasses these cases (see below for implementation).

![image](https://github.com/Liv-j/SEG3503_playground/assets/68886940/a4445bc6-9708-4b4b-847b-332d75949620)

Result after modification to Twitter.java:

With the previous modifications all tests pass. Though, actual_call() passes by random chance as it will only pass when r (random generated number) <= 0.45 because it will output "I am tweet that likes to talk about @me" (see loadTweet() implementation above).

![image](https://github.com/Liv-j/SEG3503_playground/assets/68886940/b7b5c4bc-b2e5-439b-8302-d2fe9f18ec96)

