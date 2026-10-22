package homework1;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Yandex");
        Worker worker = new Worker("Nikita", company1);

        company1.setCompanyName("Google");
        System.out.println(company1.getCompanyName());
        System.out.println(worker.getCompany().getCompanyName());

        Company company2 = new Company(company1);
        company2.setCompanyName("VK");
        System.out.println(company1.getCompanyName());
        System.out.println(company2.getCompanyName());

        worker.getCompany().setCompanyName("SBER");
        System.out.println(company1.getCompanyName());
    }
}