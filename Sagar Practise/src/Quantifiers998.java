import java.util.regex.Pattern;

public class Quantifiers998 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("? quantifiers");
		System.out.println(Pattern.matches("[amn]?", ".a"));
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		System.out.println(Pattern.matches("[amn]?", "aammmmnn"));
		System.out.println(Pattern.matches("[amn]?", "aazzta"));
		System.out.println(Pattern.matches("[amn]?", "am"));
		System.out.println("+quantifiers..");
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		System.out.println(Pattern.matches("[amn]?", "aazzta"));
		System.out.println("quantifier..");
		System.out.println(Pattern.matches("[amn]*", "ammmmna"));
	}

}
