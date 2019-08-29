package entity;

public class UserData {
    private String source;
    private User data;

    public UserData() {
    }

    public UserData(String source, User data) {
        this.source = source;
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}
