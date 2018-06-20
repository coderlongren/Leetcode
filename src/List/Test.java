package List;

import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月14日 下午3:05:01
* 类说明: 
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(1);
		minStack.push(2);
		minStack.push(3);
		minStack.push(4);
		System.out.println(minStack.getMin());
		minStack.push(-6);
		System.out.println(minStack.getMin());
		System.out.println(minStack.top());
		minStack.pop();
		System.out.println(minStack.top());
//		List<? extends Number> flist = new ArrayList<Inetger>();
        // Compile Error: can't add any type of object:
        // flist.add(new Apple())
        // flist.add(new Orange())
        // flist.add(new Fruit())
//        // flist.add(new Object())
//        flist.add(null); // Legal but uninteresting
//        // We Know that it returns at least Fruit:
//        Fruit f = flist.get(0);
	}

}
