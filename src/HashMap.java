
import java.util.Arrays;

public class HashMap {
    int[] arr;
    int size;
    public HashMap(){
        arr = new int[1000001];
        Arrays.fill(arr,-1);
        size = 0;
    }

    public void add(int key, int val){
        arr[key] = val;
        size++;
    }
    public void remove(int key){
        arr[key] = -1;
        size--;
    }
    public int Size(){
        return size;
    }
    public boolean isContains(int key){
        return arr[key] != -1;
    }

    public static void main(String[] args) {
        HashMap mp = new HashMap();

        mp.add(8, 9);
        mp.add(4, 2);
        mp.add(7, 5);
        mp.add(6, 4);

        System.out.println(mp.Size());
        System.out.println(mp.isContains(8));
        mp.remove(8);
        System.out.println(mp.isContains(8));

    }
}
