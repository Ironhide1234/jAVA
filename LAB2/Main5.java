public class Main5 {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 314, 334};
        int day = 121;
        System.out.println("Day: " + dm(day, month(day, arr), arr) + "\nMonth: " + month(day, arr));
    }

    public static int dm(int d, int m, int [] array){
    	return d-array[m-1];
    }
    
    public static int month(int d, int [] array){
        int res = 0;
        for(int i = array.length-1; array[i]-d > 0; i--){
        	if(array[i]-d < 31){
        		res = i;
        	}
        }
        return res;
    }

}
