import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月12日 下午10:41:06
* 类说明: 
*/
public class leetcode599_Mininum_index_of_two_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"KFC", "Shogun", "Burger King"};
		System.out.println(findRestaurant(list1, list2));
	}
	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++){
        	if (!map1.keySet().contains(list1[i])){
        		map1.put(list1[i], i);
        	}
        }
        
        List<String> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < list2.length; i++){
        	if (!map2.keySet().contains(list2[i])){
        		map2.put(list2[i], i);
        	}
        }
        for (String string : map1.keySet()){
        	if (map2.keySet().contains(string)){
        		list.add(string);
        	}
        }
        int min = map1.get(list.get(0)) + map2.get(list.get(0));
        String res = "";
        for (String string : list){
        	if (map1.get(string) + map2.get(string) < min){
        		min = map1.get(string) + map2.get(string);
        		res = string;
        	}
        }
        for (String string : list){
        	if (map1.get(string) + map2.get(string) == min){
        		temp.add(string);
        	}
        }
        
        String[] result = (String[])temp.toArray(new String[0]);
        return result;
        
        
    }

}
