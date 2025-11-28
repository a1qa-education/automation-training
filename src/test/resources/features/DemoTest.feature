Feature: Demo test

  Background:
  Given главная страница открыта

  @ui
  Scenario: Remove button
    When пользователь нажимает на ссылку 'Add/Remove Elements'
    And пользователь нажимает на кнопку Add button
    Then на странице отображена кнопка Remove button

  @ui
  Scenario Outline: Login page
    Given главная страница открыта
    When пользователь нажимает на ссылку 'Form Authentication'
    And пользователь указывает логин "<login>"
    And пользователь указывает пароль "<password>"
    And пользователь нажимает на кнопку Login
    Then сообщение о <status> логине отображается
    Examples:
      | login        | password             | status      |
      | tomsmith     | SuperSecretPassword! | успешном    |
      | tomsmith     | wrongpass            | неуспешном  |
      | unknown      | anypass              | успешном    |