

public class insertionSort{
/*public void basicInsertionSort(int arr[], int n)
{
    if (n <= 1)
    {
        return;
    }  */
	private int temp;
    public int[] basicInsertionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j= i+1; j < x.length; ++j) {
                if (x[i] > x[j]) {
                	temp = x[i];
                    x[i] = x[j];
                    x[j] = temp; // was: temp = x[j];
                }
            } // end of inner for loop
        } // end of outer for loop
        return x;
    }

    /*basicInsertionSort( arr, n-1 );  // sort the remaining array


    int last = arr[n-1];       //last element of the array
    int j = n-2;               //correct index of last element of the array

    while (j >= 1 && arr[j+1] > last) //find the correct index
    {
        arr[j+1] = arr[j];     //shift section of sorted elements upwards
        j--;
    }
    arr[j] = last;         //set the last element at its correct index  */
}
