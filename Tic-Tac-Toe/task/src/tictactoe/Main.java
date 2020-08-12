package tictactoe;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        char[] ticTac = scanner.nextLine().toCharArray();

        System.out.println("---------");
        System.out.println("| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |");
        System.out.println("| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |");
        System.out.println("| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |");
        System.out.println("---------");

        System.out.print("Enter the coordinates: ");
        int choice1 = scanner.nextInt();
        int choice2 = scanner.nextInt();

        String choiceString = new String(String.valueOf(choice1 + "" + choice2)); // połąćzenie 2 liczb w string aby pozbyć się spacji bez działania matematycznego
        int fullChoice = parseInt(choiceString); // konwert stringa w liczbę reprez daną komórkę
//        System.out.println(fullChoice);


        switch (fullChoice) {
            case 11: {
                ticTac[6] = 'X';
                break;
            }
            case 21: {
                ticTac[7] = 'X';
                break;
            }
            case 31: {
                ticTac[8] = 'X';
                break;
            }
            case 12: {
                ticTac[3] = 'X';
                break;
            }
            case 22: {
                ticTac[4] = 'X';
                break;
            }
            case 32: {
                ticTac[5] = 'X';
                break;
            }
            case 13: {
                ticTac[0] = 'X';
                break;
            }
            case 23: {
                ticTac[1] = 'X';
                break;
            }
            case 33: {
                ticTac[2] = 'X';
                break;
            }
        }

        System.out.println("---------");
        System.out.println("| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |");
        System.out.println("| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |");
        System.out.println("| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |");
        System.out.println("---------");

//        int countX = 0;
//        int countO = 0;
//
//        for (int i = 0; i < ticTac.length; i++) {
//            if (ticTac[i] == 'X') {
//                countX++;
//            }
//            if (ticTac[i] == 'O') {
//                countO++;
//            }
//        }
//
//        String state = "Game not finished";
//
//
//        String stateX = null;
//        String stateO = null;
////        while (state == "Game not finished") {
//
//        if ((ticTac[0] == 'X') && (ticTac[1] == 'X') && (ticTac[2] == 'X')) {
//            stateX = "X wins";
//        } else if ((ticTac[3] == 'X') && (ticTac[4] == 'X') && (ticTac[5] == 'X')) {
//            stateX = "X wins";
//        } else if ((ticTac[6] == 'X') && (ticTac[7] == 'X') && (ticTac[8] == 'X')) {
//            stateX = "X wins";
//        } else if ((ticTac[0] == 'X') && (ticTac[3] == 'X') && (ticTac[6] == 'X')) {
//            stateX = "X wins";
//        } else if ((ticTac[1] == 'X') && (ticTac[4] == 'X') && (ticTac[7] == 'X')) {
//            stateX = "X wins";
//        } else if ((ticTac[2] == 'X') && (ticTac[5] == 'X') && (ticTac[8] == 'X')) {
//            stateX = "X wins";
//        } else if ((ticTac[0] == 'X') && (ticTac[4] == 'X') && (ticTac[8] == 'X')) {
//            stateX = "X wins";
//        } else if ((ticTac[2] == 'X') && (ticTac[4] == 'X') && (ticTac[6] == 'X')) {
//            stateX = "X wins";
//        }
//
//        if ((ticTac[0] == 'O') && (ticTac[1] == 'O') && (ticTac[2] == 'O')) {
//            stateO = "O wins";
//        } else if ((ticTac[3] == 'O') && (ticTac[4] == 'O') && (ticTac[5] == 'O')) {
//            stateO = "O wins";
//        } else if ((ticTac[6] == 'O') && (ticTac[7] == 'O') && (ticTac[8] == 'O')) {
//            stateO = "O wins";
//        } else if ((ticTac[0] == 'O') && (ticTac[3] == 'O') && (ticTac[6] == 'O')) {
//            stateO = "O wins";
//        } else if ((ticTac[1] == 'O') && (ticTac[4] == 'O') && (ticTac[7] == 'O')) {
//            stateO = "O wins";
//        } else if ((ticTac[2] == 'O') && (ticTac[5] == 'O') && (ticTac[8] == 'O')) {
//            stateO = "O wins";
//        } else if ((ticTac[0] == 'O') && (ticTac[4] == 'O') && (ticTac[8] == 'O')) {
//            stateO = "O wins";
//        } else if ((ticTac[2] == 'O') && (ticTac[4] == 'O') && (ticTac[6] == 'O')) {
//            stateO = "O wins";
//        }
//
//        if (stateX != null && stateO == null) {
//            state = stateX;
//        } else if (stateX == null && stateO != null) {
//            state = stateO;
//        } else if (stateX != null && stateO != null) {
//            state = "Impossible";
//        } else if (stateX == null && stateO == null) {
//            state = "Draw";
//            for (int i = 0; i < ticTac.length; i++) {
//                if (ticTac[i] == '_') {
//                    if (state != "X wins" && state != "O wins") {
//                        state = "Game not finished";
//                        break;
//                    }
//                }
//            }
//
//        }
//
//        if (countX - countO > 1 || countO - countX > 1) {
//            state = "Impossible";
//        }
//
//        System.out.println(state);
    }
}
