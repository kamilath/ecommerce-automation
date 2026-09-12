package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import utils.ConfigReader;

public class ExtentReportManager {

    private static ExtentReports extent;

    public static ExtentReports getReportInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter(
                            "target/extent-report.html"
                    );

            spark.config().setReportName(
                    "E-Commerce Automation Report"
            );

            spark.config().setDocumentTitle(
                    "Automation Test Report"
            );

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo(
                    "OS",
                    System.getProperty("os.name")
            );

            extent.setSystemInfo(
                    "Java",
                    System.getProperty("java.version")
            );

            extent.setSystemInfo(
                    "Browser",
                    ConfigReader.get("browser")
            );

            extent.setSystemInfo(
                    "Environment",
                    ConfigReader.getEnvironment()
            );
        }

        return extent;
    }
}