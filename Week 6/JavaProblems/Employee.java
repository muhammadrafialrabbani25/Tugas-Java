package JavaProblems;

public class Employee {
    private String nama;
    private int gaji;

    //Constructor
    Employee (String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    
    //setter
    public void setNama (String nama){
        this.nama = nama;
    }

    public void setGaji(int gaji){
        this.gaji = gaji;
    }

    //getter

    public String getNama(){
        return nama;
    }

    public int getGaji(){
        return gaji;
    }

    @Override
    public String toString(){
        return "name=" + getNama() + " salary=" + getGaji();
    }
}
