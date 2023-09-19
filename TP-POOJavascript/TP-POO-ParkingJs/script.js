import { Parking } from "./Parking.js";

const btnGetTicket = document.getElementById("btnGetTicket")
const btnPay = document.getElementById("button-addon2")
let parking = new Parking()


console.log(parking)


btnGetTicket.addEventListener("click", (e) => {
    parking.inTab(document.getElementById("inpt").value)
    console.log(parking);
})


btnPay.addEventListener("click", (e) => {
    parking.pay(document.getElementById("inpt").value)
})






