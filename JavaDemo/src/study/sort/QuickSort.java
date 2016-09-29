package study.sort;

/*
 * 快速排序
 * 哨兵i和j一个从左向右，一个从右像左
 * 找到一个比基准值大和小的则互换位置
 * 直到i=j  调换基准数和i的位置
 * 再类推
 */
public class QuickSort {
	
	//  2  4  5  1  7  9  6
	//           j
	//  1  4  5  2  7  9  6
	public void sort(int[] arrs,int left,int right){
		
		if(left>=right){
			return;
		}
		
		int t,temp;  //temp存基准值
		int i = left;
		int j = right;
		
		temp = arrs[left];
		while(i<j){
			
			while(i<j && arrs[j]>=temp){
				j--;
			}
			
			while(i<j && arrs[i]<=temp){
				i++;
			}
			
			if(i<j){
				
				t = arrs[i];
				arrs[i] = arrs[j];
				arrs[j] = t;
			}
		}
		
		//i=j了 将基准值的位置换一下
		arrs[left] = arrs[i];
		arrs[i] = temp;
		
		sort(arrs, left, i-1);
		
		sort(arrs, i+1, right);
	}
	
	public static void main(String[] args) {
		
		int arrs[] = {2,4,5,6,7,8,9};
		QuickSort q = new QuickSort();
		q.sort(arrs, 0, arrs.length-1);
		for(int i=0;i<arrs.length;i++){
			System.out.println(arrs[i]);
		}
	}
}
