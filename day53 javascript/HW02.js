let userName = {
    firstName:"Prasanna",
    lastName:"Kumar",
    email:"prasanna@gmail.com"
}

let fullName =( userName.firstName + " " + userName.lastName).toUpperCase();

let domain = userName.email.split("@")[1];

console.log(
`Full Name: ${fullName} 
Email Domain: ${domain}`);

console.log("***********************************************");

let sentence = "Now we are learing about Java Script";

let obj = {
    totalCharcters : sentence.length,
    totalWords : sentence.split(" ").length,
    lowerCase : sentence.toLowerCase()
};

for(let key in obj){
    console.log(`${key} : ${obj[key]}`);
}

console.log("***********************************************");


let fullName = "Prasanna";
let phoneNo = "9876543210";

let userName = (fullName.slice(0, 3) + phoneNo.slice(-2)).toLowerCase();

console.log(`User Name: ${userName}`);