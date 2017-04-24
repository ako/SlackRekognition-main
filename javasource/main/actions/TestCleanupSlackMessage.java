package main.actions;

import org.junit.Test;

/**
 * Created by ako on 2/21/2017.
 */
public class TestCleanupSlackMessage {
    @Test
    public void testRE() {
        String pattern = "<[^>]*>";
        String message = "<@U09QH0147|andrej> uploaded a file: <https://mendix.slack.com/files/andrej/F497U2TCN/grandhotels-ep-new-gran-hotel-bf7b19b4708dab1b898bdafa65cc625d-large-761166.jpg|grandhotels-ep-new-gran-hotel-bf7b19b4708dab1b898bdafa65cc625d-large-761166.jpg> and commented: What do you see?";
        System.out.println(message.replaceAll(pattern, ""));
    }
}
