let amount =document.getElementById("amount")
let from =document.getElementById("from")
let to = document.getElementById("to")

function getrs(){
    let s = 0
    let  chuyen =  parseInt(from.value)
    let  den = parseInt(to.value)

    if( chuyen == 1 && den == 2 ){
        s =  (parseInt(amount.value)) / 23000
        s = s + "USD"
    }
    else if ( chuyen ==2 && den ==1 ){
        s =   (parseInt(amount.value)) * 23000
        s = s + "VND"
    }

    else if  (chuyen ==2 && den ==2 )
        s =  (parseInt(amount.value)) + " USD"
    else if  (chuyen ==1 && den ==1 )
        s =  (parseInt(amount.value)) + " VND"

    document.getElementById("rs").innerText = s;

}