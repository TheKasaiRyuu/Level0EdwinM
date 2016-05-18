void setup()
{
size(750, 750);  
background(0,0,0);  
//ellipse();


}
void draw()
{
  /*int randomX = random(200) + 100
  int randomY = random*/
  fill(255,255,255);
  ellipse(250, 250, 100, 100);
  ellipse(500, 250, 100, 100);
  
  fill(0,0,0);
  ellipse(mouseX, mouseY, 50, 50);
  ellipse(mouseX + 250, mouseY, 50, 50);
  
  if(mouseY < 150){
  fill(255,0,0);
  ellipse(250, 250, 100, 100);
  ellipse(500, 250, 100, 100);
  }
  
  if (mouseY > 300 || mouseX < 200 || mouseY < 150 || mouseX > 300){
  fill(0,0,0);
  ellipse(250, 250, 50, 50);
  ellipse(500, 250, 50, 50);
   }

}
