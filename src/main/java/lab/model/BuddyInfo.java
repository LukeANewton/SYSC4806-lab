package lab.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
    }

    public BuddyInfo(String name, String address, String phone) {
        super();

        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
    }

    public BuddyInfo(BuddyInfo bInfo) {
        super();
        this.name = bInfo.getName();
        this.address = bInfo.getAddress();
        this.phoneNumber = bInfo.getPhoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean equals(BuddyInfo info) {
        if (info.getName().equals(this.name) &&
                info.getAddress().equals(this.address) &&
                info.getPhoneNumber().equals(this.phoneNumber)) return true;
        return false;

    }

    public String toString() {
        return "name: " + this.name +
                ",Address: " + this.address +
                ",Phone: " + this.phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}