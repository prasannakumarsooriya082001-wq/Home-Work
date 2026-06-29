
//  Sum of arrays

let ar = [10,20,30,40,50];

let sum = 0;
for (let i= 0; i < ar.length; i++)
{
    sum+=ar[i];
}

console.log("Sum of Array : "+sum); 
console.log("****************************************");
//Count even and odd num in array

let ar1 = [10,21,30,43,50];

let countOdd = 0;
let countEven = 0;
for (let i= 0; i < ar1.length; i++)
{
    if(ar1[i] % 2 == 0)
    {
        countEven++;
    }
    else
    {
        countOdd++;
    }
}

console.log("Even Count : "+countEven +" , Odd Count : "+countOdd); 
console.log("****************************************");


// Reverse the Array

let ar2 = [10,20,30,40,50];

for (let i= ar2.length-1; i >= 0; i--)
{
    console.log(ar2[i]);
}
console.log("****************************************");
