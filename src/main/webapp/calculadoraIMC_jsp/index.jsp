<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Calculando IMC</title>
    <h1 class="heading">Calculando IMC</h1>
  </head>

<body>
    
<form name="imcForm" id="imcForm" action="#">

<div class="col-md-offset-2 col-md-8 col-sm-12 text-center">
<title>Calculadora IMC</title>
</head>
<body>

    <form name="imcForm" id="imcForm" action="#">
     <p>
    <p><br/><br/>
    Altura (cm)<br/>
        <input type="text" id="altura" name="altura" />
    </p>
    <p>Peso (kg) <br />
        <input type="text" id="peso" name="peso" />
    </p>
    <p>
    <label> 
        <input type="radio" name="sexo" value="op??o" id="sexo_0" />
    Masculino</label>
    <br />
    <label>
        <input type="radio" name="sexo" value="op??o" id="sexo_1" />
    Feminino</label>
    </div>
<p><input class=css_btn_class name="Enviar" type="submit" value="Calcular" onclick="calculadoraIMC_jsp" />
</p>

<%
String alturaStr = request.getParameter("altura");
String pesoStr = request.getParameter("peso");

double altura = Double.parseFloat(alturaStr);
double peso = Double.parseFloat(pesoStr);
double quadrado = (alturaStr*alturaStr);

double calculo = (10000*peso/quadrado);

String resultado = "";

if(calculo<17){
            resulado = "Você está MUITO ABAIXO DO PESO ! IMC " + calculo.toFixed(2);
        }
	else if(calculo>=17 && calculo<=18.5){
             resulado = "Você está ABAIXO DO PESO ! IMC " + calculo.toFixed(2);
        }
       else if(calculo>=18.5 && calculo<24.9){
            resulado = "Você está com o PESO NORMAL ! IMC: " + calculo.toFixed(2);
        }
        else if(calculo>=25 && calculo<29.9) {
            resulado = "Você está ACIMA DO PESO ! IMC: " + calculo.toFixed(2);
        }
        else if(calculo>=30 && calculo<34.9) {
            resulado = "Você está com OBESIDADE 1 ! IMC: " + calculo.toFixed(2);
        }
		    else if(calculo>=35 && calculo<39.9) {
            resulado = "Você está com OBESIDADE 2 (severa)! IMC: " + calculo.toFixed(2);
        }
        else if (calculo>40){
       resulado = "Você está com OBESIDADE 3 (mórbida)! IMC: " + calculo.toFixed(2);
    }
%>

<div id="alert"> <%=resultado%> </div>
 </div>

  </form>
  
</body>