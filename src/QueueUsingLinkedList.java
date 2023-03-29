public class QueueUsingLinkedList {
    private class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node front;
    Node back;
    int size;
    public QueueUsingLinkedList(){
        this.front = null;
    }
    public void push(int data){
        this.size = size + 1;
        Node temp = new Node(data);

        if(this.back == null){
            this.front = temp;
            this.back = temp;
            return;
        }
        this.back.next = temp;
        this.back = temp;
    }
    public int front(){
        if(this.front == null){
            return -1;
        }
        Node temp = this.front;
//        this.front = this.front.next;
        if(this.front == null){
            this.back = null;
        }
        return temp.data;
    }
    public void pop(){
        if(this.front == null){
            return;
        }
        Node temp = front;
        front = front.next;
        this.size = size - 1;
        if(this.front == null){
            this.back = null;
        }
    }
    public void show(){
        if(front == null){
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

    }
    public int Size(){
        return size;
    }
    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.push(29);
        q.push(89);
        q.push(12);
        q.push(18);
        q.push(9);

        System.out.println(q.front());
        q.show();
        q.push(10);
        System.out.println();
        q.show();
        System.out.println( q.Size());
        q.pop();
        System.out.println();
        System.out.println( q.Size());

        q.show();

    }
}


