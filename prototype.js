function Person(name) {
    this.name = name;
}
Person.prototype.getName = function () {
    console.log("Name:", this.name);
};

function Faculty(name, department) {
    Person.call(this, name);
    this.department = department;
}
Faculty.prototype = Object.create(Person.prototype);
Faculty.prototype.getDepartment = function () {
    console.log("Department:", this.department);
};

function Professor(name, department, subject) {
    Faculty.call(this, name, department);
    this.subject = subject;
}
Professor.prototype = Object.create(Faculty.prototype);
Professor.prototype.getSubject = function () {
    console.log("Subject:", this.subject);
};

const p = new Professor("Dr. Sharma", "Engineering", "JavaScript");
p.getName();
p.getDepartment();
p.getSubject();
