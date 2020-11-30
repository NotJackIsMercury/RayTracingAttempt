package certainpackage;

public class CurrentClass {
	int certainWidth = 1000;

	public int[] method(int[] certainArray) {
		//the array's size is width * height
		//referring to how buffered image work with array
		System.out.println(certainArray.length);

		//index to access a certain element in the array earlier
		int index;

		//the maximum "height" before hitting the array's bounds
		int maxHeight = certainArray.length / certainWidth;

		for (int i = 0; i < certainWidth; i++) {
			for (int j = 0; j < maxHeight; j++) {
				//access of index
				index = (i + j * certainWidth);

				//setting certain element of the array
				certainArray[index] = anotherMethod();
			}
		}

		//returning the array
		return certainArray;
	}

	public int anotherMethod() { return 0; }

	public static void main(String[] args) {
		int[] array = new int[307200];
		CurrentClass thisClass = new CurrentClass();

		thisClass.method(array);
	}
}