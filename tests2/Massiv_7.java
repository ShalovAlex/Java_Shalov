import java.util.Arrays;

/*Необходимо реализовать метод таким образом, чтобы
он возвращал новый массив, в котором значения массива arr записаны задом
наперед.*/
public class Massiv_7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = reverseBack(arr);
        System.out.println(Arrays.toString(reversed));
    }

    public static int[] reverseBack(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }
}
