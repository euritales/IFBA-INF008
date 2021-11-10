
package pooprova;

/**
 *
 * @author Atlas
 *
 *
• 1 metro quadrado = 10.76 pés quadrados
• 1 pé quadrado = 929 centímetros quadrados
• 1 milha quadrada = 640 acres
• 1 acre = 43.560 pés quadrados.
*/
public class ConversaoDeUnidadesDeArea {
    
    private double medida;

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }
   
    public double conversorMetroCentimetro(double medida){
       
       return medida * 1000;
       
   }
   
   public double conversorMetroPe(double medida){
       
       return medida * 10.76;
       
   }
   
   public double conversorMetroAcre(double medida){
       
       return medida / 0.000247105;
       
   }
   
   public double conversorPeCentimetro(double medida){
       
       return medida * 929;
       
   }
 
   public double conversorMilhaAcres(double medida){
       
       return medida * 640;
       
   }
      public double conversorMetroMilha(double medida){
       
       return medida * 0.0000003861;
       
   }
       
   public double conversorAcrePes(double medida){
       
       return medida * 43560;
       
   }
   

}
