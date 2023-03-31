import java.util.Arrays;

public class HashSet {
    final private int[] list;
    int size;
    public HashSet(){
        list = new int[1000001];
        Arrays.fill(list,-1);
        size = 0;
    }

    public void add(int val){
        list[val] = 1;
        size++;
    }

    public void remove(int val){
        list[val] = -1;
        size--;
    }

    public boolean contains(int val){
        return list[val] == 1;
    }
    public int Size(){
        return size;
    }

    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(5);
        set.add(8);
        set.add(11);
        set.add(21);
        set.add(35);
        set.add(98);
        System.out.println(set.Size());
        System.out.println(set.contains(9));
        System.out.println(set.contains(8));
        set.remove(8);
        System.out.println(set.contains(8));
        System.out.println(set.Size());
    }
}
