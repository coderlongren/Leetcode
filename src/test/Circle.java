package test;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��16�� ����2:35:17
* ��˵��: 
*/
public class Circle {
	double radius = 0;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    public Draw getIntance() {
    	return new Draw();
    }
    public void test() {
    	System.out.println("�ⲿ�� test");
    }
     
    class Draw {     //�ڲ���
        public void drawSahpe() {
            System.out.println("drawshape");
        }
        public void test() {
        	System.out.println("�ڲ��� test");
        }
    }
    public static void main(String[] args) {
    	// ��һ�� ���췽��
    	Circle circle = new Circle(1);
		Circle.Draw draw = circle.new Draw();
		Circle.Draw draw2 = circle.getIntance();
		circle.test();
		draw.drawSahpe();
		draw.test();
		
	}
}
