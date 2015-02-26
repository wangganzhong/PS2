package MainPackage;

public class CopyOfMyInteger {

    int value;
    
    CopyOfMyInteger(int newValue) { 			//constructor
        value = newValue;
    }

    public int getValue() {				//get method to return the int value
        return value;
    }

    public static boolean isEven(int n) {		//method for returning boolean value for isEven
        return (n % 2 == 0);
    }

    public static boolean isOdd(int n) {		//method for returning boolean value for isOdd
        return !isEven(n);
    }

    public static boolean isPrime(int n) {		// method for returning boolean value isPrime
        for (int f = 2; f < n / 2; f++) {
            if (n % f == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(CopyOfMyInteger n) {
        return n.isEven();
    }

    public static boolean isOdd(CopyOfMyInteger n) {
        return n.isOdd();
    }

    public static boolean isPrime(CopyOfMyInteger n) {
        return n.isPrime();
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean equals(int n) {
        return (value == n);
    }

    public boolean equals(CopyOfMyInteger n) {
        return equals(n.getValue());
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static int parseInt(char[] s) {
        return parseInt(new String(s));
    }
        

    //test
     public static void main(String[] args) {
            CopyOfMyInteger n1 = new CopyOfMyInteger(10);
            System.out.println("n1 is even? " + n1.isEven());
            System.out.println("n1 is prime? " + n1.isPrime());
            System.out.println("20 is prime? " + CopyOfMyInteger.isPrime(20));

            char[] chars = {'1', '9', '9', '3'};
            System.out.println(CopyOfMyInteger.parseInt(chars));

            String s = "1993";
            System.out.println(CopyOfMyInteger.parseInt(s));

            CopyOfMyInteger n2 = new CopyOfMyInteger(20);
            System.out.println("n2 is odd? " + n2.isOdd());
            System.out.println("10 is odd? " + CopyOfMyInteger.isOdd(66));
            System.out.println("n1 is equal to n2? " + n1.equals(n2));
            System.out.println("n1 is equal to 15? " + n1.equals(5));
        
    }
}
