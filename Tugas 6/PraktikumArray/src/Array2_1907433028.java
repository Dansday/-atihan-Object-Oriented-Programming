public class Array2_1907433028 {
    private String[][] Mahasiswa;
    private int[][] data, hasil;
    
    public void setmahasiswa(String [][] MHS){
        this.Mahasiswa = MHS;
        MHS = null;
    }
    
    public String[][] getMahasiswa(){
        return Mahasiswa;
    }
    
    public void setData(int [][] DATA){
        this.data = DATA;
        DATA = null;
    }
    
    public int[][] getData(){
        return data;
    }
    
    public void setPerkalianSkala(int[][] data, int a){
        hasil = data;
        int i,j;
        for (i=0;i<data.length;i++){
            for (j=0;j<data[i].length;j++){
                hasil[i][j] = a*data[i][j];
            }
        }
        data = null;
    }
    
    public int[][] getPerkalianSkala(){
        return hasil;
    }
    
    public void tampil (String a){
        System.out.println(a);
        a = null;
    }
    
    public void tampil (String data [][]){
        int i, j;
        for (i=0; i<data.length; i++){
            for (j=0; j<data[i].length; j++){
                System.out.print(data[i][j]+"      ");
            }
            System.out.println();
        }
        data = null;
    }
    
    public void tampil (int data [][]){
        int i, j;
        for (i=0; i<data.length; i++){
            for (j=0; j<data[i].length; j++){
                System.out.print(data[i][j]+"   ");
            }
            System.out.println();
        }
        data = null;
    }
    
    public void hapus(){
        Mahasiswa = null;
        data = null;
        hasil = null;
    }
}