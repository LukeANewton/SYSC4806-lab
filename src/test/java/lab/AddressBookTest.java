package lab;

import lab.model.AddressBook;
import lab.model.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddressBookTest {
    private AddressBook book;

    @Before
    public void setUp() {
        book = new AddressBook();
    }

    @Test
    public void testEmptyAddressBook() {
        assertTrue(0 == book.size());
    }

    @Test
    public void testAddressBookSizeWithTwo() {
        book.addBuddy(new BuddyInfo("name", "location", "phone"));
        book.addBuddy(new BuddyInfo("name2", "location2", "phone2"));
        assertTrue(2 == book.size());
    }

    @Test
    public void testClearedAddressBook() {
        book.addBuddy(new BuddyInfo("name3", "location3", "phone3"));
        assertTrue("", book.clear());

    }

}
