int ballX = 250; 
int speed = 5;
int whySpeed = 1;
int ballY = 250;
import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup()
{
  size(500, 500); 
  minim = new Minim (this);
  sound = minim.loadSample ("ding.wav", 128);
}
void draw()
{


  background(255, 0, 0);  
  ellipse(ballX, ballY, 50, 50);
  ballX = ballX + speed;
  ballY = ballY + whySpeed;
  if (ballY == (25))
  {
    sound.trigger();
  }

  rect(mouseX, -25, 50, 50);

  if (ballX == (475))
  {
    speed = -speed;
  } else if (ballX == (25))
  {
    speed = speed + 5;
  } else if (ballY > (450))
  {
    whySpeed = -whySpeed;
  }
  /*else if(ballY < (25))
   {
   whySpeed = whySpeed + 5;
   }*/
  if (mouseX < ballX) {
    if (ballX < mouseX + 50) {
      if (ballY > -25) {
        if (ballY < 50) {
          speed = -speed;
          whySpeed = -whySpeed;
        }
      }
    }
  }
}

