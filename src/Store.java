/*
* File: Store.java
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

public class Store {
    
    String User;
    String Password;
    String Location;
    
    public Store(String user, String password, String location) {
        this.User = user;
        this.Password = password;
        this.Location = location;
    }
    public String Passwordretrieval() {
        return Password;
    }
    public boolean Locationretrival() {
        if(this.Location == "") {
            return true;
        }else {
            return false;
        }
    }
}
