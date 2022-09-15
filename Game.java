import java.net.Socket;

public class Game { // public klasse, dette er noe som vi manuelt må sette i java
    public static void main(String[] args)
    {
        Player one = new Player( "Sanchay"); //her setter vi navn på ny spiller
        System.out.println(one.name + " has joined the game");//console.log funkjsonalitet i java som skriver følgende ut
        Weapon stick = new Weapon("wooden stick", 5);// her velges våpentype og antall damage dette gjør
        System.out.println(one.name + " found a " + stick.Weapon); 
        System.out.println(one.name + " has picked up " + stick.Weapon + " which hurt " + stick.Damage + " Damage ");
    }
}
