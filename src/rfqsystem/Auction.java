package rfqsystem;

import java.util.Timer;
import java.util.TimerTask;

public class Auction {

    public static boolean auctionOpen = false;          // shared flag

    private static final long AUCTION_DURATION_MS = 30L * 1000L;  // 10 seconds

    public static void startAuctionTimer() {
        auctionOpen = true;

        System.out.println("\n Auction started. You have 10 seconds to choose and confirm.");

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                auctionOpen = false;
                System.out.println("\n---AUCTION TIME IS OVER (30 seconds passed)---");
                timer.cancel();
            }
        }, AUCTION_DURATION_MS);
    }
}