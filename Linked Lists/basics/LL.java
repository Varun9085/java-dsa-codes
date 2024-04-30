public class LL {
    Node head;
    Node tail;
    int size;



 public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail=node;
            return;
        }
        tail.next= node;
        tail = node;
        size++;
    }
    public void insertFirst(int val){
     Node node = new Node(val);
     if(tail==null){
         head= node;
         tail=node;
     }
     node.next= head;
     head=node;
     size++;
    }
    public void insert(int index,int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);

        return;
    }
     Node node = new Node(val);
     Node temp = head;
     for(int i = 1; i<index; i++){
         temp = temp.next;

     }
     node.next=temp.next;
     temp.next=node;
     size++;
    }
    public int get(int index){
     if(index<0 || index>=size){
         return-1;
     }
     Node temp = head;
     for(int i =1; i<index; i++){
         temp = temp.next;
     }
     return temp.val;
    }
    public void insertLast(Node head, int val){
     Node node = new Node(val);
     Node temp = head;
     while(temp.next!=null){
         temp= temp.next;
     }
     temp.next=node;
    }
    public void deleteAt(int index){
     if(index==0){
         head= head.next;
         size--;
         return;
     }
     Node temp= head;
     for(int i =1; i<index; i++){
         temp = temp.next;
     }

     temp.next=temp.next.next;
        tail=temp;
     size--;
    }
    public  void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("End");
    }
    public static void displayRec(Node head){
        if(head==null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);
    }
    public static int len(Node head){
     Node temp = head;
     int count =0;
     while(temp!=null){
         count++;
         temp = temp.next;
     }
     return count;
    }


    public static class Node{
        int val;
        Node next;
//        int size;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next=next;
        }




    }

}
