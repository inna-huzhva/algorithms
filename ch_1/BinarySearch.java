public class BinarySearch {
  public static int rank(int key, int[] a) {
    return rank(key, a, 0, a.length - 1);
  }

  private static int rank(int key, int[] a, int lo, int hi) {
    if (lo > hi) {
      return -1;
    }
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) {
      return rank(key, a, lo, mid - 1);
    } else if (key > a[mid]) {
      return rank(key, a, mid + 1, hi);
    } else {
      return mid;
    }
  }

  public static void main(String[] args) {
    int[] a1 = {};
    int[] a2 = {1};
    int[] a3 = {1, 2};
    int[] a4 = {1, 2, 3, 4, 5};
    int[] a5 = {0, 0, 0};
    int key1 = 0;
    int key2 = 2;

    System.out.println("test0: " + (rank(key1, a1) == -1));
    System.out.println("test1: " + (rank(key1, a2) == -1));
    System.out.println("test2: " + (rank(key1, a3) == -1));
    System.out.println("test3: " + (rank(key2, a4) == 1));
    System.out.println("test4: " + (rank(key1, a5) == 1));
  }
}
