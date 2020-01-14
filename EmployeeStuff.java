import employees.Employee;
import employees.Instructor;
import employees.Lecturer;
import employees.Professor;

class EmployeeStuff {
  public static void main(String[] args) {
    Employee e = new Employee("Luke Skywalker", 1, 40.00);
    System.out.println(e.getName() + " earns " + e.getMonthlyPay(160));

    Instructor i = new Instructor("Leia Organa", 2, 1000000, 9);
    System.out.println(i.getName() + " earns " + i.getMonthlyPay(160));
    System.out.println(i.getName() + " earns " + i.getMonthlyPay());

    Employee ei = new Instructor("Rey", 3, 1000000, 9);
    System.out.println(ei.getName() + " earns " + ei.getMonthlyPay(160));

    Professor p = new Professor("Kylo", 3, 1000000, 9);

    haveALecture(i);
    haveALecture(p);
  }

  public static void haveALecture(Lecturer l) {
    System.out.println(l.getName() + " says: " + l.deliverLecture());
  }
}

class SomeOtherClass {
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
