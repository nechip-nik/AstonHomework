package homework1;

public class Company {
    private String companyName;


    public Company(String companyName) {
        this.companyName = companyName;
    }

    public Company(Company o) {
        this.companyName = o.companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
