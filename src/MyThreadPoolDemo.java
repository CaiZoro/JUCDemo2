import java.util.concurrent.*;

public class MyThreadPoolDemo {
	public static void main(String[] args) {
//		ExecutorService threadPool = new ThreadPoolExecutor(2, 5, 1L, TimeUnit.SECONDS, 
//				new LinkedBlockingDeque<>(3),
//				Executors.defaultThreadFactory(),
//				new ThreadPoolExecutor.AbortPolicy());
		
//		ExecutorService threadPool = new ThreadPoolExecutor(2, 5, 1L, TimeUnit.SECONDS, 
//				new LinkedBlockingDeque<>(3),
//				Executors.defaultThreadFactory(),
//				new ThreadPoolExecutor.CallerRunsPolicy());

		ExecutorService threadPool = new ThreadPoolExecutor(2, 5, 1L, TimeUnit.SECONDS, 
				new LinkedBlockingDeque<>(3),
				Executors.defaultThreadFactory(),
				new ThreadPoolExecutor.DiscardOldestPolicy());
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		try {
			for (int i = 1; i <= 10; i++) {
				threadPool.execute(() ->{
					System.out.println(Thread.currentThread().getName()+"\t"+"正在处理业务");
				});
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			threadPool.shutdown();
		}
	}
}
