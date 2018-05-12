package KolkoIKrzyzyk;



public class Player {

    public enum Symbol {
        X,
        O,
    }

    private Symbol symbol;


    public Player(Symbol symbol) {
        this.symbol = symbol;
    }


    public Symbol getSymbol() {
        return symbol;
    }

}
