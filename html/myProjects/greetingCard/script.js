let greeting =
  '{"greetText":"A very happy Diwali to you and your family! May the millions of lamps of Diwali illuminate your life with happiness, joy, peace and health","from":"Rohit","to":"Arjun"}';

var parsedGreeting = JSON.parse(greeting);

var fromText = document.getElementById("fromText");
var toText = document.getElementById("toText");
var greetingText = document.getElementById("greeting");

fromText.textContent = "From: " + parsedGreeting.from;
toText.textContent = "To: " + parsedGreeting.to;
greetingText.textContent = parsedGreeting.greetText;
