package Fall_2015.package2;

class t2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i + 1; k++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}	}
}