package com.coderlong.copyClass;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��1�� ����2:36:06
* ��˵��: 
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
		// ������������Ļ�
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
