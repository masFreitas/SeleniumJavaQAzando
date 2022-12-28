$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("discount.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 3,
  "name": "Receive discount coupon",
  "description": "Me as a user from qazando\r\nI want to receive a discount coupon\r\nTo buy a course with reduced price",
  "id": "receive-discount-coupon",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "See coupon code",
  "description": "",
  "id": "receive-discount-coupon;see-coupon-code",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "that Im on qazando website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I fill email field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on ganhar cupom button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see the discount code",
  "keyword": "Then "
});
formatter.match({
  "location": "DiscountStep.thatImOnQazandoWebsite()"
});
formatter.result({
  "duration": 2126669100,
  "status": "passed"
});
formatter.match({
  "location": "DiscountStep.iFillEmailField()"
});
formatter.result({
  "duration": 2113503600,
  "status": "passed"
});
formatter.match({
  "location": "DiscountStep.clickOnGanharCupomButton()"
});
formatter.result({
  "duration": 57127200,
  "status": "passed"
});
formatter.match({
  "location": "DiscountStep.iSeeTheDiscountCode()"
});
formatter.result({
  "duration": 67528500,
  "status": "passed"
});
});