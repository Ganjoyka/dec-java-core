package lessons.lesson1;

public class HW12 {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public HW12(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    public static void main(String[] args) {
        HW12 myObject = new HW12(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");

        System.out.println("My Object Details:");
        System.out.println("Post ID: " + myObject.getPostId());
        System.out.println("ID: " + myObject.getId());
        System.out.println("Name: " + myObject.getName());
        System.out.println("Email: " + myObject.getEmail());
        System.out.println("Body: " + myObject.getBody());
    }
}
