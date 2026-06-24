package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        String path = System.getProperty("user.dir")
                + "/test-output/screenshots/"
                + testName + "_" + timestamp + ".png";

        try {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File(path);

            Files.createDirectories(destination.getParentFile().toPath());
            Files.copy(source.toPath(), destination.toPath());

        } catch (IOException e) {
            throw new RuntimeException("Screenshot failed", e);
        }

        return path;
    }
}	