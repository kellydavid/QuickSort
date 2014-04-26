
public class QuickSortApp {
	public static void main(String args[]){
		String arr[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",
				"Uranus", "Neptune", "Pluto"};
		QuickSort<String> qSort = new QuickSort<String>(arr);
		qSort.testPartition();
	}
}
