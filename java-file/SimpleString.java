public class SimpleString {
    public static void main(String[] args) {
        String name = "Java Programming";
        
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Substring: " + name.substring(0, 4));
    }