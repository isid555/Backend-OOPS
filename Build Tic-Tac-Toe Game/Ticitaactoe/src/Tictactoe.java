import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        int n = 3;
        char board[][] = new char[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the name of the player 1");
        String p1 = sc.nextLine();

        System.out.println("Please Enter the name of the player 2");
        String p2 = sc.nextLine();

//        Make all the cells visible and vacant
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '-';
            }
        }
        displayBoard(board);
        //Player 1 turn
        Boolean turn = true;
        int count_of_Moves = 0;

        while (true) {
            //init the symbol
            char sym;
            while (true) {
                //While loop 1  - For input function
                if (turn) {
                    System.out.println("Player's 1 turn");
                } else {
                    System.out.println("Player's 2 turn");
                }

                if (turn) {
                    sym = 'X';
                } else {
                    sym = 'O';
                }
                System.out.println("Player 1 will be X and Player 2 will be O   ");
                //Make them choose their location
                System.out.println("Please input the row: ");
                int r = sc.nextInt();
                System.out.println("Please input the col: ");
                int c = sc.nextInt();

                if (r < 0 || r > n || c < 0 || c > n) {
                    System.out.println("Invalid Move !");
                } else if (board[r][c] != '-') {
                    System.out.println("This cell is already occupied");
                } else {
                    board[r][c] = sym;
                    count_of_Moves++;
                    break;
                    //once input over no need to go further ,we shld start again
                }


            }
            if (checkWinner(board, sym)) {
                System.out.println("Winner is: " + sym);
                break;
            } else if (count_of_Moves == 9) {
                System.out.println("Draw");
                break;
            }
            turn = !turn;
            displayBoard(board);
        }//while loop 2 ends here

    } // while loop 1 ends


    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(char[][] board, char sym) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == sym && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            } else if (board[0][i] == sym && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
            //Diagonal condition
            else if (board[0][0]==sym && board[0][0]==board[1][1] && board[1][1]==board[2][2]) {
                return true;
            } else if (board[0][2] == sym && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                return true;
            }
        }
        return false;

    }//main ends
}



