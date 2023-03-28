import java.util.Scanner;
public class Tugas2 
{
    public static void main(String[] args)
    {
        int n;
        String mutu;
        Scanner nilai = new Scanner(System.in);
        System.out.println("===== Aplikasi Penghitung Nilai Mahasiswa=====");
        System.out.print("Masukkan Nilai Siswa = ");
         try
             
        { 
            n = nilai.nextInt();
            
            if (n >=81 && n <=100){
                mutu = "A";
            }
            else if (n >=76 && n <=80){
                mutu = "A-";
            }
            else if (n >=72 && n <=75){
                mutu = "B+";
            }
            else if (n >=68 && n <=71){
                mutu = "B";
            }
             else if (n >=64 && n <=67){
                mutu = "B-";
            }
             else if (n >=60 && n <=63){
                mutu = "C+";
            }
            else if (n >=56 && n <=59){
                mutu = "C";
            }
            else if (n >=41 && n <=55){
                mutu = "D";
            }
            else if (n<0||n>100) {
                mutu = "Inputan nilai salah";
            }
            else {
                mutu = "E";
            }
            System.out.println("Mutu Nilai = "+(mutu)+"");
        }
         
            catch (Exception e) {
         System.out.println("Inputan harus nilai");
            }

     }
}