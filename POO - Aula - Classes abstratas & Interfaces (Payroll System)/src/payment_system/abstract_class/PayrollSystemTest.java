package payment_system.abstract_class;
public class PayrollSystemTest {
  
  public static void main(String args[]) {
    
    // Criando objetos das subclasses
    SalariedEmployee salariedEmployee = 
      new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
    HourlyEmployee hourlyEmployee = 
      new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
    CommissionEmployee commissionEmployee = 
      new CommissionEmployee("Sue","Jones", "333-33-3333", 10000, 0.06);
    BasePlusCommissionEmployee basePlusCommissionEmployee = 
      new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

    System.out.println("Employees processed individually:\n");

    System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned",
        salariedEmployee.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned",
        hourlyEmployee.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned",
        commissionEmployee.earnings());
    System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee,
        "earned", basePlusCommissionEmployee.earnings());

    // Criando um array de Employee de quatro posições
    Employee employees[] = new Employee[4];

    // Inicializando cada posição do array com os objetos criados
    employees[0] = salariedEmployee;
    employees[1] = hourlyEmployee;
    employees[2] = commissionEmployee;
    employees[3] = basePlusCommissionEmployee;
    
    System.out.println("Employees processed polymorphically:\n");

    // Genericamente process cada elemento do array
    
    for (int i = 0; i < employees.length; i++) {
        Employee e = employees[i];
        System.out.println(e.earnings());
    }
    
    for (Employee currentEmployee : employees) {
      // Invoca implicitamente o método toString
      System.out.println(currentEmployee); 
      
      // Determina qual elemento é um BasePlusCommissionEmployee
      if (currentEmployee instanceof BasePlusCommissionEmployee) {
        // Faz um cast para uma referência de tipo menor (BasePlusCommissionEmployee)
        BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

        double oldBaseSalary = employee.getBaseSalary();
        employee.setBaseSalary(1.10 * oldBaseSalary);
        System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
            employee.getBaseSalary());
      }

      System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
    }

    // Pega o nome de cada tipo dos objetos do array de Employees
    for (int j = 0; j < employees.length; j++)
      System.out.printf("Employee %d is a %s\n", j, employees[j].getClass());
  }
}
