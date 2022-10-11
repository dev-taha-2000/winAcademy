import java.util.Iterator;

class Authetification extends Main{
    private String email;
    private String password;

    public Authetification(String email, String password) {
        this.email = email;
        this.password = password;
        AdminService users = new AdminService();
        users.user.stream().forEach(System.out::println);
        users.roles.stream().forEach(System.out::println);
        if("taha@gmail.com".equals(this.email) && "taha2000".equals(this.password)){
            System.out.println("hello  Taha");
            AdminService admin = new AdminService();
            admin.menu();
        }else if(1==1){
            Iterator<User> it = users.user.iterator();
            while(it.hasNext()){
                User u = it.next();
                if(email.equals(u) && password.equals(u)){
                    System.out.println("yes afcors");
                    break;
                }else {
                    System.out.println("dont try");
                }
            }
        }else {
            System.out.println("chaaaaaaaakhda");
        }
    }

}

