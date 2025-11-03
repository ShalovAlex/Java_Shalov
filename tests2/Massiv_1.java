/*Необходимо реализовать метод таким образом, чтобы
он возвращал индекс первого вхождения числа x в
массив arr. Если число не входит в массив – возвращается -1.*/
public class Massiv_1 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,2,2,5};
        System.out.println(findFirst(arr, 2));
    }
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
