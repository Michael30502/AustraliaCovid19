import processing.core.PApplet;

import java.util.HashMap;

public class AustraliaCorona extends PApplet {

    DataImport dataImport = new DataImport(this);
    DisplayAndInput displayAndInput;
    DataHandler dataHandler;
    double multiplier = 0.5;

    public static void main(String[] args ) {
        PApplet.main("AustraliaCorona");
    }


    public void settings() {
        size(1792/2,828/2);
    }



    public void setup(){

    dataImport.importData();

     dataHandler = new DataHandler(this,dataImport.map,dataImport.dates,multiplier);
         displayAndInput= new DisplayAndInput(this,dataHandler);
    displayAndInput.display();


    displayAndInput.displayMenu();


    }

}
