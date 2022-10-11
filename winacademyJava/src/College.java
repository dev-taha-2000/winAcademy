public class College {
    int idCollege;
    String name ;
    int nemuro;
    String city;
    public College(int idCollege,String name,int nemuro,String city){
        this.idCollege=idCollege;
        this.nemuro=nemuro;
        this.city=city;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getIdCollege(){
        return idCollege;
    }
    public int getNemuro(){
        return nemuro;
    }
    public String getNiveau(){
        return city;
    }
    public String toString(){
        return   "  "+idCollege+"/ "+"name:"+name+" "+"city:"+city+" ";
    }
}
