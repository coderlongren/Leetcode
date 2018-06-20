package DataStruct;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月17日 下午11:32:42
* 类说明: 随机层数的额 跳跃表
*/

import java.util.Random;

class SkipList<T>{
	
	// 头尾指针
	private SkipListNode<T> head, tail;
	private int nodes; // 节点数
	private int listLevel; // 层数
	private static final double PROBABILITY=0.5;//向上提升一个的概率
	private Random random;
	public SkipList() {
		random = new Random();
		clear(); // 每一次创建一个新的跳跃表的时候，都要clear一下
	}
	
	// 清空跳跃表
	public void clear() {
		head = new SkipListNode<T>(SkipListNode.HEAD_KEY, null);
		tail = new SkipListNode<T>(SkipListNode.TAIL_KEY, null);
		
		listLevel = 0; // 层数为0
		nodes = 0; // 节点数为0
		horizontalLink(head, tail);
	}
	public boolean isEmpty() {
		return nodes == 0; // 节点数是否为0
	}
	public int size() {
		return nodes; // 返回节点总数
	}
	
	// 寻找节点
	private SkipListNode<T> findNode(int key) {
		SkipListNode<T> p = head; // 从头结点开始查找
		while (true) {
			while (p.right.key != SkipListNode.TAIL_KEY && p.right.key <= key) {
				p = p.right; // 往右 搜索
			}
			if (p.down != null) {
				p = p.down; // 往下一层 试探搜索
			}
			else {
				break;
			}
		}
		return p;
	}
	// 查找是否存储key, 存在返回该节点，否则返回null
	public SkipListNode<T> search(int key) {
		SkipListNode<T> p = findNode(key);
		
        if (key == p.getKey()) {
            return p;
        } else {
            return null;
        }
	}
	
	// 向跳跃表中增加 key-value对
	public void put(int k, T v) {
		// 先试探搜索，表中是否含有该key的节点, 有则直接替换v， 即可
		SkipListNode<T> p = findNode(k);
		if (k == p.getKey()) {
			p.value = v;
			return;
		}
		// 创建新节点插入到 跳跃表中
		SkipListNode<T> newNode = new SkipListNode<T>(k, v);
		backlink(p, newNode);
		int currentLevel=0; //当前所在的层级是0
		// 随机选择 插入的节点是否上升
		while (random.nextDouble() < PROBABILITY) {
			//如果超出了高度，需要重新建一个顶层
            if (currentLevel >= listLevel) {
            	
                listLevel++;
                SkipListNode<T> p1=new SkipListNode<T>(SkipListNode.HEAD_KEY, null);
                SkipListNode<T> p2=new SkipListNode<T>(SkipListNode.TAIL_KEY, null);
                horizontalLink(p1, p2);
                vertiacallLink(p1, head);
                vertiacallLink(p2, tail);
                
                head=p1;
                tail=p2;
            }
            //将p移动到上一层
            while (p.up==null) {
                p=p.left;
            }
            p=p.up;

            SkipListNode<T> e=new SkipListNode<T>(k, null);//只保存key就ok
            backlink(p, e);//将e插入到p的后面
            vertiacallLink(e, newNode);//将e和q上下连接
            newNode=e;
            currentLevel++;
		}
		nodes++;
		
	}
	
	// 水平双向连接两个节点
	private void horizontalLink(SkipListNode<T> a, SkipListNode<T> b) {
		a.right = b;
		b.left = a; 
	}
	// 我们要把after节点插入到before节点之后
	// 这不正是我们学过的双向链表的 节点插入方法吗？
	private void backlink(SkipListNode<T> before, SkipListNode<T> after) {
		after.left = before;
		after.right = before.right;
		before.right.left = after;
		before.right = after;
	}
	
	
	// 垂直连接两个节点
	private void vertiacallLink(SkipListNode<T> node1,SkipListNode<T> node2){
        node1.down=node2;
        node2.up=node1;
    }
	
	// 打印出 跳跃表
	@Override
	public String toString() {
		if (isEmpty()) {
            return "跳跃表为空！";
        }
        StringBuilder builder=new StringBuilder();
        SkipListNode<T> p=head;
        while (p.down!=null) {
            p=p.down;
        }

        while (p.left!=null) {
            p=p.left;
        }
        if (p.right!=null) {
            p=p.right;
        }
        while (p.right!=null) {
            builder.append(p);
            builder.append("\n");
            p=p.right;
        }

        return builder.toString();
	}
	
}
