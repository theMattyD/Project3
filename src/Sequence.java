// Developer:   Matthew Daniels
// Class:       CMIS 242 - Project 3
// Date:        23 April 2017
// Filename:    Sequence.java
// Purpose:     This file is the utility class that generates the iterative and
//              recursive number sequences, as well as tallies the runs for 
//              method efficiency output.

public class Sequence {
    
    private static int number;
    private static int efficiency;
    
    public static int getNumber(){
        return number;
    }
    
    // ------------------------ ITERATIVE METHOD -------------------------------
    public static int computeIterative(int userInput) {
        
        efficiency = 0;
        int value[] = new int[userInput + 2];
        value[0] = 0;
        value[1] = 1;
        
        for (int i = 2; i <= userInput; i++) {
            efficiency++;
            value[i] = 2 * value[i - 1] + value[i - 2];
        }
        number = value[userInput];
        return number;
    }
    
    // ------------------------ RECURSIVE METHOD -------------------------------   
    public static int computeRecursive(int userInput) {
        efficiency++;
        switch (userInput) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                number = (2 * computeRecursive(userInput-1) + 
                          computeRecursive(userInput-2));
                return number;
        }
    }
    
    // --------------------- EFFICIENCY COUNTER METHOD -------------------------    
    public static int getEfficiency() {
        return efficiency;
    }    
}