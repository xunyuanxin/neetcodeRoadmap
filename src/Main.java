import recursion.ClimbingStairs;
import recursion.Factorial;
import recursion.FibonacciSequence;
import sorting.BucketSort;
import sorting.InsertionSort;
import sorting.MergeSort;
import sorting.QuickSort;
import trees.BinaryTreeNode;
import trees.InsertRemoveBST;
import trees.TraversalBST;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------RECURSION TEST--------");
        System.out.println("calculating factorial: " + Factorial.factorial(5));
        System.out.println("calculating fibonacci number: " + FibonacciSequence.fibonacciNumber(12));
        System.out.println("climbing 45 stairs: " + ClimbingStairs.climbingStairs(45));
        //System.out.println("time out on leetcode climbing 45 stairs: " + ClimbingStairs.timeOutClimbingStairs(45));
        System.out.println("--------SORTING TEST--------");
        int[] testArray = {2, 3, 4, 1, 6};
        System.out.println("sorting array using insertion: " + Arrays.toString(InsertionSort.insertionSort(testArray)));
        System.out.println("sorting array using merging: " + Arrays.toString(MergeSort.mergeSort(testArray, 0, 4)));
        int[] testQuickSortArray = {6, 2, 4, 1, 3};
        System.out.println("quick sorting array: " + Arrays.toString(QuickSort.quickSort(testQuickSortArray, 0 , 4)));
        int[] testQuickSortNotStable = {7, 3, 7, 4, 5};
        System.out.println("quick sorting not stable: " + Arrays.toString(QuickSort.quickSort(testQuickSortNotStable, 0 , 4)));
        int[] testBucketSortArray = {2, 1, 2, 0, 0, 2};
        System.out.println("sorting array using bucket: " + Arrays.toString(BucketSort.bucketSort(testBucketSortArray)));
        System.out.println("--------BINARY SEARCH TREES (BST) INSERT TEST--------");
        BinaryTreeNode testDeleteBSTArray = new BinaryTreeNode(3);
        System.out.println("Before Inserting: ");
        TraversalBST.traversalBFS(testDeleteBSTArray);
        InsertRemoveBST.insertBST(testDeleteBSTArray, 2);
        InsertRemoveBST.insertBST(testDeleteBSTArray, 5);
        InsertRemoveBST.insertBST(testDeleteBSTArray, 4);
        InsertRemoveBST.insertBST(testDeleteBSTArray, 10);
        InsertRemoveBST.insertBST(testDeleteBSTArray, 8);
        InsertRemoveBST.insertBST(testDeleteBSTArray, 15);
        InsertRemoveBST.insertBST(testDeleteBSTArray, 7);
        System.out.println("After Inserting: ");
        TraversalBST.traversalBFS(testDeleteBSTArray);
        System.out.println("--------BINARY SEARCH TREES (BST) DELETE TEST--------");
//        System.out.println("deleting 5 from BST: " + InsertRemoveBST.removeBST(testDeleteBSTArray, 5));
//        //TraversalDFS.inOrderDFS(testDeleteBSTArray);
//        System.out.println("traversal BFS after deleting 5 from BST: ");
//        TraversalBST.traversalBFS(testDeleteBSTArray);
    }
}
