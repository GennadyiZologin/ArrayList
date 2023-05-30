public class UserInput {
    private final String command;

    private final Integer index;

    private final String task;

    public UserInput(String command, Integer index, String task) {
        this.command = command;
        this.index = index;
        this.task = task;
    }

    public String getCommand() {
        return command;
    }

    public Integer getIndex() {
        return index;
    }

    public String getTask() {
        return task;
    }

}

