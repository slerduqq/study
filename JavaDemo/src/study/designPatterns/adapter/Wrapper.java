package study.designPatterns.adapter;


public class Wrapper implements Target{

	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}
	Integer i = 0;
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is targe method");
	}
	
	
}
