#Author: Prudhvi Raj Mukiri

@Paints&Textures
Feature: Paints & Textures functional test

  Background: User is already logged into his asianpaints account or just visited the asianpaints website.

  Scenario: Check the Paints & Textures
    Given User should be in asianpaints website
    When User click on Paints & Textures
    Then User should see categories of Paints & Textures and check title

  Scenario Outline: Failure of Enquiry for right assistance for painting needs on providing invalid data
    Given User should be in Paints & Textures section
    When User enters invalid combinations of <name>, <email>, <mobile number> and <pincode> and click on Enquiry now button
    Then User should see invalid data message

    Examples: 
      | name         | email                      | mobile number | pincode  |
      | Prudhvi      | prudhvijoshi7942@gmail.com |        769466 |   523157 |
      | Prudhvi      | joshi@gmail.com            |    7093131808 |   523157 |
      |     23453783 | prudhvijoshi7942@gmail.com |    7093131808 |   523157 |
      | Prudhvi      | prudhvijoshi7942@gmail.com |    7093131808 | 57798468 |
      | 54368Prudhvi | joshi@gmail.com            |    7093131808 |   523157 |
      | Prudhvi      | prudhvijoshi7942@gmail.com |    7093131808 |  4647946 |
      | Prudhvi      | prudhvijoshi7942gmail.com  |       7093108 |   523157 |
      |       578337 | prudhvijogmail.com         |        769466 |      523 |
      | @5365lmhh    | prudhvijoshi7942@gmail.com |        769466 |   523157 |
      | Prudhvi      | 546846gmail.com            |    0000000000 |   523157 |
      |     23453783 | prudhvijoshi7942@gmail.com |    7093131808 |   523157 |
      | Prudhvi      | prudhvijoshi7942@gmail.com |               | 57798468 |
      | 54368Prudhvi |                            |    7093131808 |     2555 |
      | Prudhvi      | prudhvijoshi7942@gmail.com |    7093131808 |  4647946 |
      |              | prudhvijoshi7942gmail.com  |       7093108 |   523157 |
      |              |                            |               |          |

  Scenario: Check the 2200colours feature in Colours & Textures
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on 2200colours under Colours & Textures
    And Select the required colour combinations and apply the filters to filter the required colours shades
    Then User should see different shades of colours that are in 2200colours

  Scenario: Check the Interior Textures feature in Colours & Textures
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Interior Textures under Colours & Textures
    And Select the required colour combinations and apply the filters to filter the required colours shades
    Then User should see different shades of colours that are in Interior Textures

  Scenario: Check the Exterior Textures feature in Colours & Textures
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Exterior Textures under Colours & Textures
    And Select the required colour combinations and apply the filters to filter the required colours shades
    Then User should see different shades of colours that are in Exterior Textures

  Scenario Outline: check the Paint Budget Calculator in Colours & Textures
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Paint Budget Calculator under Colours & Textures
    And Select Type of Poject, select space, size of home and <carpet Area>
    Then User should click on calculate now to see the Recommended Product with details

    Examples: 
      | carpet Area |
      |        1200 |
      |        2400 |

  Scenario: Check the Paint Selector feature in Colours & Textures
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Paint Selector under Colours & Textures
    And Select the required option to filter the required products
    Then User should see different paint products

  Scenario: Check the Wall Paints feature in Interior
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Wall Paints under Interior
    And Select the required colour type and apply the filters to filter the required wall paints
    Then User should see different types of Wall paints that are in Interior

  Scenario: Check the Wall Textures feature in Interior
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Wall Textures under Interior
    And Select the filters to filter the required wall Textures
    Then User should see different types of Wall Textures that are in Interior

  Scenario: Check the Kid's World feature in Interior
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Kid's World under Interior
    And Select the required Theme type and apply the toggle switch for each theme to view the themes in dark and light modes
    Then User should see different types of themes that are in Kid's World

  Scenario: Check the Stencils feature in Interior
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Stencils under Interior
    And Select the required model and filter the required products
    Then User should see different Stencils designs

  Scenario: Check the Wall Paints feature in Exterior
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Wall Paints under Exterior
    And Select the required colour type and apply the filters to filter the required wall paints
    Then User should see different types of Wall paints that are in Exterior

  Scenario: Check the Textured Finishes feature in Exterior
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Textured Finishes under Exterior
    And Select the required type and apply the filters to filter the required Textured Finishes
    Then User should see different types of Textured Finishes that are in Exteriors

  Scenario: Check the Tile guard feature in Exterior
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Tile Guard under Exterior
    Then User should see different uses and pre-painting steps of Tile Gaurd that are in Exteriors

  Scenario: Check the Terrace & Tank feature in Waterproofing
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Terrace & Tank under Waterproofing
    And Select the filter and add required filters for products
    Then User should see different Terrace & Tank products

  Scenario: Check the Bathroom feature in Waterproofing
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Bathroom under Waterproofing
    And Select the filter and add required filters for products
    Then User should see different Bathroom products

  Scenario: Check the Interiors feature in Waterproofing
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Interiors under Waterproofing
    And Select the filter and add required filters for products
    Then User should see different Interiors products

  Scenario: Check the View all feature in Waterproofing
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on View all under Waterproofing
    Then User should see all waterproofing products

  Scenario: Check the Wood Paints feature in Wood & Metal
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Wood Paints under Wood & Metal
    And Select the required design type and apply the filters to filter the required Wood Paints
    Then User should see different types of Wood Paints that are in Wood & Metal

  Scenario: Check the Metal Paints feature in Wood & Metal
    Given User should be in asianpaints website
    When User place the mouse on Paints & Textures and click on Metal Paints under Wood & Metal
    And Select the required design type and apply the filters to filter the required Metal Paints
    Then User should see different types of Metal Paints that are in Wood & Metal
