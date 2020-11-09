import processing.core.PApplet;

public class Graphs {
    PApplet p;
    Data data;
    int posX, posY;
    int type;
    Graphs(PApplet p,int posX, int posY,Data data,int type){
    this.p=p;
    this.posY=posY;
    this.posX=posX;
    this.data=data;
    this.type=type;
    }

    void bar(){}

    void pie(){}

    void tabel(){}

    void line(){}
}
