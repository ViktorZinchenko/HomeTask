# language: en

@all
Feature: Testing adding of AD's to favorites

#  @single
#  Scenario: Add a single AD
#
#    Given open homepage
#    When open "Техника" category
#    And open "Смарт часы" subcategory
#    And select 1 ad from the list
#    Then favorites counter shows 0 added products
#    When scroll to add to favorites button
#    Then add to favorites button have a name "Добавить в избранное"
#    When click on add to favorites button
#    Then add to favorites button have a name "Удалить из избранного"
#    When scroll to favorites counter
#    Then favorites counter shows 1 added products
#    When click on favorites button
#    Then in favorites 1 ads
#
#  @multiple
#  Scenario: Add multiple AD's
#
#    Given open homepage
#    When open "Техника" category
#    And open "Автоаудио" subcategory
#    And select 1 ad from the list
#    And scroll to add to favorites button
#    And click on add to favorites button
#    And go back to the previous page
#    And select 2 ad from the list
#    And scroll to add to favorites button
#    And click on add to favorites button
#    When scroll to favorites counter
#    Then favorites counter shows 2 added products
#    When click on favorites button
#    Then favorites counter shows 2 added products
#
#  @AddAdThroughSearch
#  Scenario: Add an AD through search
#
#    Given open homepage
#    When enter "Bmw" in the search
#    And select 1 ad from the list
#    Then favorites counter shows 0 added products
#    When scroll to add to favorites button
#    And click on add to favorites button
#    And scroll to favorites counter
#    Then favorites counter shows 1 added products
#    When click on favorites button
#    Then in favorites 1 ads

  @delete
  Scenario: Delete an AD

    Given open homepage
    When open "Техника" category
    And open "Телевизоры цветные" subcategory
    And select 1 ad from the list
    And scroll to add to favorites button
    And click on add to favorites button
    And scroll to favorites counter
    And click on favorites button
    Then in favorites 1 ads
    When click on the clear button
    Then in favorites 0 ads
