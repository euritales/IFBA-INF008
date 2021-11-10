
package pooprova;

import javax.swing.JOptionPane;

/**
 *
 * @author Atlas
 */
public class Questao01 {
    
    public static void main(String[] args) {
     
        // DecimalFormat format = new DecimalFormat("0.00");
        
        double valorMetro;
        double valorMetroCm;
        double valorMetroPes;
        double valorMetroAcre;
        double valorMetroMilha;
        double valorAcrePes;
        double valorPesCm;
        double valorMilhaAcre;

        ConversaoDeUnidadesDeArea conversor = new ConversaoDeUnidadesDeArea();   
        conversor.setMedida(Double.parseDouble(JOptionPane.showInputDialog("Insira a dimensão do campo em m²: ")));
        
        valorMetro =  conversor.getMedida(); 
        System.out.println(valorMetro); // 1 metro
        valorMetroPes = conversor.conversorMetroPe(valorMetro);
        System.out.println(valorMetroPes); // 1 metro = 10,7639 Pes²
        valorPesCm = conversor.conversorPeCentimetro(valorMetroPes);
        System.out.println(valorPesCm); //10,7639pes² = 9999,990323cm²
        valorMetroCm = conversor.conversorMetroCentimetro(valorMetro);
        System.out.println(valorMetroCm); //1 metro = 1000cm
        valorMetroMilha = conversor.conversorMetroMilha(valorMetro);
        System.out.println(valorMetroMilha); //1 metro = 0,0000003861milhas²
        valorMilhaAcre = conversor.conversorMilhaAcres(valorMetroMilha);
        System.out.println(valorMilhaAcre); // 0,0000003861milhas² = 0,000247104 Acres
        valorMetroAcre = conversor.conversorMetroAcre(valorMetro);
        valorAcrePes = conversor.conversorAcrePes(valorMetroAcre);
      
        JOptionPane.showMessageDialog(null,"CONVERSOR DE MEDIDAS \n\nm² > Pés : "+ valorMetroPes + "\nPés > cm²: " + valorPesCm + "\nMilha > Acre: " + valorMilhaAcre + "\nAcre > Pés: " + valorAcrePes);
        JOptionPane.showMessageDialog(null,"DIMENSÕES CAMPO \n\nm²: "+valorMetro + "\nPés: " + valorMetroPes + "\nAcre: " + valorMetroAcre + "\ncm²: " + valorMetroCm);

    }
   }