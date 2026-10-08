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
  // Mengirimkan pulsa ultrasonik
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  
  // Mengukur waktu pantulan dan menghitung jarak
  long durasi = pulseIn(echoPin, HIGH);
  int jarak = durasi * 0.034 / 2;
  
  // Menampilkan pembacaan jarak pada Serial Monitor
  Serial.print("Jarak: ");
  Serial.print(jarak);
  Serial.println(" cm");

  // Pengendalian LED dan Motor Servo berdasarkan jarak
  if (jarak > 0 && jarak <= batasJarak) {
    // Objek berada dalam jarak dekat
    digitalWrite(ledPin1, HIGH);
    digitalWrite(ledPin2, LOW);
    
    // Motor servo bergerak penuh ke 180 derajat
    servoMotor.write(180);
  } else {
    // Objek berada dalam jarak jauh
    digitalWrite(ledPin1, LOW);
    digitalWrite(ledPin2, HIGH);
    
    // Motor servo kembali ke posisi 0 derajat
    servoMotor.write(0);
  }
  
  delay(100);
}
