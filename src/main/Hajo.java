package main;

public class Hajo {
    private int[] pozicio;
    
    public String talalat(int poz){
        //eldöntés
        int i = 0;
        while(i<3 && !(pozicio[i]==poz)){
            i++;
        }
        
        return i < 3 ? "talált" : "mellé";
    }

    public Hajo(int[] pozicio) {
        this.pozicio=pozicio;
    }
    
}
