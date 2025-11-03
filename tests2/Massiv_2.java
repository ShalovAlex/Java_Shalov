/*Необходимо реализовать метод таким образом, чтобы
он возвращал индекс последнего вхождения числа x в
массив arr. Если число не входит в массив – возвращается -1.*/
public class Massiv_2 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,2,2,5};
        System.out.println(findLast(arr, 2));
    }
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0;  i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
