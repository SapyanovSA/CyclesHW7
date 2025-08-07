import java.time.Year;

public class Main {
    public static void main(String[] args) {

       for (int year = 2021; ; year++) {
           if (Year.isLeap(year)){
               System.out.println("Ближайший весокосный год " + year);
               break;
           }
       }
    }
}
