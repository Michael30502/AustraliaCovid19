import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.util.ArrayList;

public class DisplayAndInput {
    int currentGraph = 0;
    PApplet p;
    DataHandler dataHandler;
    int counter = 0;
    boolean click;
    PImage logo;

        DisplayAndInput(PApplet p,DataHandler dataHandler){
            logo=p.loadImage("Australiencool.png");
            this.p=p;
            this.dataHandler = dataHandler;

        }

    void displayMenu(ArrayList<String> options){

        for(int i =0;i<options.size();i++){
            p.textAlign(p.CENTER);
            p.fill(0);
         //   p.text(options.get(i),p.width/2,(p.height/2)-options.size()+i*20);
        
	}}

void display(int graph,ArrayList<Button> buttList,Button loginButton,boolean introScreen){
    if(introScreen){


        loginButton.drawButton();
        openingScreen();


    }
    if(!introScreen) {
        background();

        for (int i = 0; i < buttList.size(); i++) {
            buttList.get(i).drawButton();
        }


        switch (currentGraph) {

            case 0: {
                p.text("Select a GRAPH!", p.width / 2, p.height / 2);


            }
            break;

            case 1: {
                dataHandler.barGraph("total");


            }
            break;

            case 2: {
                dataHandler.barGraph("new");

            }
            break;

            case 3: {
                dataHandler.lineGraph();

            }
            break;
            case 4: {
                dataHandler.circleDiagram();
            }
            break;
            default:
                break;

        }

    }
}





void background(){
    p.stroke(0);
    p.background(3,145,213);
    p.fill(3,130,170);
    p.rect(0,0,p.width,100);

    p.image(logo,0,0,200,100);

    }
void openingScreen(){
 p.background(3,145,213);
    p.image(logo,400,214,992,400);
    if(counter%30==0)
     click=!click;
    if(click){
        p.fill(0);
    p.text("CLICK",p.width/2,200);}
    counter++;
}


}
