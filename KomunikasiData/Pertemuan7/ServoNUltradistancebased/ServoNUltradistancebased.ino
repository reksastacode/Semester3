#include <Servo.h>

const int TRIG_PIN = 13;
const int ECHO_PIN = 11;
const int SERVO_PIN = 6;
const int ledPins[6] = {3, 4, 5, 7, 8, 9};
Servo servoMotor;

void setup() {
  Serial.begin(9600);

  pinMode(TRIG_PIN, OUTPUT);
  pinMode(ECHO_PIN, INPUT);

  for (int i = 0; i < 6; i++) {
    pinMode(ledPins[i], OUTPUT);
  }

  servoMotor.attach(SERVO_PIN);
  servoMotor.write(0); // Posisi awal 0 derajat
}

void loop() {
  digitalWrite(TRIG_PIN, LOW);
  delayMicroseconds(2);
  digitalWrite(TRIG_PIN, HIGH);
  delayMicroseconds(10);
  digitalWrite(TRIG_PIN, LOW);

  long durasi = pulseIn(ECHO_PIN, HIGH);
  int jarak = durasi * 0.034 / 2;

  Serial.print("Jarak terdeteksi: ");
  Serial.print(jarak);
  Serial.println(" cm");

  if (jarak > 0 && jarak <= 3) {
    setLEDs(LOW, HIGH, HIGH, HIGH, HIGH, HIGH);
    servoMotor.write(30);
  } 
  else if (jarak > 3 && jarak <= 6) {
    setLEDs(LOW, LOW, HIGH, HIGH, HIGH, HIGH);
    servoMotor.write(60);
  } 
  else if (jarak > 6 && jarak <= 9) {
    setLEDs(LOW, LOW, LOW, HIGH, HIGH, HIGH);
    servoMotor.write(90);
  } 
  else if (jarak > 9 && jarak <= 12) {
    setLEDs(LOW, LOW, LOW, LOW, HIGH, HIGH);
    servoMotor.write(120);
  } 
  else if (jarak > 12 && jarak <= 15) {
    setLEDs(LOW, LOW, LOW, LOW, LOW, HIGH);
    servoMotor.write(150);
  } 
  else if (jarak > 15 && jarak <= 18) {
    setLEDs(LOW, LOW, LOW, LOW, LOW, LOW);
    servoMotor.write(180);
  } 
  else {
    setLEDs(HIGH, HIGH, HIGH, HIGH, HIGH, HIGH);
    servoMotor.write(0);
  }

  delay(100); // Jeda pembacaan antarsampel
}

void setLEDs(int l1, int l2, int l3, int l4, int l5, int l6) {
  digitalWrite(ledPins[0], l1);
  digitalWrite(ledPins[1], l2);
  digitalWrite(ledPins[2], l3);
  digitalWrite(ledPins[3], l4);
  digitalWrite(ledPins[4], l5);
  digitalWrite(ledPins[5], l6);
}