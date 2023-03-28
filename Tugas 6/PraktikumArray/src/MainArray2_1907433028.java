public class MainArray2_1907433028 {
    public static void main(String[] args){
        Array2_1907433028 ob = new Array2_1907433028();
        String[][] Mhs = {
            {"NIM", "NAMA"},
            {"100001", "TINA"},
            {"100002", "TUTI"},
            {"100003", "TONO"},
            {"100004", "BOKIR"}
        };
        ob.tampil("DATA MAHASISWA");
        ob.setmahasiswa(Mhs);
        ob.tampil(ob.getMahasiswa());
        ob.tampil("==================");
        int[][] data = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int panggil = 2;
        ob.tampil("Data Matriks: ");
        ob.setData(data);
        ob.tampil(ob.getData());
        ob.tampil("Data Matriks X"+panggil+" : ");
        ob.setPerkalianSkala(data, panggil);
        ob.tampil(ob.getPerkalianSkala());
        
        ob.hapus();
        Mhs = null;
        data = null;
        ob = null;
    }
}
