<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background-color: black;
}
form {
  background-color: #444444;
  border-radius: 10px;
  padding: 20px;
  width: 300px;
  margin: 50px auto;
}

.lb {
  display: block;
  margin-bottom: 10px;
  font-size: 18px;
  font-weight: bold;
}

.infos[type="text"], input[type="email"], input[type="date"], input[type="password"] {
  width: 90%;
  padding: 10px;
  font-size: 16px;
  border-radius: 5px;
  border: none;
  margin-bottom: 20px;
  background-color: #333333;
  color: white;
}

input[type=password]{
margin-bottom: 20px;
background-color: #333333;
}
#send {
  --glow-color: rgb(176, 255, 189);
  --glow-spread-color: rgba(123, 255, 160, 0.781);
  --enhanced-glow-color: rgb(182, 175, 71);
  --btn-color: rgba(13, 241, 21, 0.508);
  border: .25em solid var(--glow-color);
  padding: 1em 2em;
  color: var(--glow-color);
  font-size: 14px;
  font-weight: bold;
  background-color: var(--btn-color);
  border-radius: 1em;
  outline: none;
  box-shadow: 0 0 1em .25em var(--glow-color),
        0 0 4em 1em var(--glow-spread-color),
        inset 0 0 .05em .25em var(--glow-color);
  text-shadow: 0 0 .5em var(--glow-color);
  position: relative;
  transition: all 0.3s;
}

#send::after {
  pointer-events: none;
  content: "";
  position: absolute;
  top: 120%;
  left: 0;
  height: 100%;
  width: 100%;
  background-color: var(--glow-spread-color);
  filter: blur(2em);
  opacity: .7;
  transform: perspective(1.5em) rotateX(35deg) scale(1, .6);
}

#send:hover {
  color: var(--btn-color);
  background-color: var(--glow-color);
  box-shadow: 0 0 1em .25em var(--glow-color),
        0 0 4em 2em var(--glow-spread-color),
        inset 0 0 .75em .25em var(--glow-color);
}

#send:active {
  box-shadow: 0 0 0.6em .25em var(--glow-color),
        0 0 2.5em 2em var(--glow-spread-color),
        inset 0 0 .5em .25em var(--glow-color);
}

#limpar {
  --glow-color: rgb(255, 176, 176);
  --glow-spread-color: rgba(255, 123, 123, 0.781);
  --enhanced-glow-color: rgb(182, 175, 71);
  --btn-color: rgba(241, 13, 13, 0.508);
  border: .25em solid var(--glow-color);
  padding: 1em 2em;
  color: var(--glow-color);
  font-size: 14px;
  font-weight: bold;
  background-color: var(--btn-color);
  border-radius: 1em;
  outline: none;
  box-shadow: 0 0 1em .25em var(--glow-color),
        0 0 4em 1em var(--glow-spread-color),
        inset 0 0 .05em .25em var(--glow-color);
  text-shadow: 0 0 .5em var(--glow-color);
  position: relative;
  transition: all 0.3s;
}

#limpar::after {
  pointer-events: none;
  content: "";
  position: absolute;
  top: 120%;
  left: 0;
  height: 100%;
  width: 100%;
  background-color: var(--glow-spread-color);
  filter: blur(2em);
  opacity: .7;
  transform: perspective(1.5em) rotateX(35deg) scale(1, .6);
}

#limpar:hover {
  color: var(--btn-color);
  background-color: var(--glow-color);
  box-shadow: 0 0 1em .25em var(--glow-color),
        0 0 4em 2em var(--glow-spread-color),
        inset 0 0 .75em .25em var(--glow-color);
}

#limpar:active {
  box-shadow: 0 0 0.6em .25em var(--glow-color),
        0 0 2.5em 2em var(--glow-spread-color),
        inset 0 0 .5em .25em var(--glow-color);
}
.form h2:hover{
color: white;
transition:all 0.6s;
}
</style>
</head>
<body>
<form class="form" action="register" method="post">
<h2>Student Registration Form</h2>
<label class="lb" for="nome">Name:</label>
      <input name="name" id="nome" type="text" class="infos" required="required">

      <label for="email" class="lb">E-mail:</label>
      <input name="email" id="email" type="email" class="infos" required="required">

      <label for="data" class="lb">Course Join Date:</label>
      <input name="date" id="data" type="date" class="infos" required="required">
      
      <label for="data" class="lb">Course Name:</label>
      <input name="cname" id="data" type="text" class="infos" required="required">
      

      <button id="send"  type="submit">Send</button>
      <button id="limpar" type="reset">Clear </button>
    </form>
</body>
</html>