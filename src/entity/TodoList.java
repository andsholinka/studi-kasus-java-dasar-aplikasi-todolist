package entity;

public class TodoList {

    private String todo;

    TodoList(){

    }

    TodoList(String todo) {
        this.todo = todo;
    }
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
