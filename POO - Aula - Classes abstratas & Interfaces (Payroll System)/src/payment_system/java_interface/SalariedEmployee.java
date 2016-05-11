package payment_system.java_interface;
// Fig. 10.14: SalariedEmployee.java
// Classe SalariedEmployee estende Employee que implementa Payable.

public class SalariedEmployee extends Employee {
  private double weeklySalary;

  public SalariedEmployee(String first, String last, String ssn, double salary) {
    super(first, last, ssn);
    this.setWeeklySalary(salary);
  }

  public double getPaymentAmount() {
    return this.getWeeklySalary();
  }

  public String toString() {
    return String.format("salaried employee: %s\n%s: $%,.2f", 
        super.toString(), "weekly salary", this.getWeeklySalary());
  }
  
  public void setWeeklySalary(double salary) {
    weeklySalary = salary < 0.0 ? 0.0 : salary;
  } // fim do método setWeeklySalary

  // retorna o salário
  public double getWeeklySalary() {
    return weeklySalary;
  } // fim do método getWeeklySalary
  
}