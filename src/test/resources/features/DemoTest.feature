Feature: Demo test

  Background:
  Given главная страница открыта

  @ui
  @allure.label.epic:Buttons
  @allure.label.feature:Remove
  @allure.label.story:Valid_remove_button
  Scenario: Remove button
    When пользователь нажимает на ссылку 'Add/Remove Elements'
      And пользователь нажимает на кнопку Add button
    Then на странице отображена кнопка Remove button

  @ui
  @allure.label.epic:Login
  @allure.label.feature:Authentication
  @allure.label.story:Valid_user_login
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

  @ui
  @allure.label.epic:Login
  @allure.label.feature:Authentication
  @allure.label.story:Valid_user_login
  Scenario: Login page negative check
    Given главная страница открыта
    When пользователь нажимает на ссылку 'Form Authentication'
      And пользователь вводит учетные данные
      | login    | password            |
      | tomsmith | SuperSecretPassword!|
    And пользователь нажимает на кнопку Login
    Then сообщение о успешном логине отображается