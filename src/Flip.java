import java.lang.Math;

public class Flip{

	public static string flip(){
		int r = (int)(Math.random() * 3);
		if (r < 2){
			return "heads";
		}
		return "tails";
	}

}