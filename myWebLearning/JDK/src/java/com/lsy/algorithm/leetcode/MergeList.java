package com.lsy.algorithm.leetcode;


public class MergeList {
    //有序链表合并
    public static Node mergeList(Node head1, Node head2){
        if(head1 == null && head2 == null){
            return null;
        }
        if(head1==null) return head2;
        if(head2==null) return head1;

        Node mergedHead = null;
        if(head1.value < head2.value){
            mergedHead = head1;
            mergedHead.next = mergeList(head1.next,head2);
        }else {
            mergedHead = head2;
            mergedHead.next = mergeList(head1,head2.next);
        }
        return mergedHead;
    }

    //两个链表加和
    public static Node addTwoList(Node l1, Node l2){
        if(l1 == null && l2 == null){
            return null;
        }

        int sum = 0;
        Node p=new Node(0,null);
        Node node = p;
        while(l1!=null || l2!=null || sum!=0){
            if(l1!=null){
                sum+=l1.value;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.value;
                l2=l2.next;
            }
            p.next = new Node(sum%10,null);
            p=p.next;
            sum=sum/10;
        }

        return node.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(9,null);
        Node node2 = new Node(9,node1);
        Node node3 = new Node(8,node2);
        Node node4 = new Node(9,null);
        Node node5 = new Node(9,node4);

        //Node head = mergeList(node3,node5);
        Node head = addTwoList(node3,node5);

        while(head!=null){
            System.out.print(" "+head.value);
            head=head.next;
        }
    }
}
