package com.lsy.algorithm.leetcode;

class Node{
    int value;
    Node next;

    public Node(int value,Node next){
        this.next = next;
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public static void printList(Node node){
        while(node!=null){
            System.out.print(node.value+" ");
            node = node.next;
        }
        System.out.println();
    }

    public static Node reverseList(Node node){
        Node pre = null;
        Node cur = node;
        Node next = node.next;
        while(true){
            cur.next = pre;
            if(next==null){
                return cur;
            }
            pre = cur;
            cur =next;
            next = next.next;
        }
    }
}

public class ReverseList {
    public static void main(String[] args) {
        Node n1 = new Node(4,null);
        Node n2 = new Node(3,n1);
//        Node n3 = new Node(2,n2);
//        Node n4 = new Node(1,n3);

        Node.printList(n2);
//        Node.reverseList(n4);
        Node.printList(Node.reverseList(n2));

    }
}
