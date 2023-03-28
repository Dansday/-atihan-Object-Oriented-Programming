public class MainTugas_1907433028 {
    public static void main(String[] args){
        Tugas_1907433028 ob = new Tugas_1907433028();
        int bilangan[]= {-5,-3,-6,-3,-4};
      
        ob.tampil("Bilangannya: ");
        ob.setBilangan(bilangan);
        ob.tampil(ob.getBilangan());
        ob.tampil("Nilai Rata - Ratanya: ");
        ob.setRata(bilangan);
        ob.tampil(ob.getRata());
        ob.tampil("Nilai Maksimumnya: ");
        ob.setMax(bilangan);
        ob.tampil(ob.getMax());;
        ob.tampil("Nilai Minimumnya: ");
        ob.setMin(bilangan);
        ob.tampil(ob.getMin());;
        
        ob.hapus();
        bilangan = null;
        ob = null;
    }
}
