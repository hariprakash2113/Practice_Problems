package Practices;

public class SinglyLLptc {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static void main(String[] args) {
        Node head=new Node(100);
        Node sec = new Node(50);
        Node trd=new Node(25);
        Node fth=new Node(12);
        head.next=sec;
        sec.next=trd;
        trd.next=fth;
        for(Node curr=head;curr != null;curr=curr.next){
            System.out.print(curr.data+" ==> ");
        }
        System.out.println("null");
        }
    }
