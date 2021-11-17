import java.util.Scanner;

public class Terminal {
    Parser parser;
    
    public void chooseCommandAction(){
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        System.out.println("CLI running... enter commands");
        String temp = in.nextLine();
        Parser parser = new Parser();
        parser.parse(temp);
        System.out.println("done");
    }
}
