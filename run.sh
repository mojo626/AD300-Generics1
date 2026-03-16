rm -rf build
mkdir build
find src/ -name "*.java" > build/sources.txt
javac @build/sources.txt -d ./build/
java -cp ./build Main
