
Jobs
A

Search...



Upgrade to Premium for Doubt Support across all your problems and courses.

Explore Premium
Redirection Icon
Refresh

Time (IST)	Status	Marks	Lang	Test Cases	Code
2025-07-29 20:41:10	Correct	
0Info
java	1111 / 1111	View
2025-07-29 20:40:16	RunTime Error	
0
java	1 / 1111	View
2025-07-24 15:52:03	Correct	
2
java	1111 / 1111	View
Java (21)



        



Custom Input
/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        Node slow =head;
            Node fast=head;
            for(int i=1;i<=k;i++){
                if(fast==null) return -1;
                fast=fast.next;
            }    
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow.data;
}
}
