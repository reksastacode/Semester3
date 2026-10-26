const int LDR_PIN = 0;   
const int LED_PIN = 10; 


void setup() {
  pinMode(LED_PIN, OUTPUT);
  pinMode(LDR_PIN, INPUT);

  digitalWrite(LED_PIN, LOW);
}

void loop() {
  int cahaya = analogRead(LDR_PIN);

  if (cahaya < 800) {
    digitalWrite(LED_PIN, HIGH); 
  } else {
    digitalWrite(LED_PIN, LOW);  
  }
}