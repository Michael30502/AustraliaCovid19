import processing.core.PApplet;

import java.util.HashMap;

public class AustraliaCorona extends PApplet {

    DataImport dataImport = new DataImport(this);



    public static void main(String[] args ) {
        PApplet.main("AustraliaCorona");
    }


    public void settings() {
        size(1792,828);
    }



    public void setup(){

    dataImport.importData();
    DataHandler dataHandler = new DataHandler(this,dataImport.map,dataImport.dates);
    DisplayAndInput displayAndInput = new DisplayAndInput(this);

    displayAndInput.displayMenu();


    }

}
