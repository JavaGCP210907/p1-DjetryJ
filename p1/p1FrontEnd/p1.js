const url = "http://localhost:8090/"

document.body.style.backgroundColor= "pink";

document.getElementById("loginButton").addEventListener("click", loginFunc)
document.getElementById("loginButton").style.backgroundColor= "brown"
document.getElementById("urButton").style.backgroundColor= "black"
document.getElementById("mButton").style.backgroundColor= "black"
document.getElementById("addReimb").style.backgroundColor = "black"

//Login functionality

async function loginFunc(){

    let usern = document.getElementById("username").value
    let userp = document.getElementById("password").value 

    let user = {
        username:usern,
        password:userp
    }

    console.log(user)

    let response = await fetch(url + "login", {
        method: "POST",
        body: JSON.stringify(user),
        credentials: "include"
    })

    console.log(response.status)

    let ub = document.getElementById("User")

    if(response.status === 200){
        document.getElementById("login-row").innerText="Welcome!"
        ub.setAttribute("style", "block")
    }else{
        document.getElementById("login-row").innerText="Login Failed!! the oracle has lied to us!!"
        ub.setAttribute("style", "none")
    }
}



/*if(loginFunc === 200){
    ub.setAttribute("style", "block")
}else{
    ub.setAttribute("style","none")
}*/



//User functionality 
document.getElementById("urButton").addEventListener("click", userFunc)
document.getElementById("mButton").addEventListener("click", userFunc)

async function userFunc(){

  

    let response = await fetch(url + "UserRoles", {
        method: "GET",
        credentials: "include"
    })

    console.log(response.status)

    let rTable = document.getElementById("table-row")

    if(response.status === 200){
        document.getElementById("urButton").innerText = "Welcome Employee"
        document.getElementById("mButton").innerText = "Welcome Manager"
        rTable.setAttribute("style", "block")

        
    }else{
        console.log("This has failed")
        
    }

 
}


async function reimbFunc(){

    let response = await fetch(url + "Reimbursement", {credentials: "include"})

    console.log(response)

     if(response.status === 200){

        let data = await response.json()

        for(let reimbursement of data){

            let row = document.createElement("tr")

            let cell = document.createElement("td")
            cell.innerHTML = reimbursement.reimb_ID
            row.appendChild(cell)

            let cell2 = document.createElement("td")
            cell.innerHTML = reimbursement.reimb_amount
            row.appendChild(cell2)

            let cell3 = document.createElement("td")
            cell.innerHTML = reimbursement.reimb_submitted
            row.appendChild(cell3)

            let cell4 = document.createElement("td")
            cell.innerHTML = reimbursement.reimb_resolved
            row.appendChild(cell4)

            let cell5 = document.createElement("td")
            cell.innerHTML = reimbursement.reimb_description
            row.appendChild(cell5)

            let cell6 = document.createElement("td")
            cell.innerHTML = reimbursement.reimb_receipt
            row.appendChild(cell6)

            let cell7 = document.createElement("td")
            cell.innerHTML = reimbursement.reimb_author
            row.appendChild(cell7)

            let cell8 = document.createElement("td")
            cell.innerHTML = reimbursement.reimb_resolver
            row.appendChild(cell8)

            document.getElementById("reimb-body").appendChild(row)
        }
    }

       
    }

    document.getElementById.addEventListener("click", addReimb)


async function addReimb(){
    let add_amount = document.getElementById("add_amount").value
    let add_sub = document.getElementById("add_submitted").value
    let add_desc = document.getElementById("add_description").value

    let newReimb = {
        amount: add_amount,
        submitted: add_sub,
        description: add_desc
    }

    console.log(newReimb)

    let response = await fetch(url + "addReimbursement", {
        method: "POST",
        body: JSON.stringify(user),
        credentials: "include"
    })

    console.log(response.status)

 
        }
    






