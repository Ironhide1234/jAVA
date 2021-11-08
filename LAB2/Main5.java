// Task25
// Определите номер дня в месяце и номер месяца году по заданному номеру дня в году
// (вводится как аргумент при вызове программы). Признак,  является ли год високосным,
// задается как булевская переменная.  Указание: количество дней до начала данного месяца (не високосный год): январь – 0, февраль – 31, март – 59, апрель – 90, май –120, июнь – 151, июль – 181, август – 212, сентябрь – 243, октябрь – 273, ноябрь – 314, декабрь – 334 задать в виде массива.  В високосном году, начиная с марта, к количеству дней добавляется 1. 


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
