package AVL;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月7日 上午5:18:08
* 类说明:  Trie应用
*/
public class Trie {
    private int SIZE = 26;
    private TrieNode root;// 字典树的根

    // 字典树节点 
    class TrieNode {
        private int num;// 有多少单词通过这个节点,即由根至该节点组成的字符串模式出现的次数
        private TrieNode[] son;// 所有的儿子节点
        private boolean isEnd;// 是不是最后一个节点
        private char val;// 节点自身的值

        TrieNode() {
            num = 1;
            son = new TrieNode[SIZE];
            isEnd = false;
        }
    }
    
    // 初始化字典树
    Trie() {
        root = new TrieNode(); // 初始化的时候 ，就初始化该root了
    }
    

    // 建立字典树  
    
    // 在字典树中插入一个单词
    public void insert(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        
        TrieNode node = root;
        char[] letters = str.toCharArray();//将目标单词转换为字符数组
        for (int i = 0, len = str.length(); i < len; i++) {
            int pos = letters[i] - 'a';
            //如果当前节点的儿子节点中没有该字符，则构建一个TrieNode并复值该字符
            if (node.son[pos] == null) {
                node.son[pos] = new TrieNode();
                node.son[pos].val = letters[i];
            } 
        	//如果已经存在，则将由根至该儿子节点组成的字符串模式出现的次数+1
            else {
                node.son[pos].num++;
            }
            node = node.son[pos];
        }
        node.isEnd = true;
    }

    // 计算单词前缀的数量
    public int countPrefix(String prefix) {
        if(prefix == null || prefix.length() == 0) {
            return -1; //没有此前缀 返回 -1
        }
        TrieNode node = root;
        char[] letters = prefix.toCharArray();
        for(int i = 0,len = prefix.length(); i < len; i++)  {
            int pos = letters[i] - 'a';
            if(node.son[pos] == null)  {
                return 0;
            }
            else {
                node = node.son[pos];
            }
        }
        return node.num;
    }

    // 打印指定前缀的单词
    public String hasPrefix(String prefix) {
        if (prefix == null || prefix.length() == 0) {
            return null;
        }
        TrieNode node = root;
        char[] letters = prefix.toCharArray();
        for (int i = 0, len = prefix.length(); i < len; i++) {
            int pos = letters[i] - 'a';
            if (node.son[pos] == null) {
                return null;
            }
            else {
                node = node.son[pos];
            }
        }
        preTraverse(node, prefix);
        return null;
    }

    // 遍历经过此节点的单词.
    public void preTraverse(TrieNode node, String prefix) {
        if (!node.isEnd) {
            for (TrieNode child : node.son) {
                if (child != null) {
                    preTraverse(child, prefix + child.val);
                }
            }
            return;
        }
        System.out.println(prefix);
    }

    // 在字典树中查找一个完全匹配的单词.
    public boolean has(String str) {
    	
        if(str == null||str.length() == 0) {
            return false;
        }
        
        TrieNode node=root;
        
        char[] letters = str.toCharArray();
        for(int i = 0,len = str.length(); i < len; i++) {
            int pos = letters[i] - 'a';
            if(node.son[pos] != null) {
                node = node.son[pos];
            }
            else {
                return false;
            }
        }
        //走到这一步，表明可能完全匹配，可能部分匹配，如果最后一个字符节点为末端节点，则是完全匹配，否则是部分匹配
        return node.isEnd;
    }

    // 前序遍历字典树，全部遍历就OK了
    public void preTraverse(TrieNode node) {
        if(node != null) {
            System.out.print(node.val + "-");
            for(TrieNode child:node.son) {
                preTraverse(child);
            }
        }
    }

    public TrieNode getRoot() {
        return this.root;
    }

    public static void main(String[]args) {
        Trie tree = new Trie();
        String[]strs = {"banana", "band", "bee", "absolute", "acm",};
        String[]prefix = {"ba", "b", "band", "abc",};
        for(String str : strs) {
            tree.insert(str);
        }
        System.out.println(tree.has("abc")); // 构建的字典树不包含 "abc"前缀的树枝
        tree.preTraverse(tree.getRoot()); // 前序遍历字典树
        System.out.println();
        
        //tree.printAllWords();
        for(String pre : prefix) {
            int num = tree.countPrefix(pre);
            System.out.println(pre + "数量:" + num);
        }
    }
}
