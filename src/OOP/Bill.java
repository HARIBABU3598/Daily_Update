package OOP;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bill {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        DateTimeFormatter dateFormatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        DateTimeFormatter timeFormatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");
        
        Scanner scan=new Scanner(System.in);

        String formattedDate = date.format(dateFormatter);
        String formattedTime = time.format(timeFormatter);
        int hour = time.getHour(); // 0–23
        String amPm;

        if (hour < 12) {
            amPm = "AM";
        } else {
            amPm = "PM";
        }
        String prod1="FREILI BASIL LEMO";
        float rate1=40.00f;
        String prod2="MILKY MIST MISH";
        float rate2=35.00f;
        String prod3="SUNF D/FAN CHOC";
        float rate3=35.00f;
//        System.out.println(prod1);
//        System.out.print("Quantity: ");
        int lemoQty=1;
        
//        System.out.println(prod2);
//        System.out.print("Quantity: ");
        int mishQty=1;
        
//        System.out.println(prod3);
//        System.out.print("Quantity: ");
        int chocQty=1;
        
        float Amt1=lemoQty*rate1;
        float Amt2=mishQty*rate2;
        float Amt3=chocQty*rate3;
        
        float totalAmt=Amt1+Amt2+Amt3;
        int totalQty=lemoQty+mishQty+chocQty;
        
        System.out.println();
        System.out.println("			 ROYAL SHOPPE");
        System.out.println("	    No.31/1, Tansi Nagar, 1st Main Road,");
        System.out.println("		     Velachery, Chennai-600042");
        System.out.println();
        System.out.println("	GSTin :33AAIFR1392L1ZY          Ph:9003911011");
        System.out.println("	..............................................");
        System.out.println("	TAX INVOICE    		  Bill No:25895");
        System.out.println("	..............................................");
        System.out.println("	Date    :" + formattedDate + "       Time   :" + formattedTime+" "+amPm);
        System.out.println("	..............................................");
        System.out.println("	Cashier :RAMESH 	  Counter:CTR2");
        System.out.println("	..............................................");
        System.out.println("	Description 	    MRP   Rate    Qty    Amt");
        System.out.println("	..............................................");
        System.out.println("	"+prod1+"  "+rate1+"   "+"40.00"+"    "+lemoQty+"    "+Amt1);
        System.out.println("	"+prod2+"	   "+rate2+"   "+"35.00"+"    "+mishQty+"    "+Amt2);
        System.out.println("	"+prod3+"	   "+rate3+"   "+"35.00"+"    "+chocQty+"    "+Amt3);
        
        System.out.println("	..............................................");
        System.out.println("	E & O.E., #Inct Gst 		  Total:"+totalAmt);
        System.out.println("	..............................................");
        System.out.println("	Qty  : "+totalQty+"	Total:"+totalAmt);
        System.out.println("	Items: 3");
        System.out.println("	..............................................");
        System.out.println("	Payment Details");
        System.out.println("	..............................................");
        System.out.println("	Wallet	:	"+totalAmt);
        System.out.println("	..............................................");
        System.out.println();
        System.out.println("	Tax% 	   Amt 	   Gst 	   SGst    CGst");
        System.out.println("	..............................................");
        System.out.println("	5.00 	  104.76   5.24    2.62    2.62");
        System.out.println();
        System.out.println("	Cust ID: G PAY");
        System.out.println("	*G PAY CUSTOMER");
        System.out.println("	1234567800");
        System.out.println();
        System.out.println("	..............................................");
        System.out.println("	Customer Offers");
        System.out.println("	..............................................");
        System.out.println("	Sno. 	Customer Offer List 	   BillQty");
        System.out.println("	..............................................");
        System.out.println("	3 	BUY 1 GET 1 		   1");
        System.out.println("	..............................................");
        System.out.println("		   Thank You - Visit Again");
    }
}
