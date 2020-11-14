import processing.core.PApplet;
import processing.event.MouseEvent;

import java.util.ArrayList;

public class AustraliaCorona extends PApplet {

    DataImport dataImport = new DataImport(this);
    DisplayAndInput displayAndInput;
    DataHandler dataHandler;
    double multiplier = 0.5;
    int graphs;
    Button loginButton;
    boolean introScreen = true;
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
        //options.add("Circle Diagram");
        dataHandler = new DataHandler(this,dataImport.totalMap,dataImport.dates,multiplier,dataImport.datesActive);
        displayAndInput= new DisplayAndInput(this,dataHandler);
        loginButton = new Button(this,400,214,992,400,"",0);
    for(int i = 0; i<options.size();i++){
        buttList.add(new Button(this,200+((width-200)/options.size()*i),0,(width-200)/options.size(),100,options.get(i),displayAndInput,i+1));
    }
    dataImport.importData();

    


     


    }

    public void draw(){
        if(loginButton.isButtonPressedGraphs())
            introScreen=false;
displayAndInput.display(graphs,buttList,loginButton,introScreen);
        displayAndInput.displayMenu(options);

    }


    @Override
    public void mouseClicked() {
        if(introScreen)
            loginButton.registerClick(mouseX, mouseY);
        for (int i = 0; i < buttList.size(); i++) {
            buttList.get(i).registerClick(mouseX, mouseY);
        }
    }



    @Override
    public void mouseReleased() {

        for(int i = 0; i<buttList.size();i++){
            buttList.get(i).release();
        }
    }



}
