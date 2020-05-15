package day40_Encapsulation;

public class EmployeeInfo {
    private double salary;
    private long SSN;
    private int ID;
    private String Address;
  public static String companyName="Bank of America";
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getSalary() {
        return salary;
    }

    public long getSSN() {
        return SSN;
    }

    public int getID() {
        return ID;
    }

    public String getAddress() {
        return Address;
    }
}
