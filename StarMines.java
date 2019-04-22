package kursova2;

import java.util.Scanner;

public class StarMines {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] field = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                field[i][j] = 100;
            }
        }

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("GAME OVER")) {
                break;
            }
            String[] cmd = command.split(",");
            int x = Integer.parseInt(cmd[0]);
            int y = Integer.parseInt(cmd[1]);
            int power = Integer.parseInt(cmd[2]);

            int neithDamage = 0;
            if (power <= 30){
                neithDamage = 5;
            }else if (power <= 70){
                neithDamage = 10;
            }else {
                neithDamage = (power * 20) / 100;
            }
            if (x < 0 || x>=rows || y < 0 || y >=rows){
                continue;
            }
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (x + i >= 0 && x + i < rows && y + j >= 0 && y + j < cols) {
                        if (i == 0 && j == 0) {
                            field[x + i][y + j] -= power;
                        } else {
                            field[x + i][y + j] -= neithDamage;
                        }
                        if (field[x + i][y + j] < 0) {
                            field[x + i][y + j] = 0;
                        }
                    }
                }
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}