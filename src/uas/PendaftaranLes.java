import java.util.Scanner; // 12. IO Sederhana
import java.util.InputMismatchException; // 14. Error Handling

// 1. Class Induk
class LesPrivate {
    // 3. Atribut (private -> 7. Encapsulation)
    private String nama;
    private int umur;
    private String jenisLes;

    // 4. Constructor
    public LesPrivate(String nama, int umur, String jenisLes) {
        this.nama = nama;
        this.umur = umur;
        this.jenisLes = jenisLes;
    }

    // 5. Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenisLes(String jenisLes) {
        this.jenisLes = jenisLes;
    }

    // 6. Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenisLes() {
        return jenisLes;
    }

    // 9. Polymorphism (Method Overriding)
    public void tampilkanInfo() {
        System.out.println("== Data Pendaftaran ==");
        System.out.println("Nama       : " + getNama());
        System.out.println("Umur       : " + getUmur());
        System.out.println("Jenis Les  : " + getJenisLes());
    }
}

// 8. Inheritance
class LesOnline extends LesPrivate {
    public LesOnline(String nama, int umur, String jenisLes) {
        super(nama, umur, jenisLes);
    }

    // 9. Polymorphism (Override)
    @Override
    public void tampilkanInfo() {
        System.out.println("\n== Data Pendaftaran Les Online ==");
        System.out.println("Nama       : " + getNama());
        System.out.println("Umur       : " + getUmur());
        System.out.println("Jenis Les  : " + getJenisLes());
        System.out.println("Mode       : Online");
    }
}

public class PendaftaranLes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 12. IO Sederhana

        // 13. Array
        LesPrivate[] daftar = new LesPrivate[100];
        int jumlahPendaftar = 0;

        // 11. Perulangan
        while (true) {
            try {
                System.out.println("\n=== Aplikasi Pendaftaran Les Privat ===");
                System.out.print("Masukkan Nama: ");
                String nama = input.nextLine();

                System.out.print("Masukkan Umur: ");
                int umur = input.nextInt();
                input.nextLine(); // clear buffer

                // 10. Seleksi
                System.out.println("Pilih Jenis Les:");
                System.out.println("1. Matematika");
                System.out.println("2. Bahasa Inggris");
                System.out.println("3. Fisika");
                System.out.println("4. Kimia");
                System.out.println("5. Komputer");
                System.out.print("Masukkan pilihan (1-5): ");
                int pilihan = input.nextInt();
                input.nextLine(); // clear buffer

                String[] jenisLes = {"Matematika", "Bahasa Inggris", "Fisika", "Kimia", "Komputer"};

                if (pilihan < 1 || pilihan > 5) {
                    System.out.println("Pilihan tidak valid. Ulangi.");
                    continue;
                }

                // 2. Object (dibuat dan diisi dengan setter -> 7. Encapsulation)
                LesPrivate pendaftar = new LesOnline("", 0, "");
                pendaftar.setNama(nama);                      
                pendaftar.setUmur(umur);                      
                pendaftar.setJenisLes(jenisLes[pilihan - 1]);

                // Simpan ke array
                daftar[jumlahPendaftar] = pendaftar;
                jumlahPendaftar++;

                // Tampilkan hasil
                pendaftar.tampilkanInfo();

                // 11. Perulangan
                System.out.print("Tambah pendaftar lain? (y/n): ");
                String lanjut = input.nextLine();
                if (!lanjut.equalsIgnoreCase("y")) {
                    break;
                }

            } catch (InputMismatchException e) { // 14. Error Handling
                System.out.println("Terjadi kesalahan input. Ulangi.");
                input.nextLine(); // clear buffer
            }
        }

        // ✅ Tambahan: Menampilkan seluruh peserta yang telah mendaftar
        System.out.println("\n===============================");
        System.out.println("   DAFTAR SEMUA PESERTA LES    ");
        System.out.println("===============================");
        for (int i = 0; i < jumlahPendaftar; i++) {
            System.out.println((i + 1) + ". " + daftar[i].getNama() + " - " + daftar[i].getJenisLes());
        }

        System.out.println("\nTotal Pendaftar: " + jumlahPendaftar);
        input.close();
    }
}
