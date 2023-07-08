let firstNumberElement = document.getElementById("firstNumber");
let secondNumberElement = document.getElementById("secondNumber");
let userInputElement = document.getElementById("userInput");
let gameResultElement = document.getElementById("gameResult");

let gameResultCongoMsg = "Congratulations! You got it right.";
let gameResutTryMsg = "Please Try Again!";

function randomGenerate() {
  let firstRandomNumber = Math.random() * 100;
  firstRandomNumber = Math.ceil(firstRandomNumber);
  firstNumberElement.textContent = firstRandomNumber;

  let secondRandomNumber = Math.random() * 100;
  secondRandomNumber = Math.ceil(secondRandomNumber);
  secondNumberElement.textContent = secondRandomNumber;
}

randomGenerate();

function checkAddition() {
  let firstNumber = parseInt(firstNumberElement.textContent);
  let secondNumber = parseInt(secondNumberElement.textContent);
  let userInputValue = userInputElement.value;

  let total = firstNumber + secondNumber;
  if (userInputValue == "") {
    gameResultElement.textContent = gameResutTryMsg;
    gameResultElement.style.backgroundColor = "#1e217c";
  } else if (userInputValue == total) {
    gameResultElement.textContent = gameResultCongoMsg;
    gameResultElement.style.backgroundColor = "#028a0f";
  } else {
    gameResultElement.textContent = gameResutTryMsg;
    gameResultElement.style.backgroundColor = "#1e217c";
  }
}

function restartGame() {
  randomGenerate();
  userInputElement.value = "";
  gameResultElement.textContent = "";
  gameResultElement.style.backgroundColor = "ffffff";
}
