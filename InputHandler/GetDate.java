package InputHandler;

import DateComponents.TheDate;

import java.util.Scanner;

public class GetDate {
    public GetDate(){}
    public void getDateViaConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Date To Continue : ");
        String rawDateInput = scanner.next();
        String[] dateComponents = rawDateInput.split("[,/-]");
        TheDate dateModule = new TheDate(stringArrToIntArr(dateComponents), rawDateInput);
    }
    private int[] stringArrToIntArr(String[] date){
        int[] tempIntArr = new int[date.length];
        for(int i = 0; i < date.length; i++){
            tempIntArr[i] = Integer.parseInt(date[i]);
        }
        return tempIntArr;
    }
}
