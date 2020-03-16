# PharmacyPocUseCase
Microservice architecture for CRUD operations of single and/or multiple entities and payment processing using payment requests flowing in through rabbit MQ.

There are 3 services - employee service, company service and payment service.

=========================
  EMPLOYEE SERVICE
=========================
This service is basically responsible for adding/creating a new employee record in the organizaition database. It can also update an existing employee details, provided it's already present in the database. Currently delete employee feature is not yet added into this service. It'll be added shortly. Note that this service accepts only one employee record at a time. So bulk processing of employee add/update is not possible using this service.

=========================
  COMPANY SERVICE
=========================
This service is basically responsible for adding/creating one/more new employee(s) in the organizaition database. It can also update one/more existing employee(s) details, provided it's already present in the database. Currently delete employee feature is not yet added into this service. It'll be added shortly. Note that this service can accept one/more employee(s) at a time. So bulk processing of employee add/update is possible using this service. However, this service will not directly interact with the backend database. It'll in turn invoke the employee service as suitable and get the request processed.

=========================
  PAYMENT SERVICE
=========================
Work In Progress.
