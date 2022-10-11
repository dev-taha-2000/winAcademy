
public class Enseignant extends User{
    private int departement_id;
    private int matiere_id;

    /**public Enseignant(int id, String fullName, String email, String password, long phone, int role_id, int departement_id, int matiere_id) {
        super(id, fullName, email, password, phone, role_id);
        this.departement_id = departement_id;
        this.matiere_id = matiere_id;
    }**/

    public Enseignant(int departement_id,int matiere_id){
        this.departement_id= departement_id;
        this.matiere_id=matiere_id;
    }
    public int getDepartement_id(){
        return departement_id;
    }
    public int getMatiere_id(){
        return matiere_id;
    }
    public String toString(){
       this.toString();
        return departement_id+" "+matiere_id;
    }
}
