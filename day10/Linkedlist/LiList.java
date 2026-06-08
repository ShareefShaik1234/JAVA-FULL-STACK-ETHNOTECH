package day10.Linkedlist;

public class LiList {


    private Node head;
    private Node tail;
    private int size;

    //Insert at first
    void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;


        if(tail == null)
        {
            tail=head;
        }
        size++;
    }
    //Insert last
    void addLast(int value){

        if(tail == null)
        {
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
        size++;
    }

    //Insert anywhere
    void insert(int index,int value){
        if(index==0){
            addFirst(value);
            return;
        }
        if(index==size){
            addLast(value);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node newNode = new Node(value,temp.next);
        temp.next = newNode;
        size++;
    }
    //Delete first
    int deleteFirst(){
        if(size==0)
        {
            tail=head;
            return -1;
        }
        int val=head.value;
        head=head.next;
        size--;
        return val;
    }
    int deleteLast(){

        if(size<=1)
        {
             return deleteFirst();
        }
        int val=tail.value;
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    int delete(int index){
        if(index==0)
        {
            return deleteFirst();
        }
        if(index==size-1)
        {
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }

    Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }


    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }


    private class Node
    {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }

   public static void main(String[] args) {
        LiList list = new LiList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.display();

       System.out.println("-------------------------------------");
        list.addLast(6);
        list.display();

       System.out.println("----------------------------------------");
        list.insert(2,8);
        list.display();

       System.out.println("------------------------------------------");
      //  list.deleteFirst();
       System.out.println(list.deleteFirst());
        list.display();

        System.out.println("--------------------------------------");
       // list.deleteLast();
       System.out.println(list.deleteLast());
        list.display();

       System.out.println("---------------------------------------");
       //list.delete(2);
       System.out.println(list.delete(2));
        list.display();


    }
}
