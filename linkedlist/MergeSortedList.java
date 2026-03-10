import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class MergeSortedList {

    static Node merge(Node list1, Node list2){

        Node dummy = new Node(0);
        Node curr = dummy;

        while(list1 != null && list2 != null){

            if(list1.data < list2.data){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if(list1 != null)
            curr.next = list1;

        if(list2 != null)
            curr.next = list2;

        return dummy.next;
    }

    static void print(Node head){

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args){

        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node res = merge(list1, list2);

        print(res);
    }
}