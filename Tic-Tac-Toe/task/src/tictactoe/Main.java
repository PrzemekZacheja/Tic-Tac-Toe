package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    static int choice1;
    static int choice2;
    private static int fullChoice;
    static int countX = 0;
    static int countO = 0;
    static String stateX = null;
    static String stateO = null;
    static char swichSign = 'X';


    public static void main(String[] args) {


        char[] ticTac = new char[9];
        Arrays.fill(ticTac, '_');
//        for (int i = 0; i < ticTac.length; i++) {
//            ticTac[i] = '_';
//        }

        System.out.println("---------");
        System.out.println("| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |");
        System.out.println("| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |");
        System.out.println("| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |");
        System.out.println("---------");

        enterCoordinates();


        String state = "Game not finished";

        while (state.equals("Game not finished")) {
            switch (fullChoice) {
                case 11: {
                    if (ticTac[6] == '_') {
                        ticTac[6] = swichSign;
                        change();

                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
                case 21: {
                    if (ticTac[7] == '_') {
                        ticTac[7] = swichSign;
                        change();
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
                case 31: {
                    if (ticTac[8] == '_') {
                        ticTac[8] = swichSign;
                        change();
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
                case 12: {
                    if (ticTac[3] == '_') {
                        ticTac[3] = swichSign;
                        change();
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
                case 22: {
                    if (ticTac[4] == '_') {
                        ticTac[4] = swichSign;
                        change();
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
                case 32: {
                    if (ticTac[5] == '_') {
                        ticTac[5] = swichSign;
                        change();
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
                case 13: {
                    if (ticTac[0] == '_') {
                        ticTac[0] = swichSign;
                        change();
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
                case 23: {
                    if (ticTac[1] == '_') {
                        ticTac[1] = swichSign;
                        change();
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
                case 33: {
                    if (ticTac[2] == '_') {
                        ticTac[2] = swichSign;
                        change();
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        enterCoordinates();
                    }
                    break;
                }
            }
            System.out.println("---------");
            System.out.println("| " + ticTac[0] + " " + ticTac[1] + " " + ticTac[2] + " |");
            System.out.println("| " + ticTac[3] + " " + ticTac[4] + " " + ticTac[5] + " |");
            System.out.println("| " + ticTac[6] + " " + ticTac[7] + " " + ticTac[8] + " |");
            System.out.println("---------");

            for (char c : ticTac) {
                if (c == 'X') {
                    countX++;
                }
                if (c == 'O') {
                    countO++;
                }
            }

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
                for (char c : ticTac) {
                    if (c == '_') {
                        if (!state.equals("X wins") && !state.equals("O wins")) {
                            state = "Game not finished";
                            enterCoordinates();
                            break;
                        }
                    }
                }

            }

            if (countX - countO > 1 || countO - countX > 1) {
                state = "Impossible";
            }

        }
        System.out.println(state);
    }

    static Scanner scanner = new Scanner(System.in);

    private static void enterCoordinates() {
        System.out.print("Enter the coordinates: ");
        while (!scanner.hasNextInt()) {
            System.out.println("You should enter numbers!");
            scanner.nextLine();
            System.out.print("Enter the coordinates: ");
        }
        choice1 = scanner.nextInt();
        choice2 = scanner.nextInt();
        if ((choice1 < 1 || choice1 > 3) || (choice2 < 1 || choice2 > 3)) {
            System.out.println("Coordinates should be from 1 to 3!");
            enterCoordinates();
        }
        String choiceString = choice1 + "" + choice2; // połąćzenie 2 liczb w string aby pozbyć się spacji bez działania matematycznego
        fullChoice = parseInt(choiceString); // konwert stringa w liczbę reprez daną komórkę
    }

    private static void change() {
        if (swichSign == 'X') {
            swichSign = 'O';
        }
        if (swichSign == 'O') {
            swichSign = 'X';
        }
    }
}


