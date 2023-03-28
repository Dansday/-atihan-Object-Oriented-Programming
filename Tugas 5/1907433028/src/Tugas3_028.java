public class Tugas3_028 {
    public void tampilan(){
        System.out.println("I Love 028");
    }
    
    public void tampilan(int i){
        System.out.println("Metode dengan 1 parameter = "+i);
    }
    
    public void tampilan(int i, int j){
        System.out.println("Metode dengan 2 parameter = "+i+"&"+j);
    }
    
    public void tampilan(String str){
        System.out.println(str);
    }
    
    public static void main(String[] args){
        Tugas3_028 ob = new Tugas3_028();
        ob.tampilan();
        ob.tampilan(8);
        ob.tampilan(6,7);
        ob.tampilan("Hello 028");
    }
}
