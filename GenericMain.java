package javacycletest2;

import java.util.Scanner;

//Generic Class
class GenericBox<T> {
    private T value;//Variable is only belongs to thus class

    GenericBox(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String text = sc.next();

        GenericBox<Integer> intBox = new GenericBox<>(number);
        GenericBox<String> stringBox = new GenericBox<>(text);

        System.out.println(intBox.getValue());
        System.out.println(stringBox.getValue());

        sc.close();
    }
}

