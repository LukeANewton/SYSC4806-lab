package lab.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BuddyInfoTest {
	private BuddyInfo aBudInfo;
	
	@Before
	public void setUp() {
		aBudInfo = new BuddyInfo("Name", "Location", "Number");
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
