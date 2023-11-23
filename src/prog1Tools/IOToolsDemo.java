package prog1Tools;
public class IOToolsDemo {
  public static void main (String[] args) {  
    // int-input with prompt
    System.out.print("i = "); 
    int i = IOTools.readInt();
                              
    // Simplified int-input
    int k = IOTools.readInt("k = ");

    // double-input
    double d = IOTools.readDouble("d = ");

    // char-input
    char c = IOTools.readChar("c = ");

    // boolean-input
    boolean b = IOTools.readBoolean("b = ");

    // Output
    System.out.println("Eingelesene Werte");
    System.out.println("i = " + i);
    System.out.println("k = " + k);
    System.out.println("d = " + d);
    System.out.println("c = " + c);
    System.out.println("b = " + b);
  }
}
