import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.print("Your first array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i]); 
        }
        System.out.print("\n"); 
        System.out.print("Enter numbers: ");
        for (int i = 0; i < 5; i++) {
            arr2[i] = input.nextInt();
        }
        System.out.println("Your 2nd array: ");
        for(int i = 0; i < 5; i++){
            System.out.print(arr2[i]);
        }
        System.out.print("\n");
        System.out.print("Similar objects: \n");
        similar(arr1,arr2);
    }  
    
    public static void similar(int[] array1, int[] array2){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j< 5; j++){
                if(array1[i] == array2[j]){
                    System.out.print(array1[i]);
                }
            }
        }
    }  
}