package DSA.LinkedList;

public class LinkedList3 {
    //cycle in linkedList yes or no
    //when last Node point null-no cycle,else cycle// use slow fast approach-when slow==fast then cycle exist
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }
    //Removing in a linkedList
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
               cycle=true;
               break;
            }
        }
        if(cycle==false){
            return;
        }

        //find meeting point
        slow=head;
        Node prev=null;
        while (slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle
        prev.next=null;
    }

    public static void main(String[] args) {
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(isCycle());
    }

}
