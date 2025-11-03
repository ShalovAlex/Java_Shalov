/*Необходимо реализовать метод таким образом, чтобы
он возвращал true, если массив arr является
палиндромом, то есть справа-налево и наоборот читается одинаково*/
public class Massiv_5 {
    public static void main(String[] args) {
        int [] arr1 = {1,-2,-7,4,2,2,5};
        int [] arr2 = {1,-2,-7,4,-7,-2,1};
        System.out.println(palindrom(arr1));
        System.out.println(palindrom(arr2));
    }
    public static boolean palindrom(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
