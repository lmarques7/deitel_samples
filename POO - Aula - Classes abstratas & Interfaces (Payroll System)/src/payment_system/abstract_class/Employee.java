package payment_system.abstract_class;
public abstract class Employee {
  private String firstName;
  private String lastName;
  private String socialSecurityNumber;

  public Employee(String first, String last, String ssn) {
    this.firstName = first;
    this.lastName = last;
    this.socialSecurityNumber = ssn;
  }

  public String toString() {
    return String.format("%s %s\nsocial security number: %s", getFirstName(),
        getLastName(), getSocialSecurityNumber());
  }

  // Método abstrato, isto é, sem implementação
  public abstract double earnings();

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getSocialSecurityNumber() {
    return this.socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }
}
