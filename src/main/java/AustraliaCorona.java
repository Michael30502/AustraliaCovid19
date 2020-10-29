import processing.core.PApplet;

public class AustraliaCorona extends PApplet {

    DataImport dataImport = new DataImport(this);
    Display display = new Display();
    DataHandler dataHandler = new DataHandler();
    UserInput userInput = new UserInput();


    public static void main(String[] args ) {
        PApplet.main("AustraliaCorona");
    }


    public void settings() {
        size(1792,828);
    }



    public void setup(){

dataImport.importData();

    }

}
