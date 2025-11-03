import java.util.Arrays;

/*Необходимо реализовать метод таким образом, чтобы
он возвращал новый массив, который будет содержать все элементы массива arr,
однако в позицию pos будут вставлены значения массива ins.*/
public class Massiv_12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 3;
        int[] ins = {7, 8, 9};
        arr = add(arr, ins, pos);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] add(int[] arr, int[] ins, int pos) { // Убрать точку с запятой здесь
        int[] res = new int[arr.length + ins.length];
        for(int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        for(int i = 0; i < ins.length; i++) {
            res[pos + i] = ins[i];
        }
        for(int i = pos; i < arr.length; i++) {
            res[ins.length + i] = arr[i];
        }
        return res;
    }
}
