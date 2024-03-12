package day_51_abstraction.Interface;

public class PingPong implements Sport,CampusFriendly {

    public void installIndoors(){
        System.out.println("Installing Ping Pong");

    }

    @Override
    public void practice() {
        System.out.println("Ping Pong practice-during class break");

    }

    @Override
    public void compete(String type) {
        System.out.println("Ping pong competition"+type);

    }

}
