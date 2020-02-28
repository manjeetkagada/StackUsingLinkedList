public class LinkedList {

    Node head;
    int top=-1;
    public void push(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if (head==null){
            head=node;
        }else {

            node.next=head;
            head=node;
            top++;



        }





    }
    public void pop(){
        if (head==null){
            System.out.println("stack empty ");
        }else {
            Node del=null;
            Node temp=head;
            del=temp;
            head=temp.next;
            del=null;
            top--;
        }

    }
    public void peek(){
        Node temp=head;
        System.out.println("Element at top "+temp.data);

    }
    public void show(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }

    }

}
