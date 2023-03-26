public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(43);
        list.insert(88);
        list.insert(94);

        list.insertAt(1,100);

//        list.deleteAt(0);
        list.insertAtStart(222);
        list.insertAtStart(332);
        System.out.println(list.Size());
        list.show();
    }
}