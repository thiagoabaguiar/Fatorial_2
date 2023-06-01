/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial;

/**
 *
 * @author Thiago Aguiar
 */
public class Fatorial_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fatorial fatorialClasseInstanciada = new Fatorial();
        
        fatorialClasseInstanciada.setFatorialEFormula(3);
        
        System.out.print(fatorialClasseInstanciada.getFormulaUsadaFatorial());                
        System.out.println(fatorialClasseInstanciada.getResultadoFatorial());
        
    }
    
}
