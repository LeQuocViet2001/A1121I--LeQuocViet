import {AbstractControl, ValidationErrors} from '@angular/forms';

export function comparePassword(control: AbstractControl): ValidationErrors | null {
  const check = control.value;
  return (check.pass === check.confirmPass) ? null : {passwordNotMatch: true};
}
