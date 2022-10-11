import java.util.ArrayList;
public class User{
    private int id;
    private String fullName;
    private String email;
    private String password; 
    private long tel;
    private  int role_id;

     public User( int id, String fullName ,String email,String password,long phone,int role_id){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.tel =phone;
        this.password = password;
        this.role_id = role_id;
     }

    public User() {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role_id = role_id;
    }


    public void finalcreatEtudiant(String firstName,String lastname,String email,String password,long phone){}

    public String toString(){
        return id+"/"+" "+"fullName:"+fullName+" "+"password:"+
                password+" "+"email:"+email+" "+"tel:"+tel+" "+"role_id:"+role_id;
    }
    public int getId(){
        return id;
    }
   public String getFullName(){
         return fullName;
   }
}

