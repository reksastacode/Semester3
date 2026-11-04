#include <Servo.h>

const byte LED_PINS[] = {13, 12, 11, 10, 9};
const byte SERVO_PIN = 7;
const byte BUZZER_PIN = 4;

Servo myservo;

void setup() {
  Serial.begin(9600);
  for (byte i = 0; i < 5; i++) {
    pinMode(LED_PINS[i], OUTPUT);
  }
  pinMode(BUZZER_PIN, OUTPUT);
  myservo.attach(SERVO_PIN);
  myservo.write(90); 
}

void loop() {
  if (!Serial.available()) return;
  char cmd = Serial.read();

  switch (cmd) {
    // LED ON
    case '1': digitalWrite(13, HIGH); break;
    case '2': digitalWrite(12, HIGH); break;
    case '3': digitalWrite(11, HIGH); break;
    case '4': digitalWrite(10, HIGH); break;
    case '5': digitalWrite(9, HIGH); break;

    // LED OFF
    case 'a': digitalWrite(13, LOW); break;
    case 'b': digitalWrite(12, LOW); break;
    case 'c': digitalWrite(11, LOW); break;
    case 'd': digitalWrite(10, LOW); break;
    case 'e': digitalWrite(9, LOW); break;

    // Servo
    case 'L': myservo.write(0); break;
    case 'M': myservo.write(90); break;
    case 'R': myservo.write(180); break;

    // Buzzer pasif
    case 'Z': tone(BUZZER_PIN, 1000); break;
    case 'z': noTone(BUZZER_PIN); break;
  }
}