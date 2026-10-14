#include <Servo.h>
#include <LiquidCrystal.h>

const int PIN_SERVO  = 11;
const int PIN_TRIG   = 9;
const int PIN_ECHO   = 10;
const int PIN_BUZZER = 12;
const int PIN_LED1   = A1;   // LED peringatan (jarak menengah)
const int PIN_LED2   = A0;  // LED bahaya (jarak sangat dekat)

// LCD: RS, E, D4, D5, D6, D7
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);

const int JARAK_PERINGATAN = 30;  // cm -> LED1 + buzzer pendek
const int JARAK_BAHAYA     = 10;  // cm -> LED2 + buzzer panjang
const int LANGKAH_SUDUT    = 5;   // derajat per langkah
const int JEDA_LANGKAH     = 60;  // ms, waktu servo stabil
const unsigned long TIMEOUT_ECHO = 30000UL; // us (~5 m)

Servo servo;

int ukurJarak() {
  digitalWrite(PIN_TRIG, LOW);
  delayMicroseconds(2);
  digitalWrite(PIN_TRIG, HIGH);
  delayMicroseconds(10);
  digitalWrite(PIN_TRIG, LOW);

  unsigned long durasi = pulseIn(PIN_ECHO, HIGH, TIMEOUT_ECHO);
  if (durasi == 0) return -1;
  return (int)(durasi * 0.0343 / 2.0);
}

void tampilkanLCD(int jarak, int sudut) {
  lcd.setCursor(0, 0);
  lcd.print("Distance:       ");
  lcd.setCursor(10, 0);
  if (jarak < 0) {
    lcd.print("---");
  } else {
    lcd.print(jarak);
    lcd.print("cm");
  }

  lcd.setCursor(0, 1);
  lcd.print("Angle:          ");
  lcd.setCursor(7, 1);
  lcd.print(sudut);
  lcd.print(" deg");
}

void atur_peringatan(int jarak) {
  bool bahaya     = (jarak >= 0 && jarak <= JARAK_BAHAYA);
  bool peringatan = (jarak >= 0 && jarak <= JARAK_PERINGATAN);

  digitalWrite(PIN_LED1, peringatan ? HIGH : LOW);
  digitalWrite(PIN_LED2, bahaya ? HIGH : LOW);

  if (bahaya) {
    tone(PIN_BUZZER, 2000, 400);   // bunyi panjang
    delay(450);
  } else if (peringatan) {
    tone(PIN_BUZZER, 1000, 100);   // bunyi pendek
    delay(120);
  } else {
    noTone(PIN_BUZZER);
  }
}

void prosesSudut(int sudut) {
  servo.write(sudut);
  delay(JEDA_LANGKAH);

  int jarak = ukurJarak();
  tampilkanLCD(jarak, sudut);
  atur_peringatan(jarak);

  Serial.print(sudut);
  Serial.print(",");
  Serial.println(jarak);
}

void setup() {
  Serial.begin(9600);

  pinMode(PIN_TRIG, OUTPUT);
  pinMode(PIN_ECHO, INPUT);
  pinMode(PIN_BUZZER, OUTPUT);
  pinMode(PIN_LED1, OUTPUT);
  pinMode(PIN_LED2, OUTPUT);

  servo.attach(PIN_SERVO);
  servo.write(0);

  lcd.begin(16, 2);
  lcd.print("Radar Parkir");
  lcd.setCursor(0, 1);
  lcd.print("Memulai...");
  delay(1500);
  lcd.clear();
}

void loop() {
  // Sapu 0 -> 180
  for (int sudut = 0; sudut <= 180; sudut += LANGKAH_SUDUT) {
    prosesSudut(sudut);
  }
  // Kembali ke 0 (langsung, tanpa pengukuran)
  servo.write(0);
  delay(500);
}
