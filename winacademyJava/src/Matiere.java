public class Matiere {
    private int id;
    private String name;

    /**public Matiere(int id, String fullName, String email, String password, long phone, int role_id, int id1, String name) {
        super(id, fullName, email, password, phone, role_id);
        this.id = id1;
        this.name = name;
    }**/

    public Matiere(int id , String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        super.toString();
        return " "+id+"/"+name+" ";
    }
}
