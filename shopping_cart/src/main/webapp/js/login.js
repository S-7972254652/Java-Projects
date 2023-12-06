window.onload = login;



var email,pass,box,reg,searchBox,req,em,pas;
function login(){
    alert("welcome tologin")
    email = document.getElementById("email");    
    pass = document.getElementById("password");
    
    reg = document.getElementById("btn");

    em = email.value;
    pas = pass.value;
    reg.onclick = sendLoginRequest;
}

function sendLoginRequest(){
    console.log("eclisked");
    
    req = new XMLHttpRequest();
    req.open('post','login.do?email='+em+'&pass='+pas,true);
    req.onreadystatechange = giveConfirmation;
    req.send(null);
}

function giveConfirmation(){
//    if(req.status==200&&req.readyState==4){
//         var res = eval(req.responseText);
//         // alert(res[0].data);
//         var len = (res[0].data).length;
//         var check = res[0].data;
//         if(check.charAt(len-1)=='1'){
//             window.location = "user_dashboard.jsp";
//         }
//    }
}

// function openLoginBox(){
//     var bx = document.getElementById("login_box");

//     searchBox.style.display = "none";
//     register.style.display="none";
//     bx.style.display="block";
// }