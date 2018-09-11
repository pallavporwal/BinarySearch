/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author mohammed
 */
public class BinarySearch {

    int triesNumber;
    int[] arrayNumbers;
    int searchValue;
    int index;
    int low;
    int mid;
    int high;
    boolean found = false;

    public BinarySearch(int[] arrayNumbers, int searchValue) {
        this.triesNumber = triesNumber;
        this.arrayNumbers = arrayNumbers;
        this.searchValue = searchValue;
        index = -1;
        low = 0;
        high = arrayNumbers.length - 1;
        mid = low + ((high - low) / 2);

    }

    public int getSearchIndex() {

        while (!found) {

            if (low > high) {
                System.err.println("number not found");
                break;
            }

            if (arrayNumbers[mid] == searchValue) {
                found = true;
                index = mid;
            } else if (arrayNumbers[mid] < searchValue) {
                low = mid + 1;
            } else if (arrayNumbers[mid] > searchValue) {
                high = mid - 1;

            }
            if (!found) {
                triesNumber++;

            }
            mid = low + (high - low) / 2;

        }
        return index;

    }

    public int getNumberOfTries() {
        return triesNumber;
    }

}
