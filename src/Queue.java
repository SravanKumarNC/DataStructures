public class Queue
{
    int size;
    int max;
    int queue[];

    int enqueueEnd;
    int dequeueEnd;

    public Queue(int max){
        this.max = max;
        queue = new int[max];
    }

    public Queue(){
        queue = new int[10];
    }

    public void enqueue(int data)
    {
        queue[enqueueEnd]  = data;
        enqueueEnd++;
        size++;
    }
    public int dequeue(){
        int pop = queue[dequeueEnd];
        dequeueEnd++;
        size--;
        return pop;
    }
    public int size(){
        return  size;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    public void show(){
        for(int i = dequeueEnd; i < enqueueEnd; i++){
            System.out.print(queue[i] + "->");
        }
    }
}
