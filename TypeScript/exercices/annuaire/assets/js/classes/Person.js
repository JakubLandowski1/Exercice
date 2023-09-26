class Person {
    constructor(firstname, lastname, dateOfBirth, email, phoneNumber) {
        this._id = ++Person._count;
        this._firstname = firstname;
        this._lastname = lastname;
        this._dateOfBirth = dateOfBirth;
        this._email = email;
        this._phoneNumber = phoneNumber;
    }
    get id() {
        return this._id;
    }
    get firstname() {
        return this._firstname;
    }
    get lastname() {
        return this._lastname;
    }
    get dateOfBirth() {
        return this._dateOfBirth;
    }
    get email() {
        return this._email;
    }
    get phoneNumber() {
        return this._phoneNumber;
    }
    set firstname(value) {
        this._firstname = value;
    }
    set lastname(value) {
        this._lastname = value;
    }
    set dateOfBirth(value) {
        this._dateOfBirth = value;
    }
    set email(value) {
        this._email = value;
    }
    set phoneNumber(value) {
        this._phoneNumber = value;
    }
    get fullname() {
        return this._firstname + " " + this._lastname;
    }
}
Person._count = 0;
export { Person };
