const int pinLED = 5;
char data;

void setup() {
   Serial.begin(9600);
  pinMode(pinLED, OUTPUT);
}
void loop() {
  if (Serial.available() > 0) {
    data = Serial.read();
    Serial.print(data);
    Serial.print("\n");
    if (data == 'a')
      digitalWrite(pinLED, HIGH);
    else if (data == 'b')
      digitalWrite(pinLED, LOW);
  }
}