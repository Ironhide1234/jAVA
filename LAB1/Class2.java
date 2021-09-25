public class Class2{
    public static void main(String[] args){
        double a = 1; 
        double b = 4;  
        double c = 4;
        double D;
        double x1, x2, x3;
        D = b * b - 4 * a * c;
        if(D > 0){
            x1 =(-b - Math.sqrt(D))/(2 * a);
            x2 =(-b + Math.sqrt(D))/(2 * a);
            System.out.print(x1 + "\n" + x2);
        }
        else{
            if(D == 0){
                x3 = (-b)/(2 * a);
                System.out.print(x3);
            }
            else{
                System.out.print("No solutions");
            }
        }
        
    }
}