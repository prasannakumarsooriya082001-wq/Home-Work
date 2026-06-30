/*


1.Add Two Numbers
Use an arrow function to add two numbers
Pass the result to a callback function to display the sum
2.Check Even or Odd
Use an anonymous function to check whether a given number is even
or odd
3.Multiply Two Numbers and Check Result
Use an arrow function to multiply two numbers
Use a callback function (anonymous) to check whether the result is
greater than 100 or not
4.Exit 

const readline = require('readline');

const r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function menu() {
    console.log("===== MENU =====");
    console.log("1. Add Two Numbers");
    console.log("2. Check Even or Odd");
    console.log("3. Multiply Two Numbers and Check Result");
    console.log("4. Exit");

    r1.question("Enter your choice : ", function (choice) {
        choice = Number(choice);

        switch (choice) {
            case 1:
                {
                    r1.question("Enter First Number : ", function (a) {
                        r1.question("Enter Second Number : ", function (b) {
                            let add = (a, b) => {
                                return (a + b);
                            };


                            function sum(res) {
                                console.log("Sum is : " + res);
                                menu();
                            };

                            sum(add(Number(a), Number(b)));
                        });
                    });
                    break;

                }
            case 2:
                {
                    r1.question("Enter a Number : ", function (num) {
                        let check = function (num) {
                            if (num % 2 == 0) {
                                console.log(num + " : is a Even Number");
                                menu();
                            }
                            else {
                                console.log(num + " : is a Odd Number");
                                menu();
                            }
                        };

                        check(Number(num));
                    });
                    break;
                }
            case 3:
                {
                    r1.question("Enter First Number : ", function (a) {
                        r1.question("Enter Second Number : ", function (b) {
                            let mul = (a, b) => {
                                return (a * b);
                            }

                            function multi(res) {
                                if (res >= 100) {
                                    console.log("Given Number is greater than and equal to 100");
                                    menu();
                                }
                                else {
                                    console.log("Given Number is lesser than  100");
                                    menu();
                                }
                            }

                            multi(mul(Number(a),Number(b)));
                        });
                    });
                    break;
                }
            case 4:
                {
                    console.log("Exiting...");
                    r1.close();
                    break;
                }
            default:
                {
                    console.log("Invalid Choice!");
                    menu();
                }
        }
    });
}

menu();

*/




//1.Write a JavaScript program using a basic function and setInterval to print “Hello World” every 2 seconds.

function name()
{
    console.log("Hello Wold");
};

setInterval(name,2000);


//2.Write a JavaScript program using a function and setInterval to display numbers from 1 to 10, one number every 1 second.

function number()
{
    let i = 1;
    let id = setInterval(function(){
        console.log(i);
        i++;
        if(i>10)
        {
            clearInterval(id);
        }
    },1000);
}

number();


//3.Write a JavaScript program using a function and setInterval to display the current time every second.

function printTime()
{
    let time = new Date();
    
    console.log(time.toLocaleTimeString());
}

setInterval(printTime,2000);


//4.Write a JavaScript program using a function and setInterval to display even numbers continuously with a delay of 2 seconds.

let num = 2;
function evenNumber()
{
    console.log(num);
    num+=2;
}

setInterval(evenNumber,2000);


//5.Write a JavaScript program using a function and setInterval to simulate a countdown timer from 10 to 0.


function countDown()
{
    let i = 10;

    let id = setInterval(function(){
        console.log(i);
        i--;
        
        if(i < 0)
        {
            clearInterval(id);
        }

    },1000);
}

countDown();









