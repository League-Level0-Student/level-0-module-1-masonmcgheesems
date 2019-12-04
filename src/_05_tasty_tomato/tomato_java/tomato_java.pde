
void setup() {
  size(1000, 1000);
}
void draw() {
 // background(200, 200, 200);
  noStroke();
  fill(#FAB803);
  ellipse(150, 200, 150, 150);
  fill(#FAB803);
  ellipse(212, 200, 150, 150);
  fill(#03FA29);
  rect(176, 103, 12, 32);
  fill(#FF1530);
  ellipse (mouseX, mouseY, 200, 200);


  if ( mousePressed) {
    if (mouseButton == LEFT) {
      fill(#FF1530);
      ellipse(mouseX, mouseY, 200, 200);
    }
  }
}
