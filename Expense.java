public class Expense{
    private String category;
    private String description;
    private double amount;
    private String date; // In format "YYYY-MM-DD"

    public Expense(String category, String description, double amount, String date) {
        this.category = category;
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    // Getters and Setters methods
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return String.format("Date: %s | Category: %s | Amount: %.2f | Description: %s",
                date, category, amount, description);
    }
}
