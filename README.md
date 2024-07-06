# Belajar-Maven

# Membuat Java Project : 

mvn archetype:generate

maven-archetype-quickstart

# Contoh Lifecycle

mvn clean  # Membersihkan direktori target

mvn compile # Mengkompilasi kode sumber

mvn test # Menjalankan unit test

mvn package # Membuat file distribusi

mvn install # Menginstal file distribusi ke repositori lokal

mvn deploy # Mengunggah file distribusi ke repositori remote


# Mencari Dependency: 

https://search.maven.org/

https://mvnrepository.com/

# Menggunakan Assembly Plugin

https://maven.apache.org/plugins/maven-assembly-plugin/usage.html

mvn package assembly:single

YG SUDAH JADI :

java -jar artifacid-1.0-SNAPSHOT-jar-with-dependencies.jar