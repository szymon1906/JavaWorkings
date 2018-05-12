package KolkoIKrzyzyk;

public class Game {



    private Player playerX;
    private Player playerO;
    private Board board;
    private Player currentPlayer;


    public Game(Player playerX, Player playerO, Board board) {
        this.playerX = playerX;
        this.playerO = playerO;
        this.board = board;

        this.currentPlayer = playerX;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void move(int x, int y) throws InvalidCoordinatesException, FieldOccupiedException {
        if(this.board.areCoordinatesValid(x, y)) {
            throw new InvalidCoordinatesException();
        }

        if(this.board.isFieldOccupied(x, y)) {
            throw new FieldOccupiedException();
        }

        this.board.setField(x, y, this.currentPlayer);
        if(this.currentPlayer == this.playerX) {
            this.currentPlayer = this.playerO;
        } else {
            this.currentPlayer = this.playerX;
        }
    }

    public void print() {
        this.board.print();
    }

    public boolean isFinished() {
        return this.board.isFinished();
    }

}
