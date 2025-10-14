package unit2;
@FunctionalInterface
interface NumericTest{
    boolean test(int n);
}

public class prog3 {
    public static void main(String[] args) {
        NumericTest isEven=(n -> n%2==0);
        System.out.println(isEven.test(12));
    }
}
//custom interface