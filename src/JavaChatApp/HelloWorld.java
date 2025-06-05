package JavaChatApp;

import java.util.Map;

public class HelloWorld {
    public static void main(String args[]) {
        
    }
    public void PL() {
        System.out.println("Hello World");
        Map<String, String> envDeets = System.getenv();
        System.out.println(envDeets);
        String envPath = System.getenv("PATH");
        System.out.println(envPath);
    }
} 
