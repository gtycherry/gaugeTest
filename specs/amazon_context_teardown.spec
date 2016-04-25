This scenario is to show context and tear down in gauge
=====================
Tags: demo

Created by tyguo on 4/21/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

* User navigate to Amazon home page
* User clicks login link on home page
* He login with his credentials

User can add product to his shopping cart
---------------------------------------------------
Tags: add product

* Search "iPhone 6s" and add it to shopping card

User can edit amount of product in shopping cart
--------------------------------------------------
Tags: edit shopping cart

* Search "iPhone 6s" and add it to shopping card
* User edit the amount of product to 3
* delete product "iPhone 6s" from shopping cart
_________________________
these are the teardown steps after each scenario
* User logout amazon



