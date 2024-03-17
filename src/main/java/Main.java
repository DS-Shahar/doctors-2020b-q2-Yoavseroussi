import java.util.*;

public class Main_doctors {
  public static Scanner input = new Scanner(System.in);

  public static void doctorRating(Doctor[] doctors) {
    double sum = 0;
    int count = 0;
    int r;
    for (int i = 0; i < doctors.length; i++) {
      System.out.println("enter your rate ");
      r = input.nextInt();
      while (r != -1) {
        sum += r;
        count++;
        System.out.println("enter your rate ");
        r = input.nextInt();
      }
      doctors[i].setRate(sum / count);
    }
  }

  public static void main(String[] args) {
    Grade[] a = new Grade[5];
    for (int i = 0; i < a.length; i++)
      System.out.println(a[i]);
  }

}
public class Doctor {
  private String name;
  private String specialization;
  private double rate;

  public Doctor(String name, String specialization) {
    this.rate=0;
    this.name = name;
    this.specialization = specialization;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getSpecialization() {
    return specialization;
  }
  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }
  public double getRate() {
    return rate;
  }
  public void setRate(double rate) {
    this.rate = rate;
  }

}
