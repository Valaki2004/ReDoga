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
//Fejrész kiírása
System.out.println("Jelszavak");
//Verzió kiírása
System.out.println("Verzió: 0.0.1");

//Az a objektummal kérhetünk be a konzolról
Scanner sc = new Scanner(System.in);

System.out.print("Felhasználónév: ");
// A b változó tárolja a jelszót
String passwordstr = sc.nextLine();
System.out.print("Jelszó: ");
String locationstr = sc.nextLine();
System.out.print("Hely: ");
String 
sc.close();
int iSiker = 0;
try {
    /* 
    A jelszó, a felhasználónév és a 
    használati helye a passList 
    objektumban van tárolva            
    */
    Store passList = new Store(passwordstr, locationstr );
    FileWriter f = new FileWriter("pass.txt");
    PrintWriter pwr = new PrintWriter(f);
    pwr.print(passList.a);
    if(!passList.hollow()) { pwr.print(passList.retrieval()); }
    pwr.print(passList.place);
    pwr.close();
    iSiker = 1;
} catch (IOException e) {
    System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
}

if(iSiker == 1) { System.out.println("Ok. A kiírás sikeres.");  }else {  System.out.println("Hiba! A kiírás sikertelen"); }

}

public static void nevjegy() {
System.out.println("Nagy János");
}
}
