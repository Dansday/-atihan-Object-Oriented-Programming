import java.util.Scanner;
public class Tugas1 {
    public static void main (String[] args){
        Scanner angka = new Scanner (System.in);
        int Panjang, Lebar;
        System.out.print("Masukan Panjang = ");
        Panjang = angka.nextInt();
        System.out.print("Masukan Lebar = ");
        Lebar = angka.nextInt();
        int Luas , Keliling ;
        Keliling = 2*Panjang + 2*Lebar;
        System.out.println("Keliling Persegi Panjang = "+Keliling);
        Luas = Panjang * Lebar;
        System.out.println("Luas Persegi Panjang = "+Luas);  
    }
}