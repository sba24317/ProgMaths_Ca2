
import java.util.Scanner;

public class Ca2Tasks {
    Scanner scanner = new Scanner(System.in);

    /*
     * This method is used when user intends to call the method
     * task01() by using parameters auto-generated
     */
    public void task01() {
        task01(-1);
    }

    /*
     * Statement: Write a Java program to find the first repeated element in an
     * array of integers. The program should:
     * Take the size of the array and its elements as input.
     * Find and print the first element that repeats in the array (i.e., occurs more
     * than once).
     * If no element repeats, print "No repeated elements found."
     * 
     * Return: void
     */
    public void task01(int paramArrSize) {
        System.out.println("Question 01 Begin");
        System.out.println("---------------------------------------------------------------------");

        int i, j;
        int arraySize;
        double myArray[];
        String msgResult = "No repeated numbers in this array";

        // check if user sent a array size otherwize ask user to input it
        try {
            if (paramArrSize > 0)
                arraySize = paramArrSize;
            else
                arraySize = getNextInt("Inform the size of the array: ");

            if (arraySize <= 0)
                throw new Exception("Array size must have at least one element.");

            // get elementso for the array
            myArray = getArrayElements((paramArrSize >= 0), arraySize);

            for (i = 0; i < arraySize-1; i++)
                // look for repeated elements
                for (j = i + 1; j < arraySize; j++)
                    if (myArray[i] == myArray[j]) {
                        // when some repetead item is found, we can stop the loop
                        msgResult = "First repeated number is: " + myArray[j];
                        break;
                    }

            // show the results
            this.printArray("Array:", myArray);
            System.out.println(msgResult);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Question 01 End");

        } catch (Exception e) {
            System.out.println("Error in method question_01, error is \n" + e.getMessage());
        }
    }

    /*
     * This first method is used when user intends to call the method
     * task02() by using parameters auto-generated
     */
    public void task02() {
        task02(-1);
    }

    /*
     * Write a program that generates a multiplication table using a 2D array. The
     * size of the table (e.g.
     * n×n) should be input by the user. Populate the 2D array with the
     * multiplication values and display
     * the table in matrix form.
     * 
     * Return: void
     */
    public void task02(int paramSize) {
        System.out.println("Question 02 Begin");
        System.out.println("---------------------------------------------------------------------");

        int size;
        double arrayResult[][];

        try {
            // check if user sent a array size otherwize ask user to input it
            size = (paramSize > 0) ? paramSize : getNextInt("Informe the row size of the array: ");

            if (size <= 0)
                throw new Exception("Array size must be bigger than 0 ");

            // instance the array
            arrayResult = new double[size][size];

            // get multiplication table
            for (int i = 0; i < size; i++)
                for (int j = 0; j < size; j++) {
                    arrayResult[i][j] = j + 1 * i + 1;
                }

            // show results
            this.printMatrix("Array result multiplication: ", arrayResult);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Question 02 End");

        } catch (Exception e) {
            System.out.println("Error in method question_02, error is \n" + e.getMessage() + " " + e.getMessage());
        }
    }

    /*
     * This method is used when user intends to call the method
     * task03() by using parameters auto-generated
     */
    public void task03() {
        task03(-1);
    }

    /*
     * Statement: Write a Java program to calculate the sum of the main diagonal and
     * the secondary diagonal of a square matrix.
     * Use user input to create the matrix
     * 
     * Return: void
     */
    public void task03(int paramArrSize) {
        System.out.println("Question 03 Begin");
        System.out.println("---------------------------------------------------------------------");

        int arraySize;
        double myMatrix[][];
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        // check if user sent a array size otherwize ask user to input it
        try {
            if (paramArrSize > 0)
                arraySize = paramArrSize;
            else
                arraySize = getNextInt("Inform the size oh the array");

            if (arraySize <= 0)
                throw new Exception("Array size must have at least one.");

            // instance the array
            myMatrix = this.getMatrixElements((paramArrSize > -1), arraySize, arraySize);

            // performing calculations for both diagonalss
            for (int i = 0; i < arraySize; i++) {

                primaryDiagonal += myMatrix[i][i];

                secondaryDiagonal += myMatrix[arraySize - i - 1][i];
            }

            // show the results
            this.printMatrix("Elements of the matrix", myMatrix);
            System.out.println("Sum of elements, diagonal principal: " + primaryDiagonal);
            System.out.println("Sum of elements, diagonal secondary: " + secondaryDiagonal);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Question 03 End");

        } catch (Exception e) {
            System.out.println("Error in method question_03, error is \n" + e.getMessage() + " " + e.getStackTrace());
        }
    }

