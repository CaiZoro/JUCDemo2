public class VolatileTest {
    public static volatile int race = 0;

    public static void increace(){
        race++;
    }

    private static final int THREADS_COUNT = 10;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];

        for (int i = 0;i<THREADS_COUNT;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<10000;i++){
                        increace();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount()>1){
            Thread.yield();
        }
        System.out.println(race);
    }
}
