import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.print("Your array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i]); 
        }
        System.out.print("\n"); 
        less(arr1);
        System.out.print("\n");
        more(arr1);
        System.out.print("\n");
        equal(arr1);
    }

    public static double avg(int [] array){
        float average = 0;
        for(int i = 0; i < array.length; i++){
            average +=array[i];
        }
        return average/array.length;
    }

    public static void less(int [] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < avg(array)){
                count++;
            }
        }
        System.out.print("Less than half: " + count*100/array.length + "%");
    }

    public static void more(int [] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > avg(array)){
                count++;
            }
        }
        System.out.print("More than half: " + count*100/array.length + "%");
    }
    
    public static void equal(int [] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == avg(array)){
                count++;
            }
        }
        System.out.print("Equal to half: " + count*100/array.length + "%");
    }
}