package behavioral.template.report;

public class SalesReport extends ReportGenerator {
    @Override
    protected void loadData() {
        System.out.println("Loading sales data");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting sales report");
    }
}
