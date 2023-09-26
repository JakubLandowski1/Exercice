class Person {
    private static _count: number=0;
    private _id: number;
    private _firstname: string;
    private _lastname: string;
    private _dateOfBirth: Date;
    private _email: string;
    private _phoneNumber: number;

    constructor(firstname: string, lastname: string, dateOfBirth: Date, email: string, phoneNumber: number) {
        this._id = ++Person._count;
        this._firstname= firstname;
        this._lastname= lastname;
        this._dateOfBirth= dateOfBirth;
        this._email=email;
        this._phoneNumber=phoneNumber;
    }

    get id() : number {
        return this._id;
    }

    get firstname() : string {
        return this._firstname;
    }

    get lastname() : string {
        return this._lastname;
    }

    get dateOfBirth(): Date {
        return this._dateOfBirth;
    }

    get email() : string {
        return this._email;
    }

    get phoneNumber(): number {
        return this._phoneNumber;
    }

    set firstname(value: string ) {
        this._firstname= value;
    }

    set lastname(value: string) {
        this._lastname= value;
    }
     
    set dateOfBirth(value: Date) {
        this._dateOfBirth= value;
    }
    
    set email(value: string){
        this._email=value
    }

    set phoneNumber(value: number) {
        this._phoneNumber= value
    }

    get fullname() {
        return this._firstname + " " +this._lastname
    }
}

export {Person}