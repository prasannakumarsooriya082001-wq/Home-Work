function calculateGrade(marks) 
{
    if(marks >= 90 && marks <= 100)
    {
        return 'A+';
    }
    else if(marks >= 75 && marks < 90)
    {
        return 'A';
    }
    else if(marks >= 60 && marks < 75)
    {
        return 'B';
    }
    else if(marks >= 50 && marks < 60)
    {
        return 'C';
    }
    else if(marks < 50)
    {
        return 'Fail';
    }
    else
    {
        return 'Invalid Marks';
    }
}

const readline = require('readline');

const r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
}); 

r1.question("Enter your mark : ", function (marks) {
    let grade = calculateGrade(Number(marks));
    console.log("Your Grade is : " + grade);
    r1.close();
});