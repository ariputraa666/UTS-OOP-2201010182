package ujiantengahsemester;
import java.util.Scanner;

/**
 *
 * @author ariputraaa-2201010182
 * TGL 2024-05-07
 */
class dtMusik {
    public int jRecord;
    public int aRec;
    public final String[][] dtMusik;
    final Scanner dtIN;

    public dtMusik() {
        this(10); 
    }

    public dtMusik(int nval) {
        this.jRecord = nval;
        this.aRec = 0;
        this.dtMusik = new String[jRecord][4];
        this.dtIN = new Scanner(System.in);
    }

    // DataMusik
    public void DataMusik() {
        if (aRec >= jRecord) {
            System.out.println("Album Musik sudah penuh\n");
            return;
        }
        System.out.println("Tambah Lagu dalam Album Musik");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Judul Lagu: ");
        dtMusik[aRec][0] = dtIN.nextLine();

        System.out.print("Nama Musisi: ");
        dtMusik[aRec][1] = dtIN.nextLine();

        System.out.print("Genre Lagu: ");
        dtMusik[aRec][2] = dtIN.nextLine();

        System.out.print("Tahun Rilis: ");
        dtMusik[aRec][3] = dtIN.nextLine();

        aRec++;
    }

    public void DataMusik(String judul, String musisi, String genre, String tahun) {
        if (aRec >= jRecord) {
            System.out.println("Album Musik sudah penuh\n");
            return;
        }
        dtMusik[aRec][0] = judul;
        dtMusik[aRec][1] = musisi;
        dtMusik[aRec][2] = genre;
        dtMusik[aRec][3] = tahun;

        aRec++;
    }

    // UpdateMusik: Memperbaharui/ mengedit Data musik
    public void UpdateMusik() {
        System.out.println("Ubah Data Musik");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.print("Nomor Record: ");

        int idx = Integer.parseInt(dtIN.nextLine());
        if (idx < 0 || idx >= aRec) {
            System.out.println("Nomor record tidak valid.");
            return;
        }

        System.out.println("Data Musik Lama");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Judul Lagu: " + dtMusik[idx][0]);
        System.out.print("Diubah menjadi: ");
        dtMusik[idx][0] = dtIN.nextLine();

        System.out.println("Nama Musisi: " + dtMusik[idx][1]);
        System.out.print("Diubah menjadi: ");
        dtMusik[idx][1] = dtIN.nextLine();

        System.out.println("Genre Lagu: " + dtMusik[idx][2]);
        System.out.print("Diubah menjadi: ");
        dtMusik[idx][2] = dtIN.nextLine();

        System.out.println("Tahun Rilis: " + dtMusik[idx][3]);
        System.out.print("Diubah menjadi: ");
        dtMusik[idx][3] = dtIN.nextLine();

        System.out.println("Data Musik Record ke: " + idx + " telah diubah");
    }

    // DestroyMusik: Menghapus data musik 
    public void DestroyMusik() {
        System.out.println("Hapus Data Musik");
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.print("Nomor Record: ");

        int idx = Integer.parseInt(dtIN.nextLine());
        if (idx < 0 || idx >= aRec) {
            System.out.println("Nomor record tidak valid.");
            return;
        }

        System.out.println("Data Musik yang dihapus");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Judul Lagu: " + dtMusik[idx][0]);
        System.out.println("Nama Musisi: " + dtMusik[idx][1]);
        System.out.println("Genre Lagu: " + dtMusik[idx][2]);
        System.out.println("Tahun Rilis: " + dtMusik[idx][3]);

        for (int i = idx; i < aRec - 1; i++) {
            dtMusik[i] = dtMusik[i + 1];
        }
        dtMusik[aRec - 1] = new String[4];
        aRec--;
    }

    // ViewData: Menampilkan data musik yang sudah direcord
    public void viewMusik() {
        System.out.println("Data Album Musik (" + aRec + "/" + jRecord + ")");
        System.out.println("~~~~~~~~~~~~~~~~");

        for (int i = 0; i < aRec; i++) {
            System.out.println("Data Record ke " + i);
            System.out.println("Judul Lagu: " + dtMusik[i][0]);
            System.out.println("Nama Musisi: " + dtMusik[i][1]);
            System.out.println("Genre Lagu: " + dtMusik[i][2]);
            System.out.println("Tahun Rilis: " + dtMusik[i][3]);
        }
        System.out.println("");
    }

    // Login 
    public boolean login() {
        System.out.print("Username: ");
        String username = dtIN.nextLine();
        System.out.print("Password: ");
        String password = dtIN.nextLine();

        // Simple username and password check
        if (username.equals("admin@gmail.com") && password.equals("12345")) {
            System.out.println("Login berhasil!!");
            return true;
        } else {
            System.out.println("Email dan Password anda salah!");
            return false;
        }
    }

    // Mencari Data Musik Sesuai dengan Nomor record
    public void searchMusik() {
        System.out.print("Masukan Nomor Record yang ingin dicari: ");
        int idx = Integer.parseInt(dtIN.nextLine());
        if (idx < 0 || idx >= aRec) {
            System.out.println("Nomor Record tidak tersedia!");
            return;
        }

        System.out.println("Data Record ke " + idx);
        System.out.println("Judul Lagu: " + dtMusik[idx][0]);
        System.out.println("Nama Musisi: " + dtMusik[idx][1]);
        System.out.println("Genre Lagu: " + dtMusik[idx][2]);
        System.out.println("Tahun Rilis: " + dtMusik[idx][3]);
    }}
    
    
   
