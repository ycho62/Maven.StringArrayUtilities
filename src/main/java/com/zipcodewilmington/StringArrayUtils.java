package com.zipcodewilmington;

import java.sql.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        List<String> list = Arrays.asList(array);
        return list.contains(value);

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
//        List<String> list = Arrays.asList(array);
//        return Collections.list;
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverse = new String[array.length];
        return Arrays.equals(array, reverse(array));
//        return (Arrays.equals(array,StringArrayUtils.reverse(Arrays.copyOf(array, array.length))));


//        int trueFalse;
//        for (int i = 0; i <= array.length/2; i++) {
//            if (Objects.equals(array[i], array[array.length - i -1])) {
//                trueFalse =1;
//                break;
//            } else {
//                trueFalse =0;
//
//            }
//        }

    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String string1 = Arrays.toString(array);
        String string2 = string1.toLowerCase();
        return string2.chars().filter(i -> i >= 'a' && i <= 'z').distinct().count() == 26;

//
//        String pangramic = Arrays.toString(array).toLowerCase();
//        char letter = 'a';
//        for (int i = 1; i<= 26; i++) {
//            if (!pangramic.contains(String.valueOf(letter)))) {
//    return false;
//            }else {
//    letter++;


    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String s : array) {
            if (s == value) {
                count += 1;
            }

        }
        return count;

    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> nList = new ArrayList<>(Arrays.asList(array));
        nList.removeAll(Arrays.asList(valueToRemove));
        array = nList.toArray(new String[0]);

        return array;
    }
//String[] removed;
//    int count =0
//            int j = 0
//                    for (int i =0; i < array.length; i++) {
//                        if (!array[i].equals(valueToRemove)) {
//                            removed[j] = array[i];
//                            j++;
//                        }
//                        return removed



    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int count = 0;
        int length = array.length;
        String[] nlist = new String[length];
        for (int i = 0; i < array.length; i++) {
            nlist[count] = array[i];
            while(i + 1 < array.length && nlist[count].equals(array[i+1])) {
            nlist[count] = array[i];
            i++;

            }
            count++;
        }String[] flist = new String[count];
        flist = Arrays.copyOfRange(nlist, 0, count);
        return flist;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int count = 0;
        int length = array.length;
        String[] nlist = new String[length];
        for (int i = 0; i < array.length; i++) {
            nlist[count] = array[i];
            while(i + 1 < array.length && array[i].equals(array[i+1])) {
                nlist[count] += array[i];
                i++;

            }
            count++;
        }String[] flist = new String[count];
        flist = Arrays.copyOfRange(nlist, 0, count);
        return flist;
    }


}
