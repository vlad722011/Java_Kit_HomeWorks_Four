package employee;

public class Employee {
    /*
    Каждый сотрудник должен иметь следующие атрибуты:
    Табельный номер
    Номер телефона
    Имя
    Стаж
     */


    private int  personnelNumber;
    private String phone;
    private String FIO;
    private int experience;


    public Employee() {
    }

    public Employee(int personnelNumber, String phone, String FIO, int experience) {
        this.personnelNumber = personnelNumber;
        this.phone = phone;
        this.FIO = FIO;
        this.experience = experience;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(personnelNumber).append(", ")
                .append(FIO).append(", ")
                .append(phone).append(".");
        return sb.toString();
    }
}
