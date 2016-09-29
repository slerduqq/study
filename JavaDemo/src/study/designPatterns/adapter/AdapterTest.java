package study.designPatterns.adapter;


public class AdapterTest {
	
	public static void main(String[] args) {
		
//		Adapter target = new Adapter();
//		target.method1();
//		target.method2();
	
		Source source = new Source();
		Target targe = new Wrapper(source);
		targe.method1();
		targe.method2();
	}
}
