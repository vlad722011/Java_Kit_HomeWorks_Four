import employee.Employee;
import employeeDirectory.Directory;
import java.util.ArrayList;
import java.util.List;


public class Main {

    /*
    Создать справочник сотрудников
    Необходимо:
    Создать класс справочник сотрудников, который содержит внутри
    коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
    Табельный номер
    Номер телефона
    Имя
    Стаж

    Добавить метод, который ищет сотрудника по стажу (может быть список)
    Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    Добавить метод, который ищет сотрудника по табельному номеру
    Добавить метод добавление нового сотрудника в справочник

     */

    public static void main(String[] args) {
        // Создаем список сотрудников справочника, для начала пустой!
        List<Employee> employeeList = new ArrayList<>();

        // Создаем экземпляр нашего справочника, для начала тоже пустой!
        Directory directoryEmployee = new Directory(employeeList);

        // Выведем на печать справочник сотрудников, убеждаемся, что справочник создан, и пока он пустой!!!
        System.out.println(directoryEmployee.toString());

        // Создаем несколько сотрудников.
        Employee employee1 = new Employee(1, "+7-923-423-79-80", "Ivanov Ivan", 7);
        Employee employee2 = new Employee(2, "+7-956-179-23-12", "Petrov Petr", 1);
        Employee employee3 = new Employee(3, "+7-817-999-99-90", "Antonova Anna", 13);
        Employee employee4 = new Employee(4, "+7-777-615-67-67", "Sergeeva Irina", 2);
        Employee employee5 = new Employee(5, "+4-555-455-33-33", "Bach Alex", 3);


        // Проверяем метод добавления сотрудника в справочник! Добавим сотрудника в справочник и выведем справочник в консоль!
        directoryEmployee.addNewEmployee(employee1);
        directoryEmployee.addNewEmployee(employee2);
        directoryEmployee.addNewEmployee(employee3);

        // Пытаемся повторно добавить сотрудника в справочник! Убеждаемся, что повтороное добавление не происходит.
        System.out.println("Пытаемся добавить в справочник сотрудника, который там уже есть!");
        directoryEmployee.addNewEmployee(employee3);
        System.out.println();
        directoryEmployee.addNewEmployee(employee4);
        directoryEmployee.addNewEmployee(employee5);

        // Выведем справочник в консоль, после добавления сотрудников.
        System.out.println("Выведем справочник в консоль.");
        System.out.println(directoryEmployee.toString());


        // Ищем сотрудников по стажу
        System.out.println("Ищем сотрудников по стажу.");
        List<Employee> employeeWithDefiniteExperience = new ArrayList<>();
        employeeWithDefiniteExperience = directoryEmployee.findEmployeeByExperience(directoryEmployee, 5);
        System.out.println(employeeWithDefiniteExperience);
        System.out.println();


        // Ищем сотрудников по табельному номеру
        System.out.println("Ищем сотрудников по табельному номеру.");
        Employee desiredEmployeeWithPersonalNumber = directoryEmployee.findEmployeeByPersonnelNumber(directoryEmployee, 2);
        System.out.println(desiredEmployeeWithPersonalNumber.toString());
        System.out.println();


        // Ищем сотрудников по номеру телефона
        System.out.println("Ищем сотрудников по номеру телефона.");
        Employee employeeWithDesirePhone = directoryEmployee.findEmployeeByPhone(directoryEmployee, "+7-923-423-79-80");
        System.out.println(employeeWithDesirePhone.toString());

    }
}
