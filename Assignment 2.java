//EX1
// Question 1:
//Kiểm tra account thứ 2
//Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
//Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."

public class Exercise01 {
    public static void question01() {
        Account account = new Account();
        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là ...");
        }
    }

// Question 2:
//Kiểm tra account thứ 2
//Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
//Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
//Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"

    public static void question02() {
        Account account = new Account();
        if (account.groups == null || account.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account.groups.length == 1 || account.groups.length == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

//Question 3: Sử dụng toán tử ternary để làm Question 1 
    
    public static void question03() {
        Account account = new Account();
        String message = (account.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là ...";
        System.out.println(message);
    }
    
//Question 4:
//Sử dụng toán tử ternary để làm yêu cầu sau:
//Kiểm tra Position của account thứ 1
//Nếu Position = Dev thì in ra text "Đây là Developer"
//Nếu không phải thì in ra text "Người này không phải là Developer"
    
    public static void question04() {
        Account account = new Account();
        Position position = new Position();
        position.name = PositionName.DEV;
        account.position = position;
        String message = (account.position.name == PositionName.DEV)
                ? "Đây là Developer"
                : "Người này không phải là Developer";
        System.out.println(message);
    }
    
//SWITCH CASE Question 5:
//Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau: Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên" 
//Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên" 
//Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên" 
//Còn lại in ra "Nhóm có nhiều thành viên"

    public static void question05() {
        Group group = new Group();
        group.accounts = new Account[]{new Account(), new Account()};
        switch (group.accounts.length) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
    }
    
//Question 6:Sử dụng switch case để làm lại Question 2
    
    public static void question06() {
        Account account = new Account();
        account.groups = new Group[]{new Group()};
        int length = account.groups.length;
        switch (length) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }
    
//Question 7:Sử dụng switch case để làm lại Question 3
    
    public static void question07() {
        Account account = new Account();
        Position position = new Position();
        position.name = PositionName.DEV;
        account.position = position;

        switch (account.position.name) {
            case DEV:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
    }
    
//FOREACH Question 8:In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
    
    public static void question08() {
        Department department = new Department();
        department.name = "Kỹ thuật";

        Account account = new Account();
        account.fullName = "Nguyễn Văn Khoa";
        account.email = "nvkhoa05@gmail.com";
        account.department = department;

        Account[] accounts = {account, account};

        for (Account acc : accounts) {
            System.out.println("acc.email = " + acc.email);
            System.out.println("acc.fullName = " + acc.fullName);
            System.out.println("acc.department.name = " + acc.department.name);
        }
    }

    //Question 9:In ra thông tin các phòng ban bao gồm: id và name
    
    public static void question09() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        Department[] departments = {department};

        for (Department dep : departments) {
            System.out.println("dep.id = " + dep.id);
            System.out.println("dep.name = " + dep.name);
        }
    }
    
//FOR
//Question 10:In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng như sau:
//Thông tin account thứ 1 là: Email: NguyenVanA@gmail.com Full name: Nguyễn Văn A
//Phòng ban: Sale
//Thông tin account thứ 2 là: Email: NguyenVanB@gmail.com Full name: Nguyễn Văn B
//Phòng ban: Marketting
    
    public static void question10() {
        Department department = new Department();
        department.name = "Kỹ thuật";

        Account account = new Account();
        account.fullName = "Nguyễn Văn Khoa";
        account.email = "nvkhoa05@gmail.com";
        account.department = department;

        Account[] accounts = {account, account};

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
            System.out.println();
        }
    }

//Question 11:In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//Thông tin department thứ 1 là: Id: 1
//Name: Sale
//Thông tin department thứ 2 là: Id: 2
//Name: Marketing
    
    public static void question11() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        Department[] departments = {department};

        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].id);
            System.out.println("Name: " + departments[i].name);
            System.out.println();
        }
    }
    
//Question 12:Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    
    public static void question12() {
        Department department = new Department();
        department.id = 1;
        department.name = "Giám đốc";

        Department[] departments = {department};

        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("Id: " + departments[i].id);
            System.out.println("Name: " + departments[i].name);
            System.out.println();
        }
    }
    
//Question 13:In ra thông tin tất cả các account ngoại trừ account thứ 2
    
    public static void question13() {
        Department department = new Department();
        department.name = "Kỹ thuật";

        Account account = new Account();
        account.fullName = "Nguyễn Văn Khoa";
        account.email = "nvkhoa05@gmail.com";
        account.department = department;

        Account[] accounts = {account, account, account};

        for (int i = 0; i < accounts.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.name);
                System.out.println();
            }
        }
    }
    
