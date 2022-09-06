package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import ru.yandex.praktikum.pageOdjects.MainPageObject;


public class QuestionsAnsAnswersTest extends BaseUITest{

    @Test
    public void answer1ShouldBeAsExpected() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        AnswerTexts answerTexts = new AnswerTexts();
        mainPageObject.acceptCookies();
        mainPageObject.clickOnQuestion(mainPageObject.question1);
        String actualText = mainPageObject.getAnswerText(mainPageObject.answer1);
        Assert.assertEquals("Текст ответа не совпадает с ожидаемым", answerTexts.answer1, actualText);
    }

    @Test
    public void answer2ShouldBeAsExpected() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        AnswerTexts answerTexts = new AnswerTexts();
        mainPageObject.acceptCookies();
        mainPageObject.clickOnQuestion(mainPageObject.question2);
        String actualText = mainPageObject.getAnswerText(mainPageObject.answer2);
        Assert.assertEquals("Текст ответа не совпадает с ожидаемым", answerTexts.answer2, actualText);
    }

    @Test
    public void answer3ShouldBeAsExpected() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        AnswerTexts answerTexts = new AnswerTexts();
        mainPageObject.acceptCookies();
        mainPageObject.clickOnQuestion(mainPageObject.question3);
        String actualText = mainPageObject.getAnswerText(mainPageObject.answer3);
        Assert.assertEquals("Текст ответа не совпадает с ожидаемым", answerTexts.answer3, actualText);
    }

    @Test
    public void answer4ShouldBeAsExpected() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        AnswerTexts answerTexts = new AnswerTexts();
        mainPageObject.acceptCookies();
        mainPageObject.clickOnQuestion(mainPageObject.question4);
        String actualText = mainPageObject.getAnswerText(mainPageObject.answer4);
        Assert.assertEquals("Текст ответа не совпадает с ожидаемым", answerTexts.answer4, actualText);
    }

    @Test
    public void answer5ShouldBeAsExpected() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        AnswerTexts answerTexts = new AnswerTexts();
        mainPageObject.acceptCookies();
        mainPageObject.clickOnQuestion(mainPageObject.question5);
        String actualText = mainPageObject.getAnswerText(mainPageObject.answer5);
        Assert.assertEquals("Текст ответа не совпадает с ожидаемым", answerTexts.answer5, actualText);
    }

    @Test
    public void answer6ShouldBeAsExpected() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        AnswerTexts answerTexts = new AnswerTexts();
        mainPageObject.acceptCookies();
        mainPageObject.clickOnQuestion(mainPageObject.question6);
        String actualText = mainPageObject.getAnswerText(mainPageObject.answer6);
        Assert.assertEquals("Текст ответа не совпадает с ожидаемым", answerTexts.answer6, actualText);
    }

    @Test
    public void answer7ShouldBeAsExpected() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        AnswerTexts answerTexts = new AnswerTexts();
        mainPageObject.acceptCookies();
        mainPageObject.clickOnQuestion(mainPageObject.question7);
        String actualText = mainPageObject.getAnswerText(mainPageObject.answer7);
        Assert.assertEquals("Текст ответа не совпадает с ожидаемым", answerTexts.answer7, actualText);
    }

    @Test
    public void answer8ShouldBeAsExpected() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageObject mainPageObject = new MainPageObject(driver);
        AnswerTexts answerTexts = new AnswerTexts();
        mainPageObject.acceptCookies();
        mainPageObject.clickOnQuestion(mainPageObject.question8);
        String actualText = mainPageObject.getAnswerText(mainPageObject.answer8);
        Assert.assertEquals("Текст ответа не совпадает с ожидаемым", answerTexts.answer8, actualText);
    }



}
