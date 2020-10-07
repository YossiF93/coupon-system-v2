# AdminFunctionalityCouponsApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCoupon**](AdminFunctionalityCouponsApi.md#createCoupon) | **POST** /coupons-system/admin/createCoupon | Create a new Coupon in the coupon system
[**getAllCoupons**](AdminFunctionalityCouponsApi.md#getAllCoupons) | **GET** /coupons-system/admin/getCouponsDetails | get the Coupons registered in the coupon system by companyId.
[**getCouponDetailsAsAdmin**](AdminFunctionalityCouponsApi.md#getCouponDetailsAsAdmin) | **GET** /coupons-system/admin/getCouponDetails | get a Coupon details from the coupon system.
[**removeCoupon**](AdminFunctionalityCouponsApi.md#removeCoupon) | **POST** /coupons-system/admin/removeCoupon | Remove exsiting Coupon from the coupon system
[**updateCouponAsAdmin**](AdminFunctionalityCouponsApi.md#updateCouponAsAdmin) | **POST** /coupons-system/admin/updateCoupon | Update exsiting Coupon details

<a name="createCoupon"></a>
# **createCoupon**
> String createCoupon(body)

Create a new Coupon in the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCouponsApi;


AdminFunctionalityCouponsApi apiInstance = new AdminFunctionalityCouponsApi();
CouponDetails body = new CouponDetails(); // CouponDetails | CouponDetails
try {
    String result = apiInstance.createCoupon(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCouponsApi#createCoupon");
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

<a name="getAllCoupons"></a>
# **getAllCoupons**
> CouponsList getAllCoupons(companyId)

get the Coupons registered in the coupon system by companyId.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCouponsApi;


AdminFunctionalityCouponsApi apiInstance = new AdminFunctionalityCouponsApi();
Integer companyId = 56; // Integer | Id of the company
try {
    CouponsList result = apiInstance.getAllCoupons(companyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCouponsApi#getAllCoupons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **Integer**| Id of the company | [optional]

### Return type

[**CouponsList**](CouponsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCouponDetailsAsAdmin"></a>
# **getCouponDetailsAsAdmin**
> CouponDetails getCouponDetailsAsAdmin(couponId)

get a Coupon details from the coupon system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCouponsApi;


AdminFunctionalityCouponsApi apiInstance = new AdminFunctionalityCouponsApi();
Integer couponId = 56; // Integer | Id of the coupon
try {
    CouponDetails result = apiInstance.getCouponDetailsAsAdmin(couponId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCouponsApi#getCouponDetailsAsAdmin");
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

<a name="removeCoupon"></a>
# **removeCoupon**
> String removeCoupon(couponId)

Remove exsiting Coupon from the coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCouponsApi;


AdminFunctionalityCouponsApi apiInstance = new AdminFunctionalityCouponsApi();
Integer couponId = 56; // Integer | Id of the coupon
try {
    String result = apiInstance.removeCoupon(couponId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCouponsApi#removeCoupon");
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

<a name="updateCouponAsAdmin"></a>
# **updateCouponAsAdmin**
> String updateCouponAsAdmin(couponId, body)

Update exsiting Coupon details

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AdminFunctionalityCouponsApi;


AdminFunctionalityCouponsApi apiInstance = new AdminFunctionalityCouponsApi();
Integer couponId = 56; // Integer | Id of the coupon
CouponDetails body = new CouponDetails(); // CouponDetails | couponDetails
try {
    String result = apiInstance.updateCouponAsAdmin(couponId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminFunctionalityCouponsApi#updateCouponAsAdmin");
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

