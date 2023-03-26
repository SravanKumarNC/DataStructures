public class StackUsingLinkedList {

    private class Node{
        Node next;
        int data;

    }
    Node top;

    public StackUsingLinkedList(){
        this.top = null;
    }
     public void push(int data){
         Node temp = new Node();

         if(temp == null){
             return;
         }
         temp.data = data;
         temp.next = top;
         top = temp;
     }

     public boolean isEmpty(){
        return top == null;
     }

     public int peek(){
        if(!isEmpty()){
            return top.data;
        }else{
            return -1;
        }
     }

     public void pop(){
        if(isEmpty()){
            return;
        }else{
            top = top.next;
        }
     }

     public void display(){
        if(isEmpty()){
            return;
        }else{
            Node temp = top;
            while(temp.next != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
     }
}
