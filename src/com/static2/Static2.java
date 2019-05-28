package com.static2;
/*
 * 类方法属于整个类，被调用时可能还没有创建任何对象实例，
 * 因此类方法内只可以访问类变量，而不能直接访问实例变量和实例方法
 */
public class Static2 {

	public static void main(String[] args) {
		System.out.println(TestFunction.addUp(10, 5)); //正确，类方法可被类直接调用
		//System.out.println(TestFunction.sub()); //错误，实例方法不能被类直接调用
		TestFunction test = new TestFunction();
		System.out.println(test.sub()); //通过对象引用
	}

}
