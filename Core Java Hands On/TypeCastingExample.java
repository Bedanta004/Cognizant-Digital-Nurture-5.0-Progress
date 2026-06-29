public class TypeCastingExample {
    public static void main(String[] args) {

        double d = 45.89;
        int i = (int)d;

        int num = 100;
        double value = (double)num;

        System.out.println("Original Double : " + d);
        System.out.println("Double to Int : " + i);

        System.out.println("Original Int : " + num);
        System.out.println("Int to Double : " + value);
    }
}