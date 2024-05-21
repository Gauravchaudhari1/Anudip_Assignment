class Sports {

    public void play() {
        System.out.println("Playing...");
    }
}

class Football extends Sports {

    public void play() {
        System.out.println("Playing football");
    }
}

class Basketball extends Sports {

    public void play() {
        System.out.println("Playing basketball");
    }
}

class Rugby extends Sports {

    public void play() {
        System.out.println("Playing rugby");
    }
}

public class Main {
    public static void main(String[] args) {

        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        football.play();
        basketball.play();
        rugby.play();
    }
}
