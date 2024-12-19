/*
 *  Main class for CA2 Programath project
 *  remote repository is https://github.com/sba24317/ProgMaths_Ca2
 * 
 */
public class Ca2Main {

    public static void main(String[] args) {
        System.out.println("\r\n");
        int option=1;
        
        // class that calculates tasks        
        Ca2Tasks ca2Tasks = new Ca2Tasks();
        
        // task for data input
        InputData scanner = new InputData();

        while  (option >=1 && option <=5) {
            System.out.println ("Main Menu");
            option = scanner.getNextInt("Choose one task from 1 to 5, otherwise, say goodbye: ");

            switch (option) {
                case 1:ca2Tasks.task01();
                    break;
                case 2:ca2Tasks.task02();
                    break;
                case 3:ca2Tasks.task03();
                    break;
                case 4:ca2Tasks.task04();
                    break;
                case 5:ca2Tasks.task05();            
                    break;
                default: {
                    option = -1;
                    System.out.println ("Bye!");
                    break;}
            }
        }
    }
}