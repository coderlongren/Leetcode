package contest56week;

public class leetcode717 {

	public static void main(String[] args) {
		int[] bits = {0,0,1,0,0};
		System.out.println(isOneBitCharacter(bits));

	}
	public static  boolean isOneBitCharacter(int[] bits) {
		
		for (int i= 0; i < bits.length; i++){
			if (i == bits.length - 1 && bits[i] == 0){
					return true;
			}
			int j = i + 1;
			if (bits[i] == 0){
				continue;
			}
			else  if ((bits[i] == 1 && bits[j] == 1) || (bits[i] == 1 && bits[j] == 0)){
				i++;
				continue;
			}
			
		}
		
        return false; 
    }

}
