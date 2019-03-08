/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.dao.ClienteDao;
import model.dao.ClienteDaoImpl;

/**
 *
 * @author rafael
 */
public class ServiceLocator {

    public static ClienteDao getClienteDao() {
        return new ClienteDaoImpl();
    }
    
}
