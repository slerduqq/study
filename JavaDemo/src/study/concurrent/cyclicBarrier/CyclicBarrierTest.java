package study.concurrent.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/*
 * 并发之栅栏类
 * n个线程等待着一起完成
 * 然后执行下一步操作
 */
public class CyclicBarrierTest implements Runnable{
	
	private int id;
    private CyclicBarrier barrier;

    public CyclicBarrierTest(int id, final CyclicBarrier barrier) {
        this.id = id;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(id + " th people wait");
            barrier.await(); // 大家等待最后一个线程到达
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
	public static void main(String[] args) {
		
		int num = 10;
		
		CyclicBarrier cyclic = new CyclicBarrier(num, new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("together");
			}
		});
		
		 for (int i = 1; i <= num; i++) {
	            new Thread(new CyclicBarrierTest(i, cyclic)).start();
        }
	}
}
