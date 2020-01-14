package employees;

public class Professor extends Instructor {
  public Professor(String name, int id, double salary, int appointmentMonths) {
    super(name, id, salary, appointmentMonths);
  }

  public String deliverLecture() {
    return "Much pontification...";
  }
}
