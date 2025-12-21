package behavioral.template;

import behavioral.template.report.InventoryReport;
import behavioral.template.report.ReportGenerator;
import behavioral.template.report.SalesReport;

public class Main {
    public static void main(String[] args) {
        ReportGenerator report = new SalesReport();
        report.generateReport();
        report = new InventoryReport();
        report.generateReport();
    }
}
