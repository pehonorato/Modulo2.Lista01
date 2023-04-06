var mediaSalario = 0;
var mediaFilhos = 0;
var maiorSalario = 0;

    for (var i = 1; i <= 20; i++) {
        var salario = parseFloat(prompt("Digite o salário do habitante " + i));
        var numFilhos = parseInt(prompt("Digite o número de filhos do habitante " + i));

        mediaSalario = mediaSalario + salario;
        mediaFilhos = mediaFilhos + numFilhos;

        if (salario > maiorSalario) {
            maiorSalario = salario;
        }
}

mediaSalario = mediaSalario / 20;
mediaFilhos = mediaFilhos / 20;

document.writeln("Média salarial: " + mediaSalario.toFixed(2) + " R$<br>");
document.writeln("Média do número de filhos por habitante: " + mediaFilhos.toFixed(0) + "<br>");
document.writeln("Maior salário: " + maiorSalario.toFixed(2) + " R$");