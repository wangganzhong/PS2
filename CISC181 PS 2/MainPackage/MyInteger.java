package MainPackage;

public class MyInteger {
    
    int value;
    
    public MyInteger(int newValue) { 			//a constructor that creates a MyInteger object for the specified int value
        value = newValue;
    }

    
    public int getValue() {				//a get method that returns the int value
        return value;
    }

    
    public boolean isEven() {   				//method isEven
    	if (value % 2 == 0){
            return true;
        }
        return false;
    }

    public boolean isOdd() {					//method isOdd
    	 if (value % 2 == 0){
             return false;
         }
         return true;
     }

    public boolean isPrime() {					//method isPrime
    	for (int divisor =2; divisor<=value/2; divisor++){
            if (value % divisor == 0){
                 return false;
            }
        }
        return true;
    
    }
    
    public static boolean isEven(int newValue) {		//static method isEven(int)
        if(newValue % 2 == 0){
        	return true;
        	
        }
    	return false;
    }

    public static boolean isOdd(int newValue) {		//static method isOdd(int)
        if(newValue % 2 != 0){
        	return true;
        	
        }
    	return false;
    }

    public static boolean isPrime(int newValue) {		//static method isPrime(int)
        for (int d = 2; d < newValue / 2; d++) {
            if (newValue % d == 0) {
                return false;
                
            }
        }
        return true;
    }
    
    
    
    public static boolean isEven(MyInteger value) {			//static method isEven(MyInteger)
        return value.isEven();
    }

    public static boolean isOdd(MyInteger value) {			//static method isOdd(MyInteger)
        return value.isOdd();
    }

    public static boolean isPrime(MyInteger value) {		//static method isPrime(MyInteger)
        return value.isPrime();
    }

    
    
    
    
    
    public boolean equals(int n) {			//method equals(int)
        return (value == n);
    }

    public boolean equals(MyInteger n) {		//method equals(MyInterger)
        return equals(n.getValue());
    }

    
    
    
    public static int parseInt(char[] nc) {    // a static method parseIn(char[]) that converts an array of numeric characters to an int value
        return parseInt(new String(nc));
    }
       
    public static int parseInt(String string) {		// a static method parseIn(String) that converts a string into an int value
        return Integer.parseInt(string);
    }
   
    
    public static void main(String[] args) {	
    	 	MyInteger int1 = new MyInteger(17);
            System.out.println("Is int1 even? " + int1.isEven());
            System.out.println("Is int1 odd? " + int1.isOdd());
            System.out.println("Is int prime? " + int1.isPrime());

            MyInteger n2 = new MyInteger(20);
            System.out.println("n2 is odd? " + n2.isOdd());
            System.out.println("10 is odd? " + MyInteger.isOdd(10));
            System.out.println("Is int1 equal to n2? " + int1.equals(n2));
            System.out.println("Is int1 equal to 15? " + int1.equals(20));
            
            char[] nc = {'1', '9', '9', '3'};   // numeric character
            System.out.println(MyInteger.parseInt(nc));

            String string = "1020";
            System.out.println(MyInteger.parseInt(string));
    }   
}
