package ujiantengahsemester;

/**
 *
 * @author ariputraaa - 2201010182
 * TGL 2024-05-07
 */
public class UjianTengahSemester {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        dtMusik DM = new dtMusik(5);
        if (DM.login()) {
            String ul = "ulang";
            do {
                System.out.println("Album Musik");
                System.out.println("~~~~~~~~~~~~~~~~~~~~");
                System.out.println("A. Lihat Lagu");
                System.out.println("B. Tambah Lagu ");
                System.out.println("C. Ubah Lagu");
                System.out.println("D. Hapus Lagu");
                System.out.println("E. Cari Lagu");
                System.out.println("X. Selesai");
                System.out.print("Pilih A/B/C/D/E/X: ");
                String mPIL = DM.dtIN.nextLine();

                switch (mPIL.toUpperCase()) {
                    case "A":
                        DM.viewMusik();
                        break;
                    case "B":
                        DM.DataMusik();
                        break;
                    case "C":
                        DM.UpdateMusik();
                        break;
                    case "D":
                        DM.DestroyMusik();
                        break;
                    case "E":
                        DM.searchMusik();
                        break;
                    case "X":
                        ul = "selesai";
                        break;
                    default:
                        System.out.println("Pilihan Tidak tersedia");
                        break;
                }
            } while (ul.equals("ulang"));
        }
    }
}