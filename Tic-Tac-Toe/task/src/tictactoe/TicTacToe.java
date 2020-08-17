package tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] plansza = new char[3][3];
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                plansza[i][j] = '_';
            }
        }
        printTable(plansza);

    }

    public static void printTable(char[][] plansza) {
        System.out.println("---------");
        for (int wiersz = 0; wiersz < plansza.length; wiersz++) {
            System.out.print("| ");
            for (int kolumna = 0; kolumna < plansza[wiersz].length; kolumna++) {
                System.out.print(plansza[wiersz][kolumna] + " ");
            }
            System.out.print("|");
            System.out.println();

        }
        System.out.println("---------");
    }
}
