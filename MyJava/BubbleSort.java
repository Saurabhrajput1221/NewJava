public class BubbleSort {
      class bubbleSort
  {
    void bubblesort (int[]arr)
    {

      int n = arr.length;

      for (int i = 0; i < n; i++)
	{
	  for (int j = 0; j < n - i - 1; j++)
	    {
	      if (arr[j] > arr[j + 1])
		swap (arr, j, j + 1);
	    }
	}

    }
  }
    public static void main(String[] args) {
        System.out.println("Bubble Sort.");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int[] arr = new int[n];
    }
}
