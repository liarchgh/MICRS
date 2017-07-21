/**
 * Created by new on 2017/7/20.
 */
function checkLogin(){
    var res = checkUsername();
    return res;
}
function checkResign(){
    var res = checkPassword1();
    res = checkPassword2() && res;
    res = checkUsername() && res;
    return res;
}
function checkPassword1(){
    var pass1 = document.getElementById("pass1").value;
    var passS = document.getElementById("pass1S");
    var sta = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,20}$/;
    if(pass1.length < 8){
        passS.innerHTML = "密码过短！";
        passS.style = "color:red;font-size:100%;";
        return false;
    }
    else if(pass1.length > 20){
        passS.innerHTML = "密码过长！";
        passS.style = "color:red;font-size:100%;";
        return false;
    }
    else if(sta.test(pass1) == false){
        passS.innerHTML = "密码格式错误！请重新输入。";
        passS.style = "color:red;font-size:100%;";
        return false;
    }
    else{
        passS.innerHTML = "√";
        passS.style = "color:green;font-size:150%;font-weight:bold;";
        return true;
    }
}
function checkPassword2(){
    var pass1 = document.getElementById("pass1").value;
    var pass2 = document.getElementById("pass2").value;
    var passS = document.getElementById("pass2S");
    if(pass1 != pass2){
        passS.innerHTML = "两次输入的密码不一致，请检查！";
        passS.style = "color:red;font-size:100%;";
        return false;
    }
    else{
        passS.innerHTML = "√";
        passS.style = "color:green;font-size:150%;font-weight:bold;";
        return true;
    }
}
function checkUsername(){
    var uname = document.getElementById("username").value;
    var sta = /^(?![a-zA-Z]+$)[0-9A-Za-z]{5,20}$/;
    var uns = document.getElementById("usernameS");
    if(uname.length < 5){
        uns.innerHTML = "用户名长度太短！";
        uns.style = "color:red";
        return false;
    }
    if(uname.length > 20){
        uns.innerHTML = "用户名长度太长！";
        uns.style = "color:red;";
        return false;
    }
    if (!sta.test(uname)) {
        uns.innerHTML = "用户名格式错误！请检查。";
        uns.style = "color:red;";
        return false;
    }
    uns.innerHTML = "√";
    uns.style = "color:green";
    return true;
}
function restrictUsername(){
    var uname = document.getElementById("username");
    uname.value = uname.value.replace(/[^\w\.\/]/ig,'');
}