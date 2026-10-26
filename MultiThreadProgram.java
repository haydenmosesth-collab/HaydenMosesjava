package multithreadprogram;

public class MultiThreadProgram {

    static boolean winnerDeclared = false;

    static synchronized void declareWinner(String name) {
        if (!winnerDeclared) {
            winnerDeclared = true;
            System.out.println(name + " Wins the Race!");
        }
    }

    static class Runner extends Thread {
        String runnerName;
        int delay;

        Runner(String name, int delay) {
            runnerName = name;
            this.delay = delay;
        }

        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(runnerName + " : " + i);
                    Thread.sleep(delay);
                }
                System.out.println(runnerName + " Finished!");
                declareWinner(runnerName);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args)
            throws InterruptedException {
        Runner a = new Runner("Runner A", 200);
        Runner b = new Runner("Runner B", 600);

        a.start();
        b.start();

        a.join();
        b.join();
    }
}