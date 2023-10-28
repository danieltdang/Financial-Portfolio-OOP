import java.util.*;

class SavingsAccount
{
    private String acc_num;
    private double acc_bal;
    
    public void set_acc_num(String acc_num) { this.acc_num = acc_num; }
    public void set_acc_bal(double acc_bal) { this.acc_bal = acc_bal; }
    
    public String get_acc_num() { return acc_num; }
    public double get_acc_bal() { return acc_bal; }
}

class Bonds
{
    private String bond_name;
    private double face_val;
    private int bond_num;
    
    public void set_bond_name(String bond_name) { this.bond_name = bond_name; }
    public void set_face_val(double face_val) { this.face_val = face_val; }
    public void set_bond_num(int bond_num) { this.bond_num = bond_num; }
    
    public String get_bond_name() { return bond_name; }
    public double get_face_val() { return face_val; }
    public int get_bond_num() { return bond_num; }
}

class Stocks
{
    private String stock_name;
    private float stock_val;
    private int shares_num;
    
    public void set_stock_name(String stock_name) { this.stock_name = stock_name; }
    public void set_stock_val(float stock_val) { this.stock_val = stock_val; }
    public void set_shares_num(int shares_num) { this.shares_num = shares_num; }
    
    public String get_stock_name() { return stock_name; }
    public float get_stock_val() { return stock_val; }
    public int get_shares_num() { return shares_num; }
}

class FinancialPortfolio
{
    public FinancialPortfolio() 
    {
        first_name = "";
        last_name = "";
        p_num = 0;
        p_val = 0;
        SA = new SavingsAccount();
        B = new Bonds();
        S = new Stocks();
    }
    
    private String first_name;
    private String last_name;
    private int p_num;
    private double p_val;
    
    private SavingsAccount SA;
    private Bonds B;
    private Stocks S;
    
    // setters
    public void set_first_name(String first_name) { this.first_name = first_name; }
    public void set_last_name(String last_name) { this.last_name = last_name; }
    public void set_p_num(int p_num) { this.p_num = p_num; }
    public void set_p_val(double p_val) { this.p_val = p_val; }
    
    // getters
    public String get_first_name() { return first_name; }
    public String get_last_name() { return last_name; }
    public int get_p_num() { return p_num; }
    public double get_p_val() { return p_val; }
    public SavingsAccount get_SA() { return SA; }
    public Bonds get_B() { return B; }
    public Stocks get_S() { return S; }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FinancialPortfolio fp = new FinancialPortfolio();

        System.out.print("Enter first name: ");
        String first_name = input.next();
        fp.set_first_name(first_name);
        
        input.close();

        System.out.println("Portfolio Name: " + fp.get_first_name() + "'s Portfolio");
        System.out.println("Saving's account: " + "($" + ")");
        System.out.println("Bonds: " + "($" + ")");
        System.out.println("Stocks: " + "($" + ")");
        System.out.println("Portfolio value: $" );
    }
}