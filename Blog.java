 public class Blog {
    private User user;
    private int sequenceId;
    private String content;
    private String url;

    public Blog(User user, int sequenceId, String content) {
        this.user = user;
        this.sequenceId = sequenceId;
        this.content = content;
    }

    public Blog(User user, int sequenceId, String content, String url) {
        this.user = user;
        this.sequenceId = sequenceId;
        this.content = content;
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public int getSequenceId() {
        return sequenceId;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }

    public void print() {
        System.out.println("Blog Posted By : " + getUser().getUserName() + "\n" +
        "Post# : " + getSequenceId() + "\n" + "Content : " + getContent() + "\n" +"Web Address : " + getUrl());
    }
}