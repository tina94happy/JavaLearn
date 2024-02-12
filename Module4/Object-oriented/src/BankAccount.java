import java.util.Random;

public class BankAccount {
    private String holder_name;
    private Long account_number;
    private Integer balance;
    private static Integer total_account=0;
    private static Integer totalBalance=0;
    private String acccount_type;
    private Integer checking_count = 3;


    public BankAccount (String holder_name, Integer startingBalance, String acccount_type){
        this. holder_name = holder_name;
        this.balance = startingBalance;
        this.account_number = generateAccountNumber();
        this.acccount_type = acccount_type;
        total_account++;
        totalBalance += balance;
    }

    private long generateAccountNumber() {
        Random random = new Random();
        return 10000000000L + random.nextInt(90000000);
    }

    public void display() {
        System.out.println("帳戶持有人名稱: " + holder_name);
        System.out.println("帳戶號碼: " + account_number);
        System.out.println("帳戶類型: " + acccount_type);
        System.out.println("現在餘額: $" + balance);
    }
    public static String totalAccounts () {
        return "帳戶總數:"+ Integer.toString(total_account);
    }
    public static String totalBalance () {
        return "全帳戶金額:"+ Integer.toString(totalBalance);
    }

    public void deposit(Integer amount) {
        balance += amount;
        totalBalance += amount;
        System.out.println(String.format("%s 收入 %d, 目前存款為: %d ",holder_name, amount, balance));
    }

    public void transferTo(BankAccount destinationAccount, Integer amount) {
        balance -= amount;
        destinationAccount.balance += amount;
        System.out.println(String.format("%s 轉出 %d 元給 %s ", holder_name, amount, destinationAccount.holder_name));
        System.out.println(String.format("目前%s存款為: %d, %s存款為: %d ",holder_name, balance, destinationAccount.holder_name, destinationAccount.balance));
    }

    public void transferFrom(BankAccount sourceAccount, Integer amount) {
        balance += amount;
        sourceAccount.balance -= amount;
        System.out.println(String.format("%s 轉入 %d 元給 %s ", sourceAccount.holder_name, amount, holder_name));
        System.out.println(String.format("目前%s存款為: %d, %s存款為: %d ",holder_name, balance, sourceAccount.holder_name, sourceAccount.balance));
    }

    public void withdraw(Integer amount) {
        if (amount < balance){
            balance -= amount;
            totalBalance -= amount;
            System.out.println(String.format("%s 剛剛取出 %d, 目前存款為: %d ",holder_name, amount, balance));
        } else {
            System.out.println("餘額不足");
        }
    }

    public void withCheck(Integer amount) {
        if (amount < balance && checking_count >0){
            balance -= amount;
            totalBalance -= amount;
            checking_count --;
            System.out.println(String.format("剛剛取出 %d, 目前存款為: %d ", amount, balance));
        } else {
            System.out.println("餘額不足或轉出次數超過3次");
        }
    }

    public static void main(String[] args) {
        BankAccount tina_saving = new BankAccount("tina",0, "savings");
        BankAccount tina_checking = new BankAccount("tina",1000, "checking");
        BankAccount AC_saving = new BankAccount("AC",0, "savings");
        tina_saving.display();
        tina_saving.deposit(1000);
        tina_saving.deposit(99);
        tina_saving.withCheck(19);
        tina_saving.withCheck(12);
        tina_saving.withCheck(2);
        tina_saving.withCheck(1);
        tina_saving.transferTo(AC_saving, 100);
        tina_saving.transferFrom(AC_saving,20);
        tina_checking.withdraw(10);

        System.out.println(totalBalance());
        System.out.println(totalAccounts());

    }


}


