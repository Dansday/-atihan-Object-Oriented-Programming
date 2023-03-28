package Tugas1;

public class mainConstructMotor_1907433028 {
    public static void main(String[] args){
        String pemilik = "Akbar Yudhanto";
        String merk = "Yamaha";
        String warna = "Hitam";
        
        constructor_1907433028.setPemilik(pemilik);
        System.out.println("Pemilik Kendaraan : "+constructor_1907433028.getPemilik());
        System.out.println("==============================");
        
        constructor_1907433028 ob = new constructor_1907433028(merk);
        ob.tampil("Merk Kendaraan = "+ob.getMerk());
        ob.tampil("Pemilik Kendaraan = "+ob.getPemilik());
        System.out.println("==============================");
        
        constructor_1907433028 ob2 = new constructor_1907433028();
        ob2.tampil("Merk Kendaraan (Instan Vsriable) = "+ob2.getMerk());
        ob2.tampil("Pemilik Kendaraan (Instan Vsriable) = "+ob2.getPemilik());
        System.out.println("==============================");
        
        constructMotor_1907433028 ob3 = new constructMotor_1907433028(merk, warna);
        ob3.tampil("Merk Motor = "+ob3.getMerk());
        ob3.tampil("Warna Motor = "+ob3.getWarna());
        ob3.tampil("Pemilik Motor = "+ob3.getPemilik());
        
        pemilik = null;
        merk = null;
        warna = null;
        ob.hapus();
        ob = null;
        ob2 = null;
        ob3 = null;
    }
}
