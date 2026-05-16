package introduction.inheritance.payroll_hr;

import java.time.LocalDate;
import java.util.ArrayList;

public class PayrollGenerator {
    static void main() {
        String text = """
                1,Erlent,Mazreku,2005-06-06,2026-05-16,Programmer,500,10,Java
                2,Xhemaludin,Beluli,2004-04-04,2024-04-04,Manager,1000,5,IT
                3,Armend,Krasniqi,2000-01-01,2018-01-01,Consultant,500,20,AI Migration
                4,Lorik,Krasniqi,1960-05-05,2000-01-01,Manager,2000,15,Finance
                """;

        String[] rows = text.split("\n");

        ArrayList<Employee> employees = new ArrayList<>();

        for (String row : rows) {
            String[] columns = row.split(",");
            int id = Integer.parseInt(columns[0].trim());
            String name = columns[1].trim();
            String surname = columns[2].trim();
            LocalDate dateOfBirth = LocalDate.parse(columns[3].trim());
            LocalDate hireDate = LocalDate.parse(columns[4].trim());
            String type = columns[5].trim();

            double salaryOrHourlyWage = Double.parseDouble(columns[6].trim());
            double bonusPercentageOrHours = Double.parseDouble(columns[7].trim());
            String additionalInfo = columns[8].trim();

            Employee employee = null;

            switch (type.toLowerCase()) {
                case "programmer" ->
                        employee = new Programmer(id, name, surname, dateOfBirth, hireDate, salaryOrHourlyWage, bonusPercentageOrHours, additionalInfo);
                case "manager" ->
                        employee = new Manager(id, name, surname, dateOfBirth, hireDate, salaryOrHourlyWage, bonusPercentageOrHours, additionalInfo);
                case "consultant" ->
                        employee = new Consultant(id, name, surname, dateOfBirth, hireDate, bonusPercentageOrHours, salaryOrHourlyWage, additionalInfo);
                case "secretary" ->
                        employee = new Secretary(id, name, surname, dateOfBirth, hireDate, salaryOrHourlyWage, bonusPercentageOrHours, additionalInfo);
            }

            if (employee == null)
                continue;

            employees.add(employee);
        }

        ArrayList<Paycheck> paychecks = new ArrayList<>();

        for (Employee employee : employees) {
            Paycheck paycheck = new Paycheck(employee, 0, 5, 2026, LocalDate.now());
            paychecks.add(paycheck);
            paycheck.print();
        }


//        Employee employee1 = new Programmer(1,"Erlent","Mazreku",
//                LocalDate.of(2005,6,6),LocalDate.now(),
//                500,10,"Java");
//
//
//        Paycheck paycheck = new Paycheck(employee1,300,5,2026,LocalDate.now());
//        paycheck.print();

    }
}
