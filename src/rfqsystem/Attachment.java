
package rfqsystem;
import java.util.*;

import java.time.LocalDateTime;
public class Attachment {
    
    String fileName;
    String fileType;
    String path;
    LocalDateTime uploadedAt;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getPath() {
        return path;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    @Override
    public String toString() {
        return "Attachment{" + "fileName=" + fileName + ", fileType=" + fileType + ", path=" + path + ", uploadedAt=" + uploadedAt + '}';
    }
    
  
    
    
    
    
    
}
