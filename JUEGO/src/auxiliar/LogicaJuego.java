/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.Random;

/**
 *
 * @author Dark
 */
public class LogicaJuego {
    
    public int[] getCardNumbers() {
        
        int[] numbers = new int[8];
        int count = 0;
        
        while(count < 8) {
            Random r = new Random();
            int na = r.nextInt(4) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 8; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin
            
        }
        
        
        return numbers;
    }
            
}
