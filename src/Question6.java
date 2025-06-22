// Implement a banking system using java. Create 3 sub class of Bank : SBI, BOI, ICICI Classes
// should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate.
// All 3 should have following methods: 1. add getters and setters for the fields 2. print details of every bank (override toString)
class Bank {
    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    // Constructor
    public Bank(String name, String headOfficeAddress, String chairmanName,
                int branchCount, double fdInterestRate,
                double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    // Override toString to print bank details
    @Override
    public String toString() {
        return "Bank Name: " + name + "\n" +
                "Head Office Address: " + headOfficeAddress + "\n" +
                "Chairman Name: " + chairmanName + "\n" +
                "Branch Count: " + branchCount + "\n" +
                "FD Interest Rate: " + fdInterestRate + "%\n" +
                "Personal Loan Interest Rate: " + personalLoanInterestRate + "%\n" +
                "Home Loan Interest Rate: " + homeLoanInterestRate + "%";
    }
}

// SBI subclass
class SBI extends Bank {
    public SBI() {
        super("State Bank of India", "Mumbai, India", "Dinesh Kumar Khara",
                22000, 6.5, 10.5, 8.5);
    }
}

// BOI subclass
class BOI extends Bank {
    public BOI() {
        super("Bank of India", "Mumbai, India", "Atanu Kumar Das",
                5100, 6.0, 11.0, 9.0);
    }
}

// ICICI subclass
class ICICI extends Bank {
    public ICICI() {
        super("ICICI Bank", "Mumbai, India", "Sandeep Bakhshi",
                5200, 5.5, 12.5, 9.5);
    }
}

public class Question6 {
    public static void main(String[] args) {
        // Create instances of each bank
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();
        System.out.println("SBI Bank Details");
        System.out.println(sbi);
        System.out.println("\nBOI Bank Details");
        System.out.println(boi);
        System.out.println("\nICICI Bank Details");
        System.out.println(icici);

        // Example of using setters
        sbi.setFdInterestRate(7.0);
        System.out.println("\nUpdated SBI FD Rate: " + sbi.getFdInterestRate() + "%");
    }
}
