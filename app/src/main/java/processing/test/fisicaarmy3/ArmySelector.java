package processing.test.fisicaarmy3;

import java.util.ArrayList;

import processing.core.PVector;
import processing.test.fisicaarmy3.army.ArmyMoverType;
import processing.test.fisicaarmy3.utils.GameConstants;


public class ArmySelector {
    private ArmyMoverType selectedArmy = null;
    private ArrayList<ArmyMoverType> armyList = new ArrayList<ArmyMoverType>();

    public ArmySelector() {
    }

    public void addArmy(ArmyMoverType a) {
        armyList.add(a);
    }

    public boolean selectArmy(float x, float y) {
        ArmyMoverType newSelectedArmy = null;

        for (ArmyMoverType a : armyList) {
            ArmyMoverType selected = a.firstSelectionArmy(x, y);
            if (selected != null) newSelectedArmy = selected;
        }
        if (selectedArmy != null) selectedArmy.secondSelection(x, y);

        selectedArmy = newSelectedArmy;

        return selectedArmy != null;
    }

    public boolean dragFromArmy(float x, float y) {
        if (selectedArmy != null) {
            selectedArmy.dragFromArmy(x, y);
        }
        return selectedArmy != null;
    }

    public void updateWithZoomFactor() {
        GameConstants.armySelectorSize *=GameConstants.zoomFactor;
        GameConstants.wayPointGap *= GameConstants.zoomFactor;

        for (ArmyMoverType ap : this.armyList) {
            ap.updateWithZoomFactor();
        }
    }

    public void updateMapPosition(float dx, float dy) {
        for (ArmyMoverType ap : armyList) {
            ap.updateMapPosition(dx, dy);
        }
    }

    public void update() {
        for (ArmyMoverType a : armyList) {
            a.update();
        }
    }

    public void drawSelector() {
        for (ArmyMoverType a : armyList) {

            // if(a==selectedArmy)continue;
            a.display(a == selectedArmy);
            //CENTER OF ARMY///////////////////////////
            PVector msp = a.getArmyCenter();
            FisicaArmy3.fiscaArmy3.noStroke();
            if (a == selectedArmy) FisicaArmy3.fiscaArmy3.fill(255, 255, 0, 15);
            else FisicaArmy3.fiscaArmy3.fill(30, 0, 0, 0);
            FisicaArmy3.fiscaArmy3.ellipse(msp.x, msp.y, GameConstants.armySelectorSize, GameConstants.armySelectorSize);
            FisicaArmy3.fiscaArmy3.stroke(255, 0, 0);
     /* if(a == selectedArmy){
          FisicaArmy3.fiscaArmy3.textSize(30); continue; }else FisicaArmy3.fiscaArmy3.textSize(15);
        FisicaArmy3.fiscaArmy3.text(a.soldierMover.name,msp.x+armySelectorSize/2, msp.y);
        FisicaArmy3.fiscaArmy3.text( ""+a.soldierMover.absolutPosition,msp.x+armySelectorSize/2, msp.y+30);
        FisicaArmy3.fiscaArmy3.text( "Start. "+ a.soldierMover.soldiers.size() + " Alive:"+a.soldierMover.armySizeAlive(),msp.x+armySelectorSize/2, msp.y+60);
        FisicaArmy3.fiscaArmy3.text( a.moverState.toString(),msp.x+armySelectorSize/2, msp.y+90);
        FisicaArmy3.fiscaArmy3.text( a.soldierMover.armyState.toString(),msp.x+armySelectorSize/2, msp.y+120);
        FisicaArmy3.fiscaArmy3.text( "Approveroute:"+a.moverStateFollowPath.approveRoute,msp.x+armySelectorSize/2, msp.y+150);
        FisicaArmy3.fiscaArmy3.text( "nextpoint:"+a.moverStateFollowPath.nextPoint,msp.x+armySelectorSize/2, msp.y+180);
        FisicaArmy3.fiscaArmy3.text( "marching:"+a.soldierMover.isMarching(),msp.x+armySelectorSize/2, msp.y+210);*/
        }

    }

    public void drawSelectedArmy() {
      /*
     ArmyMover a = selectedArmy;
      if(a==null)return;
      //CENTER OF ARMY///////////////////////////
     PVector msp = a.soldierMover.meanSoldierPosition();
      FisicaArmy3.fiscaArmy3.noStroke();
      FisicaArmy3.fiscaArmy3.stroke(255,0,0);
      FisicaArmy3.fiscaArmy3.rect(msp.x+armySelectorSize/2, msp.y-30-5,900,300);
      FisicaArmy3.fiscaArmy3.fill(255,255,0);
      FisicaArmy3.fiscaArmy3.textSize(30);
      FisicaArmy3.fiscaArmy3.text(a.soldierMover.name,msp.x+armySelectorSize/2, msp.y);
      FisicaArmy3.fiscaArmy3.text( ""+a.soldierMover.absolutPosition,msp.x+armySelectorSize/2, msp.y+30);
      FisicaArmy3.fiscaArmy3.text( "Start. "+ a.soldierMover.soldiers.size() + " Alive:"+a.soldierMover.armySizeAlive(),msp.x+armySelectorSize/2, msp.y+60);
      FisicaArmy3.fiscaArmy3.text( a.moverState.toString(),msp.x+armySelectorSize/2, msp.y+90);
      FisicaArmy3.fiscaArmy3.text( a.soldierMover.getStateName(),msp.x+armySelectorSize/2, msp.y+120);
      FisicaArmy3.fiscaArmy3.text( "Approveroute:"+a.moverStateFollowPath.approveRoute,msp.x+armySelectorSize/2, msp.y+150);
      FisicaArmy3.fiscaArmy3.text( "nextpoint:"+a.moverStateFollowPath.nextPoint,msp.x+armySelectorSize/2, msp.y+180);
      FisicaArmy3.fiscaArmy3.text( "marching:"+a.soldierMover.isMarching(),msp.x+armySelectorSize/2, msp.y+210);
      ///////////////////////////////////////////
*/

    }

}
