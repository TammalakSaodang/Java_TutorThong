import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class TestCerTutorThong_Part2 {
    public static void main(String[] args) {

        // Date of time
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);

        System.out.println("===============================");
        System.out.println("-------Fang Clothes Shop-------");
        System.out.println("===============================");
        System.out.print("Access To Shop : ");

        char A, B, selectMember;

        int shorts = 200, yeans = 300, shirtT = 250,
                priceSumTShirts = 0, priceSumShorts = 0, priceSumYean = 0,
                priceSumAllProduct = 0, priceSum_of_Each_Product = 0, priceSum_of_Day = 0,
                priceOffMember = 0, moneyInput, moneyChange = 0,
                select_TShirt, select_Shorts, select_Yean;

        Scanner sc = new Scanner(System.in);

        A = sc.next().charAt(0);

        while (A != 'n') {

            // Select products of buys
            System.out.print("Select T-Shirts : ");
            select_TShirt = sc.nextInt();

            System.out.print("Select Shorts   : ");
            select_Shorts = sc.nextInt();

            System.out.print("Select Yeans    : ");
            select_Yean = sc.nextInt();

            // Calculate of price of each products
            priceSumTShirts = select_TShirt * shirtT;
            priceSumShorts = select_Shorts * shorts;
            priceSumYean = select_Yean * yeans;

            // Select users of members
            System.out.print("Select Member : ");
            selectMember = sc.next().charAt(0);

            // calculate price of members
            if (selectMember == 'y' || selectMember == 'Y') {

                priceSumAllProduct = (priceSumTShirts + priceSumShorts + priceSumYean) - 100;

            }

            else {

                priceSumAllProduct = (priceSumTShirts + priceSumShorts + priceSumYean);
            }

            // show price of all products buys
            System.out.println("===============================");
            System.out.println("-------------------------------");
            System.out.println("Price of all products : " + priceSumAllProduct);

            // Money input
            System.out.println("-------------------------------");
            System.out.println("-------------------------------");
            System.out.print("Money from Input : ");
            moneyInput = sc.nextInt();

            // Calculate money change
            moneyChange = moneyInput - priceSumAllProduct;
            if (moneyChange < 0) {
                System.out.println("Please input money again");
                // System.out.print("Money from Input : ");
                // moneyInput = sc.nextInt();
            }

            // Show money of change
            System.out.println("Change of Money  : " + moneyChange);
            System.out.println("-------------------------------");
            System.out.println("-------------------------------");

            // Show price of product
            System.out.println("===============================");
            System.out.println("Price all of day   : " + priceSumAllProduct);
            System.out.println("Volumn of T-Shirts : " + priceSumTShirts);
            System.out.println("Counts of each products T-Shirts :  " + select_TShirt);
            System.out.println("--------------------------------------");
            System.out.println("Volumn of Shorts   : " + priceSumShorts);
            System.out.println(" Counts of each products Shorts   : " + select_Shorts);
            System.out.println("--------------------------------------");
            System.out.println("Volumn of Yeans   : " + priceSumYean);
            System.out.println(" Counts of each products Yeans    : " + select_Yean);
            System.out.println("===============================");
            System.out.println("Sales of Day " + formattedDate);

            // Stop programs
            System.out.println("-------------------------------");
            System.out.print("Your need for continue programs : ");
            A = sc.next().charAt(0);

        }
    }

}
