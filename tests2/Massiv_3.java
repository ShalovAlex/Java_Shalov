/*Необходимо реализовать метод таким образом, чтобы
он возвращал наибольшее по модулю (то есть без учета знака) значение массива arr.*/
public class Massiv_3 {
    public static void main(String[] args) {
        int [] arr= {1,-2,-7,4,2,2,5};
        System.out.println(maxAbs(arr));
    }
    public static int maxAbs(int[] arr) {
        int max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(arr[max])) {
                max = i;
            }
        }
        return arr[max];
    }
}
