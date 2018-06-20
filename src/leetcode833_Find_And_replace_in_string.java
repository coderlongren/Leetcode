import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月13日 下午10:07:19
* 类说明: 
*/
public class leetcode833_Find_And_replace_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "mhnbzxkwzxtaanmhtoirxheyanoplbvjrovzudznmetkkxrdmr";
//		"mhnbzxkwzxtaanmhtoirxheyanoplbvjrovzudznmetkkxrdmr"
//		[46,29,2,44,31,26,42,9,38,23,36,12,16,7,33,18]
//		["rym","kv","nbzxu","vx","js","tp","tc","jta","zqm","ya","uz","avm","tz","wn","yv","ird"]
//		["gfhc","uq","dntkw","wql","s","dmp","jqi","fp","hs","aqz","ix","jag","n","l","y","zww"]
		int[] indexes = {46,29,2,44,31,26,42,9,38,23,36,12,16,7,33,18};
		String[] sources = {"rym","kv","nbzxu","vx","js","tp","tc","jta","zqm","ya","uz","avm","tz","wn","yv","ird"};
		String[] targets = {"gfhc","uq","dntkw","wql","s","dmp","jqi","fp","hs","aqz","ix","jag","n","l","y","zww"};
		System.out.println(findReplaceString(S, indexes, sources, targets));
	}
	public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        if (S == null || S.length() == 0) {
        	return S;
        }
        StringBuilder res = new StringBuilder();
        int j = 0;
        int i = 0;
        if (indexes == null || indexes.length == 0) {
        	res = new StringBuilder(S);
        	return S;
        }
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        
        for (int k = 0; k < indexes.length; k++) {
        	map1.put(indexes[k],sources[k]);
        	map2.put(indexes[k], targets[k]);
        }
        Arrays.sort(indexes);
        for (int k = 0; k < indexes.length; k++) {
        	sources[k] = map1.get(indexes[k]);
        	targets[k] = map2.get(indexes[k]);
        }
        
        
        while (i < S.length()) {
        	if (j < indexes.length && i == indexes[j] && S.startsWith(sources[j],i)) {
        		res.append(targets[j]);
        		i += sources[j].length();
        		j++;
        	}
        	else {
        		res.append(S.charAt(i));
        		i++;
        	}
        	
        }
		return res.toString();
    }

}
