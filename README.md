Test Combined back-end service apis in to one

GraphQl playground

http://localhost:8080/graphql

{
  customerById(id: "3"){
    id
    firstName
    lastName
    customerType
    gender
    email{
      id
      primaryEmail
      secondaryEmail
    }
    email2 : email{
      id
      primaryEmail
      secondaryEmail
    }
    phone{
      id
      phoneNumber
      phoneType
    }
  }
} 