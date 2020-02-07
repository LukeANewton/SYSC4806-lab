package lab.controller;

import lab.model.AddressBook;
import lab.model.BuddyInfo;
import lab.repositories.BuddyInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Controller {

    private AddressBook addressBook;
    private BuddyInfoRepository repo;

    @Autowired
    public Controller(BuddyInfoRepository repository) {
        addressBook = new AddressBook();
        repo = repository;
    }

    public void addBuddy(BuddyInfo aBud) {
        addressBook.addBuddy(aBud);
        repo.save(aBud);
        // fetch all customers
        System.out.println("Buddies found with findAll():");
        System.out.println("-------------------------------");
        for (BuddyInfo customer : repo.findAll()) {
            System.out.println(customer.toString());
        }
        System.out.println();
        System.out.println(addressBook.toString());
    }

    public void removeBuddy(int aBudIndex) {
        addressBook.removeBuddy(aBudIndex);
    }
}

