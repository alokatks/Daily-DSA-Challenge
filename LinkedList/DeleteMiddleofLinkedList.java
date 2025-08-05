/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        if(head.next==null) return null ;
        int length=0;
            Node temp=head;
            while(temp!=null){
                temp=temp.next;
                length++;
            }
            temp=head;
            for(int i=0;i<length/2-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return head;
    }
}
