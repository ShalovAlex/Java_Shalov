import java.util.Arrays;

/*Необходимо реализовать метод таким образом, чтобы
он возвращал новый массив, в котором сначала идут элементы первого массива (arr1), а затем второго (arr2).*/
public class Massiv_8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = concat(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }
}
