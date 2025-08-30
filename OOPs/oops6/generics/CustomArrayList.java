public class CustomArrayList{

    private int[] data;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        //Coping the current items in the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
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
        CustomArrayList list  = new CustomArrayList();
        list.add(45);
        list.add(73);
        list.add(35);
        System.out.println(list.size());
        list.add(21);
        list.add(15);
        list.add(13);
        list.add(81);
        list.add(99);
        list.add(91);
        list.add(63);
        list.add(65);
        System.out.println(list.size());



        System.out.println(list);
    }
    
}