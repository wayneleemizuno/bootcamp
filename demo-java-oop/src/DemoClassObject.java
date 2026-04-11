public class DemoClassObject {
  public static void main(String[] args) {
    String phoneNumber = "+852 97843342";
    String emailAddress = "amimizuno@gmail.com";
    String whatsapp = "+852 98733444";
    String wechatId = "amimizuno";

    String[] profile = new String[] { "+852 97843342", "amimizuno@gmail.com", "+852 98733444", "amimizuno" };

    // Object-oriented Programming
    Tutor t1 = new Tutor(); // produce a Tutor object
    t1.setEmailAddress("amimizuno@gmail.com");

    Tutor t2 = new Tutor();
    t2.setEmailAddress("wookoo@hotmail.com");
    String t2Email = t2.getEmailAddress();
    System.out.println(t2Email);

  }
}
