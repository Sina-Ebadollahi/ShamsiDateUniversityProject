package DateComponents;

public class TheDate {
    public String Date = "";
    public Year yearRef;
    public Month monthRef;
    public Day dayRef;
    public TheDate(int[] dateComponents){

    }
    private void handleInputDate(int[] dateComponents){
         yearRef = new Year(dateComponents[0]);
         monthRef = new Month(dateComponents[1]);
         dayRef = new Day(dateComponents[2]);
    }
    private void dateLogic(){
        this.dayRef.dayValue++;
    }

}
