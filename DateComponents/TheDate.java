package DateComponents;

public class TheDate {
    public String date = "";
    public String enteredDate;
    public Year yearRef;
    public Month monthRef;
    public Day dayRef;
    public TheDate(int[] dateComponents, String enteredDate){
        this.enteredDate = enteredDate;
    handleInputDate(dateComponents);

    }
    private void handleInputDate(int[] dateComponents){
         yearRef = new Year(dateComponents[0]);
         monthRef = new Month(dateComponents[1]);
         dayRef = new Day(dateComponents[2]);
    }
    private void dateIncreaseLogic(){
        int tempValue = this.dayRef.dayValue++;
        if(Month.MONTHS_LENGTH[this.monthRef.monthValue - 1] == tempValue ){
            
        }else{
            this.dayRef.dayValue++;
        }
    }

}
