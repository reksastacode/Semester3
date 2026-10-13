#include <Servo.h>

Servo myServo;
const int ledPin1 = 13;
const int ledPin2 = 12;
const int servoPin = 7;
const int trigPin = 9;
const int echoPin = 8;
const int batasJarak = 20;
Servo servoMotor;

void setup() {
  Serial.begin(9600);
  
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(ledPin1, OUTPUT);
  pinMode(ledPin2, OUTPUT);
  
  servoMotor.attach(servoPin);
  servoMotor.write(0); // Posisi awal servo di 0 derajat
}

void loop() {
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  
  long durasi = pulseIn(echoPin, HIGH);
  int jarak = durasi * 0.034 / 2;
  
  Serial.print("Jarak: ");
  Serial.print(jarak);
  Serial.println(" cm");

  if (jarak > 0 && jarak <= batasJarak) {
    digitalWrite(ledPin1, HIGH);
    digitalWrite(ledPin2, LOW);
    
    servoMotor.write(180);
  } else {
    digitalWrite(ledPin1, LOW);
    digitalWrite(ledPin2, HIGH);
    
    servoMotor.write(0);
  }
  delay(100);
}
