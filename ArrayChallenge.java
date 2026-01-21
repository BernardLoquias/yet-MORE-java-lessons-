import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        Random rand = new Random();  

        char[][] tictacToe = new char[3][3]; 

        char player1 = 'X';
        char player2 = 'O';

        if (rand.nextInt(2) == 0) {
            System.out.println(player1); 
        } else {
            System.out.println(player2); 
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tictacToe[i][j] = rand.nextBoolean() ? player1 : player2;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tictacToe[i][j] + " ");
            }
            System.out.println();
        }

        boolean xWins = false;
        boolean oWins = false;

        for (int i = 0; i < 3; i++) {

            if (tictacToe[i][0] == tictacToe[i][1] &&
                tictacToe[i][1] == tictacToe[i][2]) {

                if (tictacToe[i][0] == player1) xWins = true;
                if (tictacToe[i][0] == player2) oWins = true;
            }

            if (tictacToe[0][i] == tictacToe[1][i] &&
                tictacToe[1][i] == tictacToe[2][i]) {

                if (tictacToe[0][i] == player1) xWins = true;
                if (tictacToe[0][i] == player2) oWins = true;
            }
        }

        if (tictacToe[0][0] == tictacToe[1][1] &&
            tictacToe[1][1] == tictacToe[2][2]) {

            if (tictacToe[0][0] == player1) xWins = true;
            if (tictacToe[0][0] == player2) oWins = true;
        }

        if (tictacToe[0][2] == tictacToe[1][1] &&
            tictacToe[1][1] == tictacToe[2][0]) {

            if (tictacToe[0][2] == player1) xWins = true;
            if (tictacToe[0][2] == player2) oWins = true;
        }

        if (xWins && oWins) {
            System.out.println("Both players win (invalid game).");
        } else if (xWins) {
            System.out.println("X wins!");
        } else if (oWins) {
            System.out.println("O wins!");
        } else {
            System.out.println("Cat’s game (draw).");
        }

        


    }
}

