package com.coderlong.copyClass;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午2:36:06
* 类说明: 
*/
public class Body  implements Cloneable{
	Face face;
	Head head;
	public Body(){
		
	}
	public Body(Head head){
		this.head = head;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// 如果想进行深拷贝的话
		Body newbody = (Body)super.clone();
		newbody.head = (Head)head.clone();
		return newbody;
	}

	static class Head implements Cloneable{
		public Face face;
//		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			Head newhead = (Head)super.clone();
			newhead.face = (Face)face.clone();
			return newhead;
		}
		public Head(){
			
		}
		public Head(Face face){
			this.face = face;
		}
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Body body1 = new Body(new Head());
		Body body2 = (Body)body1.clone();
		System.out.println(body1 == body2);
		System.out.println(body1.head == body2.head);
		System.out.println(body1.head.face == body2.head.face);
	}
}
