import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr1 = new int[size];
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.print("Your array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < size; i++) {
            if (arr1[i] < 0) {
                arr2.add(arr1[i]);
            }
        }
        if (arr2.size() == arr1.length) {
            System.out.println("Array is fully negative");
        } else if (arr2.size() == 0) {
            System.out.println("Array is fully positive");
        } else {
            System.out.println("Array is pos. and neg.");
        }
        input.close();
    }
}