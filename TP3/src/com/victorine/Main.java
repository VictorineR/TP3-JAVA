package com.victorine;

public class Main {

    public static void ex1(){
        MyFirstGeneric myFirstGeneric = new MyFirstGeneric(10, 20, 30);
        MySecondGeneric mySecondGeneric = new MySecondGeneric(1, 2, 3, 4);

        mySecondGeneric.display();
    }
    


    public static void main(String[] args) {
        ex1();

    }
}

