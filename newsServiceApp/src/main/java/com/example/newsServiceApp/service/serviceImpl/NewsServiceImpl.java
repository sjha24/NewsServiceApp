package com.example.newsServiceApp.service.serviceImpl;

import com.example.newsServiceApp.service.INewsService;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements INewsService {

    private static final String CHROME_DRIVER_PATH = "path_to_chromedriver";

    @Override
    public List<String> searchNewsArticles(String searchTerm) {
            List<String> newsUrls = new ArrayList<>();

            // Automatically set up the ChromeDriver using WebDriverManager
            WebDriverManager.chromedriver().setup();

            // Optional: Set up Chrome options
            ChromeOptions options = new ChromeOptions();
            // options.addArguments("--headless");  // Run in headless mode (optional)

            // Initialize the ChromeDriver
            WebDriver driver = new ChromeDriver(options);

            try {
                // Navigate to Google News
                driver.get("https://news.google.com/");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the browser
                driver.quit();
            }

            return newsUrls;
        }
    }

}
