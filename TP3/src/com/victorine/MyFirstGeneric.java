
package com.victorine;

public class MyFirstGeneric {
    protected int X;
    protected int Y;
    protected int Z;

    //Constructor
    public MyFirstGeneric(int x, int y, int z) {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }

    //Getter
    public int getX() {return this.X;}
    public int getY() {return this.Y;}
    public int getZ() {return this.Z;}

    //Setter
    public void setX(int x) {this.X = x;}
    public void setY(int y) {this.Y = y;}
    public void setZ(int z) {this.Z = z;}

    //Methode
    public void display() {
    System.out.println("The value of X : " +X);
    System.out.println("The value of Y : " +Y);
    System.out.println("The value of Z : " +Z);
    }
}
