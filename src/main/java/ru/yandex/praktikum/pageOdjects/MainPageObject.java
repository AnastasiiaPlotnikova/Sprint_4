package ru.yandex.praktikum.pageOdjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageObject {

    private final WebDriver driver;
    public MainPageObject(WebDriver webDriver) {
        this.driver = webDriver;
    }

// Куки
    private By acceptCookiesButton = By.className("App_CookieButton__3cvqF");
// Шапка
    // Логотип Яндекса
    private By yandexLogo = By.xpath("//img[@alt='Yandex']");
    // Логотип Самоката
    private By scooterLogo = By.xpath("//img[@alt='Scooter']");
    // заголовок "Учебный тренажер"
    private By mainPageHeaderDisclaimerText = By.className("Header_Disclaimer__3VEni");
    // Кнопка "Заказать" в шапке
    private By orderButtonInHeader = By.className("Button_Button__ra12g");
    // Кнопка "Статус заказа"
    private By orderStatusButton = By.className("Header_Link__1TAG7");
    // Поле ввода статуса заказа
    private By orderStatusInput = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    // Кнопка "Go!" проверки статуса заказа
    private By orderStatusGoButton = By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']");

// Первая часть страницы (до скролла)
    // Нарисованный самокат
    private By scooterBlueprint = By.className("Home_BluePrint__TGX2n");
    // Заголовок "Самокат на пару дней Привезём его прямо к вашей двери, а когда накатаетесь — заберём"
    private By pageContentHeaderPart1 = By.className("Home_Header__iJKdX");
    // Подзаголовок "Привезём его прямо к вашей двери, а когда накатаетесь — заберём"
    private By pageContentSubheaderPart1 = By.xpath("//div[@class = 'Home_Header__iJKdX']/div[contains(text(), 'Привезём')]");
    // Кнопка скролла вниз
    private By scrollDownButton = By.xpath("//img[@alt='Scroll down']");

// Первая часть страницы (после скролла)
    // Фото самоката
    private By scooterPhoto = By.className("Home_Scooter__3YdJy");
    // Подзаголовок Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю
    private By getPageContentSubheaderPart2 = By.xpath("//div[@class = 'Home_Header__iJKdX']/div[contains(text(), 'Он лёгкий')]");
    // Модель самоката
    private By scooterModel = By.xpath("//div[contains(text(), 'Модель')]");
    // Разделитель после названия модели
    private By separatorAfterModelName = By.xpath("//div[@class='Home_Table__2kPxP']/div[position() = 2]");
    // Максимальная скорость
    private By maxSpeed = By.xpath("//div[@class='Home_Row__jdQW2 Home_FirstRow__1pAl9']/div[position() = 1]");
    // Значение максимальной скорости
    private By maxSpeedValue = By.xpath("//div[@class='Home_Row__jdQW2 Home_FirstRow__1pAl9']/div[position() = 2]");
    // Проедет без подзарядки
    private By maxDistance = By.xpath("//div[@class='Home_Row__jdQW2']/div[position() = 1]");
    // Значение максимальной дистанции без подзарядки
    private By maxDistanceValue = By.xpath("//div[@class='Home_Row__jdQW2']/div[position() = 2]");
    // Выдерживает вес
    private By weightLimit = By.xpath("//div[@class='Home_Row__jdQW2']/div[position() = 1]");
    // Значение выдерживает максимальный вес
    private By weightLimitValue = By.xpath("//div[@class='Home_Row__jdQW2']/div[position() = 2]");
    // Разделитель после максимального веса
    private By separatorAfterWeightLimit = By.xpath("//div[@class='Home_Table__2kPxP']/div[position() = 6]");

// Второй раздел "Как это работает"
    // Заголовок "Как это работает"
    private By howItWorksHeader = By.xpath("//div[@class='Home_ThirdPart__LSTEE']/div[@class='Home_SubHeader__zwi_E']");
    // Шаг первый
    private By stepCircle1 = By.xpath("//div[text()='1']");
    private By stepText1 = By.xpath("//div[contains(text(), 'Заказываете')]");
    private By stepSubtext1 = By.xpath("//div[contains(text(), 'Выбираете')]");
    // Шаг второй
    private By stepCircle2 = By.xpath("//div[text()='2']");
    private By stepText2 = By.xpath("//div[contains(text(), 'Курьер привозит')]");
    private By stepSubtext2 = By.xpath("//div[contains(text(), 'А вы')]");
    // Шаг третий
    private By stepCircle3 = By.xpath("//div[text()='3']");
    private By stepText3 = By.xpath("//div[contains(text(), 'Катаетесь')]");
    private By stepSubtext3 = By.xpath("//div[contains(text(), 'Сколько часов')]");
    // Шаг четвертый
    private By stepCircle4 = By.xpath("//div[text()='4']");
    private By stepText4 = By.xpath("//div[contains(text(), 'Курьер забирает')]");
    private By stepSubtext4 = By.xpath("//div[contains(text(), 'Когда аренда')]");
    // Кнопка "Заказать" на странице
    private By orderButtonOnPage = By.className("Button_Button__ra12g Button_Middle__1CSJM");


// Третий раздел "Вопросы и ответы"
    // Заголовок "Вопросы о важном"
    private By questionsHeader = By.xpath("//div[text() = 'Вопросы о важном']");
    // Вопросы и ответы
    public By question1 = By.xpath("//div[@id='accordion__heading-0']");
    public By answer1 =By.xpath("//div[@id='accordion__panel-0']");
    public By question2 = By.xpath("//div[@id='accordion__heading-1']");
    public By answer2 =By.xpath("//div[@id='accordion__panel-1']");
    public By question3 = By.xpath("//div[@id='accordion__heading-2']");
    public By answer3 =By.xpath("//div[@id='accordion__panel-2']");
    public By question4 = By.xpath("//div[@id='accordion__heading-3']");
    public By answer4 =By.xpath("//div[@id='accordion__panel-3']");
    public By question5 = By.xpath("//div[@id='accordion__heading-4']");
    public By answer5 =By.xpath("//div[@id='accordion__panel-4']");
    public By question6 = By.xpath("//div[@id='accordion__heading-5']");
    public By answer6 =By.xpath("//div[@id='accordion__panel-5']");
    public By question7 = By.xpath("//div[@id='accordion__heading-6']");
    public By answer7 =By.xpath("//div[@id='accordion__panel-6']");
    public By question8 = By.xpath("//div[@id='accordion__heading-7']");
    public By answer8 =By.xpath("//div[@id='accordion__panel-7']");

// Принять куки
    public void acceptCookies() {
        driver.findElement(acceptCookiesButton).click();
    }

// Клик по вопросу
    public void clickOnQuestion(By question) {
        WebElement element = driver.findElement(question);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(question).click();
    }

// Получение текста ответа
    public String getAnswerText(By answer) {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(answer));
        return driver.findElement(answer).getText();
    }
// Клик по кнопке "Заказать" в хедере
    public void clickOnTheOrderButton() {
        driver.findElement(orderButtonInHeader).click();
    }

}
