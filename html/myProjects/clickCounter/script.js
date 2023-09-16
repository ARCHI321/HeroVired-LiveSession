var buttonCounter = document.getElementById("button");
console.log(buttonCounter);
localStorage.setItem("click", document.getElementById("value").innerHTML);
console.log(localStorage);

buttonCounter.onclick = function () {
  countClick();
};

function countClick() {
  var count = parseInt(localStorage.getItem("click"));
  console.log(count);
  count = count + 1;
  document.getElementById("value").innerHTML = count;
  localStorage.setItem("click", count);
}
