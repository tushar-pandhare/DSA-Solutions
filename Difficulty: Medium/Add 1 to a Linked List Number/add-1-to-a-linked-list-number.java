/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        head=reverse(head);
        head=add1(head);
        return reverse(head);
    }
    public Node reverse(Node start){
        Node prev=null;
        Node nxt=null;
        while(start!=null){
            nxt=start.next;
            start.next=prev;
            prev=start;
            start=nxt;
        }
        return prev;
    }
    public Node add1(Node head){
        Node temp=head;
        int carry=1;
        Node prev=null;
        while(temp!=null){
            int data=carry+temp.data;
            temp.data=data%10;
            carry=data/10;
            prev=temp;
            temp=temp.next;
        }
        if(carry>0){
            prev.next=new Node(carry);
        }
        return head;
    }
}