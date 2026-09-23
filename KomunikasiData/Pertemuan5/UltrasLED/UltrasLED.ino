#define led 13 //Membuat variabel LED ke-pin 9
#define echoPin 8 //Membuat variabel Echo ke-pin 12
#define trigPin 9 //Membuat variabel Trig ke-pin 11
long duration, distance; //Membuat variabel untuk durasi dan jarak

void setup() {
  Serial.begin (9600); //Berfungsi untuk komunikasi serial dengan komputer
  pinMode(trigPin, OUTPUT); //Set varibel trigPin sebagai output
  pinMode(echoPin, INPUT); //Set variabel echoPin sebagai input
  pinMode(led, OUTPUT); //Set variabel led sebagai output
}void loop() {
  // Program agar Trig mengirim sinyal ultrasonik
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10); // Diubah ke 10us agar sesuai spesifikasi HC-SR04
  digitalWrite(trigPin, LOW);

  duration = pulseIn(echoPin, HIGH); // Echo menerima sinyal ultrasonik
  distance = (duration / 2) / 29.1; // Rumus mengubah durasi menjadi jarak (cm)

  // Program jika jarak kurang dari atau sama dengan 10 cm maka LED menyala
  if (distance <= 10) {
    digitalWrite(led, HIGH);
  } else {
    digitalWrite(led, LOW);
  }

  // Menampilkan jarak di serial monitor dengan jeda 0.05 detik (50 ms)
  Serial.print(distance);
  Serial.println(" cm");
  delay(50); // Sesuaikan dengan komentar (0,05 detik = 50 ms)
}