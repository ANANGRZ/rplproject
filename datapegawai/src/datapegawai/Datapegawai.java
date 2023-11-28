package datapegawai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Datapegawai {
    public static void main(String[] args) {
        List<datapegawaibaru> daftarPegawai = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Tambah Data Pegawai Baru (y/n): ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            
            System.out.print("Umur: ");
            int umur = input.nextInt();
            input.nextLine();
            
            datapegawaibaru pegawai = new datapegawaibaru(nama, alamat, umur);
            daftarPegawai.add(pegawai);
        }
        System.out.println("Daftar Pegawai:");
        for (datapegawaibaru pegawai : daftarPegawai) {
            System.out.println(pegawai);
        }
        
    }
}
        