size(1000, 1000);

int side =1000;
int otherside = 1000;
for (int i= 0; i < 200; i= i + 30){
 fill(random(255),random(255),random(255));
  ellipse(500,500, side , otherside);
  side = side -i;
  otherside = otherside -i;



}
