EX1

package backend;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Position;

import java.time.LocalDateTime;

public class Exercise01 {
    public static void question01() {
        Department departmentA = new Department();
        Department departmentB = new Department("Giám đốc");
    }

    public static void question02() {
        Account accountA = new Account();
        Account accountB = new Account(1, "khoa.nv@gmail.com", "khoa.nv", "Khoa", "Nguyễn Văn");
        Account accountC = new Account(2, "khoa.nv@gmail.com", "khoa.nv", "Khoa", "Nguyễn Văn", new Position());
        Account accountD = new Account(3, "khoa.nv@gmail.com", "khoa.nv", "Khoa", "Nguyễn Văn", new Position(), LocalDateTime.now());
    }

    public static void question03() {
        Group groupA = new Group();
        Group groupB = new Group("Java core", new Account(), LocalDateTime.now(), new Account[]{new Account()});
        Group groupC = new Group("Java core", new Account(), LocalDateTime.now(), new String[]{"khoa.nv"});
    }
}

EX4

package backend;

import entity.Student;

public class Exercise04 {
    public static void question01() {
        Student student = new Student();
        student.setScore(5.0);
        student.plusScore(3.5);
        student.showInfo();
    }
}

EX5

package backend;

import entity.HighSchoolStudent;

import java.util.Scanner;

public class Exercise05 {
    public static void question02() {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("1. Thêm mới cán bộ.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiển thị thông tin về danh sách các cán bộ.");
            System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó");
            System.out.println("5. Thoát khỏi chương trình.");
            System.out.println("Chọn chức năng: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                qlcb.themCanBo();
            } else if (menu == 2) {
                qlcb.timKiemTheoHoTen();
            } else if (menu == 3) {
                qlcb.hienThiDSCB();
            } else if (menu == 4) {
                qlcb.xoaTheoTen();
            } else if (menu == 5) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public static void question03() {
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại học công nghệ");
    }

    public static void question04() {
        Scanner scanner = new Scanner(System.in);
        QLTV qltv = new QLTV();
        while (true) {
            System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo");
            System.out.println("2. Xoá tài liệu theo mã tài liệu.");
            System.out.println("3. Hiện thị thông tin về tài liệu.");
            System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
            System.out.println("5. Thoát khỏi chương trình");
            System.out.println("Chọn chức năng bạn muốn dùng: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                qltv.themTaiLieu();
            } else if (menu == 2) {
                qltv.xoaTaiLieuTheoId();
            } else if (menu == 3) {
                qltv.hienThiDSTL();
            } else if (menu == 4) {
                qltv.timKiemTaiLieuTheoLoai();
            } else if (menu == 5) {
                return;
            } else {
                System.out.println("Vui lòng chọn lại");
            }
        }
    }
}

EX6

package backend;

import entity.Employee;
import entity.Phone;
import entity.VietnamesePhone;

import java.util.Scanner;

public class Exercise06 {
    public static void question1() {
        Scanner scanner = new Scanner(System.in);
        Phone vietnamesePhone = new VietnamesePhone();
        while (true) {
            System.out.println("1. insertContact");
            System.out.println("2. removeContact");
            System.out.println("3. updateContact");
            System.out.println("4. searchContact");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");
            int menu = scanner.nextInt();
            if (menu == 5) return;

            System.out.println("Nhập vào tên: ");
            String name = scanner.next();

            switch (menu) {
                case 1:
                    System.out.println("Nhập vào phone: ");
                    String phone = scanner.next();
                    vietnamesePhone.insertContact(name, phone);
                    break;
                case 2:
                    vietnamesePhone.removeContact(name);
                    break;
                case 3:
                    System.out.println("Nhập vào new phone: ");
                    String newPhone = scanner.next();
                    vietnamesePhone.updateContact(name, newPhone);
                    break;
                case 4:
                    vietnamesePhone.searchContact(name);
                    break;
            }
        }
    }

    public static void question02_03() {
        Employee employee = new Employee();
        employee.displayInfo();
    }
}

QLCB

package backend;

import entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> canBos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themCanBo() {
        System.out.println("1. Thêm công nhân");
        System.out.println("2. Thêm kỹ sư");
        System.out.println("3. Thêm nhân viên");
        System.out.println("Chọn chức năng: ");
        int menu = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào họ tên: ");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập vào tuổi: ");
        int tuoi = scanner.nextInt();

