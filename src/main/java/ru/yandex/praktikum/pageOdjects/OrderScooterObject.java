package ru.yandex.praktikum.pageOdjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderScooterObject {
    private final WebDriver driver;

    public OrderScooterObject(WebDriver driver) {
        this.driver = driver;
    }

//Шаг1
    // Поле имя
    private By nameInput = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder = '* Имя']");
    // Поле фамилия
    private By surnameInput = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder = '* Фамилия']");
    // Поле Адрес
    private By adressInput = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder = '* Адрес: куда привезти заказ']");
    // Поле ввода станции метро
    private By subwayStationInput = By.xpath("//input[@placeholder = '* Станция метро']");
    // Дропдаун выбор первого элемента по результатам поиска станции метро
    private By getSubwayStationInput = By.xpath("//li[@class='select-search__row'][position() = 1]");
    // Поле номер телефона
    private By phoneNumberInput = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder = '* Телефон: на него позвонит курьер']");
    // Кнопка Далее (шаг 1)
    private By step1NextButton = By.xpath("//div[@class='Order_NextButton__1_rCA']/button");
//Шаг 2
    // Поле ввода даты
    private By odredDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");

    // Поле выбора срока аденды (вызов дропдауна)
    private By orderDuration = By.className("Dropdown-placeholder");

    // Поле Комментарий для курьера
    private By commentForCourier = By.xpath("//input[@placeholder='Комментарий для курьера']");

    // Кнопка "Заказать" на шаге 2
    private By orderButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");


    // Кнопка "Да" в конферм попапе
    private By confirmOrderButton = By.xpath("//button[text()='Да']");
    // Попап с сообщением об успешном создании заказа
    private By orderInformationMessage = By.xpath("//div[@class='Order_Modal__YZ-d3']/div[text()='Заказ оформлен']");

    //ввод имени
    public void enterName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }
    // ввод фамилии
    public void enterSurname(String surName) {
        driver.findElement(surnameInput).sendKeys(surName);
    }
    //ввод адреса
    public void enterAdress(String adress) {
        driver.findElement(adressInput).sendKeys(adress);
    }
    // выбор станции
    public void selectStation(String station) {
        driver.findElement(subwayStationInput).sendKeys(station);
        driver.findElement(getSubwayStationInput).click();
    }
    //ввод номера телефона
    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
    }
    //клин по кнопке "Далее"
    public void clickNextInStep1() {
        driver.findElement(step1NextButton).click();
    }
    //выбор даты
    public void enterOrderDate(String date) {
        driver.findElement(odredDate).sendKeys(date);
        driver.findElement(By.xpath("//div[@class='react-datepicker__month']//div[@tabindex='0']")).click();
    }
    //выбор продолжительности аренды
    public void selectOrderDuration(int days){
        driver.findElement(orderDuration).click();
        driver.findElement(By.xpath("//div[@class='Dropdown-menu']/div[position() = "+days+"]")).click();
    }
    //выбор цвета
    public void selectScooterColor(String color) {
        driver.findElement(By.xpath("//input[@id='"+color+"']")).click();
    }

    //ввод коммента для курьера
    public void enterCommentForCourier(String comment) {
        driver.findElement(commentForCourier).sendKeys(comment);
    }
    //клик по кнопке "Заказать"
    public void clickOrderInStep2() {
        driver.findElement(orderButton).click();
    }
    //клин по кнопке "Да" в попапе подтверждения заказа
    public void clickYesInConfirmPopup() {
        driver.findElement(confirmOrderButton).click();
    }
    //проверка видимости сообщения "заказ оформлен" на всплывающем окне
    public boolean orderConfirmMessageIsVisible(){
        return driver.findElement(orderInformationMessage).isDisplayed();
    }


}
