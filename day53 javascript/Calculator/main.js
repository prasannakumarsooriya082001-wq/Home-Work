import { add,sub,mul } from "./calculator.js";

let addBtn = document.getElementById("addBtn");
let subBtn = document.getElementById("subBtn");
let mulBtn = document.getElementById("mulBtn");

let num1 =  document.getElementById("num1");
let num2 =  document.getElementById("num2");

let result = document.getElementById("result");

addBtn.addEventListener("click", function() {
  result.textContent = add(Number(num1.value), Number(num2.value));
});

subBtn.addEventListener("click", function() {
  result.textContent = sub(Number(num1.value), Number(num2.value));
});

mulBtn.addEventListener("click", function() {
  result.textContent = mul(Number(num1.value), Number(num2.value));
});
