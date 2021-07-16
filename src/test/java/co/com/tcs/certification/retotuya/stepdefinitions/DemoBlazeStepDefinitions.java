package co.com.tcs.certification.retotuya.stepdefinitions;

import co.com.tcs.certification.retotuya.model.DataList;
import co.com.tcs.certification.retotuya.questions.TheAnswer;
import co.com.tcs.certification.retotuya.questions.TheAnswerAuth;
import co.com.tcs.certification.retotuya.questions.TheAnswerFrom;
import co.com.tcs.certification.retotuya.questions.TheAnswerProduct;
import co.com.tcs.certification.retotuya.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class DemoBlazeStepDefinitions {

    @Before
    public void Configuration() {
        setTheStage(new OnlineCast());
    }


    @Given("^that (.*) wants to enter the page$")
    public void thatMarilynWantsToEnterThePage(String marilyn) {

        theActorCalled(marilyn).wasAbleTo(OpenThe.page());

    }

    @When("^the user enters the data$")
    public void theUserEntersTheData(List<DataList> dataLists) {
        theActorInTheSpotlight().attemptsTo(RegisterThe.user(dataLists));


    }

    @When("^the user enters the data for auth$")
    public void theUserEntersTheDataForAuth(List<DataList> dataLists) {
        theActorInTheSpotlight().attemptsTo(AuthenticactionUser.is(dataLists));


    }

    @When("^the user enters the data for form$")
    public void theUserEntersTheDataForForm(List<DataList> dataLists) {
        theActorInTheSpotlight().attemptsTo(RegisterForm.ofContact(dataLists));
    }

    @Then("^should see the successful registration message$")
    public void shouldSeeTheSuccessfulRegistrationMessage() {
        theActorInTheSpotlight().should(seeThat(TheAnswer.is()));

    }

    @Then("^should see the authenticated user$")
    public void shouldSeeTheAuthenticatedUser() {
        theActorInTheSpotlight().should(seeThat(TheAnswerAuth.is()));
    }

    @Then("^should see the message (.*)$")
    public void shouldSeeTheMessageThanksForTheMessage(String word) {
        theActorInTheSpotlight().should(seeThat(TheAnswerFrom.is(word)));
    }

    @When("^the user selects the product from the Laptops section$")
    public void theUserSelectsTheProductFromTheLaptopsSection(List<DataList> dataLists) {
        theActorInTheSpotlight().attemptsTo(AddProduct.macbook(dataLists));
    }

    @Then("^should check the (.*) product in the cart$")
    public void shouldCheckTheMacBookProProductInTheCart(String word) {
        theActorInTheSpotlight().should(seeThat(TheAnswerProduct.is(word)));
    }

}
