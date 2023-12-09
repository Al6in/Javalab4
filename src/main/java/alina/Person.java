package alina;

public class Person {
    int id;
    String name;
    Sex sex;
    String date;
    Division division;
    int salary;

    public Person(int id, String name, Sex sex, String date, Division division, int salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.division = division;
        this.salary = salary;
    }

    public void print() {

        System.out.println(id + " " + name + " " + sex + " " + date + " " + division.name + " " + salary);
    }
}
