
package rfqsystem;

public class Notification {
    
    String notification;
    String recieverId;
    String senderId;
    String recieverName;
    String senderName;
    boolean isRead;
    boolean isSent;

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public void setRecieverId(String recieverId) {
        this.recieverId = recieverId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public void setIsSent(boolean isSent) {
        this.isSent = isSent;
    }

    public String getNotification() {
        return notification;
    }

    public String getRecieverId() {
        return recieverId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getRecieverName() {
        return recieverName;
    }

    public String getSenderName() {
        return senderName;
    }

    public boolean isIsRead() {
        return isRead;
    }

    public boolean isIsSent() {
        return isSent;
    }
    
    
    public static void sendNotification(String message) {
        // For now, just print to console (simulating sending a notification)
        System.out.println("\n----------Notification Sent Successfully----------");
        System.out.println(message);
        System.out.println("-------------------------------\n");
    }

    @Override
    public String toString() {
        return "Notification{" + "notification=" + notification + ", recieverId=" + recieverId + ", senderId=" + senderId + ", recieverName=" + recieverName + ", senderName=" + senderName + ", isRead=" + isRead + ", isSent=" + isSent + '}';
    }
    
    
    
}
