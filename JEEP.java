import java.io.*;
import java.util.*;

public class JEEP{
public static void main(String arg[]){

Scanner Eight = new Scanner(System.in);

System.out.println("Input a negative number");
double Neg = Eight.nextInt();
System.out.println("Input number greater than "+ Math.abs(Neg));
double Pos = Eight.nextInt();
double LOVE = Math.random()*(Pos)-Neg;
System.out.print(LOVE);

System.out.println();
System.out.println();System.out.println();
System.out.println();

System.out.println("What's your full name");
String ONE = Eight.nextLine();
System.out.println("How old are you?");
int TWO = Eight.nextInt();
System.out.println("How far is it to your house from exactly where you are with out units?");
double THREE = Eight.nextDouble();
System.out.println(ONE + " from earth... they look about " + TWO + " years old, but it's kinda hard to tell. They're far from home though, why would they be out hear though? That's about " + THREE + " lightyears away.");

//* Sorry for my poor story telling ability.
}}