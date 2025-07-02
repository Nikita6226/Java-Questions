//1. Reverse a sring
public class Q1_ReverseString { 
    public static void main(String[] args) { 
        String str = "Java"; 
        String reversed = new StringBuilder(str).reverse().toString(); 
        System.out.println(reversed); // Output: avaJ 
    } 
}
