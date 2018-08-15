import ddf.minim.*;  //at the very top of your sketch
PImage pictureOfRecord;  //as member variable
int rotate = 0;
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
void setup(){
size(800, 800);
pictureOfRecord= loadImage("record.jpg");  //in setup method
pictureOfRecord.resize(width,height);
minim = new Minim(this);  //in the setup method
song = minim.loadFile("Halo Theme Song Original.mp3", 512);//in the setup method
}
void draw(){
  if(mousePressed){
  song.play();
  rotateImage(pictureOfRecord,rotate);
rotate += 10;
}else {
  song.pause();
}
image(pictureOfRecord,0,0);
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}
