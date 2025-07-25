public class heapSort { // O(n*logn)

  public static void heapify(int arr[], int i, int size) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int maxIdx = i;

    if (left < size && arr[left] > arr[maxIdx]) {
      maxIdx = left;
    }

    if (right < size && arr[right] > arr[maxIdx]) {
      maxIdx = right;
    }

    if (maxIdx != i) {
      // swap
      int temp = arr[i];
      arr[i] = arr[maxIdx];
      arr[maxIdx] = temp;

      heapify(arr, maxIdx, size);
    }
  }

  public static void sort(int arr[]) {
    // step1 - build maxHeap
    int n = arr.length;
    for (int i = n / 2; i >= 0; i--) {
      heapify(arr, i, n);
    }

    // step2 - push largest at end
    for (int i = n - 1; i > 0; i--) {
      // swap (largest-first with last)
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      heapify(arr, 0, i);

    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5, 3 };
    sort(arr);

    // print
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}

// arr = 1,2,4,5,3
// non-leaf = 2,1
// for(int i=n/2; i>=0; i--)
// 1 2 3 4 5, n=5, 5/2 = 2;

// ascending(maxHeap)
// descending(minHeap)

// 1. arr -> maxHeap create
// 2. largest element pushed at end
// -> swap(0, last)
// -> heapify(0) -> n-1, n-2, n-3

// non-leaf nodes -> heapify() (maxHeap)

// i = n-1 to 1
// swap(0, i)
// heapify(0, i)
