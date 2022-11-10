import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// This program uses the value of a variable to determine whether branch a or b
        Scanner scanner = new Scanner(System.in);

        int month;


        System.out.println("Enter numbers from 1 - 10 " + " and I will tell you what month it represent in the year ");

        month = scanner.nextInt();

        switch (month) {
            case 0:
                System.out.println("Zero is not a month");
                break;

                case 1:
                    System.out.println("One represent january in the month of the years");
                    break;
                    case 2:
                        System.out.println("Two represent February in the month of the years");
                        break;
                        case 3:
                            System.out.println("Three represent March in the month of the years");
                            break;
                            case 4:
                                System.out.println("Four represent April in the month of the years");
                                break;
                                case 5:
                                    System.out.println("Five represent May in the month of the years");
                                    break;
                                    case 6:
                                        System.out.println("Six represent June in the month of the years");
                                        break;
                                        case 7:
                                            System.out.println("Seven represent July in the month of the years");
                                            break;
                                            case 8:
                                                System.out.println("Eight represent August in the month of the years");
                                                break;
                                                case 9:
                                                    System.out.println("nine represent September in the month of the years");
                                                    break;
                                                    case 10:
                                                        System.out.println("nine represent October in the month of the years");
                                                        break;
                                                        case 11:
                                                            System.out.println("nine represent November in the month of the years");
                                                            break;
                                                            case 12:
                                                                System.out.println("nine represent December in the month of the years");
                                                                break;
        }
    }
}