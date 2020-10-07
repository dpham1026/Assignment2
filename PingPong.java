import java.util.concurrent.Semaphore;


public class PingPong {


    private final static Semaphore mutexPing = new Semaphore(1);
    private final static Semaphore mutexPong = new Semaphore(0);
    private final static int count = 3;


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ready… Set… Go!");
        ChattyThread ping = new ChattyThread("Ping!", count, mutexPing, mutexPong);
        ChattyThread pong = new ChattyThread("Pong!", count, mutexPong, mutexPing);
        ping.start();
        pong.start();
        ping.join();
        pong.join();
        System.out.println("Done!");
    }


    static class ChattyThread extends Thread {


        private String saying;
        private Semaphore mine;
        private Semaphore other;
        int count;


        public ChattyThread(String saying, int count, Semaphore mine, Semaphore other) {
            this.saying = saying;
            this.count = count;
            this.mine = mine;
            this.other = other;
        }


        public void run() {
            while (count > 0) {
                mine.acquireUninterruptibly();
                System.out.println(saying);
                other.release();
                count--;
            }
        }
    }
}