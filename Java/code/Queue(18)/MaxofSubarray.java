// Java Program to find the maximum for each and every contiguous subarray of size K. Sliding Window (Deque)
import java.util.Deque;
import java.util.LinkedList;

public class MaxofSubarray {
	static void printMax(int arr[], int N, int K)
	{
		Deque<Integer> Qi = new LinkedList<Integer>();
		int i;
		for (i = 0; i < K; ++i) {
			while (!Qi.isEmpty()
				&& arr[i] >= arr[Qi.peekLast()])
				// Remove from rear
				Qi.removeLast();
			// Add new element at rear of queue
			Qi.addLast(i);
		}
		// Process rest of the elements, i.e., from arr[k] to arr[n-1]
		for (; i < N; ++i) {
			// The element at the front of the queue is the largest element of previous window, so print it
			System.out.print(arr[Qi.peek()] + " ");
			// Remove the elements which are out of this window
			while ((!Qi.isEmpty()) && Qi.peek() <= i - K)
				Qi.removeFirst();
			// Remove all elements smaller than the currently being added element (remove useless elements)
			while ((!Qi.isEmpty())
				&& arr[i] >= arr[Qi.peekLast()])
				Qi.removeLast();

			// Add current element at the rear of Qi
			Qi.addLast(i);
		}

		// Print the maximum element of last window
		System.out.print(arr[Qi.peek()]);
	}
	public static void main(String[] args)
	{
		int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
		int K = 3;
		printMax(arr, arr.length, K);
	}
}

