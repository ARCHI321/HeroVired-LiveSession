let todoList = [
  {
    text: "Learn HTML",
    uniqueNo: 1,
  },
  {
    text: "Learn CSS",
    uniqueNo: 2,
  },
  {
    text: "Learn JavaScript",
    uniqueNo: 3,
  },
];
todoList = getTodoListFromLocalStorage();
var existingvalues = [];

let todoItemsContainer = document.getElementById("todoItemsContainer");
var AddToDoButton = document.getElementById("AddToDoButton");
AddToDoButton.onclick = function () {
  addtoTODO();
};

function addtoTODO() {
  var input = document.getElementById("todoUserInput").value;
  var ToDoCount = todoList.length;
  if (input == "") {
    alert("Enter valid text!");
    return;
  }
  ToDoCount = ToDoCount + 1;
  let NewTodo = {
    text: input,
    uniqueNo: ToDoCount,
  };
  createAndAppendTodo(NewTodo);
  document.getElementById("todoUserInput").value = "";
  todoList.push(NewTodo); //---Add this line to push the todo item into the list
}

function onTodoStatusChange(checkboxId, labelId) {
  let checkboxElement = document.getElementById(checkboxId);
  // console.log(checkboxElement);
  let labelElement = document.getElementById(labelId);
  // if (checkboxElement.checked === true) {
  //   labelElement.classList.add("checked");
  // } else {
  //   labelElement.classList.remove("checked");
  // }
  labelElement.classList.toggle("checked");
}

// function onDeleteTodo(todoId) {
//   let todoElement = document.getElementById(todoId);
//   console.log(todoElement);
//   todoItemsContainer.removeChild(todoElement);
// }
function onDeleteTodo(todoId) {
  let todoElement = document.getElementById(todoId);
  console.log(todoElement);
  todoItemsContainer.removeChild(todoElement);

  let DeletedItem = todoList.findIndex(function (eachItem) {
    let eachTodoId = "todo" + eachItem.uniqueNo;
    if (eachTodoId === todoId) return true;
    else return false;
  });
  console.log(DeletedItem);
  todoList.splice(DeletedItem, 1);
}

function createAndAppendTodo(todo) {
  // console.log(todo.uniqueNo);
  let checkboxId = "checkbox" + todo.uniqueNo;
  let labelId = "label" + todo.uniqueNo;
  let todoId = "todo" + todo.uniqueNo;
  let todoElement = document.createElement("li");
  todoElement.classList.add("todo-item-container");
  todoElement.id = todoId;
  todoItemsContainer.appendChild(todoElement);

  let inputElement = document.createElement("input");
  inputElement.type = "checkbox";
  inputElement.id = checkboxId;
  inputElement.classList.add("checkbox-input");
  inputElement.onclick = function () {
    onTodoStatusChange(checkboxId, labelId);
  };
  todoElement.appendChild(inputElement);

  let labelContainer = document.createElement("div");
  labelContainer.classList.add("label-container");
  todoElement.appendChild(labelContainer);

  let labelElement = document.createElement("label");
  labelElement.setAttribute("for", checkboxId);
  labelElement.id = labelId;
  labelElement.classList.add("checkbox-label");
  var value = todo.text;

  if (!(value in existingvalues)) {
    existingvalues.push(todo.text);
    labelElement.textContent = todo.text;
  }
  labelContainer.appendChild(labelElement);

  let deleteIconContainer = document.createElement("div");
  deleteIconContainer.classList.add("delete-icon-container");

  labelContainer.appendChild(deleteIconContainer);

  let deleteIcon = document.createElement("i");
  deleteIcon.classList.add("far", "fa-trash-alt", "delete-icon");
  deleteIcon.onclick = function () {
    onDeleteTodo(todoId);
  };
  deleteIconContainer.appendChild(deleteIcon);
}

for (let todo of todoList) {
  createAndAppendTodo(todo);
}

let saveTodoButton = document.getElementById("saveTodoButton");

saveTodoButton.onclick = function () {
  localStorage.setItem("todoList", JSON.stringify(todoList));
};

function getTodoListFromLocalStorage() {
  let stringifiedTodoList = localStorage.getItem("todoList"); //--get the item from the local storage which is String type
  let parsedTodoList = JSON.parse(stringifiedTodoList); //--parse the string to convert it back to a JS Object

  //-- Add this below code to check if its a null value
  if (parsedTodoList === null) {
    return [];
  } else {
    return parsedTodoList;
  }
}
