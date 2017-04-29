<%!boolean maior(int idade) {
    return idade >= 18;
}%>

<%
String alturaStr = request.getParameter("altura");
String pesoStr = request.getParameter("peso");
//float quadrado = (alturaStr*alturaStr);

//idadeStr = idadeStr == null ? "0" : idadeStr;

float altura = Float.parseFloat(alturaStr);
float peso = Float.parseFloat(pesoStr);
float quadrado = (alturaStr*alturaStr);

float calculo = (10000*peso/quadrado);

if(calculo<17){   
            alert("Você está MUITO ABAIXO DO PESO ! IMC " + calculo.toFixed(2));
        }
		else if(calculo>=17 && calculo<=18.5){   
            alert("Você está ABAIXO DO PESO ! IMC " + calculo.toFixed(2));
        }
        else if(calculo>=18.5 && calculo<24.9){
            alert("Você está com o PESO NORMAL ! IMC: " + calculo.toFixed(2));
        }
        else if(calculo>=25 && calculo<29.9) {
            alert("Você está ACIMA DO PESO ! IMC: " + calculo.toFixed(2));
        }
        else if(calculo>=30 && calculo<34.9) {
            alert("Você está com OBESIDADE 1 ! IMC: " + calculo.toFixed(2));
        }
		else if(calculo>=35 && calculo<39.9) {
            alert("Você está com OBESIDADE 2 (severa)! IMC: " + calculo.toFixed(2));
        }
        else if (calculo>40)
        alert("Você está com OBESIDADE 3 (mórbida)! IMC: " + calculo.toFixed(2));
    }
/*
String resultado = "";
boolean maior = maior(idade);
if (maior) {
  resultado = "De Maior! :)";
} else {
  resultado = "De Menor! :(";
}*/
%>