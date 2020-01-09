package employees;

public class Instructor extends Employee {
  private int appointmentMonths;

  public Instructor(String name, int id, double salary, int appointmentMonths) {
    super(name, id, salary);
    this.appointmentMonths = appointmentMonths;
  }

  @Override
  public double getMonthlyPay(double hoursWorked) {
    return this.getPayRate() / this.appointmentMonths;
  }

  public double getMonthlyPay() {
    return this.getPayRate() / this.appointmentMonths;
  }
}
