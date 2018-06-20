import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月17日 上午8:59:00
* 类说明: 
*/
public class RandomizedSet {
	public int x;
	public Set<Integer> set;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		System.out.println(set.add(1));
		System.out.println(set.add(1));
		System.out.println(set.add(3));
		System.out.println(set.add(2));
		System.out.println(set.contains(2));
		System.out.println(set.remove(1));
		System.out.println(set.contains(1));
	}
	/** Initialize your data structure here. */
    public RandomizedSet() {
        this.set = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        return set.add(val);
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	return set.remove(val);
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Iterator<Integer> it = set.iterator();
        return it.next();
    }

}
