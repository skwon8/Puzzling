import java.util.ArrayList;

import java.util.Random;


public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {

        Random rand = new Random();

        ArrayList<Integer> random10num = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            random10num.add(rand.nextInt(20) + 1);
        }
        return random10num;
    }

    public String getRandomLetter() {

        Random rand = new Random();

        String[] alphabetInOrder = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };

        return alphabetInOrder[rand.nextInt(26)];

    }

    public String getRandomPassword() {

        String password = "";

        for (int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public String[] getNewPasswordSet(int length) {

        String[] newPasswordSet = new String[length];

        for (int i = 0; i < length; i++) {
            newPasswordSet[i] = getRandomPassword();
        }
        return newPasswordSet;
    }

    public static void shuffeArray(Object[] arr) {

        Random rand = new Random();

        for (int i = 0; i < arr.length / 2; i++) {

            Object temp = arr[i];

            int randomIndexNum = rand.nextInt(arr.length - i) + i;
            arr[i] = arr[randomIndexNum];
            arr[randomIndexNum] = temp;
        }
        return;
    }
}