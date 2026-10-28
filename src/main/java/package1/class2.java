package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class class2 {
	@Test
	public void About() {
		WebDriver Driver=new EdgeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.puneripattern.com/about-us/");
		Driver.quit();
	}
}
