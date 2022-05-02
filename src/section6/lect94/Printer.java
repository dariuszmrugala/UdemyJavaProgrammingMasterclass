package section6.lect94;

public class Printer {
    private double tonerLevel = 100;
    private int numberOfPrintedPages = 0;
    private boolean isDuplex = false;

    public Printer(double tonerLevel, int numberOfPrintedPages, boolean isDuplex) {

        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPrintedPages = numberOfPrintedPages;
        this.isDuplex = isDuplex;
    }

    public Printer(boolean isDuplex) {
        this(100, 0, isDuplex);
    }



    public void fillUpToner(double howMuch) {
        tonerLevel += howMuch;
        if (tonerLevel > 100) tonerLevel = 100;
    }

    public void printPage() {
        numberOfPrintedPages++;
    }

//    public fill
}
