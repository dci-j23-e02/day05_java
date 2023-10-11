import java.util.Locale;
import java.util.Scanner;

public class StringLessons {
public static void main(String[] args){

  //String test = new String("Testing new keyword");
  //System.out.println(test);
  //String greeting = "Hello ";
  //Scanner input = new Scanner(System.in);
 // System.out.println("Please Enter: your name: ");
  //String name = input.nextLine();

  //System.out.println(greeting + name.toLowerCase());

  // Finding a Character in a String

  // indexOf: returns the index of the first match otherwise -1

  // String txt = greeting + name; or like below :
  //String txt = greeting.concat(name);
  //System.out.println(txt.indexOf('l')); // 2

  // Get the length of the string:returns number of characters in the string
  //System.out.println(txt.length());


  // Checking if a keyword is contained in a String
  // contains(String keyword): returns boolean: true if found otherwise false
  String content = "I was looking for you Safwan !!!";
  String keyWord = "you";
  System.out.println(content.contains(keyWord));




}
}
