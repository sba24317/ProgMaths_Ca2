/*
 *  Main class for CA2 Programath project
 *  remote repository is https://github.com/sba24317/ProgMaths_Ca2
 * 
 */
public class Ca2Main {

    public static void main(String[] args) {
        System.out.println("\r\n");
        
        Ca2Tasks ca2Tasks = new Ca2Tasks();
        
        // look for repeated elements
        ca2Tasks.task01();
        
        // matrix multiplication
        ca2Tasks.task02();

        // diagonal principal and secondary
        ca2Tasks.task03();

        // spiral traversal
        ca2Tasks.task04();
        
        // bubblesort
        ca2Tasks.task05();
    }
}