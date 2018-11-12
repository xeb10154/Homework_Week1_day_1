public class Printer {

    private int maxPaper;
    private int paperLeft;
    private int tonerLeft;

    public Printer(int maxPaper, int maxToner){
        this.maxPaper = maxPaper;
        this.paperLeft = this.maxPaper;
        this.tonerLeft = maxToner;
    }

    public int checkPaper(){
        return this.paperLeft;
    }

    public void print(int copies, int pages){
        int total = copies * pages;
        this.paperLeft -= total;
        consumeToner(total);
    }

    public void refill(){
        this.paperLeft = this.maxPaper;
    }

    public int checkToner(){
        return this.tonerLeft;
    }

    public void consumeToner(int total){
        this.tonerLeft -= total;
    }




}
