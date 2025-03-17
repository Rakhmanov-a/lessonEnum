import homeWork.Days;
import homeWork.TransportType;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /// 1-задания
        //Создайте enum для 7 областей КР.
        //Используя switch case выведите
        //на консоль особенности областей.

//        Region[] regions = Region.values();
//
//        for (int i = 0; i < regions.length; i++) {
//            System.out.println(regions[i].name()+ " "+regions[i].getOsoben());
//        }
        /// homeWork
        //TransportType деген enum туз. Ичине ар кандай типтеги
        // унааларды жаз. Мисалы: CAR, BUS, TRUCK.
        //Enum-дын ичинде бир  метод болсун:
        //public  double calculateTravelCost(double distance);
        //Бул метод транспорттун ар бир түрү үчүн өзүнүн жол баасын
        // эсептеп чыгышы керек.
        //(CAR)  Автоунаанын бир километринин баасы $0,1.
        //(BUS)  Автобустун бир километринин баасы $0,05
        //(TRUCK.) Трак үчүн бир километрдин баасы $0,02

//        TransportType car = TransportType.CAR;
//        double autoDistance = 20.0;
//        System.out.println("Автоунаанын "+autoDistance + "км баасы: "+car.calculateTravelCost(autoDistance)+"$");
//
//        TransportType bus = TransportType.BUS;
//        double busDistance = 5.0;
//        System.out.println("Автобустун "+busDistance + "км баасы: "+car.calculateTravelCost(busDistance)+"$");
//
//        TransportType truck = TransportType.TRUCK;
//        double truckDistance = 15.0;
//        System.out.println("Трактын "+truckDistance + "км баасы: "+car.calculateTravelCost(truckDistance)+"$");

        /// 2-homework
        //Күндөргө enum түзүңүз (Monday, Tuesday ...)
        //Консолдон бир күндү белгилеңиз. Эгер Monday болсо - анда
        // "Дуйшөмбү куну жава окуйм" же Tuesday болсо - анда "Шейшемби
        // күнү англис тили сабагын окуйм" деп күнгө жараша кайсы
        // сабакты окуганыңызды консолго чыгарыңыз.
        //Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Бир кунду танданыз (MONDAY, TUESDAY...): ");
        String input = scanner.nextLine().toUpperCase();
        Days selectedDay = Days.valueOf(input);

        switch (selectedDay) {
            case MONDAY:
                System.out.println("Дуйшөмбү күнү жава окуйм.");
                break;
            case TUESDAY:
                System.out.println("Шейшемби күнү англис тили сабагын окуйм.");
                break;
            case WEDNESDAY:
                System.out.println("Шаршемби күнү математика сабагын окуйм.");
                break;
            case THURSDAY:
                System.out.println("Бейшемби күнү физика сабагын окуйм.");
                break;
            case FRIDAY:
                System.out.println("Жума күнү тарых сабагын окуйм.");
                break;
            case SATURDAY:
                System.out.println("Ишемби күнү спорт менен машыгам.");
                break;
            case SUNDAY:
                System.out.println("Жекшемби күнү эс алам.");
                break;
            default:
                System.out.println("Тандалган күн туура эмес.");
        }

        scanner.close();
    }
}