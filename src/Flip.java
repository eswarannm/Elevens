public class Flip{

	public static void main(String[] args){
		System.out.println(arePermutations(new int[]{1, 2, 3, 4}, new int[]{1, 3, 2, 4}));
		System.out.println(arePermutations(new int[]{1, 4, 3, 2}, new int[]{1, 3, 6, 5}));

	}


	public static String flip(){
		int r = (int)(Math.random() * 3);
		if (r < 2){
			return "heads";
		}
		return "tails";
	}

	public static boolean arePermutations(int[] a, int[] b){
		int k = 0;

		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < b.length; j++){
				if (a[i] == b[j]){
					k++;
				}
			}
		}

		if (k == a.length){
			return true;
		}
		return false;

	}

}