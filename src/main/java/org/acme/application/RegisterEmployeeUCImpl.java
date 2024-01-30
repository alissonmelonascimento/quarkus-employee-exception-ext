package org.acme.application;

import org.acme.domain.Employee;
import org.acme.domain.uc.RegisterEmployeeUC;
import org.acme.exceptions.runtime.exceptions.BusinessException;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RegisterEmployeeUCImpl implements RegisterEmployeeUC{

    @ConfigProperty(name = "salary-max")
    Double salaryMax;

    @Override
    public void execute(final Employee employee) throws Exception{
        if(employee.getSalary() > this.salaryMax){
            throw new BusinessException("Salário muito alto");
        }

        //TODO persist
    }
    
}
