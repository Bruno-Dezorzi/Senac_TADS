import { RouterOutlet, Routes } from '@angular/router';
import { CepComponent } from './cep/cep.component';

export const routes: Routes = [
  {path: '', component: RouterOutlet},
  {path: 'cep', component: CepComponent}
];
