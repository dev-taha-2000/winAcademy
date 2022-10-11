public class Note {
    private int idNote;
    private int etudiant_id;
    private int matiere_id;
    private float note;
    public Note(int idNote,int etudiant_id , int matiere_id,float note){
        this.idNote=idNote;
        this.note=note;
        this.etudiant_id=etudiant_id;
        this.matiere_id=matiere_id;
    }

    public int getMatiere_id(){

        return matiere_id;
    }
    public int getIdNote(){
        return idNote;
    }
    public float getNote() {
        return note;

    }
    public int getEtudiant_id(){

        return etudiant_id;
    }

    public String toString(){

        return "matier_id:"+matiere_id+" "+"la note:"+note+" "+"etudiant_id:"+etudiant_id;
    }
}
