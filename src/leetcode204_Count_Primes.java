
public class leetcode204_Count_Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] notPrime = new boolean[5];
		System.out.println(notPrime[3]);
		System.out.println(countPrimes(3));
	}	
	public static int countPrimes(int n) {
        if (n <= 1){
        	return 0;
        }
        // 艾氏  筛法 计算素数经典算法
        // 默认数组里面都是false 
        boolean[] isPrime = new boolean[n];
		isPrime[0] = true;
		isPrime[1] = true;
        // 如果i*i > n也就意味着 在i以后的没有划去的元素 都是素数
		for (int i = 2; i*i < n;i++){
			// 第一个 素数 画上去圈  并逐次划掉 这个素数的倍数
			if (!isPrime[i]){
				for (int j = 2;i*j < n; j++){
					// 划去此元素
					isPrime[j*i] = true;
				}
			}
		}
        int count = 0;
        for (boolean b : isPrime) {
        	if (!b){
        		count++;
        	}
		}
        return count;
    }

}
