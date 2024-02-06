Feature: This feature file contains @setup examples

  Scenario: Setup example 1
    * def json = karate.setup()
    * print json


  @setup
  Scenario: Setup data
  * def jsonbody = 
    """
    {
    employee
    {
  "name": "Amod",
  "gender": "Male"
}
}
    """
