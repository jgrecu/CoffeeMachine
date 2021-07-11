# CoffeeMachine
## About
What can be better than a cup of coffee during a break? A coffee that you don’t have to make yourself. It’s enough to press a couple of buttons on the machine and you get a cup of energy; but first, we should teach the machine how to do it. In this project, you will work on programming a coffee machine simulator. The machine works with typical products: coffee, milk, sugar, and plastic cups; if it runs out of something, it shows a notification. You can get three types of coffee: espresso, cappuccino and latte. Since nothing’s for free, it also collects the money.
## Learning outcomes
This project allows you to get a taste of Java. Challenge yourself with loops and conditions, practice working with classes, and get more confident in Java.

<h2>Description</h2>

<p>Let's redesign our program and write a class that represents the coffee machine. The class should have a method that takes a string as input. Every time the user inputs a line (a string) to the console, the program invokes this method with one argument: the line that user input to the console. This system simulates pretty accurately how real-world electronic devices work. External components (like buttons on the coffee machine or tapping on the screen) generate events that pass into the single interface of the program.</p>

<p>The class should not use system input at all; it only should handle input that comes to it via this method and its string argument.</p>

<p>The first problem that comes to mind: how to write that method in a way that it represents all that coffee machine can do? If the user inputs a single number, how can the method determine what that number is: a variant of coffee chosen by the user or the number of the disposable cups that a special worker added into the coffee machine?</p>

<p>The right solution to this problem is to store the current state of the machine. The coffee machine has several states it can be in. For example, the state could be "choosing an action" or "choosing a variant of coffee". Every time the user inputs something and a program passes that line to the method, the program determines how to interpret this line using the information about the current state. After processing this line, the state of the coffee machine can be changed or can stay the same. The most efficient way of handling states is using an enum with all predefined states.</p>

<p>Remember, that:</p>

<ul>
	<li>For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.</li>
	<li>For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.</li>
	<li>And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee. It costs $6.</li>
</ul>

<h2>Instruction</h2>

<p>Refactor the program. Make it so that you can communicate with the coffee machine through a single method.</p>

<h2>Example</h2>

<p>Your coffee machine should have the same initial resources as in the example (400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash).<br>
The symbol <code class="java">&gt;</code> represents the user input. Note that it's not part of the input.</p>

<pre><code class="language-no-highlight">Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
400 ml of water
540 ml of milk
120 g of coffee beans
9 disposable cups
$550 of money

Write action (buy, fill, take, remaining, exit): 
&gt; buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
&gt; 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
50 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
&gt; buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
&gt; 2
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit): 
&gt; fill

Write how many ml of water you want to add: 
&gt; 1000
Write how many ml of milk you want to add: 
&gt; 0
Write how many grams of coffee beans you want to add: 
&gt; 0
Write how many disposable cups of coffee you want to add: 
&gt; 0

Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
1050 ml of water
465 ml of milk
100 g of coffee beans
8 disposable cups
$557 of money

Write action (buy, fill, take, remaining, exit): 
&gt; buy

What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: 
&gt; 2
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$564 of money

Write action (buy, fill, take, remaining, exit): 
&gt; take

I gave you $564

Write action (buy, fill, take, remaining, exit): 
&gt; remaining

The coffee machine has:
700 ml of water
390 ml of milk
80 g of coffee beans
7 disposable cups
$0 of money

Write action (buy, fill, take, remaining, exit): 
&gt; exit</code></pre>
