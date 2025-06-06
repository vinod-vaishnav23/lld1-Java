public class Client {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            Thread t = new Thread(new Task(i));
            t.start();
        }
    }
}