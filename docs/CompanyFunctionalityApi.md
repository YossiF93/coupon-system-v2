# CompanyFunctionalityApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompanyCoupon**](CompanyFunctionalityApi.md#createCompanyCoupon) | **POST** /coupons-system/company/createCoupon | Create a new company coupon in the coupon system
[**getCompanyCoupon**](CompanyFunctionalityApi.md#getCompanyCoupon) | **GET** /coupons-system/company/getCouponDetails | get a Coupon details from the coupon system.
[**getCompanyCoupons**](CompanyFunctionalityApi.md#getCompanyCoupons) | **GET** /coupons-system/company/getCouponsDetails | get the company coupons.
[**removeCompanyCoupon**](CompanyFunctionalityApi.md#removeCompanyCoupon) | **POST** /coupons-system/company/removeCoupon | Remove exsiting company coupon from the coupon system
[**updateCoupon**](CompanyFunctionalityApi.md#updateCoupon) | **POST** /coupons-system/company/updateCoupon | Update exsiting Coupon details

<a name="createCompanyCoupon"></a>
# **createCompanyCoupon**
> String createCompanyCoupon(body)

Create a new company coupon in the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFunctionalityApi;


CompanyFunctionalityApi apiInstance = new CompanyFunctionalityApi();
CouponDetails body = new CouponDetails(); // CouponDetails | CouponDetails
try {
    String result = apiInstance.createCompanyCoupon(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFunctionalityApi#createCompanyCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CouponDetails**](CouponDetails.md)| CouponDetails | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompanyCoupon"></a>
# **getCompanyCoupon**
> CouponDetails getCompanyCoupon(couponId)

get a Coupon details from the coupon system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFunctionalityApi;


CompanyFunctionalityApi apiInstance = new CompanyFunctionalityApi();
Integer couponId = 56; // Integer | Id of the coupon
try {
    CouponDetails result = apiInstance.getCompanyCoupon(couponId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFunctionalityApi#getCompanyCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponId** | **Integer**| Id of the coupon |

### Return type

[**CouponDetails**](CouponDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCompanyCoupons"></a>
# **getCompanyCoupons**
> CouponsList getCompanyCoupons()

get the company coupons.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFunctionalityApi;


CompanyFunctionalityApi apiInstance = new CompanyFunctionalityApi();
try {
    CouponsList result = apiInstance.getCompanyCoupons();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFunctionalityApi#getCompanyCoupons");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CouponsList**](CouponsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCompanyCoupon"></a>
# **removeCompanyCoupon**
> String removeCompanyCoupon(couponId)

Remove exsiting company coupon from the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFunctionalityApi;


CompanyFunctionalityApi apiInstance = new CompanyFunctionalityApi();
Integer couponId = 56; // Integer | Id of the coupon
try {
    String result = apiInstance.removeCompanyCoupon(couponId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFunctionalityApi#removeCompanyCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponId** | **Integer**| Id of the coupon |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCoupon"></a>
# **updateCoupon**
> String updateCoupon(couponId, body)

Update exsiting Coupon details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyFunctionalityApi;


CompanyFunctionalityApi apiInstance = new CompanyFunctionalityApi();
Integer couponId = 56; // Integer | Id of the coupon
CouponDetails body = new CouponDetails(); // CouponDetails | couponDetails
try {
    String result = apiInstance.updateCoupon(couponId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyFunctionalityApi#updateCoupon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **couponId** | **Integer**| Id of the coupon |
 **body** | [**CouponDetails**](CouponDetails.md)| couponDetails | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

