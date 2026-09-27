package app;

import java.util.Random;
import gift.Gift;
import interfaces.SweetsInterface;
import report.Report;
import sweets.CandiesEnum;
import sweets.Candy;
import sweets.Chocolate;
import sweets.JellyBean;
import sweets.Waffle;

/**
 * Main class for create object and call the class Report.
 */

public class Main {

    private static Random randomCalory = new Random();

    private static void makeGift() {
        Chocolate chocolate = new Chocolate("Аленка", 100, randomCalory.nextInt(SweetsInterface.MAX_CALORIES_SWEET));
        Candy caramel = new Candy(CandiesEnum.LOLIPOP, "Золотой ключик", 15, randomCalory.nextInt(SweetsInterface.MAX_CALORIES_SWEET), 4);
        Candy bird = new Candy(CandiesEnum.BIRDMILK, "Птичье Молоко", 37, randomCalory.nextInt(SweetsInterface.MAX_CALORIES_SWEET), 15);
        Candy arahis = new Candy(CandiesEnum.PEANUT, "Арахисовые", 27, randomCalory.nextInt(SweetsInterface.MAX_CALORIES_SWEET), 10);
        JellyBean jelly = new JellyBean("Бон-пари", 50, randomCalory.nextInt(SweetsInterface.MAX_CALORIES_SWEET));
        Waffle waffle = new Waffle("Витьба", 70, randomCalory.nextInt(SweetsInterface.MAX_CALORIES_SWEET));

        Gift gift = new Gift();
        gift.addSweet(chocolate);
        gift.addSweet(caramel);
        gift.addSweet(bird);
        gift.addSweet(arahis);
        gift.addSweet(jelly);
        gift.addSweet(waffle);

        Report report1 = new Report(gift);
        report1.outputResult();
        report1.makeFindCandy(100, 500);
        report1.makeSortCandy();       
    }

    public static void main(String[] args) {  makeGift(); }
}
