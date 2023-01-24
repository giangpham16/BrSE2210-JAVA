
Object Demo

package main.java;
import java.time.LocalDate;

public class ObjectDemo{
    public static void main(String[] args){
        //Khởi tạo DL mẫu
        Department department_ketoan = new Department();
        department_ketoan.DepartmentID = 1;
        department_ketoan.DepartmentName = "Phong Ke toan";
        Department department_sale = new Department();
        department_sale.DepartmentID = 2;
        department_sale.DepartmentName = "Phong sale";
        Department department_taichinh = new Department();
        department_taichinh.DepartmentID = 3;
        department_taichinh.DepartmentName = "Phong tai chinh";

        Position position_Dev = new Position();
        position_Dev.PositionID = 1;
        position_Dev.PositionName = "Dev";
        Position position_Test = new Position();
        position_Test.PositionID = 2;
        position_Test.PositionName = "Test";
        Position position_Scrummaster = new Position();
        position_Scrummaster.PositionID = 3;
        position_Scrummaster.PositionName = "Scrum Master";

        Account Account_1 = new Account();
        Account_1.AccountID = 1;
        Account_1.Email = "1@gmail.com";
        Account_1.Username = "Hoa";
        Account_1.fullName = "Nguyen Thi Hoa";
        Account_1.Department = department_ketoan;
        Account_1.Position = position_Dev;
        Account_1.CreateDate = LocalDate.of(2022,12,05);
        Account Account_2 = new Account();
        Account_2.AccountID = 2;
        Account_2.Email = "2@gmail.com";
        Account_2.Username = "Khoa";
        Account_2.fullName = "Nguyen Van Khoa";
        Account_2.Department = department_taichinh;
        Account_2.Position = position_Test;
        Account_2.CreateDate = LocalDate.of(2022,12,05);
        Account Account_3 = new Account();
        Account_3.AccountID = 3;
        Account_3.Email = "3@gmail.com";
        Account_3.Username = "Huong";
        Account_3.fullName = "Pham Huong";
        Account_3.Department = department_ketoan;
        Account_3.Position = position_Scrummaster;
        Account_3.CreateDate = LocalDate.of(2022,12,05);

//        Cau1
        if (Account_2.Department == null){
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: "+ Account_2.Department.DepartmentName);
        }

        Group Group_1 = new Group();
        Group_1.GroupID = 1;
        Group_1.account = Account_1;
        Group_1.CreateDate = LocalDate.of(2022,12,05);
        Group Group_2 = new Group();
        Group_2.GroupID = 2;
        Group_2.account = Account_2;
        Group_2.CreateDate = LocalDate.of(2022,12,05);
        Group Group_3 = new Group();
        Group_3.GroupID = 3;
        Group_3.account = Account_3;
        Group_3.CreateDate = LocalDate.of(2022,12,05);

        GroupAccount GroupAccount_1 = new GroupAccount();
        Account[] ds1  = {Account_1, Account_2, Account_3};
        GroupAccount_1.Account = ds1;
        GroupAccount_1.Group = Group_1;
        GroupAccount_1.JoinDate = LocalDate.of(2022, 12, 05);

        GroupAccount GroupAccount_2 = new GroupAccount();
        GroupAccount_2.Account = ds1;
        GroupAccount_2.Group = Group_2;
        GroupAccount_2.JoinDate = LocalDate.of(2022, 12, 05);

        GroupAccount GroupAccount_3 = new GroupAccount();
        GroupAccount_3.Account = ds1;
        GroupAccount_3.Group = Group_3;
        GroupAccount_3.JoinDate = LocalDate.of(2022, 12, 05);

//        Cau2
//        if (Account_2.groups == null || Account_2.groups.length == 0) {
//            System.out.println("Nhân viên này chưa có group");
//        } else if (account.groups == 1 || account.groups.length == 2) {
//            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//        } else if (account.groups == 3) {
//            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//        } else {
//            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//        }

//        Cau3
        System.out.println(Account_2.Department == null
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: "+ Account_2.Department.DepartmentName);

//        Cau4: toan tu
        System.out.println(Account_1.Position.PositionName == "Dev"
                ? "Đây là Developer"
                : "Người này không phải là Developer");

//        Cau5
        switch (GroupAccount_1.Account.length) {
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
//        Cau　8: foreach: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ

        Account[] accounts  = {Account_1, Account_2, Account_3};

        for (Account acc : accounts) {
            System.out.println("acc.email = " + acc.Email);
            System.out.println("acc.fullName = " + acc.fullName);
            System.out.println("acc.department.name = " + acc.Department.DepartmentName);
        }
        // Cau 9: Foreach: In ra thông tin các phòng ban bao gồm: id và name

        Department[] dept  = {department_ketoan, department_sale, department_taichinh};

        for (Department department : dept) {
            System.out.println("dept.Name = " + department.DepartmentName);
            System.out.println("dept.ID = " + department.DepartmentID);
        }
        // Cau 10: each: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ

        Account[] accounts1 = {Account_1, Account_2,Account_3};

        for (int i = 0; i < accounts1.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts1[i].Email);
            System.out.println("Full name: " + accounts1[i].fullName);
            System.out.println("Phòng ban: " + accounts1[i].Department);
            System.out.println();
        }
    //Question 15:In ra các số chẵn nhỏ hơn hoặc bằng 20

        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
            
          }
    } //dong ngoac ham main

}//dong ngoac class
