package POM.Pages;

import ExcelDataSetHandler.ReadExcelFile;
import ExcelDataSetHandler.WriteExcelFile;
import POM.Helper.BrowserFactory;
import io.cucumber.core.gherkin.Feature;
import io.cucumber.java8.Scenario;
import io.cucumber.plugin.event.Node;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import stepDefinition.ServiceHooks;

import java.io.IOException;
import java.util.Date;
import java.util.function.Consumer;

import static POM.Helper.BrowserFactory.driver;

public class BuyFlowPage extends BrowserFactory {

    WebDriver driver;
    byte[] screenshot;
    WriteExcelFile writeFile = new WriteExcelFile();
    ReadExcelFile readFile = new ReadExcelFile();
    Integer randomrow;
    String filepath = "TestFiles/usersDataset.xlsx";
    Integer getLastRow = readFile.lastRow(filepath, "Hoja1");
    String orderReference;

    Consumer<By> hover = (By by) -> {
        actions.moveToElement(driver.findElement(by))
                .perform();
    };

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a")
    WebElement dressesButton;
    @FindBy(how = How.CLASS_NAME, using = "category-name")
    WebElement dresses;
    @FindBy(how = How.XPATH, using = "//div[@class='right-block']")
    WebElement printedDressCotton;
    @FindBy(how = How.XPATH, using = "//span[text()='Add to cart']")
    WebElement addToCart1;
    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/a")
    WebElement productAddedToCart;
    @FindBy(how = How.XPATH, using = "(//div[@class='right-block'])[2]")
    WebElement printedDre;
    @FindBy(how = How.XPATH, using = "(//span[text()='Add to cart'])[2]")
    WebElement addToCart2;
    @FindBy(how = How.XPATH, using = "(//div[@class='right-block'])[3]")
    WebElement printedSummerDressLong;
    @FindBy(how = How.XPATH, using = "(//span[text()='Add to cart'])[3]")
    WebElement addToCart3;
    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[1]/h2")
    WebElement productSuccessfullyAddedText;
    @FindBy(how = How.XPATH, using = "//span[text()[normalize-space()='Continue shopping']]")
    WebElement continueShopping;
    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/p[2]/a[1]/span")
    WebElement proceedToCheckout;
    @FindBy(how = How.XPATH, using="//a[@title='View my shopping cart']")
    WebElement viewMyShopping;
    @FindBy(how = How.CLASS_NAME, using = "cross")
    WebElement closeWindow;
    @FindBy(how = How.XPATH, using = "//span[contains(@class,'price cart_block_total')]")
    WebElement totalPrice;
    @FindBy(how = How.XPATH, using = "//span[contains(@class,'price cart_block_shipping_cost')]")
    WebElement shippingCost;
    @FindBy(how = How.XPATH, using = "//span[text()[normalize-space()='Check out']]")
    WebElement checkOut;
    @FindBy(how = How.CSS, using = "ul[class='address alternate_item box']>li[class='address_firstname address_lastname']")
    WebElement nameBilling;
    @FindBy(how = How.XPATH, using = "(//span[@class='address_address1'])[2]")
    WebElement address;
    @FindBy(how = How.XPATH, using = "(//span[@class='address_city'])[2]")
    WebElement addressCity;
    @FindBy(how = How.XPATH, using = "//span[text()[normalize-space()='United States']]")
    WebElement country;
    @FindBy(how = How.XPATH, using = "(//span[@class='address_phone_mobile'])[2]")
    WebElement phoneMobile;
    @FindBy(how = How.ID, using = "total_price")
    WebElement totalPriceSummary;
    @FindBy(how = How.ID, using = "total_price_without_tax")
    WebElement totalPriceWithoutAjaxSummary;
    @FindBy(how = How.ID, using = "total_shipping")
    WebElement totalShipping;
    @FindBy(how = How.ID, using = "total_product")
    WebElement totalProductSummary;
    @FindBy(how = How.XPATH, using = "//span[@class='price special-price']")
    WebElement discountPrice;
    @FindBy(how = How.XPATH, using = "//span[@class='price-percent-reduction small']")
    WebElement discount;
    @FindBy(how = How.CLASS_NAME, using = "old-price")
    WebElement oldPrice;
    @FindBy(how = How.XPATH, using = "//span[text()=' Summary']")
    WebElement summary;
    @FindBy(how = How.XPATH, using = "//span[text()[normalize-space()='$57.96']]")
    WebElement priceProduct1;
    @FindBy(how = How.XPATH, using = "//span[text()[normalize-space()='$52.00']]")
    WebElement priceProduct2;
    @FindBy(how = How.XPATH, using = "//input[contains(@class,'cart_quantity_input form-control')]")
    WebElement quantity1;
    @FindBy(how = How.XPATH, using = "(//input[contains(@class,'cart_quantity_input form-control')])[2]")
    WebElement quantity2;
    @FindBy(how = How.XPATH, using = "//span[text()=' Address']")
    WebElement addressSection;
    @FindBy(how = How.XPATH, using = "//span[text()='Proceed to checkout']")
    WebElement proceedToCheckoutAddress;
    @FindBy(how = How.XPATH, using = "(//li[@class='address_address1 address_address2'])[2]")
    WebElement addressBilling;
    @FindBy(how = How.CSS, using = "ul[class='address alternate_item box']>li[class='address_city address_state_name address_postcode']")
    WebElement cityBilling;
    @FindBy(how = How.XPATH, using = "(//li[@class='address_country_name'])[2]")
    WebElement countryBilling;
    @FindBy(how = How.XPATH, using = "(//li[@class='address_phone_mobile'])[2]")
    WebElement phoneMobileBilling;
    @FindBy(how = How.CSS, using = "ul[class='address item box']>li[class='address_firstname address_lastname']")
    WebElement nameDelivery;
    @FindBy(how = How.XPATH, using = "//li[@class='address_address1 address_address2']")
    WebElement addressDelivery;
    @FindBy(how = How.CSS, using = "ul[class='address item box']>li[class='address_city address_state_name address_postcode']")
    WebElement addressCityDelivery;
    @FindBy(how = How.XPATH, using = "//li[@class='address_country_name']")
    WebElement countryDelivery;
    @FindBy(how = How.XPATH, using = "//li[@class='address_phone_mobile']")
    WebElement phoneMobileDelivery;
    @FindBy(how = How.XPATH, using = "//div[@class='delivery_option_price']")
    WebElement deliveryPrice;
    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")
    WebElement iAgreeTo;
    @FindBy(how = How.XPATH, using = "//*[@id='form']/p/button")
    WebElement proceedToCheckoutShipping;
    @FindBy(how = How.XPATH, using = "//span[text()=' Shipping']")
    WebElement shipping;
    @FindBy(how = How.XPATH, using = "(//p[@class='product-name']//a)[2]")
    WebElement printedDress;
    @FindBy(how = How.ID, using = "total_price")
    WebElement totalPricePayment;
    @FindBy(how = How.ID, using = "total_product")
    WebElement totalProductPayment;
    @FindBy(how = How.ID, using = "total_shipping")
    WebElement totalShippingPayment;
    @FindBy(how = How.XPATH, using = "//span[text()=' Payment']")
    WebElement payment;
    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    WebElement payByBank;
    @FindBy(how = How.CLASS_NAME, using = "cheque")
    WebElement payByCheck;
    @FindBy(how = How.TAG_NAME, using = "h3")
    WebElement bankwirePayment;
    @FindBy(how = How.XPATH, using = "//strong[text()[normalize-space()='You have chosen to pay by bank wire. Here is a short summary of your order:']]")
    WebElement youHaveChosenBankWire;
    @FindBy(how = How.TAG_NAME, using = "h3")
    WebElement checkPayment;
    @FindBy(how = How.XPATH, using = "//strong[text()[normalize-space()='You have chosen to pay by check. Here is a short summary of your order:']]")
    WebElement youHaveChosenCheck;
    @FindBy(how = How.XPATH, using = "//span[text()='I confirm my order']")
    WebElement iConfirmMy;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'button-exclusive btn')]")
    WebElement otherPaymentMethods;
    @FindBy(how = How.XPATH, using = "//p[@class='alert alert-success']")
    WebElement yourOrderOn;
    @FindBy(how=How.XPATH,using = "//*[@id='center_column']/div")
    WebElement textWithOrderReference;
    @FindBy(how = How.XPATH, using = "//div[@class='box order-confirmation']")
    WebElement yourCheckMust;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'button-exclusive btn')]")
    WebElement backToOrders;
    @FindBy(how = How.XPATH, using = "//td[@class='history_date bold']")
    WebElement historyDate;
    @FindBy(how = How.XPATH, using = "//td[contains(@class,'history_link bold')]")
    WebElement transactionID;
    @FindBy(how = How.XPATH, using = "//*[@id='submitReorder']/p/strong")
    WebElement informationDetailsOrder_Date;
    @FindBy(how = How.XPATH, using = "//*[@id='order-detail-content']/table/tfoot/tr[4]/td[2]/span")
    WebElement totalPriceDetails;
    @FindBy(how = How.XPATH, using = "//*[@id='order-list']/tbody/tr[1]/td[7]/a[1]")
    WebElement details;
    @FindBy(how = How.XPATH, using = "//span[text()=' Home']")
    WebElement home;
    @FindBy(how = How.XPATH, using = "//span[text()[normalize-space()='Back to your account.']]")
    WebElement backToYourAccount;

    @FindBy(how = How.XPATH, using="//span[text()=' Sign in']")  WebElement signInSection;
    @FindBy(how = How.XPATH, using="(//h3[@class='page-subheading'])[2]")  WebElement alreadyRegistered;
    @FindBy(how = How.ID, using="email")  WebElement email;
    @FindBy(how = How.ID, using="passwd")  WebElement passwd;
    @FindBy(how = How.XPATH, using="//*[@id='SubmitLogin']/span")  WebElement signInButton;

    public BuyFlowPage(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    public void abrirCategoriaDresses() {
        explicitWait(driver, 15);
        dressesButton.click();
    }

    public void categoriaDressesIsDisplayed() {
        explicitWait(driver, 15);
        dresses.isDisplayed();
    }

    public void addProductToCart() {
        explicitWait(driver, 15);
        hover.accept(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a"));
        addToCart1.click();
    }

    public void productSuccessfullyAddedText() {
        explicitWait(driver, 15).until(ExpectedConditions.visibilityOf(productSuccessfullyAddedText));
        System.out.println(productSuccessfullyAddedText.getText());
        Assert.assertEquals("Product successfully added to your shopping cart", productSuccessfullyAddedText.getText());
    }

    public void continueShopping() {
        explicitWait(driver, 15);
        Assert.assertTrue(continueShopping.isDisplayed());
        continueShopping.click();
    }

    public void mouseoverCart() {
        explicitWait(driver, 15);
        hover.accept(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
    }

    public void productAddedToCart() {
        explicitWait(driver, 15).until(ExpectedConditions.visibilityOf(productAddedToCart));
        softAssertions.assertThat(productAddedToCart.getText()).as("Step: And Valido que se despliega la lista con los productos added").isEqualTo("Printed Dress");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

    }
    public void totalPriceCart() {
        explicitWait(driver, 15).until(ExpectedConditions.visibilityOf(totalPrice));
        softAssertions.assertThat(totalPrice.getText()).as("Step: And Valido el precio total").isEqualTo("$28.00");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    public void clickOnCart() {
        explicitWait(driver, 15).until(ExpectedConditions.visibilityOf(viewMyShopping));
        viewMyShopping.click();
    }
    public void summaryBoughtDetails(){
        explicitWait(driver, 15).until(ExpectedConditions.visibilityOf(totalPriceSummary));
        softAssertions.assertThat(totalPriceSummary.getText()).as("Step: And Valido que me muestra el detalle de la compra en la seccion summary").isEqualTo("$28.00");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        explicitWait(driver, 15).until(ExpectedConditions.visibilityOf(totalShipping));
        softAssertions.assertThat(totalShipping.getText()).as("Step: And Valido que me muestra el detalle de la compra en la seccion summary").isEqualTo("$2.00");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        explicitWait(driver, 15).until(ExpectedConditions.visibilityOf(totalPriceWithoutAjaxSummary));
        softAssertions.assertThat(totalPriceWithoutAjaxSummary.getText()).as("Step: And Valido que me muestra el detalle de la compra en la seccion summary").isEqualTo("$28.00");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        explicitWait(driver, 15).until(ExpectedConditions.visibilityOf(totalProductSummary));
        softAssertions.assertThat(totalProductSummary.getText()).as("Step: And Valido que me muestra el detalle de la compra en la seccion summary").isEqualTo("$26.00");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public void checkoutSummaryIsDisplay() {
        Assert.assertEquals(proceedToCheckout.isDisplayed(),Boolean.TRUE);
    }

    public void checkoutSummaryClick() {
        explicitWait(driver, 15).until(ExpectedConditions.elementToBeClickable(proceedToCheckout));
        proceedToCheckout.click();
    }

    public void signInSectionIsDisplay(){
        Assert.assertEquals(signInSection.isDisplayed(),Boolean.TRUE);
        Assert.assertEquals(alreadyRegistered.isDisplayed(),Boolean.TRUE);
    }

    public void emailFieldIsClickeable(){
        explicitWait(driver,15).until(ExpectedConditions.elementToBeClickable(email));
    }

    public void passwdFieldIsClickeable(){
        explicitWait(driver,15).until(ExpectedConditions.elementToBeClickable(passwd));
    }

    public void setEmailRegistered() throws IOException {
        randomrow = readFile.randomRow(filepath,"Hoja1");
        if(randomrow==0)
            randomrow++;
        String registeredEmail = readFile.getCellValue(filepath,"Hoja1",randomrow,0);
        email.sendKeys(registeredEmail);
    }
    public void setpasswdRegistered() throws IOException {
        String registeredEmail = readFile.getCellValue(filepath,"Hoja1",randomrow,3);
        passwd.sendKeys(registeredEmail);
    }

    public void clickOnButtonSignIn(){
        explicitWait(driver,15).until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }
    public void addressSectionIsDisplay(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(addressSection));
    }
    public void addressSectionInformation() throws IOException {
        String name = readFile.getCellValue(filepath,"Hoja1",randomrow,1)+" "+readFile.getCellValue(filepath,"Hoja1",randomrow,2);
        softAssertions.assertThat(nameBilling.getText()).as("Step: And Valido la informacion personal alli consignada").isEqualTo(name);
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        softAssertions.assertThat(nameDelivery.getText()).as("Step: And Valido la informacion personal alli consignada").isEqualTo(name);
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        String address = readFile.getCellValue(filepath,"Hoja1",randomrow,5);
        softAssertions.assertThat(addressBilling.getText()).as("Step: And Valido la informacion personal alli consignada").isEqualTo(address);
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        softAssertions.assertThat(addressDelivery.getText()).as("Step: And Valido la informacion personal alli consignada").isEqualTo(address);
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        String city = readFile.getCellValue(filepath,"Hoja1",randomrow,6);
        String zipCode = readFile.getCellValue(filepath,"Hoja1",randomrow,7);

        softAssertions.assertThat(cityBilling.getText()).as("Step: And Valido la informacion personal alli consignada").contains(city).contains(zipCode);
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        softAssertions.assertThat(addressCityDelivery.getText()).as("Step: And Valido la informacion personal alli consignada").contains(city).contains(zipCode);
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        softAssertions.assertThat(countryBilling.getText()).as("Step: And Valido la informacion personal alli consignada").isEqualTo("United States");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        softAssertions.assertThat(countryDelivery.getText()).as("Step: And Valido la informacion personal alli consignada").isEqualTo("United States");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        String phone = readFile.getCellValue(filepath,"Hoja1",randomrow,4);

        softAssertions.assertThat(phoneMobileBilling.getText()).as("Step: And Valido la informacion personal alli consignada").contains(phone);
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

        softAssertions.assertThat(phoneMobileDelivery.getText()).as("Step: And Valido la informacion personal alli consignada").contains(phone);
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

    }
    public void clickOnButtonProceedToCheckout(){
        explicitWait(driver,15).until(ExpectedConditions.elementToBeClickable(proceedToCheckoutAddress));
        proceedToCheckoutAddress.click();
    }
    public void shippingSectionIsDisplay(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(shipping));
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(deliveryPrice));
        softAssertions.assertThat(deliveryPrice.getText()).as("Step: And valido_que_estoy_en_la_seccion_de_shipping").contains("$2.00");
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    public void markIAgree(){
        explicitWait(driver,15);
        iAgreeTo.click();
    }
    public void clickOnContinueOnShipping(){
        explicitWait(driver,15).until(ExpectedConditions.elementToBeClickable(proceedToCheckoutShipping));
        proceedToCheckoutShipping.click();
    }
    public void paymentIsDisplayed(){
        String Payment = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(payment)).getText();
        Assert.assertEquals("05. Payment",Payment);
    }
    public void payByBankWireClick(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(payByBank));
        payByBank.click();
    }
    public void payByBankWireMessageIsDisplayed(){
        String payBankWireMessage = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(youHaveChosenBankWire)).getText();
        Assert.assertEquals("You have chosen to pay by bank wire. Here is a short summary of your order:",payBankWireMessage);
    }
    public void otherPaymentMethodsClick(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(otherPaymentMethods));
        otherPaymentMethods.click();
    }
    public void payByCheckClick(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(payByCheck));
        payByCheck.click();
    }
    public void payByCheckMessageIsDisplayed(){
        String payByCheckMessage = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(youHaveChosenCheck)).getText();
        Assert.assertEquals("You have chosen to pay by check. Here is a short summary of your order:",payByCheckMessage);
    }
    public void confirmMyOrderClick(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(iConfirmMy));
        iConfirmMy.click();
    }
    public void successPaymentMessage(){
        String successMessage = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(yourOrderOn)).getText();
        Assert.assertEquals("Your order on My Store is complete.",successMessage);
        orderReference = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(textWithOrderReference)).getText();
        Integer indexOR = orderReference.indexOf("order reference");
        orderReference = orderReference.substring(indexOR+16, 155);
        System.out.println(orderReference);
    }
    public void backToMyOrders(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(backToOrders));
        backToOrders.click();
    }
    public void orderReference_DateOrder(){
        String actualDate = getDate();
        String historyDateText = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(historyDate)).getText();
        Assert.assertEquals(actualDate,historyDateText);
        String transactionIDText = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(transactionID)).getText();
        Assert.assertEquals(orderReference,transactionIDText);
    }
    public void detailsButtonClick(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(details));
        softAssertions.assertThat(ExpectedConditions.elementToBeClickable(details)).as("And Hago clic en el boton deails").isEqualTo(true);
        details.click();
    }
    public void detailInformation(){
        String actualDate = getDate();
        String detailsText = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(informationDetailsOrder_Date)).getText();
        String totalPrice = explicitWait(driver,15).until(ExpectedConditions.visibilityOf(totalPriceDetails)).getText();
        softAssertions.assertThat(detailsText).as("And valido la informacion de la compra realizada").contains(actualDate);
        softAssertions.assertThat(detailsText).as("And valido la informacion de la compra realizada").contains(orderReference);
        softAssertions.assertThat(totalPrice).as("And valido la informacion de la compra realizada").isEqualTo("$28.00");

    }

}
