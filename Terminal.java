import java.util.Scanner;

public class Terminal {
    Parser parser;
    
    public void chooseCommandAction(){
    	String commendN=parser.getCommandName();
    	String [] argument=parser.getArgs();
    	System.out.println(commendN);
    	switch(commendN)
    	{
    	case "pwd":
    		pwd();
    	case "echo":
    		echo(argument);
    	
    	}
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
