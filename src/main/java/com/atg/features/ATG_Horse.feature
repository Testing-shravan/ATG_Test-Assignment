Feature: Create new coupons and verify mark horses in ATG

  @race
  Scenario Outline: Create new coupons and verify mark horses only for V4
    Given the user launch browser and navigates to url ATG.se
    Then user is on ATG - Spel på Sport, Häst och Casino home page
    And the user select <GameType>
    And the user create New Coupon
    Then the user mark Horses for game type <GameType> and verify race menu

    Examples: 
      | GameType |
      | V4       |

  Scenario Outline: Create new coupons and verify mark horses for multiple <GameType>
    Given the user launch browser and navigates to url ATG.se
    Then user is on ATG - Spel på Sport, Häst och Casino home page
    And the user select <GameType>
    And the user create New Coupon
    Then the user mark Horses for game type <GameType> and verify race menu

    Examples: 
      | GameType |
      | V3       |
      | V5       |
      | V65      |
      | DD       |
