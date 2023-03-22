package entity;

public class TodoList {

    public String todo;

    TodoList(){

    }

    public TodoList(String todo) {
        this.todo = todo;
    }
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
