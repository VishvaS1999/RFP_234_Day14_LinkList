package com.Linklist;
class Node<T>
{
    T data;
    Node<T> next;

    public Node(T data)
    {
        this.data=data;
    }
}
class LinkList<T>
{
    Node<T> head;
    Node<T> tail;
    public void push(T data)
    {
        Node<T> newNode = new Node(data);
        if (head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }
    public void add(T data)
    {
        Node<T> newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public  void show()
    {
        if(head==null)
        {
            System.out.println("Link List Empty");
        }
        else
        {
            Node<T> temp=head;
            while (temp!=null)
            {
                System.out.println(temp.data + " ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
    public class LinkListMain
    {
        public static void main(String[] args)
        {
            LinkList<Integer> list1=new LinkList();
            list1.push(70);
            list1.push(30);
            list1.push(56);
            list1.show();
            System.out.println();

            LinkList<Integer> list2=new LinkList<>();
            list2.add(56);
            list2.add(30);
            list2.add(70);
            list2.show();
        }
    }
