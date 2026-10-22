package homework1;

public final class Worker {
    private final String name;
    private final Company company;

    public Worker(String name, Company company) {
        this.name = name;
        this.company = new Company(company);
    }

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return new Company(company);
    }

}
