package com.victorine;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericStack<T> {
    protected ArrayList <T> Stack = new ArrayList<>();
    protected int top;

    public GenericStack(ArrayList<T> stack, int top) {
        Stack = stack;
        this.top = top;
    }

    //Method
    public void push(T element){
        Stack.add(element);
        this.top ++;
    }

    public void pop(){
        if (Stack.isEmpty()){
             throw new EmptyStackException();
        } else{
            this.Stack.remove(this.top+1);
            this.top --;
        }
    }

    public boolean isEmpty() {return Stack.isEmpty();}

    public int sizeStack (){
        return top;
    }

    public static <T> void addTo(GenericStack<T> _Stack, T element) {
        _Stack.push(element);
    }
}
