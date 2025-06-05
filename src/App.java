import JavaChatApp.ChatClient;
import JavaChatApp.HelloWorld;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hi");
        HelloWorld X = new HelloWorld();
        X.PL();

        ChatClient x = new ChatClient("127.0.0.1", 5000);

    }
}

