package rfqsystem;

import java.util.Timer;
import java.util.TimerTask;

public class Auction {

    public static boolean auctionOpen = false;          

    private static final long AUCTION_DURATION_MS = 30L * 1000L; 

    public static void startAuctionTimer() {
        auctionOpen = true;

        System.out.println("\n Auction started. You have 30 seconds to choose and confirm.");

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                auctionOpen = false;
                System.out.println("\n----AUCTION TIME IS OVER (30 seconds passed)----");
                timer.cancel();
            }
        }, AUCTION_DURATION_MS);
    }
}