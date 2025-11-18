
package rfqsystem;

public class Buyer {
    
    String companyName;
    String Country;
    String City;
    int zipcode;
    
      public Buyer(String companyName, String Country, String City, int zipcode) {
        this.companyName = companyName;
        this.Country = Country;
        this.City = City;
        this.zipcode = zipcode;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }

    public int getZipcode() {
        return zipcode;
    }

    @Override
    public String toString() {
        return "Buyer{" + "companyName=" + companyName + ", Country=" + Country + ", City=" + City + ", zipcode=" + zipcode + '}';
    }
  
}
