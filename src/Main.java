public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insert(3);
//        list.insert(43);
//        list.insert(88);
//        list.insert(94);
//
//        list.insertAt(1,100);
//
////        list.deleteAt(0);
//        list.insertAtStart(222);
//        list.insertAtStart(332);
//        System.out.println(list.Size());
//        list.show();

//        Stack st = new Stack(10);
//        st.push(10);
//        st.push(8);
//        st.push(18);
//        st.push(82);
//        st.push(22);
//        st.push(33);
//        System.out.println(st.isEmpty());
////        st.pop();
//        System.out.println(st.isEmpty());
//        st.pop();
//        st.pop();
//        st.pop();
//        st.push(8);
//        st.display();

//        StackUsingLinkedList st = new StackUsingLinkedList();
//
//        st.push(85);
//        st.push(55);
//        st.push(45);
//        st.push(54);
//        st.push(112);
//        st.display();
//        st.pop();
//        st.display();
//        System.out.println(st.peek());
//        st.pop();
//        st.display();
//        System.out.println(st.peek());

        Queue q = new Queue(10);

        q.enqueue(13);
        q.enqueue(4);
        q.enqueue(22);
        q.enqueue(31);
        q.enqueue(58);

        q.show();
        q.dequeue();
        System.out.println(" ");
        q.show();
        System.out.println(" ");
        q.pop();
        q.show();






    }
}