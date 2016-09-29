package study.sort;

/*
 * 选择排序
 * 从下标0开始，与剩下的元素比对，将最小的放到排序的里面
 * 从下标1开始，与剩下的比对，依次类推
 */
public class SelectionSort {
	
	public void sort(int arrs[]){
		
	
		for(int i=0;i<arrs.length-1;i++){
			
			int min = i;
			
			for(int j=i;j<arrs.length;j++){
				
				if(arrs[j]<arrs[min]){
					
					min = j;
				}
			}
			arrs[i] = arrs[min];
		}
		
	}
	
}
