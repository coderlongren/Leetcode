package test;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月16日 下午2:35:17
* 类说明: 
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
    	System.out.println("外部类 test");
    }
     
    class Draw {     //内部类
        public void drawSahpe() {
            System.out.println("drawshape");
        }
        public void test() {
        	System.out.println("内部类 test");
        }
    }
    public static void main(String[] args) {
    	// 第一种 构造方法
    	Circle circle = new Circle(1);
		Circle.Draw draw = circle.new Draw();
		Circle.Draw draw2 = circle.getIntance();
		circle.test();
		draw.drawSahpe();
		draw.test();
		
	}
}
