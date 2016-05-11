package payment_system.abstract_class;
public class SalariedEmployee extends Employee {
  private double weeklySalary;
  public SalariedEmployee(String first, String last, String ssn, double salary) {
    super(first, last, ssn);
    this.setWeeklySalary(salary);
  }
  public double earnings() {
    return getWeeklySalary();
  }
  public String toString() {
    return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(),
        "weekly salary", this.getWeeklySalary());
  }
  public void setWeeklySalary(double salary) {
    this.weeklySalary = salary < 0.0 ? 0.0 : salary;
  }
  public double getWeeklySalary() {
    return this.weeklySalary;
  }
}