
package randomnumbermathusenotuse;

import java.util.Random;


public class RandomNumberMAthusenotuse {

    
    public static void main(String[] args) {
        Random rand = new Random();
        //int randomNumber = rand.nextInt(10) + 1;
        int randomNumber = (int)(Math.random()*(10) +1);
        
        System.out.println("randomNumber = "+randomNumber);
    }
    
}
