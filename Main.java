package KolkoIKrzyzyk;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player px = new Player(Player.Symbol.X);
        Player po = new Player(Player.Symbol.O);

        Board board = new Board(3);

        Game game = new Game(px, po, board);

        while(true) {
            board.print();

            if(game.isFinished()) {
                System.out.println("Koniec gry");
                break;
            }

            Player currentPlayer = game.getCurrentPlayer();
            System.out.println("Teraz ruch " + currentPlayer.getSymbol());

            System.out.println("Podaj współrzędną X:");
            int x = scanner.nextInt();
            System.out.println("Podaj współrzędną Y:");
            int y = scanner.nextInt();

            try {
                game.move(x, y);
            } catch (InvalidCoordinatesException e) {
                System.out.println("Złe współrzędne!");
            } catch (FieldOccupiedException e) {
                System.out.println("Pole jest już zajęte");
            }
        }
    }
}
