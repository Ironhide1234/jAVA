public class Class4{
    public static void main(String[] args){
        int[] b  = {5, 3, 2, 6};
        int[] copy = new int[4];    
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]);
        }
        System.out.print("\n");
        for(int i = 0; i < 4; i++){
            if (i == 0){
                copy[i] = b[i+3];
            } else {
                copy[i] = b[i-1];
            }
        }
        int number = copy[0]*1000 + copy[1]*100 + copy[2]*10 + copy[3];
        System.out.printf("Now number is: %d\n", number);
        System.out.printf("Log is %.1f\n", Math.log(number));
    }
}