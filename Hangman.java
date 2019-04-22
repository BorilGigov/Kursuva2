package kursova2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int lives = 5;
        int counter = 0, tries = 0;
        ArrayList<Character> repeats = new ArrayList<>();
        System.out.println("Welcome!");
        System.out.println("First choose difficulty: EASY  NORMAL  HARD  ");
        String choose = scanner.nextLine();
        String guessWord = searchedWord(choose);
        StringBuffer wordInPoints = returnCount(guessWord);
        wordInPoints.replace(0, 1, String.valueOf(guessWord.charAt(0)));
        wordInPoints.replace(wordInPoints.length() - 1, wordInPoints.length(), String.valueOf(guessWord.charAt(guessWord.length() - 1)));

        System.out.println("Lets start, you have " + lives + "HP.");
        while (true) {
            System.out.println(wordInPoints);
            if (!wordInPoints.toString().contains("*")) {
                System.out.println("\nWell done! you beat me for " + tries + " tries");
                break;
            }
            System.out.print("Enter a letter: ");
            char urLetter = scanner.next().charAt(0);
            for (char letter : repeats) {
                if (urLetter == letter) {
                    System.out.println("You already searched for this letter.");
                    continue;
                }
            }
            if (!guessWord.contains(String.valueOf(urLetter))) {
                counter++;
                repeats.add(urLetter);
                System.out.println("This letter isn't in the word. You have " + (lives - counter) + "HP");
            } else {
                for (int i = 0; i < guessWord.length(); i++) {
                    if (urLetter == guessWord.charAt(i)) {
                        wordInPoints.delete(i, i + 1);
                        wordInPoints.insert(i, urLetter);
                        repeats.add(urLetter);
                    }
                }
            }
            if (counter == lives) {
                break;
            }
            tries++;
        }
    }

    public static StringBuffer returnCount(String word) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            buffer.append("*");
        }
        return buffer;
    }

    public static String getRandom(String[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }

    public static String searchedWord(String difficulty) {
        if (difficulty.equalsIgnoreCase("easy")) {
            String[] easyWords = {"dog", "cat", "school", "word"};
            return getRandom(easyWords);
        } else if (difficulty.equalsIgnoreCase("normal")) {
            String[] normalWords = {"power", "scissors", "student", "carpet"};
            return getRandom(normalWords);
        } else if (difficulty.equalsIgnoreCase("hard")) {
            String[] hardWords = {"router", "ethernet", "randomly", "variable"};
            return getRandom(hardWords);
        } else {
            return "Not available difficulty";
        }

    }

}