package testalistaponto;

public class Ponto{
   private int x,y;
//   int posi;
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
//   void local(int posicao) {
//        this.posi = posicao;
//   }
//   public int getposicao() {
//        return posicao;
//    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
 