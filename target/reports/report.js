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
  "line": 9,
  "name": "See coupon code",
  "description": "",
  "id": "receive-discount-coupon;see-coupon-code",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@coupon"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "that Im on qazando website",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I fill email field",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on ganhar cupom button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I see the discount code",
  "keyword": "Then "
});
formatter.match({
  "location": "DiscountStep.thatImOnQazandoWebsite()"
});
formatter.result({
  "duration": 2302751400,
  "status": "passed"
});
formatter.match({
  "location": "DiscountStep.iFillEmailField()"
});
formatter.result({
  "duration": 2100941300,
  "status": "passed"
});
formatter.match({
  "location": "DiscountStep.clickOnGanharCupomButton()"
});
formatter.result({
  "duration": 63832000,
  "status": "passed"
});
formatter.match({
  "location": "DiscountStep.iSeeTheDiscountCode()"
});
formatter.result({
  "duration": 43927600,
  "status": "passed"
});
});