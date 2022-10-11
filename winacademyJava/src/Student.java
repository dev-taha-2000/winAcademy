import javax.xml.crypto.Data;

public class Student{
    private int idStudent;
    private String date;
    private int College_id;
    private int group_id;

    /**public Student(int id, String fullName, String email, String password, long phone, int role_id, String date, int college_id, int group_id) {
        super(id, fullName, email, password, phone, role_id);
        this.date = date;
        College_id = college_id;
        this.group_id = group_id;
    }**/

    Student(int idStudent,int matire_id ,int college_id,String date,int group_id,int id_users){
        this.date = date;
        this.College_id = College_id;
        this.group_id = group_id;
        this.idStudent =idStudent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCollege_id() {
        return College_id;
    }

    public void setCollege_id(int college_id) {
        College_id = college_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    @Override
    public String toString() {
        super.toString();
        return " " +
                "date='" + date + '\'' +
                ", College_id=" + College_id +
                ", group_id=" + group_id +
                '}';
    }
}

