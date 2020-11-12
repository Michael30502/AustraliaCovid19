import processing.core.PApplet;

import java.util.ArrayList;
import java.util.HashMap;

public class AustraliaCorona extends PApplet {

    DataImport dataImport = new DataImport(this);
    DisplayAndInput displayAndInput;
    DataHandler dataHandler;
    double multiplier = 0.5;
    int graphs;
    ArrayList<String> options = new ArrayList<>();
    ArrayList<Button> buttList = new ArrayList<Button>();
    public static void main(String[] args ) {
        PApplet.main("AustraliaCorona");
    }


    public void settings() {
        size(1792,828);

    }



    public void setup(){
        options.add("Bar Graph (Deaths)");
        options.add("Bar Graph (New Deaths)");
        options.add("Line Graph (Deaths)");
    for(int i = 0; i<options.size();i++){
        buttList.add(new Button(this,200+((width-200)/3*i),0,(width-200)/3,100,options.get(i)));
    }
    dataImport.importData();

    
         displayAndInput= new DisplayAndInput(this,dataHandler);
     dataHandler = new DataHandler(this,dataImport.map,dataImport.dates,multiplier,dataImport.datesActive);
     





    }

    public void draw(){
      //  displayAndInput.barGraph();
displayAndInput.display(graphs,buttList);
        displayAndInput.displayMenu(options);

    }


    @Override
    public void mouseClicked() {

    }
}
