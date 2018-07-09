/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Objetos.Items.Items;

/**
 *
 * @author Ricardo Villeda
 */
public interface Tienda {
    Items GetItem(String tipo);
}
