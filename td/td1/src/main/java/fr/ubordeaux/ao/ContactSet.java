package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Set;

public class ContactSet {
    private Set<Contact> contactSet;

    public ContactSet() {
        contactSet = new HashSet<Contact>();
    }

    public void addContact(Contact newContact) {
        contactSet.add(newContact);
    }

    public void removeContact(Contact oldContact) {
        contactSet.remove(oldContact);
    }

    public int size() {
        return contactSet.size();
    }

    public Set<Contact> getContactSet() {
        Set<Contact> result = new HashSet<Contact>();
        for (Contact contact : contactSet) {
            result.add(contact);
        }
        return result;
    }
}