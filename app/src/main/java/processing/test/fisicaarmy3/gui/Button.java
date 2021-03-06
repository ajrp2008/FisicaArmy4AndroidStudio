package processing.test.fisicaarmy3.gui;

import processing.test.fisicaarmy3.FisicaArmy3;

public class Button {

  private FisicaArmy3 fisicaArmy3;
  private boolean isPressed = false;

  private float x,y,w,h;
  private float r=100,g=0,b=0;
  private String text;

  public Button(FisicaArmy3 fisicaArmy3, float x, float y, float w, float h){
    this.fisicaArmy3 = fisicaArmy3;
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }

  public void display(){
    fisicaArmy3.fill(r,g,b);
    fisicaArmy3.rect(x,y,w,h,20);
    fisicaArmy3.textSize(50);
    fisicaArmy3.fill(255,255,255);
    fisicaArmy3.text(text,x+20,y+h/2+10);
  }

  public void setText(String text){
    this.text = text;
  }

  public boolean isPushed(float x, float y){
    boolean isClicked = ((this.x < x && (this.x+w)>x))&(this.y < y && (this.y + h) > y);
    if(isClicked){g=200;
      setPressed(true);}
    return isClicked;
  }

  public void release(){
    setPressed(false);
    g=0;
  }

  public boolean isPressed() {
    return isPressed;
  }

  public void setPressed(boolean pressed) {
    isPressed = pressed;
  }
}
