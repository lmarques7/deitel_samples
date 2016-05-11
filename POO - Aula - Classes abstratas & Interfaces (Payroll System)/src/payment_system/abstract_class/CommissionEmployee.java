package payment_system.abstract_class;
public class CommissionEmployee extends Employee {
  private double grossSales;
  private double commissionRate;
  public CommissionEmployee(String first, String last, 
                            String ssn, double sales, double rate) {
    super(first, last, ssn);
    setGrossSales(sales);
    setCommissionRate(rate);
  }
  public double earnings() {
    return getCommissionRate() * getGrossSales();
  }
  public String toString() {
    return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "commission employee",
        super.toString(), "gross sales", this.getGrossSales(), "commission rate",
        this.getCommissionRate());
  }
  
  public void setCommissionRate(double rate) {
    this.commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
  }

  public double getCommissionRate() {
    return this.commissionRate;
  }

  public void setGrossSales(double sales) {
    this.grossSales = (sales < 0.0) ? 0.0 : sales;
  }

  public double getGrossSales() {
    return this.grossSales;
  }
}
