import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.util.ArrayList;

public class DisplayAndInput {
    int currentGraph = 0;
    PApplet p;
    DataHandler dataHandler;

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

void display(int graph,ArrayList<Button> buttList){
    background();
    //dataHandler.barGraph();
    for(int i = 0;i<buttList.size();i++){
    buttList.get(i).drawButton();}
//    dataHandler.lineGraph();

    switch(currentGraph){

        case 0:{
            p.text("Select a GRAPH!",p.width/2,p.height/2);


        }break;

        case 1:{
            dataHandler.barGraph("total");


        }break;

        case 2:{
            dataHandler.barGraph("new");

        }break;

        case 3:{
            dataHandler.lineGraph();

        }break;
        case 4:{
           dataHandler.circleDiagram();
    }break;
        default:break;

    }

}





void background(){
    p.background(3,145,213);
    p.fill(3,130,170);
    p.rect(0,0,p.width,100);
    logo.resize(200,100);
    p.image(logo,0,0);

    }



}
