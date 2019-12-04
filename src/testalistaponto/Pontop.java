/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalistaponto;

/**
 *
 * @author ruben
 */
public class Pontop {
    private int x, y;
    private int remover;

    public Pontop(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRemover() {
        return remover;
    }

    @Override
    public String toString() {
        return "Pontop{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
}
