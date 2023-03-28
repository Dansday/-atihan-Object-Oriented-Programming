import java.util.Scanner;
public class Tugas3 {
    
   public static void main(String[] args) {
       
       int a , b , c;

       Scanner angka = new Scanner(System.in);
       System.out.print("Masukan sebuah angka = ");
       a = angka.nextInt();
       
        for (b = 1; b <= a; b++){
            for ( c = b; c<= a; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}