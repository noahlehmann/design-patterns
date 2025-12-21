package behavioral.template.report;

public class InventoryReport extends ReportGenerator {
    @Override
    protected void loadData() {
        System.out.println("Loading inventory data");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting inventory report");
    }
}
