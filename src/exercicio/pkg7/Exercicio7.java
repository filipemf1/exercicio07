package exercicio.pkg7;
import java.util.Random;
public class Exercicio7 {    
    public static void main(String[] args) {
        
        int a[] = new int [30];
        float mediaN = 0;
        float mediaP = 0;
        int ctP = 0;
        int contN = 0;
        
        Random random = new Random();
        
        for (int i=0; i<a.length; i++){
        
            a[i] = random.nextInt(40)-20;
            System.out.println("v:"+i+"="+a[i]);
            
            if(a[i]<0){
            mediaN+=a[i];
            contN++;
            }else{
                
            mediaP+=a[i];
            ctP++;
                 }
            
        }
        mediaN = mediaN/contN;
        mediaP = mediaP/ctP;
        System.out.println("");
        System.out.println(mediaP);
        System.out.println(mediaN);
    }
    
}
