run: compile
	echo "Add command to run the program here"

compile:
	echo "Use this rule to compile all necessary java source files"
idataWrangler: StateData.class StateLoader.class

StateData.class: StateData.java
        javac StateData.java

StateLoader.class: StateLoader.java
        javac StateLoader.java
