package employees;

public class Professor extends Instructor implements Lecturer {
  public Professor(String name, int id, double salary, int appointmentMonths) {
    super(name, id, salary, appointmentMonths);
  }

  @Override
  public String deliverLecture() {
    return "Much pontification...";
  }
}
