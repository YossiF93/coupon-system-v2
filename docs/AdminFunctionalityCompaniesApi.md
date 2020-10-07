# AdminFunctionalityCompaniesApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminCreateCompany**](AdminFunctionalityCompaniesApi.md#adminCreateCompany) | **POST** /coupons-system/admin/createCompany | Create a new company in the coupon system
[**getAllCompanies**](AdminFunctionalityCompaniesApi.md#getAllCompanies) | **GET** /coupons-system/admin/getCompaniesDetails | get the details of all the companies registered in the coupon system.
[**getCompanyAsAdmin**](AdminFunctionalityCompaniesApi.md#getCompanyAsAdmin) | **GET** /coupons-system/admin/getCompanyDetails | get company details from the coupon system.
[**removeComapny**](AdminFunctionalityCompaniesApi.md#removeComapny) | **POST** /coupons-system/admin/removeCompany | Remove exsiting company from the coupon system
[**updateComapny**](AdminFunctionalityCompaniesApi.md#updateComapny) | **POST** /coupons-system/admin/updateCompany | Update exsiting company details

<a name="adminCreateCompany"></a>
# **adminCreateCompany**
> String adminCreateCompany(body)

Create a new company in the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCompaniesApi;


AdminFunctionalityCompaniesApi apiInstance = new AdminFunctionalityCompaniesApi();
CompanyDetails body = new CompanyDetails(); // CompanyDetails | CompanyDetails
try {
    String result = apiInstance.adminCreateCompany(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCompaniesApi#adminCreateCompany");
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

<a name="getAllCompanies"></a>
# **getAllCompanies**
> CompaniesList getAllCompanies()

get the details of all the companies registered in the coupon system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCompaniesApi;


AdminFunctionalityCompaniesApi apiInstance = new AdminFunctionalityCompaniesApi();
try {
    CompaniesList result = apiInstance.getAllCompanies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCompaniesApi#getAllCompanies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompaniesList**](CompaniesList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompanyAsAdmin"></a>
# **getCompanyAsAdmin**
> CompanyDetails getCompanyAsAdmin(couponId)

get company details from the coupon system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCompaniesApi;


AdminFunctionalityCompaniesApi apiInstance = new AdminFunctionalityCompaniesApi();
Integer couponId = 56; // Integer | Id of the coupon
try {
    CompanyDetails result = apiInstance.getCompanyAsAdmin(couponId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCompaniesApi#getCompanyAsAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponId** | **Integer**| Id of the coupon |

### Return type

[**CompanyDetails**](CompanyDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeComapny"></a>
# **removeComapny**
> String removeComapny(companyId)

Remove exsiting company from the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCompaniesApi;


AdminFunctionalityCompaniesApi apiInstance = new AdminFunctionalityCompaniesApi();
Integer companyId = 56; // Integer | Id of the company
try {
    String result = apiInstance.removeComapny(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCompaniesApi#removeComapny");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**| Id of the company |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateComapny"></a>
# **updateComapny**
> String updateComapny(companyId, body)

Update exsiting company details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCompaniesApi;


AdminFunctionalityCompaniesApi apiInstance = new AdminFunctionalityCompaniesApi();
Integer companyId = 56; // Integer | Id of the company
CompanyDetails body = new CompanyDetails(); // CompanyDetails | CompanyDetails
try {
    String result = apiInstance.updateComapny(companyId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCompaniesApi#updateComapny");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**| Id of the company |
 **body** | [**CompanyDetails**](CompanyDetails.md)| CompanyDetails | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

