package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    private static int round = 0;
    private static char[] board = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};
    private static int X;
    private static int O;

    private static void run() {

        while (true) {
            round++;
            System.out.println("round: " + round);
            System.out.println();
            playerXmove();
            playerOmove();
            if (round == 5) {
                System.out.println("It is a draw");
                return;
            }
        }
    }

    private static void playerXmove() {
        printBoard();
        System.out.println("X turn:");
        X = sc.nextInt();
        while (X > 8 || X < 0) {
            System.out.println("ONLY 0-8");
            X = sc.nextInt();
        }

        switch (X) {
            case 0 -> {
                board[0] = 'X';
                break;
            }
            case 1 -> {
                board[1] = 'X';
                break;
            }
            case 2 -> {
                board[2] = 'X';
                break;
            }
            case 3 -> {
                board[3] = 'X';
                break;
            }
            case 4 -> {
                board[4] = 'X';
                break;
            }
            case 5 -> {
                board[5] = 'X';
                break;
            }
            case 6 -> {
                board[6] = 'X';
                break;
            }
            case 7 -> {
                board[7] = 'X';
                break;
            }
            case 8 -> {
                board[8] = 'X';
                break;
            }

        }

        printBoard();

        checkX();
    }


    private static void playerOmove() {
        System.out.println("O turn:");
        O = sc.nextInt();
        while (O > 8 || O < 0) {
            System.out.println("ONLY 0-8");
            O = sc.nextInt();
        }

        switch (O) {
            case 0 -> {
                board[0] = 'O';
                break;
            }
            case 1 -> {
                board[1] = 'O';
                break;
            }
            case 2 -> {
                board[2] = 'O';
                break;
            }
            case 3 -> {
                board[3] = 'O';
                break;
            }
            case 4 -> {
                board[4] = 'O';
                break;
            }
            case 5 -> {
                board[5] = 'O';
                break;
            }
            case 6 -> {
                board[6] = 'O';
                break;
            }
            case 7 -> {
                board[7] = 'O';
                break;
            }
            case 8 -> {
                board[8] = 'O';
                break;
            }


        }
        checkO();
    }


    private static void checkX() {
        if ((board[0] == board[1] && board[1] == board[2] && board[0] == 'X') || (board[3] == board[4] && board[4] == board[5] && board[3] == 'X') || (board[6] == board[7] && board[7] == board[8] && board[6] == 'X') || (board[0] == board[4] && board[4] == board[8] && board[0] == 'X') || (board[2] == board[4] && board[4] == board[6] && board[2] == 'X') || (board[0] == board[3] && board[3] == board[6] && board[0] == 'X') || (board[1] == board[4] && board[4] == board[7] && board[1] == 'X') || (board[2] == board[5] && board[5] == board[8] && board[2] == 'X')) {
            System.out.println();
            printBoard();
            System.out.println();
            System.out.println("Winner is X in " + round + " rounds");
            System.exit(0);
        }
    }

    private static void checkO() {

        if ((board[0] == board[1] && board[1] == board[2] && board[0] == 'O') || (board[3] == board[4] && board[4] == board[5] && board[3] == 'O') || (board[6] == board[7] && board[7] == board[8] && board[6] == 'O') || (board[0] == board[4] && board[4] == board[8] && board[0] == 'O') || (board[2] == board[4] && board[4] == board[6] && board[2] == 'O') || (board[0] == board[3] && board[3] == board[6] && board[0] == 'O') || (board[1] == board[4] && board[4] == board[7] && board[1] == 'O') || (board[2] == board[5] && board[5] == board[8] && board[2] == 'O')) {
            System.out.println();
            printBoard();
            System.out.println();
            System.out.println("Winner is O in " + round + " rounds");
            System.exit(0);
        }
    }

    private static void printBoard() {
        int n = 0;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println(" " + board[n] + " | " + board[n + 1] + " | " + board[n + 2]);
                n += 3;
            } else {
                System.out.println("-----------");
                System.out.println(" " + board[n] + " | " + board[n + 1] + " | " + board[n + 2]);
                n += 3;
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        run();
    }
}