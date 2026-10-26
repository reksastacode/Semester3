#include <Servo.h>

const int PIN_LDR    = 0;   
const int PIN_SERVO  = 2;   
const int PIN_LED    = 10;  
const int PIN_BUZZER = 3;   
const int AMBANG_GELAP = 800; 

Servo servoJemuran;
bool statusGelap = false; 

void setup() {
  Serial.begin(115200);

  pinMode(PIN_LED, OUTPUT);
  pinMode(PIN_BUZZER, OUTPUT);
  pinMode(PIN_LDR, INPUT);

  servoJemuran.attach(PIN_SERVO);
  servoJemuran.write(90); 

  digitalWrite(PIN_LED, LOW);
  digitalWrite(PIN_BUZZER, LOW);
}
void loop() {
  int nilaiLDR = analogRead(PIN_LDR);
  Serial.print("Nilai Sensor LDR: ");
  Serial.println(nilaiLDR);

  if (nilaiLDR > AMBANG_GELAP) {
    digitalWrite(PIN_LED, HIGH);   
    digitalWrite(PIN_BUZZER, HIGH); 

    if (!statusGelap) {
      servoJemuran.write(0); 
      statusGelap = true;
    }
  } 
  else {
    digitalWrite(PIN_LED, LOW);   
    digitalWrite(PIN_BUZZER, LOW);  

    if (statusGelap) {
      servoJemuran.write(90); 
      statusGelap = false;
    }
  }
  delay(200);
}