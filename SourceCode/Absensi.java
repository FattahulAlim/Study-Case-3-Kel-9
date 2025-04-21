public class Absensi {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int hadir;
    int sakit;
    int izin;
    int alpa;
    double persentase;

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

    void urutkanData(Absensi[] absn){
        System.out.println("=== DATA ABSENSI BERDASARKAN PERSENTASE KEHADIRAN");
        System.out.println();
        for(int i = 0; i < absn.length-1; i++){
            for(int j = 1; j < absn.length-i; j++){
                if (absn[j].persentase > absn[j-1].persentase) {
                    Absensi tmp = absn[j];
                    absn[j] = absn[j-1];
                    absn[j-1] = tmp;
                }
            }
        }
        for(int i = 0; i < absn.length-1; i++){
            System.out.println(absn[i].persentase + " - " + absn[i].mahasiswa.namaMahasiswa + " - " + absn[i].mataKuliah.namaMK);
        }
    }

    void cariData(Absensi[] absn, String cari){
        System.out.println("=== HASIL PENCARIAN ABSENSI MAHASISWA ===");
        System.out.println();
        for(int i = 0; i < absn.length-1; i++){
            if (mahasiswa.nim.equals(cari)) {
                System.out.println(absn[i]);
            } else {
                System.out.println("Data absensi untuk NIM " + cari + " tidak dapat ditemukan.");
            }
        }
    }
}
