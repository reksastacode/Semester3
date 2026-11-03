const int PinLed = 13;
const int PinSuara = A2;
const int AmbangNilai = 200;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(PinLed, OUTPUT);
  pinMode(PinSuara, INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  int sensorSuara = analogRead(PinSuara);
  if (sensorSuara >= AmbangNilai) {
    digitalWrite(PinLed, HIGH);
    delay(500);
  }
  else{
    digitalWrite(PinLed, LOW);
  }
}
