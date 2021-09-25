public class Class3{
    public static void main(String[] args){
        double a = 3;
        double degree = 60.00;
        double  rad = Math.toRadians(degree);
        double area = a * a * Math.sin(rad);
        System.out.print("Area is: " + area);
    }
}