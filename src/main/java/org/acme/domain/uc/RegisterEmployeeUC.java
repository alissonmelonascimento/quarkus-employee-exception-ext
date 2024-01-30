package org.acme.domain.uc;

import org.acme.domain.Employee;

/**
 * Caso de uso de cadastro de empregados
 */
public interface RegisterEmployeeUC {

    /**
     * Efetua o cadastro do empregado
     * 
     * @param employee
     * @throws Exception
     */
    void execute(Employee employee) throws Exception;
    
}
