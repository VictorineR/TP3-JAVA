package com.victorine;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Main {

    public static void ex1(){
        MyFirstGeneric myFirstGeneric = new MyFirstGeneric(10, 20, 30);
        MySecondGeneric mySecondGeneric = new MySecondGeneric(1, 2, 3, 4);

        mySecondGeneric.display();
    }

    public static void ex2(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        GenericStack<String> stack = new GenericStack<>(list, 1);
        System.out.println("Your stack:" + list);

        stack.push("C");
        System.out.println("Your stack:" + list);

        try{
            stack.pop();
        }
        catch (EmptyStackException e){
            System.out.println("your stack is empty");
        }
        System.out.println("Your stack:" + list);

        System.out.println("Size of the stack: " +stack.sizeStack());

        stack.addTo(stack, "D");
        System.out.println("Your stack:" + list);
    }

    public static void ex3(){
        System.out.println("?????");

    }

    public static void ex4(){
        
    }

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        ex4();

    }
}