//Question 14:In ra thông tin tất cả các account có id < 4
    
    public static void question14() {
        Department department = new Department();
        department.name = "Kỹ thuật";

        Account account = new Account();
        account.fullName = "Nguyễn Văn Khoa";
        account.email = "nvkhoa05@gmail.com";
        account.department = department;

        Account[] accounts = {account, account, account};

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].department.name);
                System.out.println();
            }
        }
    }

    //Question 15:In ra các số chẵn nhỏ hơn hoặc bằng 20
    
    public static void question15() {
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // question01();
        // question02();
        // question03();
        // question04();
        // question05();
        // question06();
        // question07();
        // question08();
        // question09();
        // question10();
        // question13();
        // question14();
        question15();
    }
}

EX2

import java.util.Locale;

public class Exercise02 {
    public static void question01() {
        int number = 5;
        System.out.printf("number = %d%n", number);
    }

    public static void question02() {
        int number = 100000000;
        System.out.printf(Locale.ENGLISH, "number = %,d%n", number);
    }

    public static void question03() {
        double number = 5.567098;
        System.out.printf("number = %.4f%n", number);
    }

    public static void question04() {
        String fullName = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", fullName);
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
    }
}

EX3

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Exercise03 {
    public static void question01() {
        Exam exam = new Exam();
        exam.title = "Java core";
        exam.createdDate = LocalDateTime.of(2000, 10, 10, 10, 10, 10);

        System.out.println("exam.title = " + exam.title);
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(new Locale("vi", "VN"));
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void question02() {
        Exam exam = new Exam();
        exam.createdDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy - MM - dd - HH - mm - ss");
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void question03() {
        Exam exam = new Exam();
        exam.createdDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void question04() {
        Exam exam = new Exam();
        exam.createdDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy");
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void question05() {
        Exam exam = new Exam();
        exam.createdDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        System.out.println("exam.createdDate = " + exam.createdDate.format(formatter));
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question04();
        question05();
    }
}

EX4

import java.time.LocalDate;
import java.util.Random;

public class Exercise04 {
    public static void question01() {
        Random random = new Random();
        System.out.println("number = " + random.nextInt());
    }

    public static void question02() {
        Random random = new Random();
        System.out.println("number = " + random.nextDouble());
    }

    public static void question03() {
        Random random = new Random();
        String[] names = {"Cường", "Hùng", "Duy", "Nam"};
        // [0, length - 1]
        int index = random.nextInt(names.length);
        System.out.printf("names[%d] = %s%n", index, names[index]);
    }

    public static void question04() {
        Random random = new Random();
        LocalDate minDate = LocalDate.of(1995, 7, 24);
        LocalDate maxDate = LocalDate.of(1995, 12, 20);
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }

    public static void question05() {
        Random random = new Random();
        LocalDate minDate = LocalDate.now().minusYears(1);
        LocalDate maxDate = LocalDate.now();
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }

    public static void question06() {
        Random random = new Random();
        LocalDate maxDate = LocalDate.now();
        int minDay = 0;
        int maxDay = (int) maxDate.toEpochDay();
        int randomDay = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("randomDate = " + randomDate);
    }

    public static void question07() {
        Random random = new Random();
        int min = 100;
        int max = 999;
        int number = min + random.nextInt(max - min + 1);
        System.out.println("number = " + number);
    }

    public static void main(String[] args) {
        question01();
        question02();
        question03();
        question05();
        question06();
        question07();
    }

EX5

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercise05 {
    private static final Scanner scanner = new Scanner(System.in);

    private static void question01() {
        System.out.println("Mời bạn nhập vào 3 số nguyên.");

        System.out.println("Nhập vào số thứ 1:");
        int a = scanner.nextInt();

        System.out.println("Nhập vào số thứ 2:");
        int b = scanner.nextInt();

        System.out.println("Nhập vào số thứ 3:");
        int c = scanner.nextInt();

        System.out.printf("Bạn vừa nhập vào 3 số nguyên là: %d, %d và %d.%n", a, b, c);
    }

    private static void question02() {
        System.out.println("Mời bạn nhập vào 2 số thực.");

        System.out.println("Nhập vào số thứ 1:");
        double a = scanner.nextDouble();

        System.out.println("Nhập vào số thứ 2:");
        double b = scanner.nextDouble();

        System.out.printf("Bạn vừa nhập vào 2 số thực là: %f và %f.%n", a, b);
    }

    private static void question03() {
        System.out.println("Mời bạn nhập vào họ và tên.");

        System.out.println("Nhập vào họ và tên:");
        String fullName = scanner.nextLine();

        System.out.printf("Bạn vừa nhập vào họ và tên là: %s.%n", fullName);
    }

    private static void question04() {
        System.out.println("Mời bạn nhập vào ngày sinh.");

        System.out.println("Nhập vào ngày sinh (yyyy-MM-dd):");
        LocalDate birthdate = LocalDate.parse(scanner.next());

        System.out.printf("Bạn vừa nhập vào ngày sinh là: %s.%n", birthdate);
    }

    private static void question05() {
        System.out.println("Mời bạn nhập vào thông tin account.");
        Account account = new Account();

        System.out.println("Nhập vào id:");
        account.id = scanner.nextInt();

        System.out.println("Nhập vào email:");
        account.email = scanner.next();

        System.out.println("Nhập vào username:");
        account.username = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào full name:");
        account.fullName = scanner.nextLine();

        System.out.println("Nhập vào position:");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. Scrum Master");
        System.out.println("4. Project Manager");
        Position position = new Position();
        int ordinal = scanner.nextInt();
        position.name = PositionName.values()[ordinal - 1];
        account.position = position;

        System.out.println("Bạn vừa nhập vào account có thông tin như sau:");
        System.out.printf(
                "%d - %s - %s - %s - %s.%n",
                account.id, account.email, account.username, account.fullName, account.position.name
        );
    }

    private static void question06() {
        System.out.println("Mời bạn nhập vào thông tin department.");
        Department department = new Department();

        System.out.println("Nhập vào id:");
        department.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào name:");
        department.name = scanner.nextLine();

        System.out.println("Bạn vừa nhập vào department có thông tin như sau:");
        System.out.printf("%d - %s.%n", department.id, department.name);
    }

    private static void question07() {
        System.out.println("Mời bạn nhập vào 1 số chẵn.");

        while (true) {
            System.out.println("Nhập vào 1 số chẵn:");
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.printf("Bạn vừa nhập vào 1 số chẵn là: %d.%n", n);
                break;
            } else {
                System.out.printf("Số %d không phải là số chẵn.%n", n);
                System.out.println("Mời bạn nhập lại.");
            }
        }
    }

    private static void question08() {
        while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    question05();
                    break;
                case 2:
                    question06();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Mời bạn nhập lại.");
                    break;
            }
        }
    }

    private static void question09() {
        Group groupA = new Group();
        groupA.id = 1;
        groupA.name = "Database";
        groupA.createdDate = LocalDateTime.now();

        Group groupB = new Group();
        groupB.id = 2;
        groupB.name = "Java ore";
        groupB.createdDate = LocalDateTime.now();

        Group groupC = new Group();
        groupC.id = 3;
        groupC.name = "ReactJS";
        groupC.createdDate = LocalDateTime.now();

        Account accountA = new Account();
        accountA.id = 1;
        accountA.email = "khoa.nv@gmail.com";
        accountA.username = "khoa.nv";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.createdDate = LocalDateTime.now();

        Account accountB = new Account();
        accountB.id = 2;
        accountB.email = "cuong.nq@gmail.com";
        accountB.username = "cuong.nq";
        accountB.fullName = "Nguyễn Quốc Cường";
        accountB.createdDate = LocalDateTime.now();

        Account accountC = new Account();
        accountC.id = 3;
        accountC.email = "trang.nnm@gmail.com";
        accountC.username = "trang.nnm";
        accountC.fullName = "Nguyễn Ngọc Minh Trang";
        accountC.createdDate = LocalDateTime.now();

        Group[] groups = {groupA, groupB, groupC};
        Account[] accounts = {accountA, accountB, accountC};

        System.out.println("Hiển thị danh sách accounts:");
        for (Account account : accounts) {
            System.out.println("- account: " + account.username);
        }

        System.out.println("Nhập vào username:");
        String username = scanner.next();
        scanner.nextLine();

        System.out.println("Hiển thị danh sách groups:");
        for (Group group : groups) {
            System.out.println("- group: " + group.name);
        }

        System.out.println("Nhập vào group name:");
        String name = scanner.nextLine();

        for (Account account : accounts) {
            if (username.equals(account.username)) {
                for (Group group : groups) {
                    if (name.equals(group.name)) {
                        account.groups = new Group[]{group};
                        group.accounts = new Account[]{account};
                        System.out.printf("Bạn vừa thêm account %s vào group %s.%n", username, name);
                    }
                }
            }
        }
    }

    private static void question10() {
        while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thêm account vào group");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    question05();
                    break;
                case 2:
                    question06();
                    break;
                case 3:
                    question09();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Mời bạn nhập lại.");
                    break;
            }
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
        question08();
        question09();
        question10();

        scanner.close();
    }
}
