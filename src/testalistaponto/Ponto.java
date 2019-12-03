package testalistaponto;

public class Ponto {

    private int x, y;
    private int remover;

    public int getRemover() {
        return remover;
    }

    public void setRemover(int remover) {
        this.remover = remover;
    }

    public Ponto(int remover) {

        this.remover = remover;

    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
