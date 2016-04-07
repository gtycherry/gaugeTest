Amazon user registration functions
==================================

Created by tyguo on 12/28/15

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
* User navigate to Amazon home page
* User clicks login link on home page
* He login with his credentials


Search product and add to shopping cart
---------------------------------------

* User search "nuk 奶瓶" on home page
* User add the first product to his shopping cart

Register several accounts
------------------------

* User register bundles of accounts with below the information in below table
  |name    |emailOrPhone      |emailOrPhoneConfirmation|password   |passwordConfirmation|
  |--------|----------------- |------------------------|-----------|--------------------|
  |Faya101 |Faya101@yahoo.com |Faya101@yahoo.com       |123456     |123456              |
  |Faya102 |Faya102@yahoo.com |Faya102@yahoo.com       |123456     |123456              |
  |Faya103 |Faya103@yahoo.com |Faya103@yahoo.com       |123456     |123456              |
  |Faya104 |Faya104@yahoo.com |Faya104@yahoo.com       |123456     |123456              |


##User can register an amazon account successfully
tags: register

* User clicks register link on home page
* He input the information required and click register button
* He should be registered successfully and automatically logged in