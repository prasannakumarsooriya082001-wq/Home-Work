/**
 * Represents a person.
 * @class
 */
class Person {

    /**
     * Create a Person.
     * @param {string} name - The person's name.
     * @param {number} age - The person's age.
     */
    constructor(name, age) {

        /**
         * The person's name.
         * @type {string}
         */
        this.name = name;

        /**
         * The person's age.
         * @type {number}
         */
        this.age = age;
    }

    /**
     * Displays a greeting message.
     * @returns {void}
     */
    greet() {
        console.log(`Hello, my name is ${this.name} and I am ${this.age} years old`);
    }
}

// Create object
const person1 = new Person("Prasanna", 24);

// Call method
person1.greet();