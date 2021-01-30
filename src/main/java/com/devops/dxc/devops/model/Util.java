package com.devops.dxc.devops.model;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Util {

    private final static Logger LOGGER = Logger.getLogger("devops.subnivel.Control");
    private final static String IND_UF = "uf";

    /**
     * Método para cacular el 10% del ahorro en la AFP.  Las reglas de negocio se pueden conocer en 
     * https://www.previsionsocial.gob.cl/sps/preguntas-frecuentes-nuevo-retiro-seguro-10/
     * 
     * @param ahorro
     * @return
     */
    public static int getDxc(int ahorro){
        int uf = getUf();

        if(((ahorro*0.1)/uf) > 150 ){
            return (int) (150*uf) ;
        } else if((ahorro*0.1)<=1000000 && ahorro >=1000000){
            return (int) 1000000;
        } else if( ahorro <=1000000){
            return (int) ahorro;
        } else {
            return (int) (ahorro*0.1);
        }
    }

    /**
     * Método que retorna el valor de la UF.  Este método debe ser refactorizado por una integración a un servicio
     * que retorne la UF en tiempo real.  Por ejemplo mindicador.cl
     * @return
     */
    public static int getUf(){
        Indicador indicador = getIndicadorDiario(IND_UF);

        return (int)indicador.getSerie().get(0).getValor();
    }

    /**
     * Método para calcular el impuesto asociado al retiro del 10%
     *
     * @param sueldo
     * @return
     */
    public static int getImpuesto(int sueldo, int dxc){
        double impuesto = 0;
        int sueldoAnual = sueldo * 12;

        if(sueldoAnual>=17864280 && sueldoAnual<=29773800){
            impuesto = dxc * 0.08;
        }else if(sueldoAnual>=29773801 && sueldoAnual<=41600000) {
            impuesto = dxc * 0.135;
        }else if(sueldoAnual>=41600001 && sueldoAnual<=53500000) {
            impuesto = dxc * 0.23;
        }else if(sueldoAnual>=53500001 && sueldoAnual<=71400000) {
            impuesto = dxc * 0.304;
        }else if(sueldoAnual>=71400001) {
            impuesto = dxc * 0.35;
        }

        return (int)impuesto;
    }

    /**
     * Método que consulta el valor del día asociado al indicador
     * @param ind
     * @return
     */
    public static Indicador getIndicadorDiario(String ind){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = simpleDateFormat.format(Calendar.getInstance().getTime());
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> call= restTemplate.getForEntity("https://mindicador.cl/api/" + ind + "/" + fecha, String.class);

        Gson gson = new Gson();
        Indicador indicador = gson.fromJson(call.getBody().toLowerCase(), Indicador.class);

        LOGGER.log(Level.INFO, "< Trabajo DevOps - DXC > <Consultado " + ind + " del día: " + indicador.getSerie().get(0).getValor() + " >");

        return indicador;
    }
    
}
