package threading.create_thread;

public class MyTaskApp {
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyTask());
        myThread.start();
    }
}
