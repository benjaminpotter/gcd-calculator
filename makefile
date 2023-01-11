all: main run

main:
	javac -d out src/Main.java
	
run:
	java -classpath out Main

clean:
	rm out/Main.class
