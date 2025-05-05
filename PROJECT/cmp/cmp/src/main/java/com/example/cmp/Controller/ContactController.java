package com.example.cmp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.cmp.Model.Contact;
import com.example.cmp.Repository.ContactRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/cmp")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact";
    }

    @PostMapping("/submitContact")
    @ResponseBody
    public String submitContact(@ModelAttribute Contact contact) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedNow = now.format(formatter);

        contact.setCreated_by(formattedNow);
        contact.setCreated_by("Website User");
        contact.setModified_by(formattedNow);
        contact.setModified_by("Website User");
        contact.setDelete_status("Active");

        contactRepository.save(contact);

        return "OK";
    }
}