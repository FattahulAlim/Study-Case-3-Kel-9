public class Absensi {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int hadir;
    int sakit;
    int izin;
    int alpa;
    double persentase;

    public Absensi(Mahasiswa mahasiswa, MataKuliah mataKuliah, int hadir, int sakit, int izin, int alpa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.hadir = hadir;
        this.sakit = sakit;
        this.izin = izin;
        this.alpa = alpa;
        this.persentase = HitungPersentaseKehadiran();
    }

    double HitungPersentaseKehadiran() {
        double total = hadir + sakit + izin + alpa;
        persentase = (hadir / total) * 100;
        return persentase;
    }

    void tampilDataAbsensi(){
        System.out.println("NIM:    " + mahasiswa.nim + " |   Nama:   " + mahasiswa.namaMahasiswa);
        System.out.println("Matakuliah:    " + mataKuliah.namaMK);
        System.out.println("Hadir:    " + hadir + " |   Sakit:   " + sakit + " |   Izin:    " + izin + " |   Alpa:  " + alpa);
        System.out.println("Persentase Kehadiran:   " + HitungPersentaseKehadiran());
        System.out.println();
    }

    static void urutkanData(Absensi[] absn){
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
        for(int i = 0; i < absn.length; i++){
            System.out.println(absn[i].persentase + " - " + absn[i].mahasiswa.namaMahasiswa + " - " + absn[i].mataKuliah.namaMK);
        }
    }

    static void cariData(Absensi[] absn, String cari){
        boolean ketemu = false;
        for(int i = 0; i < absn.length; i++){
            if (absn[i].mahasiswa.nim.equals(cari)) {
                if (ketemu) {
                    System.out.println("Mata Kuliah: " + absn[i].mataKuliah.namaMK);
                    System.out.println("Hadir: " + absn[i].hadir + " | Sakit: " + absn[i].sakit + " | Izin: " + absn[i].izin + " | Alpa: " + absn[i].alpa);
                    System.out.println("Persentase Kehadiran: " + absn[i].persentase);
                } else {
                    System.out.println("NIM:    " + absn[i].mahasiswa.nim + " |   Nama:   " + absn[i].mahasiswa.namaMahasiswa);
                    System.out.println("Mata Kuliah: " + absn[i].mataKuliah.namaMK);
                    System.out.println("Hadir: " + absn[i].hadir + " | Sakit: " + absn[i].sakit + " | Izin: " + absn[i].izin + " | Alpa: " + absn[i].alpa);
                    System.out.println("Persentase Kehadiran: " + absn[i].persentase);
                    System.out.println();
                    ketemu = true;
                }
            }
        } if (!ketemu) {
        System.out.println("Data absensi untuk NIM '" + cari + "' tidak ditemukan.");
        }
    }
}
