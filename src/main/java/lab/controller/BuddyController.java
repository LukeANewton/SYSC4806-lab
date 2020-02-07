package lab.controller;

import lab.model.AddressBook;
import lab.model.BuddyInfo;
import lab.repositories.BuddyInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BuddyController {

    @Autowired
    BuddyInfoRepository repo;

    @GetMapping(value="/buddies")
    @ResponseBody
    public AddressBook buddies() {
        Iterable<BuddyInfo> buddies = repo.findAll();
        AddressBook book = new AddressBook();
        for (BuddyInfo bud : buddies) {
            book.addBuddy(bud);
        }
        return book;
    }

    @GetMapping("/create")
    public String greetingForm(Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        return "create";
    }

    @PostMapping("/create")
    public String greetingSubmit(@ModelAttribute BuddyInfo buddy, Model model) {
        String name = buddy.getName();
        model.addAttribute("name", name);
        repo.save(buddy);
        return "result";
    }

    @GetMapping("/delete")
    public String deleteBuddy(@RequestParam("id") Long id, Model model) {
        String buddyName = "Unknown";
        BuddyInfo bInfo = repo.findById(id).orElse(null);
        if (bInfo != null) {
            buddyName = bInfo.getName();
        }
        model.addAttribute("name", buddyName);
        repo.deleteById(id);
        return "deleteResult";
    }

}
