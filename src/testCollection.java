import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class testCollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
	}
	public static Collection fill(Collection<String> collection){
		//set不允许 有重复的元素  contains() TreeSet HashSet
		collection.add("dot");
		collection.add("cag");
		collection.add("rat");
		collection.add("rat");
		return collection;
	}

}
