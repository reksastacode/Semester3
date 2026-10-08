#include <Servo.h>

// Deklarasi Pin Utama
const int TRIG_PIN = 13;
const int ECHO_PIN = 11;
const int SERVO_PIN = 6;

// Array Pin LED 1 sampai 6 (Pin 3, 4, 5, 7, 8, 9)
const int ledPins[6] = {3, 4, 5, 7, 8, 9};

Servo servoMotor;

void setup() {
  Serial.begin(9600);

  // Konfigurasi Pin Ultrasonik
  pinMode(TRIG_PIN, OUTPUT);
  pinMode(ECHO_PIN, INPUT);

  // Konfigurasi Pin LED sebagai Output
  for (int i = 0; i < 6; i++) {
    pinMode(ledPins[i], OUTPUT);
  }

  // Konfigurasi Servo
  servoMotor.attach(SERVO_PIN);
  servoMotor.write(0); // Posisi awal 0 derajat
}

void loop() {
  // Mengirim pulsa trig ultrasonik
  digitalWrite(TRIG_PIN, LOW);
  delayMicroseconds(2);
  digitalWrite(TRIG_PIN, HIGH);
  delayMicroseconds(10);
  digitalWrite(TRIG_PIN, LOW);

  // Membaca waktu pantulan sinyal dan menghitung jarak (cm)
  long durasi = pulseIn(ECHO_PIN, HIGH);
  int jarak = durasi * 0.034 / 2;

  // Tampilkan jarak pada Serial Monitor
  Serial.print("Jarak terdeteksi: ");
  Serial.print(jarak);
  Serial.println(" cm");

  // Logika Pengendalian LED dan Servo Berdasarkan Jarak
  if (jarak > 0 && jarak <= 3) {
    // Jarak <= 3 cm: LED 1 Mati, LED 2-6 Menyala. Servo: 30°
    setLEDs(LOW, HIGH, HIGH, HIGH, HIGH, HIGH);
    servoMotor.write(30);
  } 
  else if (jarak > 3 && jarak <= 6) {
    // Jarak 4 - 6 cm: LED 1 & 2 Mati, LED 3-6 Menyala. Servo: 60°
    setLEDs(LOW, LOW, HIGH, HIGH, HIGH, HIGH);
    servoMotor.write(60);
  } 
  else if (jarak > 6 && jarak <= 9) {
    // Jarak 7 - 9 cm: LED 1, 2, & 3 Mati, LED 4-6 Menyala. Servo: 90°
    setLEDs(LOW, LOW, LOW, HIGH, HIGH, HIGH);
    servoMotor.write(90);
  } 
  else if (jarak > 9 && jarak <= 12) {
    // Jarak 10 - 12 cm: LED 1, 2, 3, & 4 Mati, LED 5-6 Menyala. Servo: 120°
    setLEDs(LOW, LOW, LOW, LOW, HIGH, HIGH);
    servoMotor.write(120);
  } 
  else if (jarak > 12 && jarak <= 15) {
    // Jarak 13 - 15 cm: LED 1, 2, 3, 4, & 5 Mati, LED 6 Menyala. Servo: 150°
    setLEDs(LOW, LOW, LOW, LOW, LOW, HIGH);
    servoMotor.write(150);
  } 
  else if (jarak > 15 && jarak <= 18) {
    // Jarak 16 - 18 cm: Semua LED Mati. Servo: 180°
    setLEDs(LOW, LOW, LOW, LOW, LOW, LOW);
    servoMotor.write(180);
  } 
  else {
    // Jarak > 18 cm (Di luar rentang): Semua LED Menyala. Servo: 0°
    setLEDs(HIGH, HIGH, HIGH, HIGH, HIGH, HIGH);
    servoMotor.write(0);
  }

  delay(100); // Jeda pembacaan antarsampel
}

// Fungsi bantu untuk mengatur status 6 LED secara terstruktur
void setLEDs(int l1, int l2, int l3, int l4, int l5, int l6) {
  digitalWrite(ledPins[0], l1);
  digitalWrite(ledPins[1], l2);
  digitalWrite(ledPins[2], l3);
  digitalWrite(ledPins[3], l4);
  digitalWrite(ledPins[4], l5);
  digitalWrite(ledPins[5], l6);
}