package org.acme;

import org.acme.domain.Employee;
import org.acme.domain.uc.RegisterEmployeeUC;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/employee")
public class EmployeeResource {

    @Inject
    RegisterEmployeeUC registerEmployeeUC;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(@Valid Employee employee) throws Exception{
        this.registerEmployeeUC.execute(employee);
    }
}
