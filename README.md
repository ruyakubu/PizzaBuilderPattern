# PizzaBuilderPattern
Quick demo to show how Builder Design Pattern works


#Importance of Builder class
Buider design pattern is used when you have a class object with a lot of attributes and you need to create different multiple constructors w/ different 
parament combinations to build the object.  It's hard to keep with which constructor to user with with all you can see is the required datatype with you are
trying to instantiate a class.

Also, when designing a builder object, you specify which fields in the object are required and which are mandatory

#PIZZA Example
Which building a Pizza, the ingredients for the crust are REQUIRED (e.g. flour, butter, eggs, milk, baking powder).  However, ingredients for the topping are optional based on the user's/customers taste (e.g. pineapple, pepperoni, mushroom etc)
