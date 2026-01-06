class Node{
    int data;
    Node next;
    //constructor
    Node(int a){
        data=a;
        next=null;
    }
    
    //method get data
    public void getdata(){
        System.out.println(data);
    }
    public void getref(){
        System.out.println(next);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("ajay");
        Node b=new Node(100);
        b.getdata();
        Node c=new Node(44);
        c.getdata();
        Node d=new Node(100);
        d.getdata();
        Node e=new Node(100);
        e.getdata();
    
    }
}
