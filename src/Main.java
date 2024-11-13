import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("poem.txt"))
        {
            writer.write("Roses are red\n Violets are blue\n Booty, booty, booty\n Rockin' everywhere!");
            writer.append("\n A poem by me!");
            // Use append method to append string
        }

        catch (IOException e) {

        }
    }
}