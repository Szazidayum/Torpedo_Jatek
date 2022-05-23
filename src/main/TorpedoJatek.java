package main;

import java.util.Scanner;

public class TorpedoJatek {

    static String t;
    static String loves;
    static int poz;
    static int ennyiszer=0;
    
    public static void main(String[] args) {
        System.out.println("Torpedó játék");
            new TorpedoJatek().jatekosLo();
            new TorpedoJatek().jatekLoves(poz);
            System.out.println("Ennyiszer lőtt eddig a játékos: "+ennyiszer);
        
        
        
//        new TorpedoTeszt().tesztLoves(4);

    }
    public String jatekLoves(int poz){
        int hely = (int)(Math.random()*5);
        int elso = hely;
        int masodik = hely+1;
        int harmadik = hely+2;
//        System.out.println(elso+" "+masodik+" "+harmadik);
        Hajo hajo = new Hajo(new int[] {elso,masodik,harmadik});
        t = hajo.talalat(poz);
        if(t.equals("talált")){
            System.out.println("Eltalálta!");
        }else{
            System.out.println("Mellé!");
        }
            
        return "";
    }
    public int jatekosLo(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Lövés helye: ");
            poz = sc.nextInt(); 
            ennyiszer++;
        return poz;
    }
    
    
}
