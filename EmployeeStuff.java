import employees.Employee;
import employees.Instructor;

class EmployeeStuff {
  public static void main(String[] args) {
    Employee e = new Employee("Luke Skywalker", 1, 40.00);
    System.out.println(e.getName() + " earns " + e.getMonthlyPay(160));

    Instructor i = new Instructor("Leia Organa", 2, 1000000, 9);
    System.out.println(i.getName() + " earns " + i.getMonthlyPay(160));
    System.out.println(i.getName() + " earns " + i.getMonthlyPay());
  }
}

class SomeOtherClass {
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
