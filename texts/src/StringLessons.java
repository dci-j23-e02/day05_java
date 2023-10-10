import java.util.Locale;
import java.util.Scanner;

public class StringLessons {
public static void main(String[] args){
  String greeting = "Hello ";

  Scanner input = new Scanner(System.in);
  System.out.println("Please Enter: your name: ");
  String name = input.nextLine();

  System.out.println(greeting + name.toLowerCase());

}
}
