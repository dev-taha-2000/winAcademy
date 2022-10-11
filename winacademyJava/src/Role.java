public class Role {
    private int id;
    private String role;
    public Role(int id , String role){
        this.role = role;
        this.id = id;
    }

    public int getId(){

        return id;
    }
    public String getRole(){

        return role;
    }
    public String toString(){
        return " "+id+"/ "+role+" ";
    }
}
