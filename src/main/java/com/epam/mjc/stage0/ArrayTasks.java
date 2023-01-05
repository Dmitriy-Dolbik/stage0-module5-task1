package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks
{
    public static void main(String[] args)
    {
        ArrayTasks arrayTasks = new ArrayTasks();
        for (int[] innerArr : arrayTasks.sortRaggedArray(new int[][]{{12, 9, 16, 14, 4}, {5, 3, 2}, {2, 1, 9, 6}, {10, 7, 8}}))
        {
            for (int i : innerArr)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //System.out.println(arrayTasks.findIndexOfNumber(new int[] {99, -7, 102}, 102));
    }

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray()
    {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length)
    {
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
        {
            array[i] = i + 1;
        }
        return array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number)
    {
        int foundIndexOfNumber = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == number)
            {
                foundIndexOfNumber = i + 1;
                break;
            }

            if (foundIndexOfNumber == 0)
            {
                foundIndexOfNumber = -1;
            }
        }
        return foundIndexOfNumber;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr)
    {
        String[] reversedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            reversedArray[arr.length - 1 - i] = arr[i];
        }
        return reversedArray;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr)
    {
        int counterOfPositiveNumbers = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                counterOfPositiveNumbers++;
            }
        }
        int[] onlyPositiveArray = new int[counterOfPositiveNumbers];
        int counterOfFillingOfPositiveArray = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                onlyPositiveArray[counterOfFillingOfPositiveArray] = arr[i];
                counterOfFillingOfPositiveArray++;
            }
        }
        return onlyPositiveArray;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr)
    {
        
    }
}
