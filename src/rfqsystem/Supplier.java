
package rfqsystem;

public class Supplier {

   
    String supplierId;
    String companyName;
    double rating;
    String region;
    
     public Supplier(String supplierId, String companyName, double rating, String region) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.rating = rating;
        this.region = region;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getRating() {
        return rating;
    }

    public String getRegion() {
        return region;
    }

   
     @Override
    public String toString() {
        return "Supplier{" + "supplierId=" + supplierId + ", companyName=" + companyName + ", rating=" + rating + ", region=" + region + '}';
    }
    
    
}
