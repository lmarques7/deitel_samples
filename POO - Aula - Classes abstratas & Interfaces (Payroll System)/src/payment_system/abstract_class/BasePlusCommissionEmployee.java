package payment_system.abstract_class;
public class BasePlusCommissionEmployee extends CommissionEmployee {
  private double baseSalary;

  public BasePlusCommissionEmployee(String first, String last, String ssn,
        double sales, double rate, double salary) {
    super(first, last, ssn, sales, rate);
    setBaseSalary(salary);
  }
  public double earnings() {
    return getBaseSalary() + super.earnings();
  }
  public String toString() {
    return String.format("%s %s; %s: $%,.2f", "base-salaried",
        super.toString(), "base salary", this.getBaseSalary());
  } 
  public void setBaseSalary(double salary) {
    this.baseSalary = (salary < 0.0) ? 0.0 : salary;
  }
  public double getBaseSalary() {
    return this.baseSalary;
  }
}