# LoginApiApi

All URIs are relative to */v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientLogin**](LoginApiApi.md#clientLogin) | **POST** /coupons-system/login | Login to the Coupon system

<a name="clientLogin"></a>
# **clientLogin**
> String clientLogin(body)

Login to the Coupon system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LoginApiApi;


LoginApiApi apiInstance = new LoginApiApi();
ClientLoginDetails body = new ClientLoginDetails(); // ClientLoginDetails | User login details
try {
    String result = apiInstance.clientLogin(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoginApiApi#clientLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientLoginDetails**](ClientLoginDetails.md)| User login details |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

