
package rfqsystem;
import java.time.LocalDateTime;
public class Auction {

    int sessionID;
    int rfqId;
    LocalDateTime startTime;
    LocalDateTime endTime;
    int winnerQuotationId;
    
    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    public void setRfqId(int rfqId) {
        this.rfqId = rfqId;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setWinnerQuotationId(int winnerQuotationId) {
        this.winnerQuotationId = winnerQuotationId;
    }

    public int getSessionID() {
        return sessionID;
    }

    public int getRfqId() {
        return rfqId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public int getWinnerQuotationId() {
        return winnerQuotationId;
    }

    @Override
    public String toString() {
        return "Auction{" + "sessionID=" + sessionID + ", rfqId=" + rfqId + ", startTime=" + startTime + ", endTime=" + endTime + ", winnerQuotationId=" + winnerQuotationId + '}';
    }
    
    
    
}
