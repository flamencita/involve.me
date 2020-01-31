package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "loginCradentils")
	public Object[][] getDataFromDataprovider() {
		return new Object[][] { { "Guru99", "India" }, { "Krishna", "UK" }, { "Bhupesh", "USA" },
				{ "info@gneill.co", "Salom1984" }
		};
	}
}
