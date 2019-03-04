package com.gexiao.design.principle.singleresponsibility;

public class Test {

    public static void main(String[] args) {
      /*  Bird bird = new Bird();
        bird.maniMoveMode("大雁");
        bird.maniMoveMode("鸵鸟");*/

      FlyBird bird = new FlyBird();
      bird.maniMoveMode("大雁");

      WalkBird walkBird = new WalkBird();
      walkBird.maniMoveMode("鸵鸟");
    }

}
