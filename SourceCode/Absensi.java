public class Absensi {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int hadir;
    int sakit;
    int izin;
    int alpa;

    double HitungPersentaseKehadiran() {
        double persentase = (hadir / (hadir + sakit + izin + alpa)) * 100;
        return persentase;
    }

    void tampilDataAbsensi(){
        System.out.println("=== DATA ABSENSI MAHASISWA ===");
        System.out.println(mahasiswa);
        System.out.println(mataKuliah);
        System.out.println("Hadir:    " + hadir + " |   Sakit:   " + sakit + " |   Izin:    " + izin + " |   Alpa:  " + alpa);
        System.out.println("Persentase Kehadiran:   " + HitungPersentaseKehadiran());
    }

    void urutkanData(){
        for(int i = 0; i < 6; i++){
            for(int j = 1; j < 7-i; j++){
                if () {
                    
                }
            }
        }
    }

    void cariData(String cari){
        System.out.println("=== HASIL PENCARIAN ABSENSI MAHASISWA ===");
        System.out.println();
        
    }
}
