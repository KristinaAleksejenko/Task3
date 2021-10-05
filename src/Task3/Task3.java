//Написать программу, которая спрашивает имя пользователя, фамилию, год, месяц и день рождения. Затем выводит эту информацию в виде:
//Иван Иванов родился 3 февраля 2004 года. Загрузить код проекта на удаленный репозиторий Gi
package Task3;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//новый экземпляр класса сканер (считывание введеной цифры)
        System.out.println("Введите имя пользователя:");
        String name = scanner.next();
        System.out.println("Введите фамилию пользователя:");
        String sname = scanner.next();
        System.out.println("Введите год рождения пользователя:");
        String year = scanner.next();
        System.out.println("Введите месяц рождения пользователя:");
        String month= scanner.next();
        System.out.println("Введите день рождения пользователя:");
        String day = scanner.next();

     
        System.out.println(name+" "+sname+" "+"родился"+" "+year+" "+"года"+" "+month+"месяца"+" "+day+" "+" числа");
        
    }
    
}
