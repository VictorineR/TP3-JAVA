package com.victorine;

public class MySecondGeneric extends MyFirstGeneric {
    protected int W;

    public MySecondGeneric(int x, int y, int z, int w) {
        super(x, y, z);
        this.W = w;
    }

    //Getter
    public int getW() {return W;}

    //Setter
    public void setW(int w) {W = w;}

    //Method
    public void display() {
        System.out.println("The value of X : " +getX());;
        System.out.println("The value of Y : " +getY());;
        System.out.println("The value of Z : " +getZ());;
        System.out.println("The value of W : " +W);
    }
}
