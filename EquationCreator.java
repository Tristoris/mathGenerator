import java.util.*;

/**
 * Creates math equations
 *
 * @Alexander Yurkov
 * @1.0
 */
public class EquationCreator
{
    // instance variables - replace the example below with your own
    private String[] equationList;

    public EquationCreator (int linearAmount, int quadraticAmount, int cubicAmount, int difficulty) {
        int amount = linearAmount + quadraticAmount;
        equationList = new String[amount];
        for (int i = 0; i < equationList.length; i++) {
            
        }
    }
    
    private String createLinear (int difficulty, double smallest, double biggest) {
        String eq = "";
        
        switch (difficulty) {
            case 1:
                int answer = randomNumber((int)smallest, (int)biggest);
                int a = randomNumber(-20, 20);
                
                
                
                break;
            default:
                break;
        }
        
        return eq;
    }

    private int randomNumber (int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String toString () {
        String s = "";

        return s;
    }
}
