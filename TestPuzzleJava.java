import java.util.ArrayList;

import java.util.Random;

public class TestPuzzleJava {

    public static void main(String[] args) {

        PuzzleJava generator = new PuzzleJava();

        Random randMachine = new Random();

        ArrayList<Integer> randomRolls = generator.getTenRolls();

        // System.out.println();
        System.out.println(randomRolls);

        String randLetter = generator.getRandomLetter();

        // System.out.println();
        System.out.println(randLetter);
        // System.out.println();

        String randPassword = generator.getRandomPassword();

        // System.out.println();
        System.out.println(randPassword);
        // System.out.println();

        int length = 20;

        String[] newPasswordSet = generator.getNewPasswordSet(length);

        for (int i = 0; i < length; i++)
            System.out.println(newPasswordSet[i]);
        // System.out.println();
    }
}