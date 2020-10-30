import processing.core.PApplet;

import java.util.HashMap;

public class AustraliaCorona extends PApplet {

    DataImport dataImport = new DataImport(this);
    DisplayAndInput displayAndInput = new DisplayAndInput(this);


    public static void main(String[] args ) {
        PApplet.main("AustraliaCorona");
    }


    public void settings() {
        size(828,1792);
    }



    public void setup(){

    dataImport.importData();

    DataHandler dataHandler = new DataHandler(this,dataImport.map,dataImport.dates);
    displayAndInput.display();


    displayAndInput.displayMenu();


    }

}
