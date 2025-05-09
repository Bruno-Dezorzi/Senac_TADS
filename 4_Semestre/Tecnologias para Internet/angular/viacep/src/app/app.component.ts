import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CepComponent } from './cep/cep.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,CepComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'viacep';
}
