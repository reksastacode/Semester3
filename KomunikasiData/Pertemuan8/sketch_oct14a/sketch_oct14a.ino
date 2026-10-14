int pinBuzzer = 8;
int ledPin[] = {2, 3, 4, 5, 6};
int inByte = 0;

void setup() {
  Serial.begin(9600);
  for (int i = 0; i < 5; i++) {
  pinMode(ledPin[i], OUTPUT);
  }
  pinMode(pinBuzzer, OUTPUT);
}

void loop() {
  if (Serial.available() > 0) {
  inByte = Serial.read();

  if (inByte == 'a') {
  digitalWrite(ledPin[0], HIGH);
  tone(pinBuzzer, 500);
  delay(200);
  noTone(pinBuzzer);
  digitalWrite(ledPin[0], LOW);
  }
  else if (inByte == 'b') {
  digitalWrite(ledPin[1], HIGH);
  tone(pinBuzzer, 1000);
  delay(200);
  noTone(pinBuzzer);
  digitalWrite(ledPin[1], LOW);
  }
  else if (inByte == 'c') {
  digitalWrite(ledPin[2], HIGH);
  tone(pinBuzzer, 1500);
  delay(200);
  noTone(pinBuzzer);
  digitalWrite(ledPin[2], LOW);
  }
  else if (inByte == 'd') {
  digitalWrite(ledPin[3], HIGH);
  tone(pinBuzzer, 2000);
  delay(200);
  noTone(pinBuzzer);
  digitalWrite(ledPin[3], LOW);
  }
  else if (inByte == 'e') {
  digitalWrite(ledPin[4], HIGH);
  tone(pinBuzzer, 2500);
  delay(200);
  noTone(pinBuzzer);
  digitalWrite(ledPin[4], LOW);
  }

  Serial.print(char(inByte));
  }
}
