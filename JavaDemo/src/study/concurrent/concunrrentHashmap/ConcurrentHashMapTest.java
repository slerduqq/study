package study.concurrent.concunrrentHashmap;

import java.util.concurrent.ConcurrentHashMap;

/*
 * hashmap的并发版
 * ConcurrentHashMap内部使用段(Segment)来表示这些不同的部分，
 * 每个段其实就是一个小的hash table，它们有自己的锁。
 * 只要多个修改操作发生在不同的段上，它们就可以并发进行。
 */
public class ConcurrentHashMapTest {
	
	private static ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		
		new Thread("thread1"){
			
			@Override
			public void run() {
				map.put(1,2);
			}
		};
		
		new Thread("thread2"){
			
			@Override
			public void run() {
				map.put(2,3);
			}
		};
		
		new Thread("thread3"){
			
			@Override
			public void run() {
				map.put(3,4);
			}
		};
		System.out.println(map);
	}
}
