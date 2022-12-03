float t;
void setup () {
	background (20) ;
	size (500, 500) ;
}

void draw() {
	stroke (255) ;
	strokeWeight (5) ;
	translate (width/2, height /2) ;
	line(x1(t), y1 (t), x2 (t), y2 (t));
	t++;
}
float x1 (float t) {
  return sin(t / 10) * 100 + sin(t / 5) * 20;
}

float y1 (float t) {
  return cos(t / 10) * 100;
}

float x2 (float t) {
  return sin(t / 10) * 200 + sin(t)* 2;
}

float y2(float t) {
  return cos(t / 20) * 200 + cos(t / 12) * 20;
}
