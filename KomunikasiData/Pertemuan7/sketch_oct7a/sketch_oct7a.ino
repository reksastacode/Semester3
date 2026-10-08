#include <Servo.h>

Servo myServo;

const int ledPin = 7;
const int servoPin = 11;

void setup() {
  // put your setup code here, to run once:
  pinMode(ledPin, OUTPUT);

  myServo.attach(servoPin);
}

void loop() {
  // put your main code here, to run repeatedly:
  for(int pos = 0; pos <= 180; pos++){
    myServo.write(pos);

    digitalWrite(ledPin, HIGH);
    delay(15);
    digitalWrite(ledPin, LOW);
  }

  for (int pos = 180; pos >= 0; pos--) {
    myServo.write(pos);

    digitalWrite(ledPin, HIGH);
    delay(15);
    digitalWrite(ledPin, LOW);
    delay(15);
  }
}
