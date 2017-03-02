public class Student {
    private String license;
    private int commission;

    public Student(String license, int commission) {
        this.license = license;
        this.commission = commission;
    }

    public String getLicense() {
        return license;
    }

    public int getCommission() {
        return commission;
    }
}
