package employeeDirectory;

import employee.Employee;
import java.util.ArrayList;
import java.util.List;

public class Directory {

    /*
    Добавить метод добавление нового сотрудника в справочник
    Добавить метод, который ищет сотрудника по стажу (может быть список)
    Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    Добавить метод, который ищет сотрудника по табельному номеру
     */

    private static final Directory dirEmployee = null;
    private List<Employee> employeeList = new ArrayList<>();


    public Directory(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    /**
     * Метод, который возвращает номер телефона сотрудника по имени (может быть список)
     */

    public Employee findEmployeeByPhone(Directory directory, String phone)  {
        System.out.printf("Сотрудник с номером телефона %s ->:\n", phone);
        Employee employeeWithPhone = null;
        List<Employee> list = directory.getEmployeeList();
        for (Employee emp : list) {
            String currentPhone = emp.getPhone();
            if (phone.equals(currentPhone)) {
                employeeWithPhone = emp;
            }
        }
        if (employeeWithPhone == null) {
            System.out.printf("Не найден сотрудник с номером телефона %s \n", phone);
        }


        return employeeWithPhone;
    }


    /**
     * Метод, который ищет сотрудника по персональному номеру.
     */

    public Employee findEmployeeByPersonnelNumber(Directory directory, int personelNumber) {
        Employee employeeWithPersonalNumber = null;
        System.out.printf("Сотрудник с персональным номером %d ->:\n", personelNumber);
        List<Employee> list = directory.getEmployeeList();
        int pn;
        for (Employee emp : list) {
            pn = emp.getPersonnelNumber();
            if (pn == personelNumber) {
                employeeWithPersonalNumber = emp;
            }
        }
        if(employeeWithPersonalNumber == null){
            System.out.println("Сотрудник не найден!!!");
        }

        return employeeWithPersonalNumber;
    }

    /**
     * Добавить метод, который ищет сотрудника по стажу (может быть список).
     */

    public List<Employee> findEmployeeByExperience(Directory directory, int experience) {
        System.out.printf("Искомые сотрудники, стаж которых не меньше %d лет ->:\n", experience);
        List<Employee> listWithEmployeeByDefiniteExperience = new ArrayList<>();
        for (Employee emp : directory.getEmployeeList()) {
            if (emp.getExperience() >= experience) {
                listWithEmployeeByDefiniteExperience.add(emp);
                System.out.println(emp.toString());
            }
        }
        return listWithEmployeeByDefiniteExperience;
    }

    /**
     * Метод добавления нового сотрудника в справочник
     */

    public Directory addNewEmployee(Employee employee) {
        if (!this.employeeList.contains(employee)) {
            this.employeeList.add(employee);
        } else {
            System.out.printf("Cотрудник: ->  %s уже есть в справочнике!!! \n", employee.toString());
        }
        return dirEmployee;
    }

    @Override
    public String toString() {
        System.out.println("Справочник сотрудников:");
        for (Employee employee : this.employeeList) {
            System.out.println(employee.toString());
        }
        if (this.employeeList.isEmpty()) {
            System.out.println("Справочник пока пуст. Не добавлено ни одного сотрудника!");
        }
        return "";
    }
}
