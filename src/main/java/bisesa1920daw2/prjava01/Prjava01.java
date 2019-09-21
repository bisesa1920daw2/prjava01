/*
 * 
 */
package bisesa1920daw2.prjava01;

import java.io.*;

/**
 *
 * @author bisesa1920daw2
 */
public class Prjava01 {
    public static void main(String[] args) throws IOException {
        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write("<html>"); bw.newLine();
            bw.write("  <head>"); bw.newLine();
            bw.write("      <title>"); bw.newLine();
            bw.write("          Nova p&agrave;gina web"); bw.newLine();
            bw.write("      </title>"); bw.newLine();
            bw.write("  </head>"); bw.newLine();
            bw.write("  <body>"); bw.newLine();
            bw.write("      Nova p&agrave;gina web"); bw.newLine();
            bw.write("  </body>"); bw.newLine();
            bw.write("</html>"); bw.newLine();
            bw.close();
        }
    }
}
