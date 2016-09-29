package study.sort;


/*
 * 冒泡排序
 */
public class BubbleSort {
	
	/*
	 * 冒泡排序一
	 */
	public void sort(int[] arrs){
		
		for(int i=0;i<arrs.length;i++){
			for(int j=0;j<arrs.length-1-i;j++){
				if(arrs[j]>arrs[j+1]){
					int temp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = temp;
				}
			}
		}
	}
	
	/*
	 * 冒泡排序二
	 */
	public void sort2(int[] arrs){
		
		int i = arrs.length-1;
		
		while(i>0){
			
			int pos = 0;
			for(int j=0;j<i;j++){
				
				if(arrs[j]>arrs[j+1]){
					pos = j;
					int temp = arrs[j];
					arrs[j] = arrs[j+1];
					arrs[j+1] = temp;
				}
				
			}
			i = pos;
		}
		
	}
	
	public void sort3(int[] arrs){
		
		int low=0;
		int high = arrs.length-1;
		int temp;
		while(low<high){
			
			for(int i=low;i<high;i++){
				
				if(arrs[i]>arrs[i+1]){
					temp = arrs[i];
					arrs[i] = arrs[i+1];
					arrs[i+1] = temp;
				}
				
			}
			--high;
			
			for(int i=high;i>low;i--){
				
				if(arrs[i]<arrs[i-1]){
					temp = arrs[i];
					arrs[i] = arrs[i-1];
					arrs[i-1] = temp;
				}
			}
			++low;
			
		}
		
	}
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int[] arrs ={1,4,5,2,8,7,3};
		long time = System.currentTimeMillis();
		BubbleSort b = new BubbleSort();
		b.sort3(arrs);
		long time1 = System.currentTimeMillis()-time;
		for(int i=0;i<arrs.length;i++){
			System.out.print(arrs[i]+",");
		}
		System.out.println(time1);
		
		System.out.println("");
		int[] arrs2 ={1,4,5,2,8,7,3};
		SelectionSort s = new SelectionSort();
		s.sort(arrs2);
		long time2 = System.currentTimeMillis()-time;
		for(int i=0;i<arrs.length;i++){
			System.out.print(arrs[i]+",");
		}
		System.out.println(time2);
		
		System.out.println("");
		int[] arrs3 ={1,4,5,2,8,7,3};
		InsertionSort iv = new InsertionSort();
		iv.sort(arrs3);
		long time3 = System.currentTimeMillis()-time;
		for(int i=0;i<arrs.length;i++){
			System.out.print(arrs[i]+",");
		}
		System.out.println(time3);
	}
}