        System.out.println("Nhập vào giới tính (1. NAM, 2. NU, 3. KHAC): ");
        GioiTinh gioiTinh = GioiTinh.values()[scanner.nextInt() - 1];

        scanner.nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        String diaChi = scanner.nextLine();

        if (menu == 1) {
            System.out.println("Nhập vào bậc: ");
            int bac = scanner.nextInt();
            CongNhan congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac);
            canBos.add(congNhan);
        } else if (menu == 2) {
            System.out.println("Nhập vào ngành đào tạo: ");
            String nganhDaoTao = scanner.nextLine();
            KySu kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao);
            canBos.add(kySu);
        } else if (menu == 3) {
            System.out.println("Nhập vào công việc: ");
            String congViec = scanner.nextLine();
            NhanVien nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
            canBos.add(nhanVien);
        } else {
            System.out.println("Vui lòng chọn đúng chức năng.");
        }
    }

    public void timKiemTheoHoTen() {
        System.out.println("Nhập vào họ tên cần tìm: ");
        String hoTen = scanner.nextLine();
        for (CanBo canBo : canBos) {
            if (canBo.getHoTen().equals(hoTen)) {
                System.out.println("- canBo = " + canBo);
            }
        }
    }

    public void hienThiDSCB() {
        for (CanBo canBo : canBos) {
            System.out.println("- canBo = " + canBo);
        }
    }

    public void xoaTheoTen() {
        System.out.println("Nhập vào tên cần xóa: ");
        String ten = scanner.next();
        canBos.removeIf(canBo -> canBo.getHoTen().contains(ten));
        System.out.println("Đã xóa tất cả cán bộ có tên: " + ten);
    }
}

QLTV

package backend;

import entity.Book;
import entity.Document;
import entity.Magazine;
import entity.NewsPaper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTV {
    Scanner scanner = new Scanner(System.in);
    List<Document> documents = new ArrayList<>();

    public void timKiemTaiLieuTheoLoai() {
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Nhập vào loại tài liệu: ");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                for (Document document : documents) {
                    if (document instanceof Book) {
                        System.out.println("book = " + document);
                    }
                }
                break;
            case 2:
                for (Document document : documents) {
                    if (document instanceof Magazine) {
                        System.out.println("magazine = " + document);
                    }
                }
                break;
            default:
                for (Document document : documents) {
                    if (document instanceof NewsPaper) {
                        System.out.println("newsPaper = " + document);
                    }
                }
                break;
        }
    }

    public void hienThiDSTL() {
        for (Document document : documents) {
            System.out.println("- document = " + document);
        }
    }

    public void xoaTaiLieuTheoId() {
        System.out.println("Nhập vào mã tài liệu cần xóa: ");
        int id = scanner.nextInt();
        documents.removeIf(document -> document.getId() == id);
    }

    public void themTaiLieu() {
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        System.out.println("Nhập vào loại tài liệu: ");
        int menu = scanner.nextInt();

        System.out.println("Nhập vào mã tài liệu: ");
        int id = scanner.nextInt();
        System.out.println("Nhập vào nhà xuất bản: ");
        scanner.nextLine();
        String nxb = scanner.nextLine();
        System.out.println("Nhập vào số bản phát hành: ");
        int releaseNumber = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Nhập vào tên tác giả: ");
                scanner.nextLine();
                String authorName = scanner.nextLine();
                System.out.println("Nhập vào số trang: ");
                int pageNumbers = scanner.nextInt();
                Document book = new Book(id, nxb, releaseNumber, authorName, pageNumbers);
                documents.add(book);
                break;
            case 2:
                System.out.println("Nhập vào số phát hành: ");
                scanner.nextLine();
                String soPhatHanh = scanner.nextLine();
                System.out.println("Nhập vào tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();
                Document magazine = new Magazine(id, nxb, releaseNumber, soPhatHanh, thangPhatHanh);
                documents.add(magazine);
                break;
            case 3:
                System.out.println("Nhập vào ngày phát hành: ");
                int ngayPhatHanh = scanner.nextInt();
                Document newsPaper = new NewsPaper(id, nxb, releaseNumber, ngayPhatHanh);
                documents.add(newsPaper);
                break;
        }
    }
}
