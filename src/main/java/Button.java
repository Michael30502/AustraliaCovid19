import processing.core.PApplet;

public class Button {
    boolean Tryk;

    float xPos, yPos;
    float w, h;
    String text;
    PApplet p;
    Button(PApplet p,float x, float y, float b, float h, String t) {

        this.w = b;
        this.h = h;
        this.xPos = x;
        this.yPos = y;
        this.text = t;
        this.p=p;
    }
    public void drawButton() {
        p.textSize(24);
        p.fill(0);
        p.rect(this.xPos, this.yPos, this.w, this.h);
        p.fill(255);
        p.text(this.text, xPos +10, yPos + 35);
    }
    boolean isButtonPressed() {
        return Tryk;
    }
    void registerClick(float xin, float yin) {

        if (xin > xPos && xin < xPos + w && yin < yPos + h && yin > yPos) {
            Tryk = true;
        }
    }
    void release() {
        Tryk = false;
    }
}
