/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasource;

import entidades.IProceso;

/**
 *
 * @author Inaki
 */
public interface IDatasource {
    public IProceso getPrimerProc();
    public IProceso getPrimerProcYEliminar(long tiempo);
}
