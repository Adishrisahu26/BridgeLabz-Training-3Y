const user = {
    name: "Riya",
    showName: () => {
        console.log(this.name);
    }
};

user.showName(); // ❌ undefined because arrow functions do NOT have their own `this`

// Fix using normal function
const user2 = {
    name: "Riya",
    showName() {
        console.log(this.name);
    }
};

user2.showName(); // ✔ Works correctly
