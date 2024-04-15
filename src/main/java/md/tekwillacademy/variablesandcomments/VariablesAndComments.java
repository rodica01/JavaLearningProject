package md.tekwillacademy.variablesandcomments;

import java.util.Arrays;

public class VariablesAndComments {
    public static void main(String[] args) {
        // Declare the primitive data type variables

        boolean falseBooleanVariable = false;
        System.out.println("The value of our variable falseBooleanVariable is: " + falseBooleanVariable);

        boolean trueBooleanVariables = true;
        System.out.println("The value of our variable trueBooleanVariables is: " + trueBooleanVariables);
        
        char firstCharFromAscii = '0';
        System.out.println("The value of our variable firstCharFromAscii is: " + firstCharFromAscii);
        
        char lastCharFromAscii = '0';
        System.out.println("The value of our variable lastCharFromAscii is: " + lastCharFromAscii);

        byte lowerLimitOfByteDataType = - 128;
        System.out.println("The value of our variable lowerLimitOfByteDataType is: " + lowerLimitOfByteDataType);

        byte upperLimitOfByteDataType = 127;
        System.out.println("The value of our variable upperLimitOfByteDataType is: " + upperLimitOfByteDataType);

        short lowerLimitOfShortDataType = -32768;
        System.out.println("The value of our variable lowerLimitOfShortDataType is: " + lowerLimitOfShortDataType);

        short upperLimitOfShortDataType = 32767;
        System.out.println("The value of our variable upperLimitOfShortDataType is: " + upperLimitOfShortDataType);

        int lowerLimitOfIntDataType = -2147483648;
        System.out.println("The value of our variable lowerLimitOfIntDataType is: " + lowerLimitOfIntDataType);

        int upperLimitOfIntDataType = 2147483647;
        System.out.println("The value of our variable upperLimitOfIntDataType is: " + upperLimitOfIntDataType);

        long lowerLimitOfLongDataType = -9223372036854775808L;
        System.out.println("The value of our variable lowerLimitOfLongDataType is: " + lowerLimitOfLongDataType);

        long upperLimitOfLongDataType = 9223372036854775807L;
        System.out.println("The value of our variable upperLimitOfLongDataType is: " + upperLimitOfLongDataType);

        float lowerLimitOfFloatDataType = -3.4E+38f;
        System.out.println("The value of our variable lowerLimitOfFloatDataType is: " + lowerLimitOfFloatDataType);

        float upperLimitOfFloatDataType = 3.4E+38f;
        System.out.println("The value of our variable upperLimitOfFloatDataType is: " + upperLimitOfFloatDataType);

        double lowerLimitOfDoubleDataType = -1.7E+308d;
        System.out.println("The value of our variable lowerLimitOfDoubleDataType is: " + lowerLimitOfDoubleDataType);

        double upperLimitOfDoubleDataType = 1.7E+305;
        System.out.println("The value of our variable upperLimitOfDoubleDataType is: " + upperLimitOfDoubleDataType);

    }
}
