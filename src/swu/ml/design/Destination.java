package swu.ml.design;

public class Destination {
    private static int id;
    private static String place;
    private static String describe;
    private static String img;
    public static String getPlace() {
        return place;
    }

    public static void setPlace(String place) {
        Destination.place = place;
    }

    public static String getDescribe() {
        return describe;
    }

    public static void setDescribe(String describe) {
        Destination.describe = describe;
    }

    public static String getImg() {
        return img;
    }

    public static void setImg(String img) {
        Destination.img = img;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Destination.id = id;
    }
}
