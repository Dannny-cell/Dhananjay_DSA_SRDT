import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {

    static Node reverse(Node head){

        Node prev = null;
        Node curr = head;

        while(curr != null){

            Node next_node = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next_node;
        }

        return prev;
    }

    static void print(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverse(head);

        print(head);
    }
}