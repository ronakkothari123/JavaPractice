package Array;

import java.util.ArrayList;

public class ArrayLib {

    //initialize array variable
    public static int[] array = {4, 3, 2, 5, 5};

    public static void main(String[] args) {
        //main method to run code to alter the array variable
        /*array = alterArraySize(array, 9);
        printArrayElements(array);
        printArrayElements(arrayReversal(array));*/

        System.out.println(medianOfArray(new int[]{1, 2, 3, 4, 5}));
    }

    //call to reverse the elements of an array. Requires array parameter
    public static int[] arrayReversal(int[] array){
        //cycles through half of the array unless odd length, in which case it will cycle the ceiling integer of half the array length
        for(int i = 0; i < (int) Math.ceil(array.length / 2.00); i++){
            //create a temporary pair of the elements being switched
            int[] tempPair = {array[i], array[array.length - i - 1]};

            //switch the elements in the main array
            array[i] = tempPair[1];
            array[array.length - i - 1] = tempPair[0];
        }

        //returns refactored array
        return array;
    }

    //call to print out the elements of an array in one line. Requiers array parameter
    public static void printArrayElements(int[] array){
        //print out the starting square bracket to signify the printing of an array
        System.out.print("[");

        //to avoid errors, check if the array is empty
        if(array.length > 0){
            //prints out the first array element without a preceding comma
            System.out.print(array[0]);

            //prints out every element after the first one with preceding comma
            for(int i = 1; i < array.length; i++) System.out.print(", " + array[i]);
        } System.out.println("]");
        //enter a new line
    }

    //call to alter the size of an array. Required parameters include oldArray and length to change to.
    public static int[] alterArraySize(int[] oldArray, int newLength){
        //creates new array of length specified
        int[] newArray = new int[newLength];

        //appends as much of the old array into the new array as possible
        for(int i = 0; i < oldArray.length && i < newLength; i++) newArray[i] = oldArray[i];

        //returns the updated array of updated length
        return newArray;
    }

    //sorts an array from least to greatest
    public static int[] sortArray(int[] unsortedArray){
        //creates an empty array to store the sorted array
        int[] sortedArray = new int[unsortedArray.length];

        //cycle and sort through the entire unsortedArray
        for(int i = 0; i < unsortedArray.length; i++){
            //stores the minimum value of the array
            int minimumValue = Integer.MAX_VALUE;

            //the amount of time that the element is repeated
            int elemAmount = 0;

            //cycles through array again to find minimum value that hasn't been sorted
            for(int j = 0; j < unsortedArray.length; j++){

                //see if the value is a contestant for being a minimum value
                if(unsortedArray[j] < minimumValue){
                    boolean alreadySorted = false;

                    //cycles through the sorted array to see if the value has been sorted
                    for(int k = 0; k < sortedArray.length; k++){
                        if(unsortedArray[j] == sortedArray[k]) alreadySorted = true;
                    }

                    //if it hasn't been sorted, then set as new minimum value
                    if(!alreadySorted) minimumValue = unsortedArray[j];
                }
            }

            //check the amount of time the minimum value selected repeats in the array
            for(int j = 0; j < unsortedArray.length; j++){
                if(unsortedArray[j] == minimumValue) elemAmount++;
            }

            //append the new minimum value the amount of times provided by elemAmount
            for(int j = 0; j < elemAmount; j++){
                sortedArray[i + j] = minimumValue;
            }

            //increment i the amount of times value has been repeated
            i += elemAmount - 1;
        }

        //returns the array after sorting it
        return sortedArray;
    }

    //finds the median value of an array
    public static double medianOfArray(int[] array){
        //sorts the array using the above method
        int[] sortedArray = sortArray(array);

        //checks the length of array and finds the median value accordingly
        if(sortedArray.length % 2 == 0){
            double addition = sortedArray[sortedArray.length / 2 - 1] + sortedArray[sortedArray.length / 2];
            return addition * 1.0 / (double) 2;
        } else return sortedArray[sortedArray.length / 2];
    }

    //finds the mode value of an array
    public static int modeOfArray(int[] array){
        //returns the only value the array if length is 1
        if(array.length == 1) return array[0];

        //sorts the array using above method
        int[] sortedArray = sortArray(array);

        //list of elements that qualify for mode (if there is more than one element)
        ArrayList<Integer> elements = new ArrayList<>();

        //the following integers are used to help calculate the mode
        int returnValue = Integer.MAX_VALUE;
        int modeCount = 0;
        int currentCount = 0;
        int currentElem = 0;

        //cycles through the sorted array
        for(int i = 0; i < sortedArray.length; i++){
            //if it is the last element of the array, add that value to elements array
            if(i == sortedArray.length - 1) currentCount++;

            //if this is the last element of if a new element has been selected
            if(sortedArray[i] != currentElem || i == sortedArray.length - 1){
                //if this element is repeated more often than the current mode value
                if(currentCount > modeCount){
                    //clear the elements contestant and new mode value
                    elements.clear();
                    elements.add(currentElem);
                    modeCount = currentCount;
                } else if(currentCount == modeCount){
                    //if this element is repeated the same amount, then add to contestants list
                    elements.add(currentElem);
                }

                //reset the counting variables
                currentCount = 1;
                currentElem = sortedArray[i];
            } else currentCount += 1;
        }

        //pick the minimum value of the contestants of the mode value
        for(int i = 0; i < elements.size(); i++) if(elements.get(i) < returnValue) returnValue = elements.get(i);

        //returns the mode value
        return returnValue;
    }
}
