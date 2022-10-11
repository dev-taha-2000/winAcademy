public class Departement {
    private int idDepartement;
    private String name;
    private String chefDepartement;
    private int college_id;

    public Departement(int idDepartement,String name,String chefDepartement,int college_id){
        this.idDepartement = idDepartement;
        this.name=name;
        this.chefDepartement=chefDepartement;
        this.college_id = college_id;
    }

    public String getName(){
        return name;
    }
    public int getIdDepartement(){
        return idDepartement;
    }
    public int getCollege_id(){
        return college_id;
    }
    public String getChefDepartement(){
        return  chefDepartement;
    }
    public String toString(){
        return " "+idDepartement+"/ "+name+" ";
    }
}
