package study.sort;

/*
 * 插入排序
 每次将一个待排序的记录，按其关键字大小插入到前面已经排好序的子序列中的适当位置，直到全部记录插入完成为止。
 */
public class InsertionSort {
	
	public static void sort(int arrs[]){
		
		for(int i=1;i<arrs.length;i++){  //从第二个数开始
			
			if(arrs[i-1]>arrs[i]){    
				//如果这个数比之前的大  就把这个数存起来 把之前那个数后移一位  
				//然后再跟之前的数比较 慢慢推 找到他的位置  然后把这个数放在这个位置
				
				int temp = arrs[i];
				int j = i;
				while(j>0 && arrs[j-1]>temp){
					
					arrs[j] = arrs[j-1];
					j--;
				}
				arrs[j] = temp;
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		int arrs[] = {2,3,1,7,4,9,6};
		sort(arrs);
		for(int i=0;i<arrs.length;i++){
			System.out.print(arrs[i]+",");
		}
	}
}
