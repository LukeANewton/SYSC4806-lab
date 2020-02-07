package lab.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuddyInfoTest {
	private BuddyInfo aBudInfo;
	
	@BeforeEach
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
