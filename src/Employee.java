public abstract class Employee implements Payable{
  private String emploeeId;
  private  String name;

  public Employee(String employeeId, String name) {
    this.emploeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return this.emploeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.emploeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return calculatePay();
  }

  @Override
  public String toString() {
    return this.name + " " + this.emploeeId + "" + String.format("%.2f",calculatePay());
  }
}
