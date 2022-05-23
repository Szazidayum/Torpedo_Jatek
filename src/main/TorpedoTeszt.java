package main;

public class TorpedoTeszt {
    public static void main(String[] args) {
        System.out.println("Teszt");
        new TorpedoTeszt().tesztLoves(4);        
    //assert 1==2 : "nem jó a találat ellenőrzése";
    }
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo(new int[] {2,3,4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        
        return "";
    }
}
