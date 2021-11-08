// Task10 
// сформировать массив b из    исходного одномерного массива a по следующему алгоритму:
// bi равняется количеству элементов со значением,
//равным ai , в массиве a. 


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < 5; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.print("Your array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i]); 
        }
        System.out.print("\n"); 
        gachi(arr2, arr1);
        System.out.println("Your new array: ");
        for(int i = 1; i<5; i++){
            System.out.println(arr2[i-1]);
        }
}

    public static void gachi(int [] newarr, int [] arr){
        for(int i = 1; i < 5; i++){
    	    int count = 0;
    	    for(int j = 1; j < 5; j++){
    		    if(arr[i] == arr[j]){
    			    count++;
    		    }
    	    }
    	    newarr[i-1] = count; 
        }
    }       
}