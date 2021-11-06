package stepDefinition;

import POM.Helper.BrowserFactory;
import POM.Pages.BuyFlowPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static POM.Helper.BrowserFactory.driver;

public class stepDefinition_buyFlow {

    BuyFlowPage buyFlowPage;

    @Given("En el navegador abro la pagina en la pagina principal del index")
    public void en_el_navegador_abro_la_pagina_en_la_pagina_principal_del_index() {
        BrowserFactory.abrirUrl(driver,"http://automationpractice.com/index.php");
        buyFlowPage = PageFactory.initElements(driver, BuyFlowPage.class);
    }

    @When("selecciono la categoria Dresses")
    public void selecciono_la_categoria_dresses() {
        buyFlowPage.abrirCategoriaDresses();
    }

    @Then("Valido que me encuentro en la categoria correspondiente")
    public void valido_que_me_encuentro_en_la_categoria_correspondiente() {
        buyFlowPage.categoriaDressesIsDisplayed();
    }

    @Then("Hago clic en Add to Cart en el producto")
    public void hago_clic_en_add_to_cart_en_el_producto() {
        buyFlowPage.addProductToCart();
    }

    @Then("Valido que se muestre el mensaje de prodcuto added succesfully")
    public void valido_que_se_muestre_el_mensaje_de_producto_added_succesfully(){
        buyFlowPage.productSuccessfullyAddedText();
    }

    @Then("Hago clic en el boton continuar comprando")
    public void hago_clic_en_el_boton_continuar_comprando(){
        buyFlowPage.continueShopping();
    }

    @Then("Hago mouseover sobre el carrito de compras")
    public void hago_mouseover_sobre_el_carrito_de_compras() {
        buyFlowPage.mouseoverCart();
    }

    @Then("Valido que se despliega la lista con los productos added")
    public void valido_que_se_despliega_la_lista_con_los_productos_added() {
        buyFlowPage.productAddedToCart();
    }

    @Then("Valido el precio total")
    public void valido_el_precio_total() {
        buyFlowPage.totalPriceCart();
    }

    @Then("Hago clic en el carrito")
    public void hago_clic_en_el_carrito() {
        buyFlowPage.clickOnCart();
    }

    @Then("Valido que me muestra el detalle de la compra en la seccion summary")
    public void valido_que_me_muestra_el_detalle_de_la_compra_en_la_seccion_summary() {
        buyFlowPage.summaryBoughtDetails();
    }

    @Then("Valido que el boton de proceed to checkout exista")
    public void valido_que_el_boton_de_proceed_to_checkout_exista() {
        buyFlowPage.checkoutSummaryIsDisplay();
    }

    @Then("Hago clic en el boton proceed to checkout")
    public void hago_clic_en_el_boton_proceed_to_checkout() {
        buyFlowPage.checkoutSummaryClick();
    }

    @Then("valido que me dirigio a la seccion sign in")
    public void valido_que_me_dirigio_a_la_seccion_sign_in() {
        buyFlowPage.signInSectionIsDisplay();
    }

    @Then("Valido que el campo email es clickeable")
    public void valido_que_el_campo_email_es_clickeable() {
        buyFlowPage.emailFieldIsClickeable();
    }

    @Then("Valido que el campo password es clickeable")
    public void valido_que_el_campo_password_es_clickeable() {
        buyFlowPage.passwdFieldIsClickeable();
    }

    @Then("Ingreso un email registrado")
    public void ingreso_un_email_registrado() throws IOException {
        buyFlowPage.setEmailRegistered();
    }

    @Then("Ingreso un password registrado")
    public void ingreso_un_password_registrado() throws IOException {
        buyFlowPage.setpasswdRegistered();
    }

    @Then("Hago clic en el boton de sign in")
    public void hago_clic_en_el_boton_de_sign_in() {
        buyFlowPage.clickOnButtonSignIn();
    }

    @Then("valido que me dirigio a la seccion address")
    public void valido_que_me_dirigio_a_la_seccion_address() {
        buyFlowPage.addressSectionIsDisplay();
    }

    @Then("Valido la informacion personal alli consignada")
    public void valido_la_informacion_personal_alli_consignada() throws IOException {
        buyFlowPage.addressSectionInformation();
    }

    @Then("Hago clic en el boton para continuar")
    public void hago_clic_en_el_boton_para_continuar() {
        buyFlowPage.clickOnButtonProceedToCheckout();
    }

    @Then("Valido que estoy en la seccion de shipping")
    public void valido_que_estoy_en_la_seccion_de_shipping() {
        buyFlowPage.shippingSectionIsDisplay();
    }

    @Then("marco la casilla de verificacion")
    public void marco_la_casilla_de_verificacion() {
        buyFlowPage.markIAgree();
    }

    @Then("Hago clic en el boton para continuar la transaccion")
    public void hago_clic_en_el_boton_para_continuar_la_transaccion() {
        buyFlowPage.clickOnContinueOnShipping();
    }

    @Then("valido que me encuentro en la seccion de payment")
    public void valido_que_me_encuentro_en_la_seccion_de_payment() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("hago clic en el boton pay by bank wire")
    public void hago_clic_en_el_boton_pay_by_bank_wire() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("valido el mensaje mostrado que corresponda con el metodo de pago pay by bank wire")
    public void valido_el_mensaje_mostrado_que_corresponda_con_el_metodo_de_pago_pay_by_bank_wire() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Hago clic en el boton Other payment methods")
    public void hago_clic_en_el_boton_other_payment_methods() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("hago clic en el boton pay by check")
    public void hago_clic_en_el_boton_pay_by_check() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("valido el mensaje mostrado que corresponda con el metodo de pago pay by check")
    public void valido_el_mensaje_mostrado_que_corresponda_con_el_metodo_de_pago_pay_by_check() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Hago clic en el boton I confirm my order")
    public void hago_clic_en_el_boton_i_confirm_my_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("valido que el mensaje de transaccion exitosa se muestra")
    public void valido_que_el_mensaje_de_transaccion_exitosa_se_muestra() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("hago clic en el boton back to my orders")
    public void hago_clic_en_el_boton_back_to_my_orders() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("valido la fecha de la transaccion y el order reference")
    public void valido_la_fecha_de_la_transaccion_y_el_order_reference() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Hago clic en el boton deails")
    public void hago_clic_en_el_boton_deails() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("valido la informacion de la compra realizada")
    public void valido_la_informacion_de_la_compra_realizada() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
