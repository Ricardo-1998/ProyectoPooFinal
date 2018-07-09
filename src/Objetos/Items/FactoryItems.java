/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos.Items;

import Objetos.Tienda;

/**
 *
 * @author Ricardo Villeda
 */
public class FactoryItems implements Tienda{

    @Override
    public Items GetItem(String Tipo) {
        switch (Tipo) {
            case "SoulCalibur":
                return new SoulCalibur();
            case "Anillo":
                return new Anillo();
            case "Botas":
                return new Botas();
            case "Daga":
                return new Daga();
            case "Daga2":
                return new Daga2();
            case "Espada1":
                return new Espada1();
            case "Espada2":
                return new Espada2();
            case "Espada3":
                return new Espada3();
            case "Espada4":
                return new Espada4();
            case "Espada5":
                return new Espada5();
             case "EspadaDemonio":
                return new EspadaDemonio();
            case "Fuego":
                return new Fuego();
            case "MegaHP":
                return new MegaHP();
            case "MegaMP":
                return new MegaMP();
            case "PocionMP":
                return new PocionMp();
            case "PocionHP":
                return new PocionHP();
            case "Vara":
                return new Vara();
            case "VaraElectrica":
                return new VaraElectrica();
            case "VaraLuz":
                return new VaraLuz();
            case "VaraPrincipiante":
                return new VaraPrincipiante();
            case "Armadura1":
                return new Vara();
            case "Armadura2":
                return new Armadura2();
            case "Armadura3":
                return new Armadura3();
            case "Armadura4":
                return new Armadura4();
        }
        return null;
    }
    
}
