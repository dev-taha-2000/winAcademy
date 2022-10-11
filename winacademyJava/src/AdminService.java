import java.io.StringReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdminService extends Main {
    private int idStudent,departement_id,matiere_id ,group_id;
    List<User> user = new ArrayList<User>();
    Collection<Student> student = new ArrayList<Student>();
    Collection<Enseignant> enseignants = new ArrayList<Enseignant>();
    Scanner scanner = new Scanner(System.in);
    Collection<College> colleges = new ArrayList<College>();
    Collection<Departement> departements = new ArrayList<Departement>();
    Collection<Matiere> matieres = new ArrayList<Matiere>();
    Collection<Role> roles = new ArrayList<Role>();
    Collection<Note> notes = new ArrayList<Note>();
    public void createUser(String value){
        System.out.print("enter your full name :");
        String fullName = scanner.next();

        System.out.print("enter your email :");
        String email = scanner.next();

        System.out.print("chooose number of college");
        colleges.stream().forEach(System.out::print);
        int college_id = scanner.nextInt();

        System.out.print("chooose number of matiere");
        matieres.stream().forEach(System.out::print);
        int matiere_id = scanner.nextInt();

        System.out.print("chooose number of departement");
        departements.stream().forEach(System.out::print);
        int departement_id = scanner.nextInt();

        System.out.print("chooose number of role");
        roles.stream().forEach(System.out::print);
        int role_id = scanner.nextInt();

        System.out.print("enter your date :");
        String date = scanner.next();

        if(value.equals("student")){
            System.out.print("enter your id student :");
            int idStudent = scanner.nextInt();
        }else{
            System.out.print("enter your id enseignant :");
            int idEnseignant = scanner.nextInt();
        }

        System.out.print("enter ID:");
        int id = scanner.nextInt();
        if("student".equals(value)){
            System.out.print("enter your group_id:");
            int group_id = scanner.nextInt();
        }

        System.out.print("enter your password :");
        String password = scanner.next();

        System.out.print("enter your verify password :");
        String verifyPassword = scanner.next();
        if(verifyPassword.equals(password)){
            System.out.print("enter your phone :");
            long phone= scanner.nextLong();
            if(value.equals("student")){
                user.add(new User(id,fullName,email,password,phone,role_id));
                student.add(new Student(idStudent,matiere_id,college_id,date,group_id,id));
            }else{
                user.add(new User(id,fullName,email,password,phone,role_id));
                enseignants.add(new Enseignant(departement_id,matiere_id));
            }
        }else{
            do{
                System.out.print("your pass verify wrong enter password verify :");
                verifyPassword=scanner.nextLine();
            }
            while(!verifyPassword.equals(password));
            System.out.print("enter your phone :");
            long phone= scanner.nextLong();
            if(value.equals("student")){
                user.add(new User(id,fullName,email,password,phone,role_id));
                student.add(new Student(idStudent,matiere_id,college_id,date,group_id,id));
            }else{
                user.add(new User(id,fullName,email,password,phone,role_id));
                enseignants.add(new Enseignant(departement_id,matiere_id));
            }

        }
    }
    public void ajouterCollege(){
        System.out.println("enter name the college :");
        String name = scanner.next();
        System.out.println("enter  id:");
        int id = scanner.nextInt();
        System.out.println("enter name of city:");
        String city = scanner.next();
        System.out.println("enter  nemuro:");
        int nemuro = scanner.nextInt();
        colleges.add(new College(id,name,nemuro,city));
    }

    public void ajouterDepartement(){
        System.out.println("enter name the departement :");
        String name = scanner.next();
        System.out.println("enter  id:");
        int id = scanner.nextInt();
        System.out.println("enter chef département:");
        String chefDepartement = scanner.next();
        System.out.print("chooose number of college");
        colleges.stream().forEach(System.out::print);
        int college_id = scanner.nextInt();
        departements.add(new Departement(id,name,chefDepartement,college_id));
    }
    public void ajouterMatier(){
        System.out.println("enter id");
        int id = scanner.nextInt();
        System.out.println("enter name of matiere");
        String name = scanner.next();
        matieres.add(new Matiere(id,name));
    }
    public void ajouterole(){
        System.out.println("enter  id:");
        int id = scanner.nextInt();
        System.out.println("enter role:");
        String role = scanner.next();
        roles.add(new Role(id,role));
    }
    public void ajouteNote(){
        System.out.println("enter  id:");
        int id = scanner.nextInt();
        System.out.print("chooose number of matiere ");
        matieres.stream().forEach(System.out::print);
        int matiere_id = scanner.nextInt();

        System.out.print("chooose number of student ");
        student.stream().forEach(System.out::print);
        int student_id = scanner.nextInt();

        System.out.println("enter la note");
        float note = scanner.nextFloat();
        notes.add(new Note(id,student_id,matiere_id,note));
    }
    public void consulterStudent(){
        int value = 0;
        System.out.println("welcome admin");
        System.out.println("choose what you went consulter");
        do{
            System.out.println(
                    "1 : consulter le profile de etudiant " +'\n'+
                    "2 : consulter le nom avec departement et matier" +'\n'+
                    "3 : consulter le nom avec le moyen "+'\n'+
                    "4 : consulter la note>15 avec matiere"+'\n'+
                    "5 : recherche par email "+'\n'+
                    "6 : Quitter "
            );

            value = scanner.nextInt();
            switch (value){
                case 1 : Stream streamA = Stream.of(user);Stream streamB = Stream.of(roles);
                         Stream result = Stream.concat(streamA,streamB);
                         System.out.println(result.collect(Collectors.toList()));
                         break;
                case 2 :
                         user.stream().map(user1 ->user1.getFullName()).forEach(System.out::print);
                         Stream firststream = Stream.of(departements);
                         Stream secondstream = Stream.of(matieres);
                         Stream Solution = Stream.concat(firststream,secondstream);
                         System.out.print( Solution.collect(Collectors.toList()));
                         break;

            }
        }while (value!=6);
    }
    public void delete(){
            Iterator<User> it = user.iterator();
            user.stream().forEach(System.out::println);
            System.out.println("enter number for deleted");
            int idDelete = scanner.nextInt();
            while(it.hasNext()){
                User u = it.next();
                if(u.getId()==idDelete){
                    it.remove();
                    System.out.println("delete success");
                    break;
                }else{
                    System.out.println("not existe");
                }
            }
    }
    public void edit(){
        ListIterator<User> it = user.listIterator();
        user.stream().forEach(System.out::println);
        System.out.println("enter number for edit");
        int idEdit = scanner.nextInt();
        while(it.hasNext()){
            User u = it.next();
            if(u.getId()==idEdit){
                int id=0,role_id=0;
                System.out.println("enter new fullName");
                String fullName = scanner.next();
                System.out.println("enter new email");
                String email = scanner.next();
                System.out.println("enter new password");
                String password = scanner.next();
                System.out.println("enter new phone number");
                Long phone = scanner.nextLong();
                it.set(new User(id,fullName,email,password,phone,role_id));
                System.out.println("edit success");
                break;
            }else{
                System.out.println("not existe");
            }
        }
    }
    public void menu(){
        while(1==1){
            System.out.println("-------------------------------------Menu--------------------------------");
            System.out.println(
                    "1 : create students       2:  create enseignants " +'\n'+
                    "3 : consulter students    4 : consulter enseignants" +'\n'+
                    "5 : ajouter college       6: ajouter departement"+'\n'+
                    "7 : ajouter matiere       8 : create roles       "+'\n'+
                    "9 : ajouter les notes     10 : Delete                 "+'\n'+
                    "11: edit                      12: logout              "
            );
            int value = scanner.nextInt();
            switch(value){
                case 1 : createUser("student");
                    break;
                case 2 :createUser("enseignant");
                    break;
                case 3 :consulterStudent();

                    break;
                case 4 : System.out.println(enseignants);
                    break;
                case 5:ajouterCollege();
                    break;
                case 6:ajouterDepartement();
                    break;
                case 7:ajouterMatier();
                    break;
                case 8:ajouterole();
                    break;
                case 9:ajouteNote();
                    break;
                case 10:delete();
                    break;
                case 11:edit();
                    break;
                case 12 :this.login();
                    break;

            }

        }
    }
}
