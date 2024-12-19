public class Ca2Main {

    public static void main(String[] args) {
        System.out.println("\r\n");
        
        Ca2Questions questions = new Ca2Questions();
        
        // look for repeated elements
        questions.task01();
        
        // matrix multiplication
        questions.task02();

        // calculate diagonal principal and secondary of one matrix
        questions.task03();

        // spiral traversal
        questions.task04();
        
        // bubblesort
        questions.task05();
    }
}