General details: 
1. The root folder is puzzle.
2. The project structure is standard one.
3. Code comprises of package named com.exercise (puzzle/src/main/com/exercise) having following classes:
   i.   ConverterFactory: Converter factory  
   ii.  Converter: Converter interface
   iii. ConverterImpl: Converter implementation
   iv.  ConverterException: Converter exception
   v.   ConverterClient: Converter client for demonstration
4. Junit test cases are also there in form of class ConverterTest (puzzle/src/test/java/com/exercise).
5. The client class is ConverterClient and it expects number as an argument.

Stand alone execution:
1. Code is already compiled and the jar file converter-1.0.jar is available in puzzle/target folder.
2. In order to run the application use the following command from the puzzle folder: 
   java -cp ./target/converter-1.0.jar com.exercise.ConverterClient 12345
   (12345 is the number supplied as argument which will be converted into words. Test using other values too.)
Fresh build:
1. In order to take fresh build and run Junit test cases following command needs to be executed inside the Puzzle folder:
   mvn clean install. (Assuming that maven is installed and the computer is connected to the internet.)

Execution through Eclipse IDE:
1. Create a new java project and use puzzle folder as the project source folder
2. Run ConverterClient class after setting run configuration (provide the input number as argument).     
   

