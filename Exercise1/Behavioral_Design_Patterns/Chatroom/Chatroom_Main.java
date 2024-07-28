// ChatRoom.java
import java.util.ArrayList;
import java.util.List;

class ChatRoom {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void showMessage(User user, String message) {
        System.out.println("[" + user.getName() + "]: " + message);
    }
}

// User.java
class User {
    private String name;
    private ChatRoom chatroom;

    public User(String name, ChatRoom chatroom) {
        this.name = name;
        this.chatroom = chatroom;
        chatroom.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chatroom.showMessage(this, message);
    }
}

// Main.java
public class Chatroom_Main {
    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoom();
        User alice = new User("Alice", chatroom);
        User bob = new User("Bob", chatroom);

        alice.sendMessage("Hello, Bob!");
        bob.sendMessage("Hi, Alice!");
    }
}
