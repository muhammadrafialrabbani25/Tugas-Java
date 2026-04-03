    package JavaProblems;

    public class Student{
        private String nama;
        private int ID;

        //constructor
        Student (int ID, String nama){
            this.nama = nama;
            this.ID = ID;
        }

        //setter
        public void setNama (String nama){
            this.nama = nama;
        }

        public void setID (int ID){
            this.ID = ID;
        }

        //getter
        public String getNama(){
            return nama;
        }

        public int getID(){
            return ID;
        }

        @Override
        public String toString(){
            return "id=" + ID + ", name=" + nama;
        }
    }