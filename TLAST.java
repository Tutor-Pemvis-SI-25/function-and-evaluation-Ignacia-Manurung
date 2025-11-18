//Ignacia Putri Manurung - 12S25034

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] at = new String[10];
        int n;

        n = 0;
        System.out.println(daftartugas(n));
    }
    
    public static int p(int p) {
        tk = input.nextLine();
        hhd = input.nextLine();
        p = tk * 1.0 / hhd;
        if (p > 3) {
            System.out.println("Penting! Anda harus mengerjakan tugas ini segera");
        } else {
            if (p > 1.5 && p < 3) {
                System.out.println("Tugas ini memiliki prioritas menengah");
            } else {
                if (p < 1.5) {
                    System.out.println("Tugas ini relatif ringan, namun jangan tunda terlalu lama");
                } else {
                    System.out.println("Tugas ini relatif ringan, namun jangan tunda terlalu lama");
                }
            }
        }
        
        return p;
    }
    
    public static int showassignment(int n) {
        String[] namatgs = new String[10];
        String[] nim = new String[10];
        String[] matkul = new String[10];
        String[] dospem = new String[10];
        String[] tglbulantahun = new String[10];
        String[] waktu = new String[10];
        String[] nama = new String[10];
        int i;

        i = 0;
        n = Integer.parseInt(input.nextLine());
        for (i = 0; i <= n - 1; i++) {
            nama[i] = input.nextLine();
            namatgs[i] = input.nextLine();
            nim[i] = input.nextLine();
            matkul[i] = input.nextLine();
            dospem[i] = input.nextLine();
            tglbulantahun[i] = input.nextLine();
            waktu[i] = input.nextLine();
        }
        for (i = 0; i <= n - 1; i++) {
            System.out.println("" + nim[i] + "_" + nama[i] + "_" + namatgs[i]);
        }
        
        return n;
    }
    
    public static int updatetaskstatus(int n) {
        kodematkul = input.nextLine();
        
        return n;
    }
}
