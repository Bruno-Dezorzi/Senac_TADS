import { CepService } from './cep.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-cep',
  imports: [],
  templateUrl: './cep.component.html',
  styleUrl: './cep.component.css'
})
export class CepComponent {

  constructor(private cepService: CepService){

  };

  public buscarCep(){
    this.cepService.consultarCep().then( resposta =>{
      let retorno: any = resposta;
      alert(retorno.logradouro)
    })

  }

}


