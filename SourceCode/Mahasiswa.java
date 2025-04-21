public class Mahasiswa {
    String nim;
    String namaMahasiswa;

    public Mahasiswa(){

    }

    public Mahasiswa(String nim, String nm){
        this.nim = nim;
        namaMahasiswa = nm;
    }

    void tampilData(){
        System.out.println("NIM:    " + nim + " |   Nama:   " + namaMahasiswa);
    }
}