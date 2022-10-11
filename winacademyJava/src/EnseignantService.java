import java.util.Scanner;

public class EnseignantService extends AdminService{
        Scanner scanner = new Scanner(System.in);

        public void menu(){

            while(1==1){
                System.out.println("-------------------------------------Menu--------------------------------");
                System.out.println(
                        "1 : ajouter les notes     2:  consulter les etudiant " +'\n'
                );
                int value = scanner.nextInt();
                switch(value){
                    case 1:this.ajouteNote();
                      break;
                    case 2:this.student.stream().forEach(System.out::println);
                }

            }
        }

}
