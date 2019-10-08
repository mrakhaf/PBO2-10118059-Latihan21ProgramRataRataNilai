/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan21programrataratanilai;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahNilai = 0;
        //Buat Scanner Baru
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int banyakMhs = input.nextInt();
        
        //deklarasi array
        int[] nilaiMhs = new int[banyakMhs];
        
        for(int i = 1; i <= banyakMhs; i++){
            System.out.print("Nilai Mahasiswa ke-" + i +" : ");
            nilaiMhs[i-1] = input.nextInt();
            jumlahNilai = (int) (jumlahNilai + nilaiMhs[i-1]);
        }
        
        double rataNilai = jumlahNilai/banyakMhs;
        System.out.println();
        System.out.println("Maka Rata - rata Nilainya adalah " + rataNilai);
        System.out.println("(Developed by mrakhaf)");
    }
    
}
