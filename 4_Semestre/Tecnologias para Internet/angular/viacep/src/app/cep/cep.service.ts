import { HttpBackend, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CepService {

  private http: HttpClient;

  constructor(
    handler: HttpBackend
  ) {
    this.http = new HttpClient(handler);
  }

  public consultarCep(){
    let url = 'https://viacep.com.br/ws/';

    return this.http.get(url + 85805437 + '/json').toPromise();
  }
}
