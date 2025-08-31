
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions{
    public static void main(String[] args) {
        //Lambda Function
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            list.add(i + 1);
        }

        // list.forEach((item) -> {
        //     System.out.println(item * 2);
        // });

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        list.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation product = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;

        LambdaFunctions myCal = new LambdaFunctions();
        System.out.println(myCal.operate(7, 3, sum));
        System.out.println(myCal.operate(7, 3, sub));
        System.out.println(myCal.operate(7, 3, product));
        System.out.println(myCal.operate(7, 3, division));

    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation{
    int operation(int a, int b);
}