package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[] ticTac = scanner.nextLine().toCharArray();

        System.out.println("---------");
        System.out.println("| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |");
        System.out.println("| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |");
        System.out.println("| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |");
        System.out.println("---------");

        int countX = 0;
        int countO = 0;

        for (int i = 0; i < ticTac.length; i++) {
            if (ticTac[i] == 'X') {
                countX++;
            }
            if (ticTac[i] == 'O') {
                countO++;
            }
        }

        String state = "Game not finished";


        String stateX = null;
        String stateO = null;
//        while (state == "Game not finished") {

        if ((ticTac[0] == 'X') && (ticTac[1] == 'X') && (ticTac[2] == 'X')) {
            stateX = "X wins";
        } else if ((ticTac[3] == 'X') && (ticTac[4] == 'X') && (ticTac[5] == 'X')) {
            stateX = "X wins";
        } else if ((ticTac[6] == 'X') && (ticTac[7] == 'X') && (ticTac[8] == 'X')) {
            stateX = "X wins";
        } else if ((ticTac[0] == 'X') && (ticTac[3] == 'X') && (ticTac[6] == 'X')) {
            stateX = "X wins";
        } else if ((ticTac[1] == 'X') && (ticTac[4] == 'X') && (ticTac[7] == 'X')) {
            stateX = "X wins";
        } else if ((ticTac[2] == 'X') && (ticTac[5] == 'X') && (ticTac[8] == 'X')) {
            stateX = "X wins";
        } else if ((ticTac[0] == 'X') && (ticTac[4] == 'X') && (ticTac[8] == 'X')) {
            stateX = "X wins";
        } else if ((ticTac[2] == 'X') && (ticTac[4] == 'X') && (ticTac[6] == 'X')) {
            stateX = "X wins";
        }

        if ((ticTac[0] == 'O') && (ticTac[1] == 'O') && (ticTac[2] == 'O')) {
            stateO = "O wins";
        } else if ((ticTac[3] == 'O') && (ticTac[4] == 'O') && (ticTac[5] == 'O')) {
            stateO = "O wins";
        } else if ((ticTac[6] == 'O') && (ticTac[7] == 'O') && (ticTac[8] == 'O')) {
            stateO = "O wins";
        } else if ((ticTac[0] == 'O') && (ticTac[3] == 'O') && (ticTac[6] == 'O')) {
            stateO = "O wins";
        } else if ((ticTac[1] == 'O') && (ticTac[4] == 'O') && (ticTac[7] == 'O')) {
            stateO = "O wins";
        } else if ((ticTac[2] == 'O') && (ticTac[5] == 'O') && (ticTac[8] == 'O')) {
            stateO = "O wins";
        } else if ((ticTac[0] == 'O') && (ticTac[4] == 'O') && (ticTac[8] == 'O')) {
            stateO = "O wins";
        } else if ((ticTac[2] == 'O') && (ticTac[4] == 'O') && (ticTac[6] == 'O')) {
            stateO = "O wins";
        }

        if (stateX != null && stateO == null) {
            state = stateX;
        } else if (stateX == null && stateO != null) {
            state = stateO;
        } else if (stateX != null && stateO != null) {
            state = "Impossible";
        } else if (stateX == null && stateO == null) {
            state = "Draw";
            for (int i = 0; i < ticTac.length; i++) {
                if (ticTac[i] == '_') {
                    if (state != "X wins" && state != "O wins") {
                        state = "Game not finished";
                        break;
                    }
                }
            }

        }

        if (countX - countO > 1 || countO - countX > 1) {
            state = "Impossible";
        }

        System.out.println(state);
    }
}
