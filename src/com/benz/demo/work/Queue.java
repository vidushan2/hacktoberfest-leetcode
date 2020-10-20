package com.benz.demo.work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue {

    private int[] queue;
    int rear,front;

    public Queue(int size)
    {
        queue=new int[size];
        rear=front=0;
    }

    public void enqueue(int data)
    {
         if(isFull())
             System.out.println("Queue is Overflow");
         else
         {
             queue[rear]=data;
             System.out.println(data+" is inserted");
             rear+=1;
         }
    }

    public void dequeue()
    {
        if(isEmpty())
            System.out.println("Queue is underflow");
        else{
            int data=queue[front];
            System.out.println(data+" is deleted");
            for(int i=0;i<rear-1;i++)
                queue[i]=queue[i+1];
            rear-=1;
        }
    }

    public void peek()
    {
        if(isEmpty())
            System.out.println("Queue is underflow");
        else
            System.out.println("The peek value is "+queue[rear-1]);
    }

    public void display()
    {
        if(isEmpty())
            System.out.println("Queue is underflow");
        else
        {
            for(int i=0;i<rear;i++)
                System.out.print(queue[i]+"\t");

            System.out.println("\n");
        }
    }

    public void show() throws IOException {
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.peek");
        System.out.println("4.display");

        while (true)
        {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

            int ch = Integer.valueOf(reader.readLine());

            switch (ch)
            {
                case 1:
                    System.out.println("Enter a value");
                    int value=Integer.valueOf(reader.readLine());
                    enqueue(value);break;
                case 2:dequeue();break;
                case 3:peek();break;
                case 4:display();break;
                default:
                    System.out.println("Invalid Input");
            }
        }

    }
    public boolean isFull()
    {
        return rear==queue.length?true:false;
    }

    public boolean isEmpty()
    {
        return rear==0?true:false;
    }
}
