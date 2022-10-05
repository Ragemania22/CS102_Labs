
public class Lab05b {

	public static void main(String[] args) {
		public static mySort(int arraySize) {
			int arraySize = inputArray.length;
			for (int i = 0; i < arraySize - 1; i++) {
				int index = i;
				for (int j = i + 1; j < arraySize; j++) {
					if (inputArray[j] < inputArray[index]){
						index = j;
					}
				}
				int temp = inputArray[i];
				inputArray[i] = inputArray[index];
				inputArray[index] = temp;
			}

		}

	}

}
