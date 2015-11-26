# Assignment-1

Problem Description
Create the back-end for Sales Order Application which contains:

Product: The Inventory products that organization sell.
Customer: The buyers of products from organization.
Sales Order: The process of selling product to customer. Each sales order consist of one or more order lines.
Order Lines: The actual products and quantities that a customer need to buy.
The back end will validate the following information with each sales order

Quantities that have been requested are less than or equal current inventory balance.
Total price of sales order is less than or equal (Customer Credit Limit - Customer Current Credit).
If Sales Order is valid, your back end  will reduce Inventory Quantities and increase current credit.

Your back end should also handle delete and update of sales order

There is 15 TODOs in the frontend code , you have to complete all 15 todo in the frontend.

Requirements
All Project(s) you will create will be under maven control. 
You will use web services to implement communication between your backend & our front-end . 
You will use tomcat as your web container. 
You will use hibernate as an ORM implementation. 
You will use MySQL as your database. 
