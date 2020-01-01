import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("\\d*", "123465002"));
		System.out.println(Pattern.matches("[7-9]{1}\\d{9}", "7834567895"));

	}

}
