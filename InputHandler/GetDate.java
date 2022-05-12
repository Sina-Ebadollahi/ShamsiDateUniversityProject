package InputHandler;

import java.util.Scanner;

public class GetDate {
    public GetDate(){}
    public void getDateViaConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Date To Continue : ");
        String rawDateInput = scanner.next();
        String[] dateComponents = rawDateInput.split("[,/-]");

    }
}
