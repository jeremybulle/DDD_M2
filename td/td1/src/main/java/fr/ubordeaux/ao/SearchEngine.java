package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

public abstract class SearchEngine{
    
    public static Set<Contact> findContact(String identifiant, Set<Contact> setContact){
        Set<Contact> result = new HashSet<Contact>();
        for(Contact contact : setContact){
            if(identifiant == contact.getFirstName()){
                result.add(contact);
            }
            if(identifiant == contact.getSecondName()){
                result.add(contact);
            }
        }
        if(result.isEmpty()){
            System.out.println("Pas de contact correspondant");
            return result;
        }{
            System.out.println("Conctact trouvé");
            return result;
        }
    }
}