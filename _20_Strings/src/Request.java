class Request {
    String username;
    String password;

    Request(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Request mask() {
        this.password = "****";
        return this;
    }

    public void validate() {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Username and password are required");
        }

        if (password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }
    }

    @Override
    public String toString() {
        return "Request{username='" + username + "', password='" + password + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        Request req = new Request("user1", "secret123");

        System.out.println("Incoming request: " + req.mask());

        req.validate();
        System.out.println("Validation successful");
    }
}