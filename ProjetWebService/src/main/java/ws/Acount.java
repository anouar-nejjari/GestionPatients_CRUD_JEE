package ws;

import javax.xml.crypto.Data;
import java.util.Date;

public class Acount {
    private int code;
    private double balance;
    private Date createdAt;

    public Acount() { }

    public Acount(int code, double balance, Date createdAt) {
        this.code = code;
        this.balance = balance;
        this.createdAt = createdAt;
    }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
}
