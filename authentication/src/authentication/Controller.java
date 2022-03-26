package authentication;
import authentication.Menu;
import com.sun.net.httpserver.Authenticator;

import java.util.List;
import java.util.Scanner;

public class Controller {
    String username;
    String password;
    Repository repository = new Repository();
    List<User> users = repository.getData();
    Scanner scanner = new Scanner(System.in);

    public void home(){
        Menu.mainMenu();

        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                //Dang nhap
                login();
                break;
            case 2:
                //Dang ky
                createNewAccount();
                break;
            default:
                break;
        }
    }

    public void login(){
        //thuc hien dang nhap
        boolean checkLogin = false;
        while (!checkLogin) {
            System.out.println("Nhap ten dang nhap: ");
            username = scanner.nextLine();
            int count = 0;
            for (int i = 0; i < users.size(); i++){
                if (username.equals(users.get(i).getUsername())){
                    count++;
                    System.out.println("nhap mat khau: ");
                    //nhap mat khau
                    password = scanner.nextLine();
                    if (password.equals((users.get(i).getPassword()))){
                        login();
                        loginSuccess();
                        checkLogin = true;
                    }else {
                        loginFail();
                        break;
                    }
                }
            }
            if (count == 0){
                System.out.println("Kiem tra lai username");
            }
        }
    }

    public void loginSuccess(){
        System.out.println("chao mung" + username + ", ban co the thuc hien cac cong viec sau:");
        Menu.loginSuccess();
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                //thay doi username
                changeUsername();
                break;
            case 2:
                //Thay doi email
                changeEmail();
                break;
            case 3:
                changePassword();
                break;
            case 4:
                home();
                break;
            case 0:
                System.out.println("Tam biet!!!");
                System.exit(1);
                break;
            default:
                break;
        }
    }
    public void changePassword(){
        //thay doi mat khau
        System.out.println("Nhap mat khau cu: ");
        password = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < users.size(); i++){
            if (password.equals(users.get(i).getPassword()) && username.equals(users.get(i).getUsername())){
               count++;
               boolean check = false;
               String newPassword = null;
               while (!check){
                   try {
                       System.out.println("Nhap mat khau moi:");
                       newPassword = Validate.validatePassword(scanner.nextLine());
                       check = true;
                   }catch (RuntimeException e){
                       System.out.println(e);
                   }
               }
               users.get(i).setPassword(newPassword);
               System.out.println("Thay doi mat khau thanh cong, vui long dang nhap lai:");
               login();
               password = newPassword;
            }
        }
        if (count == 0){
            System.out.println("Ban vua nhap sai mat khau");
        }
    }

    public void changeUsername(){
        //thay doi username
        boolean check = false;
        while (!check){
            try {
                System.out.println("Nhap username moi: ");
                String newUsername = scanner.nextLine();
                for (int i = 0; i < users.size(); i++){
                    if (username.equals(users.get(i).getUsername())){
                        if (!newUsername.equals(users.get(i).getUsername())){
                            users.get(i).setUsername(newUsername);
                            username = newUsername;
                            System.out.println("Thay doi username thanh cong");
                            check = true;
                        }else {
                            throw new RuntimeException("Username da ton tai");
                        }
                    }
                }
            } catch (RuntimeException e){
                System.out.println(e.getMessage() + ", vui long nhap lai username");
            }
        }
        loginSuccess();
    }

    public void changeEmail(){
        //thay doi email
        boolean check = false;
        String newEmail = null;
        while (!check){
            try {
                System.out.println("Nhap email moi: ");
                newEmail = Validate.validateEmail(scanner.nextLine());
                for (int i = 0; i < users.size(); i++) {
                    if (username.equals(users.get(i).getUsername())) {
                        if (!newEmail.equals(users.get(i).getEmail())) {
                            users.get(i).getEmail();
                            System.out.println("Thay doi email thanh cong");
                        } else {
                            throw new RuntimeException("Email da ton tai");
                        }
                    }
                }

                check = true;
            }catch (RuntimeException e){
                System.out.println(e.getMessage() + ", vui long nhap lai email");
            }
        }
        loginSuccess();
    }

    public void loginFail(){
        Menu.loginFail();
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.println("Dang nhap lai: ");
                login();
                break;
            case 2:
                forgotPassword();
                break;
        }
    }

    public void forgotPassword(){
        //Quen mat khau
        System.out.println("Vui long nhap email cua ban :");
        String email = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < users.size(); i++){
            if (email.equals(users.get(i).getEmail())){
                count++;
                boolean check = false;
                while (!check){
                    try {
                        System.out.println("Nhap mat khau moi: ");
                        String newPassword = Validate.validatePassword(scanner.nextLine());
                        users.get(i).setPassword(newPassword);
                        System.out.println("Doi mat khau thanh cong, tien hanh ang nhap lai ");
                        check = true;
                        login();
                    }catch (RuntimeException e){
                        // TODO: handle exception
                        System.out.println(e.getMessage() + ", vui long nhap lai");
                    }
                }
            }
        }
        if (count == 0){
            System.out.println("Email khong ton tai, hay nhap lai email");
            forgotPassword();
        }
    }
    public void createNewAccount(){
        boolean check = false;
        long id = 0;
        String newUsername = null;
        String newEmail = null;
        String newPassword = null;
        while (!check){
            try {
                id = users.size() + 1;
                System.out.println("Nhap username: ");
                newUsername = scanner.nextLine();
                System.out.println("Nhap email: ");
                newEmail = Validate.validateEmail(scanner.nextLine());
                System.out.println("Nhap password: ");
                newPassword = Validate.validatePassword(scanner.nextLine());
                for (int i = 0;i < users.size();i++){
                    if (newUsername.equals(users.get(i).getUsername())) throw new RuntimeException("User name da ton tai ");
                    if (newEmail.equals(users.get(i).getEmail())) throw new RuntimeException("Email da ton tai");

                }
                check = true;
            }catch (RuntimeException e){
                System.out.println(e.getMessage() + ", vui long huc hien lai");
            }
        }
        users.add(new User(id, newUsername,newEmail,newPassword));
        System.out.println("Dang ky thanh cong");
        System.out.println("Tien hanh dang nhap");
        login();
    }

}
