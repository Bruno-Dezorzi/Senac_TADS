import { Endereco } from "./model/Endereco";

function consultarCEP(cep: string): void{
    fetch(`https://viacep.com.br/ws/${cep}/json`)
        .then((res) => res.json())
        .then((data:Endereco) =>{
            if(data.erro){
                console.log("CEP não encontrado!");
            } else {
                console.log("Endereço encontrado");
                console.log(data);
            }
        })
        .catch((error) => {
            console.log(`Erro na requisição: ${error}`)
        })
    
}

consultarCEP("85805437")