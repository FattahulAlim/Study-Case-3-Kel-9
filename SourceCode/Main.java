import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Ali Rahman"),
            // new Mahasiswa("22001", "Ali Rahman"),
            new Mahasiswa("22002", "Budi Santoso"),
            // new Mahasiswa("22003", "Citra Dewi"),
            new Mahasiswa("22003", "Citra Dewi"),
            new Mahasiswa("22004", "Deni Saputra"),
            new Mahasiswa("22005", "Eka Wulandari")
        };

        MataKuliah[] mk = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            // new MataKuliah("MK001", "Struktur Data", 3),
            // new MataKuliah("MK002", "Basis Data", 3),
            // new MataKuliah("MK003", "Desain Web", 2),
            new MataKuliah("MK003", "Desain Web", 2),
            // new MataKuliah("MK001", "Struktur Data", 3)
        };

        Absensi[] absn = {
            new Absensi(mhs[0], mk[0], 10, 1, 1, 0),
            new Absensi(mhs[0], mk[1], 12, 0, 1, 1),
            new Absensi(mhs[1], mk[0], 14, 0, 0, 0),
            new Absensi(mhs[2], mk[1], 9, 2, 1, 2),
            new Absensi(mhs[2], mk[2], 10, 0, 0, 2),
            new Absensi(mhs[3], mk[2], 13, 0, 0, 0),
            new Absensi(mhs[4], mk[0], 11, 1, 1, 1)
        };

        int pilihan = 0;

        do {
            System.out.println("\n=== MENU SIAKAD NILAI ===");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data Absensi");
            System.out.println("4. Urutkan Data Absensi Berdasarkan Persentase Kehadiran");
            System.out.println("5. Cari Data Absensi Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("=== DATA MAHASISWA ===");
                    for (Mahasiswa mahasiswa : mhs) {
                        mahasiswa.tampilData();
                    }
                    break;
                case 2:
                    System.out.println("=== DATA MATA KULIAH ===");
                    for (MataKuliah mataKuliah : mk) {
                        mataKuliah.tampilData();
                    }
                    break;
                case 3:
                    System.out.println("=== DATA ABSEN MAHASISWA ===");
                    for (Absensi absensi : absn) {
                        absensi.tampilDataAbsensi();
                    }
                    break;
                case 4:
                    System.out.println("=== DATA ABSENSI BERDASARKAN PERSENTASE KEHADIRAN === ");
                    Absensi.urutkanData(absn);
                    break;
                case 5:
                    System.out.println("=== HASIL PENCARIAN ABSENSI MAHASISWA ===");
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String cari = sc.nextLine();
                    Absensi.cariData(absn, cari);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
