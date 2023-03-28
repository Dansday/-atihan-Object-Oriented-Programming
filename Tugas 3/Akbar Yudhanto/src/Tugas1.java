import java.util.Scanner;
public class Tugas1 
{
    public static void main(String[] args)
    {
        int nilai;
        Scanner harga = new Scanner(System.in);
        System.out.print("Masukkan Total Harga Belanja Anda = ");
        { 
            nilai = harga.nextInt();
            if(nilai >= 100000)
                System.out.println("Total Belanja Rp."+(nilai)+"\nSelamat!!!, Anda mendapatkan hadiah perlengkapan sekolah\n");
            else
                System.out.println("Total Belanja Rp."+(nilai)+"\nMohon maaf, Anda tidak mendapatkan hadiah perlengkapan sekolah\n");
        }
    }
}