/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySerachDemo;

import BinarySearch.BinarySearch;

/**
 *
 * @author mohammed
 */
public class BinarySearchDemo {

    public static void main(String[] args) {
        int array[] = {1, 24, 45, 68, 74, 80, 87, 99};
        int value = 99;
        BinarySearch binarySearch = new BinarySearch(array, value);
        System.out.println("Index= "+binarySearch.getSearchIndex());
        System.out.println("Number of tries= " + binarySearch.getNumberOfTries());
    }

}
