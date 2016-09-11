package Fall_2015.package2;

class SortArray {
	public static void main(String[] args) {
		int[] array = {75,23,83,15,8,82};
		
		for (int i = 0; i < array.length-1; i++) {
			
			if (array[i] > array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				i = -1;
			}
			
		}
		
		
		for (int current : array) {
			System.out.println(current);
		}
	}
	
}