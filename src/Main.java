// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ///task 1
        String firstName = "Aleksei";
        String middleName = "Ilyich";
        String lastName = "Peikhel";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s", fullName);

        //task 2
        String fullNameUppesCase = fullName.toUpperCase();
        System.out.printf("\nФ. И. О. сотрудника для заполнения отчета — %s", fullNameUppesCase);

        //task 3
        fullName = "Иванов Семён Семёнович";
        String formatFullName = fullName.replaceAll("ё", "е");
        System.out.printf("\nДанные Ф. И. О. сотрудника — %s", formatFullName);
    }
}