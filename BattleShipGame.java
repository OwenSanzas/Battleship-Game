import java.util.Scanner;

public class BattleShipGame {
    /**
     * This is the launcher of the game
     * Made by Ze Sheng
     */
    public static void main(String[] args) {
        boolean again = true;
        while (again) {
            // Initialize the map:
            Ocean ocean = new Ocean();
            String welcome = "Welcome to Battle Ship! \nProduced by Ze Sheng";
            System.out.println(welcome);

            // Initialize the ships
            ocean.placeAllShipsRandomly();

            // Initialize inputs
            Scanner sc = new Scanner(System.in);

            // String Position = sc.next();

            while (true) {
                // check if game is over:
                if (ocean.isGameOver()) {
                    System.out.println("Congratulation! You win!");
                    break;
                }

                // DEBUG ONLY!!!
                ocean.printWithShips();

                // print the current ocean map
                ocean.print();
                // print current shot fired and hit count:
                System.out.println("Hit counts: " + ocean.getHitCount());
                System.out.println("Shots fired: " + ocean.getShotsFired());
                System.out.println("Ship sunk: " + ocean.getShipsSunk());

                while (true) {
                    // get the row
                    // player need to shoot somewhere
                    int row;
                    int col;
                    while (true) {
                        System.out.println("Which position do you want to shoot? i.e. '2,1' or '0,6' ");
                        String inputPosition = sc.next();
                        // get row
                        row = inputPosition.trim().toCharArray()[0] - '0';

                        // get column
                        col = inputPosition.trim().toCharArray()[2] - '0';
                        if ((row >= 0 && row <= 9) && ((col >= 0 && col <= 9))) {
                            break;
                        }
                    }

                    // Shoot!
                    if (ocean.isShot[row][col]) {
                        // if a position is chosen before, the user must input a new one
                        System.out.println("You have tried this position! Try another one!");
                    } else {
                        // shootAt (row, col)
                        ocean.shootAt(row, col);
                        break;
                    }
                }
            }

            // ask for a new game or not:
            System.out.println("Play again? Input yes to try again!");
            String isAgain = sc.next();
            char ans = isAgain.toCharArray()[0];
            if (!(ans == 'y' || ans == 'Y')) {
                again = false;
                System.out.println("GoodBye");
            }
        }
    }
}
