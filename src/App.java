/*
* File: App.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit
* Date: 2024-12-15
* Github: https://github.com/oktat/
* Licenc: MIT
*/

/*
* File: App.java
* Refaktorálva: Varas-Tóth Gergő
* Class: Szoft II/I/N
* Date: 2024-12-23
* Github: https://github.com/valaki2004
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
nevjegy();

System.out.println("Jelszavak");
System.out.println("Verzió: 0.0.1");


Scanner sc = new Scanner(System.in);


System.out.print("Felhasználónév: ");
String userstr = sc.nextLine();
System.out.print("Jelszó: ");
String passwordstr = sc.nextLine();
System.out.print("Hely: ");
String locationstr = sc.nextLine();

sc.close();
int iSiker = 0;
try {
    Store DatasList = new Store(userstr,passwordstr, locationstr );
    FileWriter fileWriter = new FileWriter("Datas.txt");
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.print(DatasList.User);
    if(!DatasList.Locationretrival()) { printWriter.print(DatasList.Passwordretrieval()); }
    printWriter.print(DatasList.Location);
    printWriter.close();
    iSiker = 1;
} catch (IOException e) {
    System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
}

if(iSiker == 1) { System.out.println("Ok. A kiírás sikeres.");  }
else {  System.out.println("Hiba! A kiírás sikertelen"); }}

public static void nevjegy() {
    System.out.println("A késziő neve: Nagy János");
    System.out.println("A refaktoráló neve: VTG alias Varas-Tóth Gergő");
    }


}
