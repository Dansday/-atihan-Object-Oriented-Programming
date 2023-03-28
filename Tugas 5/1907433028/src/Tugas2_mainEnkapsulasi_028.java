public class Tugas2_mainEnkapsulasi_028 {
    public static void main(String[] args){
        Tugas2_enkapsulasi_028 ob = new Tugas2_enkapsulasi_028();
        ob.setAlas(28);
        ob.setTinggi(19);
        System.out.println("Alas Segitiga : "+ob.getAlas());
        System.out.println("Tinggi Segitiga : "+ob.getTinggi());
        ob.setLuasSegitiga(ob.getAlas(), ob.getTinggi());
        System.out.println("Luas Segitiga : "+ob.getLuasSegitiga());
    }
}
