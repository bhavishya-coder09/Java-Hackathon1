
    import java.util.Scanner;
    class WaterUsage1b {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("The water consumption in litres");
               int consumption = sc.nextInt();
            if (consumption <= 500) {
                System.out.println("The bill is Rs.100");
            }
            else {
                System.out.println("The bill is Rs.200");
            }
        }
    }