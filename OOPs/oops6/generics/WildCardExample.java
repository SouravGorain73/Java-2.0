
import java.util.List;

//Here T should either be number or it's subclasses
public class WildCardExample<T extends Number>{

    private Object[] data;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<Number> list){
        //do something

        //here you can only pass Number type(not it's subclasses)
    }
    
    //WILD CARD IN JAVA
    public void getList2(List<? extends Number> list){
        //do something

        //here you can only pass Number type and it's subclasses
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        //Coping the current items in the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        WildCardExample<Integer> list  = new WildCardExample();
        list.add(76);
        list.add(12);
        list.add(73);



        System.out.println(list);
    }
    
}