public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(){

    }

    public MataKuliah(String kd, String nm, int sks){
        kodeMK = kd;
        namaMK = nm;
        this.sks = sks;
    }

    void tampilData(){
        System.out.println("Kode MK:    " + kodeMK + "  |   Nama:   " + namaMK + "  |   SKS:    " + sks);
    }
}