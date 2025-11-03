import java.util.Arrays;

/*Необходимо реализовать метод таким образом, чтобы
он возвращал новый массив, в котором записаны индексы всех вхождений числа x в массив arr.*/
public class Massiv_9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 2, 2, 9};
        System.out.println(Arrays.toString(findAll(arr, 2)));
    }
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] indices = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index] = i;
                index++;
            }
        }
        return indices;
    }
}