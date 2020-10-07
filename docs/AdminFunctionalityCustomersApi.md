# AdminFunctionalityCustomersApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminCreateCustomer**](AdminFunctionalityCustomersApi.md#adminCreateCustomer) | **POST** /coupons-system/admin/createCustomer | Create a new customer in the coupon system
[**getAllCustomers**](AdminFunctionalityCustomersApi.md#getAllCustomers) | **GET** /coupons-system/admin/getAllCustomers | get all the Customers registered in the coupon system.
[**getCustomerAsAdmin**](AdminFunctionalityCustomersApi.md#getCustomerAsAdmin) | **GET** /coupons-system/admin/getCustomer | get a Customer details from the coupon system.
[**removeCustomer**](AdminFunctionalityCustomersApi.md#removeCustomer) | **POST** /coupons-system/admin/removeCustomer | Remove exsiting customer from the coupon system
[**updateCustomer**](AdminFunctionalityCustomersApi.md#updateCustomer) | **POST** /coupons-system/admin/updateCustomer | Update exsiting cutomer details

<a name="adminCreateCustomer"></a>
# **adminCreateCustomer**
> String adminCreateCustomer(body)

Create a new customer in the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCustomersApi;


AdminFunctionalityCustomersApi apiInstance = new AdminFunctionalityCustomersApi();
ClientSigningDetails body = new ClientSigningDetails(); // ClientSigningDetails | CustomerDetails
try {
    String result = apiInstance.adminCreateCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCustomersApi#adminCreateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientSigningDetails**](ClientSigningDetails.md)| CustomerDetails | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllCustomers"></a>
# **getAllCustomers**
> CustomersList getAllCustomers()

get all the Customers registered in the coupon system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCustomersApi;


AdminFunctionalityCustomersApi apiInstance = new AdminFunctionalityCustomersApi();
try {
    CustomersList result = apiInstance.getAllCustomers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCustomersApi#getAllCustomers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomersList**](CustomersList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerAsAdmin"></a>
# **getCustomerAsAdmin**
> CustomerDetails getCustomerAsAdmin(customerId)

get a Customer details from the coupon system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCustomersApi;


AdminFunctionalityCustomersApi apiInstance = new AdminFunctionalityCustomersApi();
Integer customerId = 56; // Integer | Id of the coupon
try {
    CustomerDetails result = apiInstance.getCustomerAsAdmin(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCustomersApi#getCustomerAsAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the coupon |

### Return type

[**CustomerDetails**](CustomerDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCustomer"></a>
# **removeCustomer**
> String removeCustomer(customerId)

Remove exsiting customer from the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCustomersApi;


AdminFunctionalityCustomersApi apiInstance = new AdminFunctionalityCustomersApi();
Integer customerId = 56; // Integer | Id of the customer
try {
    String result = apiInstance.removeCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCustomersApi#removeCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> String updateCustomer(customerId, body)

Update exsiting cutomer details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCustomersApi;


AdminFunctionalityCustomersApi apiInstance = new AdminFunctionalityCustomersApi();
Integer customerId = 56; // Integer | Id of the customer
ClientLoginDetails body = new ClientLoginDetails(); // ClientLoginDetails | CustomerDetails
try {
    String result = apiInstance.updateCustomer(customerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCustomersApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer |
 **body** | [**ClientLoginDetails**](ClientLoginDetails.md)| CustomerDetails | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

