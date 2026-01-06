// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next; 
    Node(int a){
        data = a;
        next=null;
    }
    //getData
    public void getData(){
        System.out.println(data);
    }
    public void getRef(){
        System.out.println(next);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("LOKESH");
        Node a=new Node(100);
        System.out.println(a);
        a.getData();
        Node b=new Node(50);
        System.out.println(b);
        b.getData();
        a.next=b;
        b.getRef();
    }
}
