package com.static2;
/*
 * �෽�����������࣬������ʱ���ܻ�û�д����κζ���ʵ����
 * ����෽����ֻ���Է����������������ֱ�ӷ���ʵ��������ʵ������
 */
public class Static2 {

	public static void main(String[] args) {
		System.out.println(TestFunction.addUp(10, 5)); //��ȷ���෽���ɱ���ֱ�ӵ���
		//System.out.println(TestFunction.sub()); //����ʵ���������ܱ���ֱ�ӵ���
		TestFunction test = new TestFunction();
		System.out.println(test.sub()); //ͨ����������
	}

}
