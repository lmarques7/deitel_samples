package payment_system.abstract_class;
public class HourlyEmployee extends Employee {
  private double wage;
  private double hours;
  public HourlyEmployee(String first, String last, String ssn, 
                        double hourlyWage, double hoursWorked) {
    super(first, last, ssn);
    this.setWage(hourlyWage);
    this.setHours(hoursWorked);
  }
  public double earnings() {
    if (getHours() <= 40)
      return getWage() * getHours();
    else
      return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
  }
  public String toString() {
    return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super
        .toString(), "hourly wage", this.getWage(), "hours worked", this.getHours());
  }

  public void setWage(double hourlyWage) {
    this.wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
  }

  public double getWage() {
    return this.wage;
  }

  public void setHours(double hoursWorked) {
    this.hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ? hoursWorked : 0.0;
  }

  public double getHours() {
    return this.hours;
  }
}

