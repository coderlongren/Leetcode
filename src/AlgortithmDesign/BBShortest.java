package AlgortithmDesign;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��17�� ����1:44:33
* ��˵��: 
*/
import java.util.Comparator;
import java.util.PriorityQueue;
public class BBShortest {
	static int[][] a;
	public static void shortest(int v, int[] dist, int[] p){
		int n = p.length - 1;
		PriorityQueue<HeapNode> heap = new PriorityQueue<>();//����һ�����ȶ��д�Žڵ�
		HeapNode enode = new HeapNode(v,0);
		for (int j = 1; j <= n; j++) {
			dist[j] = Integer.MAX_VALUE;//Ĭ��ÿ���ڵ��ʼ��Ϊ�����
		}
		dist[v] = 0;
		while(true){
			for(int j=1; j <= n; j++){
				if(a[enode.i][j] < Integer.MAX_VALUE && enode.length+a[enode.i][j]<dist[j]){
					//Լ������������ͨ���Ҵ������Ž�
					dist[j] = enode.length + a[enode.i][j];//����·��
					p[j] = enode.i;//�ѱ��д��
					HeapNode node = new HeapNode(j, dist[j]);
					heap.add(node);
				}
			}
			if(heap.isEmpty()) break;
			else enode = heap.poll();
		}
	}
	 
	public static void main(String[] args) {
		int M = Integer.MAX_VALUE;
		a = new int[][]{
				{M,M,M,M,M,M},
				{M,0,10,M,30,100},
				{M,M,0,50,M,M},
				{M,M,M,0,M,10},
				{M,M,M,20,0,60},
				{M,M,M,M,M,0},
		};
		int v = 1;
		int dist[] = new int[a.length];
		int p[] = new int[a.length];
		shortest(v, dist, p);
		for (int i = 1; i < dist.length; i++) {
			System.out.print(dist[i] + " ");
		}
	}
	static class HeapNode implements Comparable{
		int i; //������
		int length;
		HeapNode(int ii, int ll){//���캯��
			i = ii;
			length = ll;
		}
		public int compareTo(Object o){
			int x = ((HeapNode)o).length;
			if(length < x) return -1;
			if(length == x) return 0;
			return 1;
		}	 
	}
}
