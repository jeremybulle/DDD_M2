package fr.ubordeaux.ao;

import java.util.Set;

public class Main {
    private static  final int MAX = 100;
    public static void main(String[] args) {
        ContactSet contactSet = new ContactSet();
        Town talence = new Town("Talence", 33405);

        for (int i = 0 ; i < MAX ; i++) {
            Address address = new Address(351, "Cours de la libération", talence);
            Contact newContact = new Contact("John", "Do", address);
            contactSet.addContact(newContact);
        }
        System.out.println(MAX+" contacts created !");

        Set<Contact> resultSearch = SearchEngine.findContact("Do", contactSet.getContactSet());

        TownSet townSet = new TownSet();
        townSet.displayTown();

        // try {
        //     Thread.sleep(200000);
        // } catch (Exception ex) {
        //     ex.printStackTrace();
        // }
        
        
    }
}