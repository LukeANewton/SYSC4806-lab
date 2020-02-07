package lab.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddressBookTest {
    private AddressBook book;

    @Before
    public void setUp() {
        book = new AddressBook();
    }

    @Test
    public void testEmptyAddressBook() {
        assertEquals(0, book.size());
    }


    @Test
    public void testAddressBookSizeWithTwo() {
        book.addBuddy(new BuddyInfo("name", "location", "phone"));
        book.addBuddy(new BuddyInfo("name2", "location2", "phone2"));
        assertEquals( 2, book.size());
    }

    @Test
    public void testClearedAddressBook() {
        book.addBuddy(new BuddyInfo("name3", "location3", "phone3"));
        assertTrue("", book.clear());

    }

}
