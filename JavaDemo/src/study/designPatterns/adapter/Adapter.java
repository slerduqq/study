package study.designPatterns.adapter;


public class Adapter extends Source implements Target{

	public void method2() {
		System.out.println("this is target method");
	}
	
}
