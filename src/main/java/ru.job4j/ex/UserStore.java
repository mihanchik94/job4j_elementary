package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                rsl = users[index];
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException();
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid() && user.getUsername().length() > 3) {
            rsl = true;
        } else {
            throw new UserInvalidException();
        }
        return rsl;
    }

    public static void main(String[] args) throws UserInvalidException, UserNotFoundException {
        User[] users = {new User("Mickle Ponomarev", true)};
        try {
            if (validate(findUser(users, "Mickle Ponomarev"))) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException eIn) {
            eIn.println();
        } catch (UserNotFoundException eNf) {
            eNf.println();
        }
    }
}
