/*Необходимо реализовать метод таким образом, чтобы
он возвращал количество положительных элементов массива arr.*/
public class Massiv_4 {
    public static void main(String[] args) {
        int [] arr= {1,-2,-7,4,2,2,5};
        System.out.println(countPositive(arr));
    }
    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count += 1;
            }
        }
        return count;
    }
}
