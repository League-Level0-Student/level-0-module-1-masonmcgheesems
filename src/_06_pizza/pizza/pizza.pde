PImage pepperoni;
void setup() {
  pepperoni = loadImage("Pepperoni_Slice.jpg");
    size(1000, 1000);
}
void draw() {
   fill(#622E04);
ellipse(500,500,450,450);
image(pepperoni, 300, 300,450,450);

}
