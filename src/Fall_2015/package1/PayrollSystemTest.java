package Fall_2015.package1;

/**
 * Created by Hussein on 7/3/15.
 */
public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Umniyah", "Nadir", "333-69699", 300);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Halbast", "Abdulla", "222-66666", 12, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Mustafa", "Luay", "123-11111", 0.5, 500);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Hussein",
                "Ahmed", "333-33333", 0.5, 3000, 1000);


        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;


        System.out.println("Employees processed polymorphically");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }


        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee %d is a %s%n",
                    i, employees[i].getClass().getName());
        }
    }
}
