import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class sortOfSortTest {

    @Test
    public void test1(){
        int[] test = {4, 3, 2, 9, 8};
        int[] testR = {4,3,2,8,9};
        assertArrayEquals(sortOfSort(test), testR);
        //chose this test because i wanted to see what my code would do when it was faced with a basically already sort of sorted array

    }

    @Test
    public void test2(){
        int[] test1 = {0,9,4,5,5};
        int[] test1R = {5,4,0,5,9};
        assertArrayEquals(sortOfSort(test1), test1R);
        //chose this test because i wanted to see what my code would do with duplicates
    }

    @Test
    public void test3(){
        int[] test2 = {9, 8, 8};
        int[] test2R = {8,8,9};
        assertArrayEquals(sortOfSort(test2), test2R);
        //chose this test because i wanted to see what my code would do when it was faced with a change variable of just 2 for the whole
        //thing and how it would deal with duplicates in such a small array
    }

    @Test
    public void test4(){
        int[] test3 = {9, 8, 7, 10, 11};
        assertArrayEquals(sortOfSort(test3), test3);
        //wanted to see what my code would do when it was faced with an already sortOfSorted array
    }

    @Test
    public void test5(){
        int[] test4 = {1, 1, 1, 4, 5, 7};
        int[] test4R = {4, 1, 1, 1, 5, 7};
        assertArrayEquals(sortOfSort(test4), test4R);
        //chose this test in order to see if my code would still work with an array of even length

    }




}