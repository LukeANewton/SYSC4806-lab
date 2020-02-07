package lab;

import lab.model.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BuddyInfoTest {
	private BuddyInfo aBudInfo;
	
	@Before
	public void setUp() {
		aBudInfo = new BuddyInfo("Name", "Location", "Number");
	}

	@Test
	public void testBuddyInfoConstructor() {
		assertTrue("", aBudInfo.equals(new BuddyInfo(aBudInfo)));
	}
	
	@Test
	public void testBuddyInfoGreeting() {
		String actualGreeting = aBudInfo.getGreeting();
		assertEquals("", "Hello", actualGreeting);
	}

	@Test
	public void getName() {
		assertEquals("Name", aBudInfo.getName());
	}

	@Test
	public void setName() {
		aBudInfo.setName("SettingName");
		assertEquals("SettingName", aBudInfo.getName());
	}

	@Test
	public void getAddress() {
		assertEquals("Location", aBudInfo.getAddress());
	}

	@Test
	public void setAddress() {
		aBudInfo.setAddress("SettingLocation");
		assertEquals("SettingLocation", aBudInfo.getAddress());
	}

	@Test
	public void getPhoneNumber() {
		assertEquals("Number", aBudInfo.getPhoneNumber());
	}

	@Test
	public void setPhoneNumber() {
		aBudInfo.setPhoneNumber("SettingPhone");
		assertEquals("SettingPhone", aBudInfo.getPhoneNumber());
	}
}
