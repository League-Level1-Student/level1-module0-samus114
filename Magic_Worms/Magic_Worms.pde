float x = 0;
float y = 0;
void setup(){
  size(800,800);
  background(0,0,0);
}
void draw(){
   makeMagical(); 
   for(int i = 0;i<300;i++){
  x=getWormX(i);
  y=getWormY(i);
  fill(frameCount,frameCount,frameCount);
 ellipse(x,y, 20,20);
   }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
