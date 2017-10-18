
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appleNbr = "100001";
		System.out.println(String.format("%1$0"+(15-appleNbr.length())+"d",0)+appleNbr);
		System.out.println(Double.valueOf(appleNbr));
		System.out.println(Double.parseDouble(appleNbr));
	}

}
