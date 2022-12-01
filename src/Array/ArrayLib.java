package Array;

public class ArrayLib {

    //initialize array variable
    public static int[] array = {4, 3, 2, 5, 5};

    public static void main(String[] args) {
        //main method to run code to alter the array variable
        array = alterArraySize(array, 9);
        printArrayElements(array);
        printArrayElements(arrayReversal(array));
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
}
