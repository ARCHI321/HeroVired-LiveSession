function changeButton() {
  var bgColor = document.getElementById("bgColorInput").value;
  console.log(bgColor);
  var fontColor = document.getElementById("fontColorInput").value;
  console.log(fontColor);
  var fontSize = document.getElementById("fontSizeInput").value;
  console.log(fontSize);
  var fontWeight = document.getElementById("fontWeightInput").value;
  console.log(fontWeight);
  var paddingInput = document.getElementById("paddingInput").value;
  console.log(paddingInput);
  var borderRadiusInput = document.getElementById("borderRadiusInput").value;
  console.log(borderRadiusInput);
  var customButton = document.getElementById("customButton");
  customButton.style.backgroundColor = bgColor;
  customButton.style.color = fontColor;
  customButton.style.fontSize = fontSize + "px";
  customButton.style.fontWeight = fontWeight;
  customButton.style.padding = paddingInput + "px";
  customButton.style.borderRadius = borderRadiusInput + "px";
}
