import java.util.Arrays;

/*Необходимо реализовать метод таким образом, чтобы
он возвращал новый массив, который будет содержать все элементы массива arr,
однако в позицию pos будет вставлено значение x.*/
public class Massiv_11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 3;
        arr = add(arr, 9, pos);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] add(int[] arr, int x, int pos) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        res[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            res[i + 1] = arr[i];
        }
        return res;
    }
}
