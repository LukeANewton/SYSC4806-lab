package lab.model;

import javax.persistence.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    private int myId;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public AddressBook(ArrayList<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public void setBuddies(List<BuddyInfo> bInfos) {
        this.buddies = bInfos;
    }

    public void addBuddy(BuddyInfo aBudInfo) {
        buddies.add(aBudInfo);
    }

    public void removeBuddy(int index) {
        buddies.remove(index);
    }

    @Override
    public String toString() {

        String ret = "";
        for (BuddyInfo bud : buddies) {
            ret += " Name: " + bud.getName()
                    + "~ Address: " + bud.getAddress()
                    + "~ Number: " + bud.getPhoneNumber() + " \n";

        }
        return ret;
    }

    public int size() {
        return buddies.size();
    }

    public boolean clear() {
        buddies.clear();
        return true;
    }

    public void export() throws IOException {
        String s = "";
        for (BuddyInfo buddy : buddies) {
            String x = buddy.toString();
            s += (x + "\n");
        }
        BufferedWriter out = new BufferedWriter(new FileWriter("myFile.txt"));
        out.write(s);
        out.close();
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }
}
