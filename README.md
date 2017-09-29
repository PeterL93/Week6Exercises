# Week6Exercises
Exercises for week6 - network

Exercise 1+2)
This would serve as an answer both on the first and the second exercise in day 1.
Initially I run the project and the browser uses a get request method on the index.html – Here the browser loads the header: “Hello world” and I get a status code 200(OK) and it stores a cookie on my machine with a certain ID.
I thereafter insert a gif and add a stylesheet, where I styled the header(which I changed as well). After loading it for a couple of times another status code appears – 304: Not modified.
What the server actually is telling me here is that the request would be a successful 200(OK) if it wasn’t because of my cache in the browser. It already had the gif and header stored, so there was no reason to use additional memory on loading it again.

Exercise 3)
-	The first request tries to get the “unsafe” version of the website, but the browsers protocol dictates that it should use the https version of the site. If there is a safer version of the website, it’s customary that it should use that. 

Exercise 4)
- Look in the servlet folder day 1, servlet is named Exercise4
Exercise 5)

-	Get: After the implementations the hidden value is also sent as a parameter and is visible in the browsers address field as well as the first & last name. Which is a security risk. 
-	Post: It tries to post the information from the input fields and is successful. (200)

Exercise 6 + 7 can be found in the servlet day1, named Exercise6 & Exercise7
