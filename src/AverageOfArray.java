import java.util.Arrays;

public class AverageOfArray {
    public static void main(String[] args) {
        int [] list = {0,1,2,3,4,5,6};
        double total=0;
        for (int i=0;i< list.length; i++){
            total+=i;
        }
        double averaga= total/list.length;
        System.out.print(averaga);
    }
}