package com.static2;

class TestFunction {
	//系统默认提供无参构造方法，且所有的构造方法都无返回值类型
	int x = 10, y = 6;
	static int z = 9;
	public static int addUp(int a, int b) {	//被声明为类方法
		return a + b + z;	//类方法中能使用类变量
	}
	
	public int sub() {
		return x - y;
	}
	
	/*public static int addUp() {		//被声明为类方法
		return x+y;	//错误；类方法中不能使用实例变量
	}*/

}
