import java.util.Scanner;
class WaterUsage1c { 
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage+eveningUsage;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter morning Usage  in liters:");
        int morningUsage = sc.nextInt();
        System.out.println("Enter  evening Usage  in liters:");
        int eveningUsage = sc.nextInt();
        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total Water Consumption=" + totalUsage + "Liters");
    }
    }


   