    /*
     * This method is used when user intends to call the method
     * task03() by using parameters auto-generated
     */
    public void task04() {
        task04(-1, -1);
    }

    /*
     * Write a program to traverse a matrix in spiral order. The program should
     * accept the dimensions and
     * elements of the matrix as input and then display the spiral traversal.
     */
    public void task04(int paramRow, int paramCol) {
        System.out.println("Question 04 Begin");
        System.out.println("---------------------------------------------------------------------");

        int i;
        int rows;
        int cols;
        double[][] myMatrix;
        int upEdge;
        int downEdge;
        int leftEdge;
        int rightEdge;
        String msg = "";

        try {
            if (paramRow >= 0 && paramCol >= 0) {
                // resolving array for auto generated call.
                rows = paramRow;
                cols = paramCol;
            } else {
                // resolving array dimentions manualy
                rows = getNextInt("Inform number of rows: ");
                cols = getNextInt("Inform number of cols: ");
            }

            // validate dimentionss
            if (rows < 0 || cols < 0)
                throw new Exception("Array size must have at least one.");

            // instance the matrix
            myMatrix = this.getMatrixElements((paramRow > -1), rows, cols);

            // defined "edges" for the array, each step a egde comes tight
            upEdge = 0;
            downEdge = myMatrix.length - 1;
            leftEdge = 0;
            rightEdge = myMatrix[0].length - 1;

            while (leftEdge <= rightEdge && upEdge <= downEdge) {
                // get all elements from leftEdge to rightEdge
                for (i = leftEdge; i <= rightEdge; i++)
                    msg += myMatrix[upEdge][i] + ", ";
            
                msg += "\n";
                upEdge++;

                // get all elements from upEdge to downEdge
                for (i = upEdge; i <= downEdge; i++)
                    msg += myMatrix[i][rightEdge] + ", ";
            
                msg += "\n";
                rightEdge--;

                // get all elements from rightEdge to leftEdge
                if (upEdge <= downEdge) {
                    for (i = rightEdge; i >= leftEdge; i--) {
                        msg += myMatrix[downEdge][i] + ", ";
                    }
                    msg += "\n";
                    downEdge--;
                }

                // get all elements from downEdge to upEdge
                if (leftEdge <= rightEdge) {
                    for (i = downEdge; i >= upEdge; i--)
                        msg += myMatrix[i][leftEdge] + ", ";
                
                    msg += "\n";
                    leftEdge++;
                }
            }
            // remove final ", " caracter.
            msg = msg.substring(0, msg.length() - 4);

            this.printMatrix("Original Matrix", myMatrix);

            System.out.println("Tranversal array:");
            System.out.println(msg);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("Question 04 End");

        } catch (Exception e) {
            System.out.println("Error in method question_04, error is \n" + e.getMessage() + " " + e.getStackTrace());
        }
    }

    /*
     * This method is used when user intends to call the method
     * task05() by using parameters auto-generated
     */
    public void task05() {
        task05(-1);
    }

