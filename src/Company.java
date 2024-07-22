public class Company {
    private static String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Company(String companyName) {
        this.companyName = companyName;

    }
    public static String printCompanyName() {
        return companyName;
    }

    public static String changerCompanyName(String newName) {
        return companyName = newName;
    }
}
