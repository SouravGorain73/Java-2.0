public class CommandLine_Arguments{
    public static void main(String[] args) {
        System.out.println(args[1]);
    }
}

//Output

/*ts.java && java CommandLine_Arguments
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at CommandLine_Arguments.main(CommandLine_Arguments.java:3)

c:\Learn Programming\Learn JAVA\Java 2.0\Basics>javac CommandLine_Arguments.java

c:\Learn Programming\Learn JAVA\Java 2.0\Basics>java CommandLine_Arguments Hii Sourav
Hii

c:\Learn Programming\Learn JAVA\Java 2.0\Basics>javac CommandLine_Arguments.java

c:\Learn Programming\Learn JAVA\Java 2.0\Basics>java CommandLine_Argumengts Hii Sourav Gorain
Error: Could not find or load main class CommandLine_Argumengts
Caused by: java.lang.ClassNotFoundException: CommandLine_Argumengts

c:\Learn Programming\Learn JAVA\Java 2.0\Basics>java CommandLine_Arguments Hii Sourav Gorain
Sourav
*/