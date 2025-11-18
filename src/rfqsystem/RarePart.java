
package rfqsystem;

public class RarePart {
    
    String rpartName;
    String rpartModel;
    int rpartId;
    
    public void setPartName(String partName) {
        this.rpartName = partName;
    }

    public void setPartModel(String partModel) {
        this.rpartModel = partModel;
    }

    public void setPartId(int partId) {
        this.rpartId = partId;
    }

    public String getPartName() {
        return rpartName;
    }

    public String getPartModel() {
        return rpartModel;
    }

    public int getPartId() {
        return rpartId;
    }

    @Override
    public String toString() {
        return "Parts{" + "partName=" + rpartName + ", partModel=" + rpartModel + ", partId=" + rpartId + '}';
    }
   
    
}
