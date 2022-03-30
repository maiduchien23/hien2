package bank.t2108a;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionHistory {
    private Long id;
    private LocalDate dayTrading;
    private String description;
    private String beneficiarAccount;
    private long money;

    public TransactionHistory(Long id, LocalDate dayTrading, String description, String beneficiarAccount, long money) {
        this.id = id;
        this.dayTrading = dayTrading;
        this.description = description;
        this.beneficiarAccount = beneficiarAccount;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDayTrading() {
        return dayTrading;
    }

    public void setDayTrading(LocalDate dayTrading) {
        this.dayTrading = dayTrading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBeneficiarAccount() {
        return beneficiarAccount;
    }

    public void setBeneficiarAccount(String beneficiarAccount) {
        this.beneficiarAccount = beneficiarAccount;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String toString(){
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id + " - " + dayTrading.format(myFormatter) + " - " + description + " - "
                + Controller.formatMoney(money) + " - " + beneficiarAccount + "\n";
    }
}
