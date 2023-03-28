import java.util.Scanner;
public class Tugas2 {
   public static void main(String[] args){
       Scanner angka = new Scanner(System.in);
       int detik, sisajam, bagijam, jam, waktumenit, sisamenit, menit;
       System.out.print("Masukan Waktu Detik = ");
       detik = angka.nextInt();
       sisajam = detik % 3600;
       bagijam = detik-sisajam;
       jam = bagijam/3600;
       waktumenit = detik-(jam*3600);
       sisamenit = waktumenit % 60;
       menit = (waktumenit-sisamenit)/60;
       System.out.println(detik+" detik adalah "+jam+" jam "+menit+" menit dan "+sisamenit+" detik");
   }
}