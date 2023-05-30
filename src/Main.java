import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            UserInput userInput = p(scanner.nextLine());
            switch (userInput.getCommand()) {
                case "LIST":
                    System.out.println(todoList.list());
                    break;
                case "ADD":
                    todoList.add(userInput.getIndex(), userInput.getTask());
                    break;
                case "EDIT":
                    todoList.edit(userInput.getIndex(), userInput.getTask());
                    break;
                case "DELETE":
                    todoList.delete(userInput.getIndex());
                    break;
            }
        }
    }
    private static UserInput p(String input) {
        String[] split = input.split(" ");
        if (split.length == 1) return new UserInput(input.toUpperCase(), null, null);
        try {
            return new UserInput(split[0].toUpperCase(), Integer.valueOf(split[1]), String.join(" ",
                    Arrays.copyOfRange(split, 2, split.length)));
        } catch (NumberFormatException e) {
            return new UserInput(split[0].toUpperCase(), null, String.join(" ",
                    Arrays.copyOfRange(split, 1, split.length)));
        }
    }
}