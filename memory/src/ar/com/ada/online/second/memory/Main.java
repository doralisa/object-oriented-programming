package ar.com.ada.online.second.memory;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    
    public static void m1() {
        int a = 20;
        m2(a);
    }
    
    public static void m2(int b) {
        boolean c = true;
        m3();
    }

    public static String m3() {
        Account ref = new Account();
        return "hi!";
    }
}
