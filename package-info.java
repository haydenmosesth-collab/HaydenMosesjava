package genericswap;

class GenericSwap {

    static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        Integer[] values = {10, 20};

        System.out.println("Before Swap: "
                + values[0] + " " + values[1]);

        swap(values, 0, 1);

        System.out.println("After Swap: "
                + values[0] + " " + values[1]);
    }
}