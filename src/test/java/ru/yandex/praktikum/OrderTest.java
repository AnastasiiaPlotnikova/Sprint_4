package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.pageOdjects.MainPageObject;
import ru.yandex.praktikum.pageOdjects.OrderScooterObject;

@RunWith(Parameterized.class)
public class OrderTest extends BaseUITest {

    private final String name;
    private final String surname;
    private final String address;
    private final String metroStation;
    private final String phoneNumber;
    private final String orderDate;
    private final int orderDuration;
    private final String scooterColor;
    private final String comment;

    public OrderTest(String name, String surname, String address, String metroStation, String phoneNumber,
                     String orderDate, int orderDuration, String scooterColor, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.phoneNumber = phoneNumber;
        this.orderDate = orderDate;
        this.orderDuration = orderDuration;
        this.scooterColor = scooterColor;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] enterValues() {
        return new Object[][] {
                {"Иван", "Пушкин", "Кремлевский проезд 1", "Люблино", "88005553535", "11.09.2022", 2, "black", "Оставить у ворот"},
                {"Анджелина", "Джоли", "Малая Бронная ул., 21", "Маяковская", "79991234567", "15.10.2022", 5, "grey", "Спасибо)"}
        };
    }

    @Test
    public void orderInformationPopupShoulBeDisplayed() {
        MainPageObject mainPageObject = new MainPageObject(driver);
        OrderScooterObject orderScooterObject = new OrderScooterObject(driver);
        OrderTest orderTest = new OrderTest(name, surname, address, metroStation, phoneNumber,
                orderDate, orderDuration, scooterColor, comment);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPageObject.acceptCookies();

        mainPageObject.clickOnTheOrderButton();
        orderScooterObject.enterName(name);
        orderScooterObject.enterSurname(surname);
        orderScooterObject.enterAdress(address);
        orderScooterObject.selectStation(metroStation);
        orderScooterObject.enterPhoneNumber(phoneNumber);

        orderScooterObject.clickNextInStep1();

        orderScooterObject.enterOrderDate(orderDate);
        orderScooterObject.selectOrderDuration(orderDuration);
        orderScooterObject.selectScooterColor(scooterColor);
        orderScooterObject.enterCommentForCourier(comment);

        orderScooterObject.clickOrderInStep2();
        orderScooterObject.clickYesInConfirmPopup();

        Assert.assertTrue("Всплывающее окно отсутствует", orderScooterObject.orderConfirmMessageIsVisible());
    }


}
