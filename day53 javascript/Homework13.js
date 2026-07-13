const product = {
    name: "Laptop",
    price: 50000,
    brand: "Dell"
};

// Function to read property
function readProperty(obj, key) {
    const value = Reflect.get(obj, key);
    console.log(`Read -> ${key}: ${value}`);

}

// Function to write property
function writeProperty(obj, key, value) {
    const success = Reflect.set(obj, key, value);

    if (success) {
        console.log(`Write -> ${key}: ${value}`);
    } else {
        console.log(`Failed to write ${key}`);
    }
}

// Reading properties
readProperty(product, "name");
readProperty(product, "price");

// Writing properties
writeProperty(product, "price", 55000);
writeProperty(product, "brand", "HP");

// Reading again
readProperty(product, "price");
readProperty(product, "brand");