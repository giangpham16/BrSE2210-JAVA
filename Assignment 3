EX1

import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
    private static void question01() {
        System.out.println("Salary 1 = " + (int) 5240.5f);
        System.out.println("Salary 2 = " + (int) 10970.055f);
    }

    private static void question02() {
        Random random = new Random();
        // [0, 99999]
        int n = random.nextInt(100000);
        System.out.printf("=> n = %05d", n);
    }

    private static void question03() {
        Random random = new Random();
        // [0, 99999]
        int n = random.nextInt(100000);
        System.out.printf("=> n = %05d.%n", n);

        System.out.printf("=> 2 số cuối = %d.%n", n % 100);
    }

    private static double question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số nguyên a và b.");

        System.out.println("Nhập vào số nguyên a:");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số nguyên b:");
        int b = scanner.nextInt();

        return (double) a / b;
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
    }
}

EX2

import java.time.LocalDateTime;

public class Exercise02 {
    private static void question01() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = String.format("Email %d", i + 1);
            account.username = String.format("Username %d", i + 1);
            account.fullName = String.format("Full name %d", i + 1);
            account.createdDate = LocalDateTime.now();
            accounts[i] = account;
        }
    }

    public static void main(String[] args) {
        question01();
    }
}

EX3

public class Exercise03 {
    public static void question01() {
        Integer salary = 5000;
        System.out.printf("Salary = %.2f%n", salary.floatValue());
    }

    public static void question02() {
        int n = Integer.parseInt("1234567");
    }

    public static void question03() {
        int n = Integer.valueOf("1234567");
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
    }
}

EX4

import com.sun.xml.internal.ws.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.text.WordUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
    private static final Scanner scanner = new Scanner(System.in);

    private static void question01() {
        System.out.println("Mời bạn nhập vào 1 xâu kí tự.");

        System.out.println("Nhập vào 1 xâu kí tự:");
        String s = scanner.nextLine();

        int count = s.trim().split("\\s+").length;
        System.out.printf("=> Có %d từ.%n", count);
    }

    private static void question02() {
        System.out.println("Mời bạn nhập vào 2 xâu kí tự.");

        System.out.println("Nhập vào xâu kí tự thứ 1:");
        String s1 = scanner.nextLine();

        System.out.println("Nhập vào xâu kí tự thứ 2:");
        String s2 = scanner.nextLine();

        String s = s1.concat(s2);
        System.out.printf("=> %s.%n", s);
    }

    private static void question03() {
        System.out.println("Mời bạn nhập vào tên.");

        System.out.println("Nhập vào tên:");
        String name = scanner.next();

        System.out.printf("=> %s.", StringUtils.capitalize(name));
    }

    private static void question04() {
        System.out.println("Mời bạn nhập vào tên.");

        System.out.println("Nhập vào tên:");
        String name = scanner.next();

        for (int i = 0; i < name.length(); i++) {
            System.out.printf("Kí tự thứ %d là: %C.%n", i + 1, name.charAt(i));
        }
    }

    private static void question05() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ:");
        String lastName = scanner.nextLine();

        System.out.println("Nhập vào tên:");
        String firstName = scanner.next();

        System.out.printf("=> %s %s.", lastName, firstName);
    }

    private static void question06() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine();

        String[] words = fullName.trim().split("\\s+");
        System.out.printf("Họ là: %s.%n", words[0]);
        System.out.printf("Tên đệm là: %s.%n", String.join(" ", Arrays.copyOfRange(words, 1, words.length - 1)));
        System.out.printf("Tên là: %s.%n", words[words.length - 1]);
    }

    private static void question07() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine();

        String s = WordUtils.capitalizeFully(fullName.trim().replaceAll("\\s+", " "));
        System.out.printf("=> Chuẩn hóa: %s.%n", s);
    }

    private static void question08() {
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS"};
        for (String group : groups) {
            if (group.contains("Java")) {
                System.out.printf("=> group = %s.%n", group);
            }
        }
    }

    private static void question09() {
        String[] groups = {"Database", "Java", "Java core", "Java advanced", "ReactJS"};
        for (String group : groups) {
            if (group.equals("Java")) {
                System.out.printf("=> group = %s.%n", group);
            }
        }
    }

    private static void question10(String s1, String s2) {
        String s = new StringBuilder(s2).reverse().toString();
        System.out.printf("=> %s.%n", s.equals(s1) ? "OK" : "KO");
    }

    private static void question11(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == c ? 1 : 0;
        }
        System.out.printf("=> %d lần xuất hiện.%n", count);
    }

    private static void question12(String s) {
        System.out.printf("=> Chuỗi đảo ngược là: %s.%n", new StringBuilder(s).reverse());
    }

    private static void question13(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                System.out.println("=> FALSE.");
                return;
            }
        }
        System.out.println("=> TRUE.");
    }

    private static void question14(String s, char oldChar, char newChar) {
        System.out.printf("=> Replaced String: %s.%n", s.replace(oldChar, newChar));
    }

    private static void question15(String s) {
        String[] words = s.trim().split("\\s+");
        ArrayUtils.reverse(words);
        System.out.printf("=> Reverse String by word: %s.%n", String.join(" ", words));
    }

    private static void question16(String s, int n) {
        if (s.length() % n != 0) {
            System.out.println("=> KO.");
        }
    }

    public static void main(String[] args) {


        scanner.close();
    }
}

EX5

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise05 {
    private static void question01() {
        Department department = new Department("Giám đốc");
        System.out.println("department = " + department);
    }

    private static void question02() {
        Department[] departments = {new Department("Giám đốc")};
        for (Department department : departments) {
            System.out.println("department = " + department);
        }
    }

    private static void question03() {
        Department department = new Department("Giám đốc");
        System.out.println("department.hashCode() = " + department.hashCode());
    }

    private static void question04() {
        Department department = new Department("Phòng A");
        boolean answer = department.name.equals("Phòng A");
        System.out.println("answer = " + answer);
    }

    private static void question05() {
        Department departmentA = new Department("Phòng A");
        Department departmentB = new Department("Phòng B");
        boolean answer = departmentA.equals(departmentB);
        System.out.println("answer = " + answer);
    }

    private static void question06() {
        List<String> departments = Arrays.asList(
                "Sale",
                "Waiting room",
                "Boss of director",
                "Marketing",
                "Accounting"
        );
        departments.sort(Comparator.naturalOrder());
        for (String department : departments) {
            System.out.println("department = " + department);
        }
    }

    private static void question07() {
        List<String> departments = Arrays.asList(
                "Sale",
                "Waiting room",
                "Boss of director",
                "Marketing",
                "Accounting"
        );
        departments.sort((o1, o2) -> {
            String lastWord1 = o1.substring(o1.lastIndexOf(" ") + 1);
            String lastWord2 = o2.substring(o2.lastIndexOf(" ") + 1);
            return lastWord1.compareToIgnoreCase(lastWord2);
        });
        for (String department : departments) {
            System.out.println("department = " + department);
        }
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
        question05();
        question06();
        question07();
    }
}
