public class Class4{
    public static void main(String[] args){
        int[] b = new int[6];
        for(int i = 1; i <= 4; i++){
            System.out.print(b[i] + i);
        }
        System.out.print("\n");
        for(int i = 4; i > 0; i--){
            b[i + 1] = b[i];
            System.out.print(b[i] + i);
        }
    }
}