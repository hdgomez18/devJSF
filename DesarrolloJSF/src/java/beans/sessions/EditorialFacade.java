/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.sessions;

import entidades.Editorial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HGOMEZ
 */
@Stateless
public class EditorialFacade extends AbstractFacade<Editorial> {

    @PersistenceContext(unitName = "DesarrolloJSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EditorialFacade() {
        super(Editorial.class);
    }
    
}
