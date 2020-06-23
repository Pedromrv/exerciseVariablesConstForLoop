//  FASE 1
console.log("Hello World");

const name = "Pedro",
    surname1 = "Rodríguez",
    surname2 = "Valverde";

var day = 12,
    month = 07,
    year = 1986;

const DayOfBirth = day.toString(), BirthMonth = month.toString(); BirthYear = year.toString();

const AllNameOne = surname1 + " " + surname2 + ", " + name;
const AllDateOfBirth = DayOfBirth + "/" + BirthMonth + "/" + BirthYear;

console.log(AllNameOne);
console.log(AllDateOfBirth);

// FASE 2

const LeapYear = 1948;
var myYear = 1986;
var leapYear
sList;
var quantityYearsBetween = 0;

for(let i = leapYear; i < MyYear; i++){
    if(i % 4 == 0 && i % 100 != 0){
        leapYearsList = i;
        console.log("- " + leapYearsList);
        QuantityYearsBetween++;
    }
}

console.log(QuantityYearsBetween + " leap years from 1948 to my birth year.");

//  FASE 3

var VerificationYear,
    ResultTrueString,
    ResultFalseString;

for(let i = leapYearsList; i < 1986; i++){
    if(i == MyYear){
        VerificationYear = true;
        console.log(ResultTrueString = VerificationYear + " it's a leap year.");
    } else if(i != MyYear) {
        VerificationYear = false;
        console.log(ResultFalseString = VerificationYear + " it's not a leap year.");
    } else {
        console.log("Syntax error");
    }
}
