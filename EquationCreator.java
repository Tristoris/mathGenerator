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
            equationList[i] = createLinear(1, 1, 3);
        }
    }

    private String createLinear (int difficulty, double smallest, double biggest) {
        String eq = "";
        int[] data = new int[4];

        switch (difficulty) {
            case 1:
                int answer = randomNumber((int)smallest, (int)biggest);
                int e = randomNumber(-20, 20);
                int f = answer * e;
                int a = randomNumber(0, 20);
                int c = e - a;
                int d = randomNumber(0, 20);
                int b = f - d;
                int[] temp = {a,b,c,d};
                data = temp;

                break;
            default:
                break;
        }

        for (int i = 0; i < data.length; i++) {
            switch (data[i]) {
                case 0:
                    break;
                case 1:
                    if (i == 0 || i == 2) eq += "x";
                    else eq += "1";
                    break;
                case -1:
                    if (i == 0 || i == 2) eq += "-x";
                    else eq += "-1";
                default:
                    if (i == 0 || i == 2) {
                        if (data[i] > 0) eq += data[i] + "x";
                        else eq += data[i] + "x";
                    } else {
                        eq += data[i];
                    }
                    break;
            }

            if (i == 0 || i == 2) {
                if (data[i] != 0) {
                    if (data[i] < 0) eq += " - ";
                    else eq += " + ";
                }
            }

            if (i == 1) eq += " = ";
        }

        return eq;
    }

    private int randomNumber (int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public String toString () {
        String s = "";

        for (int i = 0; i < equationList.length; i++) {
            s += equationList[i] + "\n";
        }
        System.out.println(s);

        return s;
    }
}
