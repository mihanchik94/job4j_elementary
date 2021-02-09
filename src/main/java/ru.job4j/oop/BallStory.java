package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Volk wolf = new Volk();
        Fox fox = new Fox();

        hare.tryEat(ball);
        ball.tryRun(hare);
        wolf.tryEat(ball);
        ball.tryRun(wolf);
        fox.tryEat(ball);
        ball.notTryRun(fox);
    }
}
