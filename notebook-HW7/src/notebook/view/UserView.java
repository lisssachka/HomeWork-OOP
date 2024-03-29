package notebook.src.notebook.view;

import notebook.src.notebook.controller.UserController;
import notebook.src.notebook.model.User;
import notebook.src.notebook.util.Commands;

import java.util.*;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {

        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("������� ������� (READ, CREATE, UPDATE, DELETE, EXIT): ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    User userCreate = createUser();
                    userController.saveUser(userCreate);
                    break;
                case READ:
                    String id = prompt("������������� ������������: ");
                    try {
                        User userRead = userController.readUser(Long.parseLong(id));
                        System.out.println(userRead);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case UPDATE:
                    String userId = prompt("������� id ������������: ");
                    userController.updateUser(userId, createUser());
                    break;
                case DELETE:
                    String userDeleteId = prompt("������� id ������������: ");
                    userController.deleteUser(userDeleteId);
                    break;

            }

        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private User createUser() {
        String firstName = prompt("���: ");
        String lastName = prompt("�������: ");
        String phone = prompt("����� ��������: ");
        return new User(firstName, lastName, phone);
    }

}