    /*
     * Write a Java program to implement the Bubble Sort algorithm to sort an array
     * of integers in
     * ascending order. The program should:
     * 1. Accept the size of the array and the elements of the array as input.
     * 2. Sort the array using the Bubble Sort technique.
     * 3. Display the array before and after sorting.
     * 4. Count and display the total number of swaps performed during the sorting
     * process.
     */
    public void task05(int paramSize) {
        System.out.println("Question 05 Begin");
        System.out.println("---------------------------------------------------------------------");

        int i;
        int size;
        double elementAux;
        int iterations = 0;
        int swaps = 0;
        double[] myArray;
        boolean hasChaged = true;

        try {
            // reading array size
            if (paramSize > 0) {
                size = paramSize;
            } else {
                size = getNextInt("Inform the size array: ");
            }

            // validaing array size
            if (size < 0)
                throw new Exception("Size must be bigger than 0.");

            myArray = this.getArrayElements((paramSize > -1), size);

            this.printArray("Original array:", myArray);
            while (hasChaged) {
                hasChaged = false;
                for (i = 0; i < myArray.length - 1; i++) {
                    if (myArray[i + 1] < myArray[i]) {
                        hasChaged = true;

                        elementAux = myArray[i];
                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = elementAux;
                        swaps++;
                    }
                }
                iterations++;
                this.printArray("After iteration " + iterations + " : ", myArray);
            }
            System.out.println("Performed " + iterations + " iterations and " + swaps + " swaps.");
        } catch (Exception e) {
            System.out.println("Error in method question_05, error is \n" + e.getMessage() + " " + e.getStackTrace());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Question 05 End");
    }

    /*
     * This private method prompts to The user input a new double value.
     */
    private double getNextDouble(String msg) throws Exception {
        System.out.print(msg);
        return scanner.nextDouble();
    }

    /*
     * This private method prompts to The user input a new int value.
     */
    private int getNextInt(String msg) throws Exception {
        System.out.print(msg);
        return scanner.nextInt();
    }

    /*
     * This private method is used to print an array to console.
     */
    private void printArray(String msgPrint, double[] paramArray) {
        String msg = "{ ";
        String decimals;
        String strValue;

        System.out.print(msgPrint);
        for (int i = 0; i < paramArray.length; i++) {
            decimals = Math.round(paramArray[i]) == paramArray[i] ? "0" : "2";

            strValue = String.format("%." + decimals + "f", paramArray[i]);

            msg += strValue + ", ";
        }

        msg = msg.substring(0, msg.length() - 2) + " }\n";

        System.out.println(msg);
    }

    /*
     * This private method is used to print a matrix to console.
     */
    private void printMatrix(String msgPrint, double[][] matrix) {
        String msg = "";

        System.out.println(msgPrint);
        msg += "---------------------------------------------------------\n";
        for (int i = 0; i < matrix.length; i++) {
            msg += "[" + i + "] {";

            for (int j = 0; j < matrix[i].length; j++)
                msg += String.format("%.2f", matrix[i][j]) + ", ";

            msg = msg.substring(0, msg.length() - 2) + "}\n";
        }
        msg += "---------------------------------------------------------";
        System.out.println(msg);
    }

    /*
     * This private method obtain elements for an array
     */
    private double[] getArrayElements(boolean autoGenereted, int size) {
        double[] myArray = new double[size];
        try {

            // gather elements for the array auto genereted
            if (autoGenereted) {
                Double aux;
                for (int i = 0; i < size; i++) {
                    aux = (Math.random() * 10);
                    myArray[i] = aux.doubleValue();
                }
                // gather elements for the array manually
            } else {
                for (int i = 0; i < size; i++) {
                    myArray[i] = getNextDouble("Inform array index " + i + " :");
                }
            }
        } catch (Exception e) {
            System.out.println(
                    "Error in method getArrayElements()), error is \n" + e.getMessage() + " " + e.getStackTrace());
        }
        return myArray;
    }

    /*
     * This private method obtain elements for a matrix
     */
    private double[][] getMatrixElements(boolean autoGenereted, int row, int col) throws Exception {
        double[][] myMatrix = new double[row][col];
        double aux;
        int i;
        int j;
        try {
            // gather elements for the array auto genereted
            if (autoGenereted) {
                for (i = 0; i < row; i++)
                    for (j = 0; j < col; j++) {
                        aux = Math.round(Math.random() * 10);
                        myMatrix[i][j] = aux;
                    }

                // gather elements for the array manually
            } else {
                for (i = 0; i < row; i++)
                    for (j = 0; j < col; j++)
                        myMatrix[i][j] = getNextDouble("Inform element index " + (i) + "," + (j) + " : ");
            }
        } catch (Exception e) {
            System.out.println(
                    "Error in method getMatrixElements()), error is \n" + e.getMessage() + " " + e.getStackTrace());
        }
        return myMatrix;
    }

}
