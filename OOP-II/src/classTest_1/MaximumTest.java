package classTest_1;

public class MaximumTest {

    public MaximumTest() {
        System.out.println("This is MaximumTest.......");
        System.out.printf("The maximum of %d, %d & %d  is  %d \n", 5, 9, 4, maximum(5,9,4));
        System.out.printf("The maximum of %f, %f & %f  is  %f \n", 45.3901, 7.065, 81.02, maximum(45.3901,7.065,81.02));
        System.out.printf("The maximum of %s, %s & %s  is  %s", "apple", "pear", "orange", maximum("pear", "apple", "orange"));
    }

    public static <T extends Comparable <T> > T maximum (T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        return max;
    }
}
