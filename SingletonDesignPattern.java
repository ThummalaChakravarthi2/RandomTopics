public class TVRemote {
    private static TVRemote instance;

    private TVRemote() {
        System.out.println("TV Remote created!");
    }

    public static TVRemote getInstance() {
        if (instance == null) {
            instance = new TVRemote();
        }
        return instance;
    }

    public void changeChannel(int channel) {
        System.out.println("Changing channel to " + channel);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        TVRemote remote1 = TVRemote.getInstance();
        TVRemote remote2 = TVRemote.getInstance();

        remote1.changeChannel(5);
        remote2.changeChannel(10);

        System.out.println(remote1 == remote2); // true, same remote
    }
}
