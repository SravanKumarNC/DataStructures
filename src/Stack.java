public class Stack
{
    int top;
    int maxSize;
    int stack[];

    public Stack(){
        stack = new int[10];
        top = -1;
    }

    public Stack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
        top = -1;
    }

    boolean isEmpty(){
        return top < 0;
    }


    public boolean push(int data){
        if(top == maxSize -1){
            System.out.println("OverFlow");
        }else{
            top++;
            stack[top] = data;
            return true;
        }
        return false;
    }

    public boolean pop(){
        if(top == -1){
            return false;
        }else{
            top--;
            return true;
        }
    }

    public void display(){
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}
