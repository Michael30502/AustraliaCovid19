import processing.core.PApplet;

import java.util.HashMap;

public class AustraliaCorona extends PApplet {

    DataImport dataImport = new DataImport(this);
    DisplayAndInput displayAndInput;
    DataHandler dataHandler;
    double multiplier = 0.5;
    int graphs;

    public static void main(String[] args ) {
        PApplet.main("AustraliaCorona");
    }


    public void settings() {
        size(1792,828);

    }



    public void setup(){

    dataImport.importData();

    
         displayAndInput= new DisplayAndInput(this,dataHandler);
    displayAndInput.display(graphs);
     dataHandler = new DataHandler(this,dataImport.map,dataImport.dates,multiplier,dataImport.datesActive);
     





    }

    public void draw(){
      //  displayAndInput.barGraph();
displayAndInput.display();
        displayAndInput.displayMenu();
    }

}
