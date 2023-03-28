import javax.swing.JOptionPane;

public class mainMobil_1907433028 extends mobil_1907433028{
    public static void main(String[] args){
        mainMobil_1907433028 ob = new mainMobil_1907433028();
        String merk, warna, harga;
        
        merk = JOptionPane.showInputDialog("Merek Mobil : ");
        ob.setMerk(merk);
        ob.tampil("Merk Mobil : "+ob.getMerk());
        
        warna = JOptionPane.showInputDialog("Warna Mobil : ");
        ob.setWarna(warna);
        ob.tampil("Warna Mobil : "+ob.getWarna());
        
        harga = JOptionPane.showInputDialog("Harga Mobil : ");
        ob.setHarga(harga);
        ob.tampil("Harga Mobil : "+ob.getHarga());
        
        ob.hapus();
        merk = null;
        warna = null;
        harga = null;
        ob = null;
        
        System.exit(0);
    }
}
