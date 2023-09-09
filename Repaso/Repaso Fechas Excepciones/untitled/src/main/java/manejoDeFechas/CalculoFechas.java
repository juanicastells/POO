package manejoDeFechas;
import java.time.LocalDate;
public class CalculoFechas {
        private LocalDate miFechaDeNacimiento;
        public CalculoFechas(LocalDate miFechaDeNacimiento) {
                this.miFechaDeNacimiento = miFechaDeNacimiento;
        }

        public LocalDate getMiFechaDeNacimiento() {
                return miFechaDeNacimiento;
        }

        public void setMiFechaDeNacimiento(LocalDate miFechaDeNacimiento) {
                this.miFechaDeNacimiento = miFechaDeNacimiento;
        }

        public int calcularEdad () {
                LocalDate fechaActual = LocalDate.now();
                if (fechaActual.getMonthValue() >= miFechaDeNacimiento.getMonthValue() && fechaActual.getDayOfMonth() >= miFechaDeNacimiento.getDayOfMonth()){
                        return fechaActual.getYear()-miFechaDeNacimiento.getYear();
                }else{
                        return fechaActual.getYear()-miFechaDeNacimiento.getYear() - 1;
                }
        }

        public boolean mayorDeEdad () throws noMayorDeEdadException{
              if (this.calcularEdad() >= 18){
                      return true;
              }else {
                      throw new noMayorDeEdadException(this.calcularEdad());
              }
        }
}
