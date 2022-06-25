### REST - CRUD
- Stamp
- createStamp - bad solutions

- resource can have at least one uri
- resources are hierarchical
- resources are plural!!!
- Read collection - GET - /stamps
- Read one item - GET - /stamps/{id} eg. /stamps/110101010
- result : 200 - if found,404 if not found(empty body) 
- Create item - POST - /stamps
  - result: 201 + content(inside body) - positive case
  - negative case: 400 bad request(no body/errors in response)
- Delete item - DELETE - /stamps/{id} eg. /stamps/111145
- Update item - PUT - replace object - /stamps/{id}
- Update partial - PATCH - partial update - /stamps/{id}