package lessons.lesson1;

public class HW11 {
    private int userId;
    private int objectId;
    private String objectTitle;
    private String objectBody;

    public HW11(int userId, int objectId, String objectTitle, String objectBody) {
        this.userId = userId;
        this.objectId = objectId;
        this.objectTitle = objectTitle;
        this.objectBody = objectBody;
    }

    public int getUserId() {
        return userId;
    }

    public int getObjectId() {
        return objectId;
    }

    public String getObjectTitle() {
        return objectTitle;
    }

    public String getObjectBody() {
        return objectBody;
    }

    public static void main(String[] args) {
        HW11 myObject = new HW11(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");

        System.out.println("My Object Details:");
        System.out.println("User ID: " + myObject.getUserId());
        System.out.println("Object ID: " + myObject.getObjectId());
        System.out.println("Object Title: " + myObject.getObjectTitle());
        System.out.println("Object Body: " + myObject.getObjectBody());
    }
}