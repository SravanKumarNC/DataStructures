//LinkedList with extra features;
//different methods are
// insert
//show
//insertAt
//deleteAt
//insertAtStart
//size;



public class LinkedList
{
    Node head;
    private int size = 0;

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        if(head == null)
        {
            head = node;
            size++;
        }else
        {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }
    }
    public void show()
    {
        Node temp = head;

        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data );
    }
    public void insertAt(int index, int data)
    {
        if(index > size)
            return;

        if(index == size){
            insert(data);
            size++;
        }else{
            size++;
            Node toBeInserted = new Node(data);
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            toBeInserted.next = temp.next;
            temp.next = toBeInserted;
        }
    }
    public void deleteAt(int index)
    {
        if(index > size){
            return;
        }
        if(index == 0){
            Node temp1 = head.next;
            head = temp1;
            size--;
        }else{
            size--;
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            Node nextTemp = temp.next.next;
            temp.next = nextTemp;
        }
//        if(index == size){
//            Node temp = head;
//            while(temp.next.next != null){
//                temp = temp.next;
//            }
//            temp.next = null;
//        }
//        else{
//            Node temp = head;
//            for(int i = 0; i < index - 1; i++){
//                temp = temp.next;
//            }
//            Node nextTemp = temp.next.next;
//            temp.next = nextTemp;
//        }
    }
    public void insertAtStart(int data)
    {
        Node newNode = new Node(data);
        Node temp = head;
        newNode.next = temp;
        head = newNode;
        size++;

    }
    public int Size(){
        return size;
    }
}
