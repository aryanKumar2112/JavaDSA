package DSA.LinkedList;

public class LinkedList1 {
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

    public static int size;
    public void addFirst(int data){
        //step1 create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2 newNode ka next =head
        newNode.next=head;//link

        //step3 head=newNode
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

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

    //searching
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    //recursive Search
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    //reverse linkedList
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);

        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.print();

        System.out.println(ll.size);

    }
}
