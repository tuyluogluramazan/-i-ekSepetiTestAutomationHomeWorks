Feature: Morhipo Test Cases

  Scenario:Morhipo Login Account
    Given I open chrome and launch website
    When  I click login button
    And   I enter "tuyluoglu.ramazan@gmail.com" and "Ramazan123."
    Then  I should see "Siparişlerim"

  Scenario Outline: Morhipo Search Product
    Given I open chrome and launch website
    When I click searchbox
    And I enter <product> and search
    Then I should see <data> on the page

    Examples:
      | product    | data                 |
      | "Ayakkabı" | "Ayakkabi Modelleri" |
      | "Çanta"    | "canta Modelleri"    |
      | "Saat"     | "saat Modelleri"     |


  Scenario Outline: Morhipo Add to Favorite
    Given I open chrome and launch website
    When I click login button
    And I enter <userName> and <password>
    And I click searchbox
    And I enter <product> and search
    And I add products my favorites
    And I go to my favorites page
    Then I see product on  my favorites page
    Examples:
      | userName                      | password      | product    |
      | "tuyluoglu.ramazan@gmail.com" | "Ramazan123." | "Ayakkabı" |
      | "tuyluoglu.ramazan@gmail.com" | "Ramazan123." | "Çanta"    |
      | "tuyluoglu.ramazan@gmail.com" | "Ramazan123." | "Saat"     |