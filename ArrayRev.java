public class ArrayRev {
    public void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length - 1 - i] = array[i];

        }
        System.out.println("reversed array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(reversedArray[i]);

        }
    }

    public static void main(String[] args) {
        ArrayRev a = new ArrayRev();
        int[] array = { 5, 1, 3, 2, 6 };
        a.reverseArray(array);
    }

}
