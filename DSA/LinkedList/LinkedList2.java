package DSA.LinkedList;

public class LinkedList2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){
        //step1 create new node
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 newNode ka next =head
        newNode.next=head;//link

        //step3 head=newNode
        head=newNode;
    }
    public static Node head;
    public static Node tail;
    //slow fast approach
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPallindrome(){
        if(head==null ||head.next==null){
            return true;
        }
        //step1 find mid
        Node midNode=findMid(head);
        //step2: reverse 2nd Half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;  //right half head
        Node left=head;

        //step3-check left half & right half
        while (right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public void print(){
        if (head==null){
            System.out.println("linkedList is emprt");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList2 ll=new LinkedList2();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.checkPallindrome());




    }
}
