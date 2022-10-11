import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
      int val = 1;
      switch (val){
          case 1:login();
          break;
      }
    }
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------Login------------");
        System.out.print("enter yor email=> ");
        String email = scanner.next();
        System.out.print("enter yor password=> ");
        String password = scanner.next();
        Authetification root = new Authetification(email,password);

    }
}
