# SigningApiApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientSigning**](SigningApiApi.md#clientSigning) | **POST** /coupons-system/signing | Sign in as a new member to the Coupon system
[**createCompany**](SigningApiApi.md#createCompany) | **POST** /coupons-system/signing/createCompany | Create a new company in the coupon system
[**createCustomer**](SigningApiApi.md#createCustomer) | **POST** /coupons-system/signing/createCustomer | Create a new customer in the coupon system

<a name="clientSigning"></a>
# **clientSigning**
> String clientSigning(body)

Sign in as a new member to the Coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SigningApiApi;


SigningApiApi apiInstance = new SigningApiApi();
ClientSigningDetails body = new ClientSigningDetails(); // ClientSigningDetails | User sign-in Details
try {
    String result = apiInstance.clientSigning(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SigningApiApi#clientSigning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientSigningDetails**](ClientSigningDetails.md)| User sign-in Details |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCompany"></a>
# **createCompany**
> String createCompany(body)

Create a new company in the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SigningApiApi;


SigningApiApi apiInstance = new SigningApiApi();
CompanyDetails body = new CompanyDetails(); // CompanyDetails | CompanyDetails
try {
    String result = apiInstance.createCompany(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SigningApiApi#createCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CompanyDetails**](CompanyDetails.md)| CompanyDetails |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCustomer"></a>
# **createCustomer**
> String createCustomer(body)

Create a new customer in the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SigningApiApi;


SigningApiApi apiInstance = new SigningApiApi();
ClientSigningDetails body = new ClientSigningDetails(); // ClientSigningDetails | CustomerDetails
try {
    String result = apiInstance.createCustomer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SigningApiApi#createCustomer");
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

