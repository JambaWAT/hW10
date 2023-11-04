// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        {
            String firstName = "Семён";
            String middleName = "Иванов";
            String lastName = "Семёнович";
            String fullName = middleName + " " + firstName + " " + lastName;
            System.out.println("Ф. И. О. сотрудника — " + fullName);
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName.toUpperCase());
            String withOutYo = fullName.replace('ё','е');
            System.out.println("«Данные Ф. И. О. сотрудника без ё — " + withOutYo);


        }
        }
    }
