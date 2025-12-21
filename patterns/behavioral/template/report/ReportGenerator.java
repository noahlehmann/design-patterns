package behavioral.template.report;

public abstract class ReportGenerator {
    public final void generateReport() {
        loadData();
        formatData();
        exportReport();
    }

    protected abstract void loadData();
    protected abstract void formatData();

    protected void exportReport() {
        System.out.println("Exporting report");
    }
}
