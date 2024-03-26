<h1>Elon's Toy Car</h1>

<p>In this exercise you'll be playing around with a remote controlled car, which you've finally saved enough money for to buy.
  
Cars start with full (100%) batteries. Each time you drive the car using the remote control, it covers 20 meters and drains one percent of the battery.

The remote controlled car has a fancy LED display that shows two bits of information:
- The total distance it has driven, displayed as: "Driven <METERS> meters".
- The remaining battery charge, displayed as: "Battery at <PERCENTAGE>%".

If the battery is at 0%, you can't drive the car anymore and the battery display will show "Battery empty".

You have six tasks, each of which will work with remote controlled car instances.</p>

<h3>1. Buy a brand-new remote controlled car</h3>
<p>Implement the (static) ElonsToyCar.buy() method to return a brand-new remote controlled car instance:</p>

> <p>ElonsToyCar car = ElonsToyCar.buy();</p>

<h3>2. Display the distance driven</h3>
<p>Implement the ElonsToyCar.distanceDisplay() method to return the distance as displayed on the LED display:</p>

> <p>ElonsToyCar car = ElonsToyCar.buy();<br>car.distanceDisplay();<br>// => "Driven 0 meters"</p>

<h3>3. Display the battery percentage</h3>
<p>Implement the ElonsToyCar.batteryDisplay() method to return the battery percentage as displayed on the LED display:</p>

> <p>ElonsToyCar car = ElonsToyCar.buy();<br>car.batteryDisplay();<br>// => "Battery at 100%"</p>

<h3>4. Update the number of meters driven when driving</h3>
<p>Implement the ElonsToyCar.drive() method that updates the number of meters driven:</p>

> <p>ElonsToyCar car = ElonsToyCar.buy();<br>car.drive();<br>car.drive();<br>car.distanceDisplay();<br>// => "Driven 40 meters"</p>

<h3>5. Update the battery percentage when driving</h3>
<p>Update the ElonsToyCar.drive() method to update the battery percentage:</p>

> <p>ElonsToyCar car = ElonsToyCar.buy();<br>car.drive();<br>car.drive();<br>car.batteryDisplay();<br>// => "Battery at 98%"</p>

<h3>6. Prevent driving when the battery is drained</h3>
<p>Update the ElonsToyCar.drive() method to not increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%):</p>

> <p>ElonsToyCar car = ElonsToyCar.buy();<br><br>// Drain the battery<br>// ...<br><br>car.distanceDisplay();<br>// => "Driven 2000 meters"<br><br>car.batteryDisplay();<br>// => "Battery empty"</p>
