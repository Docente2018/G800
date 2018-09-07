/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainregularfigure;

/**
 *
 */
public class regularFigure {
  private int side;
  private int area;

    public regularFigure(int side) {
        this.side = side;
    }
    public int seeArea(int side){
        area = 0;
        area = side*side;
        return area;
    }
    public int getLado() {
        return side;
    }

    public void setside(int side) {
        this.side = side;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    } 
  
}
