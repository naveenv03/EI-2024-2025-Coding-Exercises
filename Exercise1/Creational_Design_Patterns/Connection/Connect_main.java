// Connection.java
class Connection {
    private int id;

    public Connection(int id) {
        this.id = id;
    }

    public void connect() {
        System.out.println("Connection " + id + " is connected");
    }

    public void disconnect() {
        System.out.println("Connection " + id + " is disconnected");
    }
}

// ConnectionPool.java
import java.util.LinkedList;
import java.util.Queue;

class ConnectionPool {
    private Queue<Connection> availableConnections = new LinkedList<>();

    public ConnectionPool(int size) {
        for (int i = 0; i < size; i++) {
            availableConnections.add(new Connection(i));
        }
    }

    public Connection acquireConnection() {
        return availableConnections.poll();
    }

    public void releaseConnection(Connection connection) {
        availableConnections.add(connection);
    }
}

// Main.java
public class Connect_main
 {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(2);
        Connection conn1 = pool.acquireConnection();
        conn1.connect();

        Connection conn2 = pool.acquireConnection();
        conn2.connect();

        conn1.disconnect();
        pool.releaseConnection(conn1);

        Connection conn3 = pool.acquireConnection();
        conn3.connect();
    }
}
