# CustomerFunctionalityApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableCoupons**](CustomerFunctionalityApi.md#getAvailableCoupons) | **GET** /coupons-system/customer/getAvailableCoupons | get the available coupons for the client in the coupon system.
[**getCustomerCoupons**](CustomerFunctionalityApi.md#getCustomerCoupons) | **GET** /coupons-system/admin/getCustomerCoupons | get the Coupons registered in the coupon system by customerId.
[**getCustomerDetails**](CustomerFunctionalityApi.md#getCustomerDetails) | **GET** /coupons-system/customer/getCustomer | get a Customer details from the coupon system.

<a name="getAvailableCoupons"></a>
# **getAvailableCoupons**
> CouponType getAvailableCoupons(customerId, couponType, price)

get the available coupons for the client in the coupon system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerFunctionalityApi;


CustomerFunctionalityApi apiInstance = new CustomerFunctionalityApi();
Integer customerId = 56; // Integer | Id of the customer
CouponsList couponType = new CouponsList(); // CouponsList | The Coupon type
Integer price = 56; // Integer | price of the coupon
try {
    CouponType result = apiInstance.getAvailableCoupons(customerId, couponType, price);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerFunctionalityApi#getAvailableCoupons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer |
 **couponType** | [**CouponsList**](.md)| The Coupon type | [optional]
 **price** | **Integer**| price of the coupon | [optional]

### Return type

[**CouponType**](CouponType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerCoupons"></a>
# **getCustomerCoupons**
> CouponsList getCustomerCoupons(customerId)

get the Coupons registered in the coupon system by customerId.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerFunctionalityApi;


CustomerFunctionalityApi apiInstance = new CustomerFunctionalityApi();
Integer customerId = 56; // Integer | Id of the customer
try {
    CouponsList result = apiInstance.getCustomerCoupons(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerFunctionalityApi#getCustomerCoupons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**| Id of the customer | [optional]

### Return type

[**CouponsList**](CouponsList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCustomerDetails"></a>
# **getCustomerDetails**
> CustomerDetails getCustomerDetails(customerId)

get a Customer details from the coupon system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerFunctionalityApi;


CustomerFunctionalityApi apiInstance = new CustomerFunctionalityApi();
Integer customerId = 56; // Integer | Id of the coupon
try {
    CustomerDetails result = apiInstance.getCustomerDetails(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerFunctionalityApi#getCustomerDetails");
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

