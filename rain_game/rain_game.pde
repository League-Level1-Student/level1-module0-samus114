int x = 400;
int y = 0;
int score = 0;
void setup(){
  size(800,800);
}
void draw(){
  background(0,190,234);
  fill(0, 0, 255);
stroke(0, 190, 234);
ellipse(x,y, 20, 20);
fill(132, 131, 121);
rect(mouseX, 675, 100, 125);
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
y+=10;
if(y>height){
   checkCatch(x);
  y=0;
  x = (int) random(width);
}
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }
