import java.util.Scanner;

public class Customer {
    // public String customerId = "001";
    // public String customerFirstname = "Kuntapat";
    // public String customerLastname = "Asawaworarit";
    // public String customerPhoneNumber = "097-094-4141";
    // public String address = "Mahidol University";
    public String customerId;
    public String customerFirstname;
    public String customerLastname;
    public String customerPhoneNumber;
    public String address;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input Customer info
        System.out.print("Enter Customer ID: ");
        String customerId = sc.nextLine();
        System.out.print("Enter First Name: ");
        String customerFirstname = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String customerLastname = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String customerPhoneNumber = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        // Input Vehicle info
        System.out.print("Vehicle Serial Number: ");
        String serialNumber = sc.nextLine();
        System.out.print("Vehicle Name: ");
        String name = sc.nextLine();
        System.out.print("Manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.print("Year: ");
        String year = sc.nextLine();
        System.out.print("Base Cost: ");
        String baseCost = sc.nextLine();
        // Input Dealer info
        System.out.print("Dealer Option Code: ");
        String optionCode = sc.nextLine();
        System.out.print("Description: ");
        String description = sc.nextLine();
        System.out.print("Price: ");
        String price = sc.nextLine();
        // Input TradeIn info
        System.out.print("TradeIn Serial Number: ");
        String serialNumberTradeIn = sc.nextLine();
        System.out.print("Make: ");
        String make = sc.nextLine();
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Year: ");
        String yearTradeIn = sc.nextLine();
        // Input TradeIn info
        System.out.print("Invoice ID: ");
        String invoiceId = sc.nextLine();
        System.out.print("Date: ");
        String date = sc.nextLine();
        System.out.print("Final Price: ");
        String finalPrice = sc.nextLine();
        System.out.print("TradeIn Allowance: ");
        String tradeInAllowance = sc.nextLine();
        System.out.print("Taxes: ");
        String taxes = sc.nextLine();
        System.out.print("License Fee: ");
        String licenseFee = sc.nextLine();
        System.out.print("Customer Signature: ");
        String customerSignature = sc.nextLine();
        // Input TradeIn info
        System.out.print("Invoice ID: ");
        String salespersonID = sc.nextLine();
        System.out.print("SalesPerson ID: ");
        String namesalesPerson = sc.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = sc.nextLine();

        // Customer
        Customer customer = new Customer();
        customer.customerId = customerId;
        customer.customerFirstname = customerFirstname;
        customer.customerLastname = customerLastname;
        customer.customerPhoneNumber = customerPhoneNumber;
        customer.address = address;
        // Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.serialNumber = serialNumber;
        vehicle.name = name;
        vehicle.manufacturer = manufacturer;
        vehicle.year = Integer.parseInt(year);
        vehicle.baseCost = Integer.parseInt(baseCost);
        // Dealer
        Dealer dealer = new Dealer();
        dealer.optionCode = Integer.parseInt(optionCode);
        dealer.description = description;
        dealer.price = Integer.parseInt(price);
        // TradeIn
        TradeIn tradeIn = new TradeIn();
        tradeIn.serialNumberTradeIn = serialNumberTradeIn;
        tradeIn.make = make;
        tradeIn.model = model;
        tradeIn.yearTradeIn = Integer.parseInt(yearTradeIn);
        // Invoice
        Invoice invoice = new Invoice();
        invoice.invoiceId = invoiceId;
        invoice.date = Integer.parseInt(date);
        invoice.finalPrice = Float.parseFloat(finalPrice);
        invoice.tradeInAllowance = Float.parseFloat(tradeInAllowance);
        invoice.taxes = Float.parseFloat(taxes);
        invoice.licenseFee = Float.parseFloat(licenseFee);
        invoice.customerSignature = customerSignature;
        // SalesPerson
        SalesPerson salesPerson = new SalesPerson();
        salesPerson.salespersonID = salespersonID;
        salesPerson.namesalesPerson = namesalesPerson;
        salesPerson.phoneNumber = phoneNumber;

        // Customer output
        System.out.println("-----------------Customer OBJECT----------------");
        System.out.println("Customer ID: " + customer.customerId);
        System.out.println("First Name: " + customer.customerFirstname);
        System.out.println("Last Name: " + customer.customerLastname);
        System.out.println("Phone Number: " + customer.customerPhoneNumber);
        System.out.println("Address: " + customer.address);
        // Vehicle output
        System.out.println("-----------------Vehicle OBJECT----------------");
        System.out.println("Vehicle Serial Number: " + vehicle.serialNumber);
        System.out.println("Vehicle Name: " + vehicle.name);
        System.out.println("Manufacturer: " + vehicle.manufacturer);
        System.out.println("Year: " + vehicle.year);
        System.out.println("Base Cost: " + vehicle.baseCost);
        // Dealer output
        System.out.println("-----------------Dealer OBJECT----------------");
        System.out.println("Dealer Option Code: " + dealer.optionCode);
        System.out.println("Description: " + dealer.description);
        System.out.println("Price: " + dealer.price);
        // TradeIn output
        System.out.println("-----------------TradeIn OBJECT----------------");
        System.out.println("TradeIn Serial Number: " + tradeIn.serialNumberTradeIn);
        System.out.println("Make: " + tradeIn.make);
        System.out.println("Model: " + tradeIn.model);
        System.out.println("Year: " + tradeIn.yearTradeIn);
        // Invoice output
        System.out.println("-----------------Invoice OBJECT----------------");
        System.out.println("Invoice ID: " + invoice.invoiceId);
        System.out.println("Date: " + invoice.date);
        System.out.println("Final Price: " + invoice.finalPrice);
        System.out.println("TradeIn Allowance: " + invoice.tradeInAllowance);
        System.out.println("Taxes: " + invoice.taxes);
        System.out.println("License Fee: " + invoice.licenseFee);
        System.out.println("Customer Signature: " + invoice.customerSignature);
        // SalesPerson output
        System.out.println("-----------------SalesPerson OBJECT----------------");
        System.out.println("SalesPerson ID: " + salesPerson.salespersonID);
        System.out.println("Name: " + salesPerson.namesalesPerson);
        System.out.println("Phone Number: " + salesPerson.phoneNumber);

        sc.close();
    }
}