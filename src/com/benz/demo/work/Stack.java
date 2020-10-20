package com.benz.demo.work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Stack {

    private int[] arr;
    private int top;

    public Stack(int size)
    {
        arr=new int[size];
        top=-1;
    }

    public void push(int data)
    {
           if(isFull()) {
               System.out.println("Stack is overflow");
           }
           else
           {
               top+=1;
               arr[top]=data;
               System.out.println(data+" is inserted");
           }
    }

    public void pop()
    {
        if(isEmpty())
            System.out.println("Stack is underflow");
        else
        {
            int data=arr[top];
            System.out.println(data+" is deleted");
            top-=1;
        }
    }

    public void peek()
    {
        if(isEmpty())
            System.out.println("Stack is underflow");
        else
            System.out.println("The peek value is "+arr[top]);
    }

    public void display()
    {
        if(isEmpty())
            System.out.println("Stack is underflow");
        else {
           for(int i=0;i<=top;i++)
               System.out.print(arr[i]+"\t");
            System.out.println("\n");
        }
    }

    public boolean isEmpty()
    {
         return top==-1?true:false;
    }

    public boolean isFull()
    {
        return top==arr.length-1 ?true : false;
    }

    public void show() throws IOException {
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.Display");

        while(true)
        {

            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

            int ch= Integer.valueOf(bufferedReader.readLine());

            switch (ch)
            {
                case 1:
                    System.out.println("Enter a value to insert");
                    int data=Integer.valueOf(bufferedReader.readLine());
                    push(data);break;
                case 2:
                    pop();break;
                case 3:peek();break;
                case 4: display();break;
                default:
                    System.out.println("Invalid Input");
            }

        }
    }
}
