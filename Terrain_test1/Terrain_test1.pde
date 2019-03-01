import fisica.*;
FWorld world;
ArrayList<PVector> vList = new ArrayList<PVector>();
boolean insertVertex = false;
boolean createShape  = false; 
Soldier soldier;

void setup() {
  size(800, 800);
  smooth();
  Fisica.init(this);
  world = new FWorld();
  world.setGravity(0, 0);
  soldier = new Soldier();
}

void draw() {
  world.step();
  world.draw();  
  for (PVector p : vList)ellipse(p.x, p.y, 5, 5);
}

void keyPressed() {
  if (key == 'c') {println("create shape!");createAShape();} 
  if (key == 'd') {println("clear points!");vList.clear();}
  if (key == 's') {println("create soldier");createSoldier();}
  soldier.move(key);
}

void createSoldier(){
  world.remove(soldier);
  world.add(soldier);
}

void insertVertex() {
  vList.add(new PVector(mouseX, mouseY));
}

void createAShape() {  
  if (!vList.isEmpty()) {
    NiveauShape l = new NiveauShape();
    for (PVector p : vList)l.vertex(p.x, p.y);
    world.add(l);
  }
  vList.clear();
}

public void contactStarted(FContact c) {
  println("contact");
}

void mousePressed() {
  insertVertex();
}