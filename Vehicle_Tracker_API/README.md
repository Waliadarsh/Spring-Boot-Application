
# Vehicle Tracker API

A RESTful Spring Boot application to manage vehicle details for a vehicle organization.

## Technologies used

<img src="https://4.bp.blogspot.com/-ou-a_Aa1t7A/W6IhNc3Q0gI/AAAAAAAAD6Y/pwh44arKiuM_NBqB1H7Pz4-7QhUxAgZkACLcBGAs/s1600/spring-boot-logo.png" height="120px"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Apache_Maven_logo.svg/1024px-Apache_Maven_logo.svg.png" width="300px"><img src="https://www.scottbrady91.com/img/logos/swagger-banner.png" width="300px"><img src="https://deepinthecode.com/wp-content/uploads/2017/10/mysql_workbench.jpg" width="200px">

## Server URL

- API version: 1.0.0
- <http://localhost:9091/swagger-ui/index.html>

## API includes

- CRUD Operations
- Validation
- Documentation

## Paths

### /update

#### PUT

Update a vehical.

- Request Body:
  - Content-Type: `application/json`
  - Required: `true`
  - Schema: `#/components/schemas/Vehical`
- Responses:
  - 200: Success
    - Content-Type: `*/*`
    - Schema: `#/components/schemas/Vehical`

### /addvehical

#### POST

Add a new vehical.

- Request Body:
  - Content-Type: `application/json`
  - Required: `true`
  - Schema: `#/components/schemas/Vehical`
- Responses:
  - 200: Success
    - Content-Type: `*/*`
    - Schema: `#/components/schemas/Vehical`

### /sortpricecolor

#### GET

Get all vehicals sorted by price and color.

- Responses:
  - 200: Success
    - Content-Type: `*/*`
    - Schema: `type: array, items: { $ref: "#/components/schemas/Vehical" }`

### /byvid

#### GET

Get a vehical by vid.

- Parameters:
  - Name: `vid`
  - In: `header`
  - Required: `true`
  - Schema: `type: integer, format: int32`
- Responses:
  - 200: Success
    - Content-Type: `*/*`
    - Schema: `#/components/schemas/Vehical`

### /byabovelakh

#### GET

Get all vehicals above 1 Lakh.

- Responses:
  - 200: Success
    - Content-Type: `*/*`
    - Schema: `type: array, items: { $ref: "#/components/schemas/Vehical" }`

### /byVprice

#### GET

Get all vehicals by vprice.

- Parameters:
  - Name: `vprice`
  - In: `header`
  - Required: `true`
  - Schema: `type: number, format: double`
- Responses:
  - 200: Success
    - Content-Type: `*/*`
    - Schema: `type: array, items: { $ref: "#/components/schemas/Vehical" }`

### /byVcolor

#### GET

Get all vehicals by vcolor.

- Parameters:
  - Name: `vcolor`
  - In: `header`
  - Required: `true`
  - Schema: `type: string`
- Responses:
  - 200: Success
    - Content-Type: `*/*`
    - Schema: `type: array, items: { $ref: "#/components/schemas/Vehical" }`

### /allvehical

#### GET

Get all vehicals.

- Responses:
  - 200: Success
    - Content-Type: `*/*`
    - Schema: `type: array, items: { $ref: "#/components/schemas/Vehical" }`

## Schemas

### Vehical

- Type: `object`
- Properties:
  - vid: `type: integer, format: int32`
  - vname: `type: string`
  - vprice: `type: number, format: double`
  - vcolor: `type: string`
  - modal: `type: integer, format: int32`
