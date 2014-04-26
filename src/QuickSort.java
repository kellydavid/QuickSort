
public class QuickSort<T> {

	private String array[];
	private int currentLeftPointer;
	private int currentRightPointer;

	public QuickSort(T array[]){
		this.array = new String[array.length];
		for(int i = 0; i < array.length; i++){
			this.array[i] = array[i].toString();
		}
		currentLeftPointer = 0;
		currentRightPointer = 0;
	}

	public void testPartition(){
		printStringArray();
		partition(0, 8, "Jupiter");
	}
	
	public void qSort(int leftIndex, int rightIndex){
		
	}

	private void partition(int leftIndex, int rightIndex, String pivot){
		
		while(leftIndex < rightIndex){
			//left scan
			while(lessThan(array[leftIndex], pivot)){
				leftIndex++;
			}
			//right scan
			while(lessThan(pivot, array[rightIndex])){
				rightIndex--;
			}
			if(leftIndex < rightIndex){
				exchange(leftIndex, rightIndex);
			}
			printStringArray();
		}
	}

	private void exchange(int leftIndex, int rightIndex){
		String temp = "" + array[leftIndex];
		array[leftIndex] = ("" + array[rightIndex]);
		array[rightIndex] = ("" + temp);
		System.out.println("Exchanged " + array[leftIndex] + " and " + array[rightIndex]);
	}
	
	private boolean lessThan(String a, String b){
		return a.compareTo(b) < 0;
	}
	
	public void printStringArray(){
		String result = "";
		for(int i = 0; i < array.length; i++){
			result += (array[i] + (i == (array.length - 1) ? "":", "));
		}
		System.out.println(result);
	}
}
