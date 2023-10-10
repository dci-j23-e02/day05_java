


public class CharLessons {
public static void main(String[] args){
  // Testing Character class
 Character ch = 'a'; // " new Character('a'); " is deprecated
  // System.out.println(ch);

  // isLetter: static method , means can be invoked by the class name
   System.out.println(Character.isLetter(ch));
 // System.out.println(Character.isLetter('0'));

  // isDigit : static method , means can be invoked by the class name
  // System.out.println(Character.isDigit('B'));
  // System.out.println(Character.isDigit('0'));

  // isWhitespace: static method
  //System.out.println(Character.isWhitespace('A')); // false
 // System.out.println(Character.isWhitespace(' ')); // true
  //System.out.println(Character.isWhitespace('0')); // false
 // System.out.println(Character.isWhitespace('\n')); // true
  //System.out.println(Character.isWhitespace('\t')); // true

  // ASCII value of tab

  // System.out.println(Character.isWhitespace(9)); // true : tab ASCII code
  // System.out.println(Character.isWhitespace('9')); // false , it is a digit

  // Example :
  char c = 'b'; // Primitive
  char[] charArray = {'a', 'b', 'c', 'd', 'e'}; // Array : MultiValues : Object







}
}
