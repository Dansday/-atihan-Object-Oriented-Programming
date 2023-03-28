public class MainArray1_1907433028 {
    public static void main(String[] args){
        Array1_1907433028 ob = new Array1_1907433028();
        String mahasiswa[]= {"Andi","Tono","Tina","Tuti","Bokir"};
        int deret[]= {2, 5, 6, 9, 7};
        
        ob.setMhs(mahasiswa);
        ob.tampil(ob.getMhs());
        ob.tampil("=============================");
        ob.tampil("Deret: ");
        ob.setDeret(deret);
        ob.tampil(ob.getDeret());
        ob.tampil("Hasil Penjumlahan Deret: ");
        ob.setPenjumlahan(deret);
        ob.tampil(ob.getPenjumlahan());
        
        ob.hapus();
        mahasiswa = null;
        deret = null;
        ob = null;
    }
}
