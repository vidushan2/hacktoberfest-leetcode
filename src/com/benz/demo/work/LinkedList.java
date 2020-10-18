package com.benz.demo.work;



public class LinkedList {

    static class Node{
        int data;
        Node link;

        public Node(int data,Node link)
        {
            this.data=data;
            this.link=link;
        }
    }

    private Node root;

    public LinkedList()
    {
        root=null;
    }

    public void append(int data)
    {
        Node temp=new Node(data,null);

        if(root==null)
            root=temp;
        else{
            Node p=root;
            while(p.link!=null)
                p=p.link;

            p.link=temp;
        }
    }
    public void addAtBegin(int data)
    {
        Node temp=new Node(data,null);

        if(root==null)
            root=temp;
        else
        {
            Node p=root;
            temp.link=p;
            root=temp;
        }
    }

    public int length()
    {
        int length=0;
        Node temp=root;

        while (temp!=null)
        {
            length +=1;
            temp=temp.link;
        }
        return length;
    }

    public void addNode(int data,int loc)
    {
            if(loc==0 || loc>length())
                System.out.println("List has "+length()+" node(s)");
            else if(loc==length())
            {
                Node temp=new Node(data,null);
                   Node p=root;
                   while(p.link!=null)
                       p=p.link;
                   p.link=temp;
            }
            else{
                Node temp=new Node(data,null);
                int count=1;
                Node p,q;
                p=root;
                while(count>loc)
                {
                    p=p.link;
                    count+=1;
                }
                q=p.link;
                temp.link=q.link;
                p.link=temp;

            }
    }

    public void display()
    {
        if(root==null)
            System.out.println("No node(s) available in the list");
        else
        {
            Node temp=root;
            while(temp!=null)
            {
                System.out.print(temp.data+"----->");
                temp=temp.link;
            }
            System.out.print("\n");
        }
    }
}
