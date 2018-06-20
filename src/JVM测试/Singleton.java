package JVM����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��16�� ����9:43:58
* ��˵��: 
*/
public class Singleton {
	private static class SingletonHolder {
		private static Singleton singleton = new Singleton();
		static {
			System.out.println("��̬�ڲ���ĳ�ʼ��");
		}
	}
	private Singleton() {
		if (SingletonHolder.singleton != null) {
			System.out.println("��̬�ڲ������ⲿ�����ʱ�ͳ�ʼ����");
		}
	}
	public static void main(String[] args) {
		Singleton singleton;
	}
}
