$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testconnectdriver.feature");
formatter.feature({
  "line": 2,
  "name": "test connect driver",
  "description": "",
  "id": "test-connect-driver",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@testBing"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "",
  "id": "test-connect-driver;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "navigate to search page by \"\u003clink\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I input \"\u003ctext\u003e\" in search box and click search button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The search results is display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I skip to the second page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Print the title and link of the result",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I scroll to Top and research \"SC\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The search results is display",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I skip to the second page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Print the title and link of the result",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "test-connect-driver;;",
  "rows": [
    {
      "cells": [
        "link",
        "text"
      ],
      "line": 16,
      "id": "test-connect-driver;;;1"
    },
    {
      "cells": [
        "https://www.ianzhang.cn/bing/",
        "Bing"
      ],
      "line": 17,
      "id": "test-connect-driver;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11687499778,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "test-connect-driver;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@testBing"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "navigate to search page by \"https://www.ianzhang.cn/bing/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I input \"Bing\" in search box and click search button",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The search results is display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I skip to the second page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Print the title and link of the result",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I scroll to Top and research \"SC\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The search results is display",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I skip to the second page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Print the title and link of the result",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.ianzhang.cn/bing/",
      "offset": 28
    }
  ],
  "location": "LoginStep.navigate_to_search_page_by(String)"
});
formatter.result({
  "duration": 869626607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bing",
      "offset": 9
    }
  ],
  "location": "LoginStep.i_input_in_search_box_and_click_search_button(String)"
});
formatter.result({
  "duration": 10339679372,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027bLogo\u0027]\"}\n  (Session info: chrome\u003d99.0.4844.74)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027PC-20120728NCPG\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d99.0.4844.17 (395f87df02eedda1d0e06d5ac0614b0eeb22a9e8-refs/branch-heads/4844@{#182}), userDataDir\u003dC:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\scoped_dir6572_805973552}, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dANY, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:52460}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, browserVersion\u003d99.0.4844.74, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 5247b82d3513feb902e43891eecffd12\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027bLogo\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat com.dx.frontend.pageObj.searchPgaeObject.logo(searchPgaeObject.java:27)\r\n\tat com.dx.frontend.pageObj.searchPgaeObject.waitSearchPageIsDisplay(searchPgaeObject.java:58)\r\n\tat com.dx.frontend.Step.LoginStep.i_input_in_search_box_and_click_search_button(LoginStep.java:49)\r\n\tat ✽.When I input \"Bing\" in search box and click search button(testconnectdriver.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStep.the_search_results_is_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_skip_to_the_second_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.print_the_title_and_link_of_the_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SC",
      "offset": 30
    }
  ],
  "location": "LoginStep.i_scroll_to_top_and_research(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.the_search_results_is_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.i_skip_to_the_second_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStep.print_the_title_and_link_of_the_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2169248174,
  "status": "passed"
});
});