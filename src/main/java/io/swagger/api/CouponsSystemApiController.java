package io.swagger.api;

import io.swagger.model.ClientLoginDetails;
import io.swagger.model.ClientSigningDetails;
import io.swagger.model.CompaniesList;
import io.swagger.model.CompanyDetails;
import io.swagger.model.CouponDetails;
import io.swagger.model.CouponType;
import io.swagger.model.CouponsList;
import io.swagger.model.CustomerDetails;
import io.swagger.model.CustomersList;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-07T12:48:49.640227100+03:00[Asia/Jerusalem]")

@Controller
public class CouponsSystemApiController implements CouponsSystemApi {

    private static final Logger log = LoggerFactory.getLogger(CouponsSystemApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CouponsSystemApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> adminCreateCompany(@ApiParam(value = "CompanyDetails" ,required=true )  @Valid @RequestBody CompanyDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> adminCreateCustomer(@ApiParam(value = "CustomerDetails"  )  @Valid @RequestBody ClientSigningDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> clientLogin(@ApiParam(value = "User login details" ,required=true )  @Valid @RequestBody ClientLoginDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> clientSigning(@ApiParam(value = "User sign-in Details" ,required=true )  @Valid @RequestBody ClientSigningDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> createCompany(@ApiParam(value = "CompanyDetails" ,required=true )  @Valid @RequestBody CompanyDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> createCompanyCoupon(@ApiParam(value = "CouponDetails"  )  @Valid @RequestBody CouponDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> createCoupon(@ApiParam(value = "CouponDetails"  )  @Valid @RequestBody CouponDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> createCustomer(@ApiParam(value = "CustomerDetails"  )  @Valid @RequestBody ClientSigningDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CompaniesList> getAllCompanies() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CompaniesList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CouponsList> getAllCoupons(@ApiParam(value = "Id of the company") @Valid @RequestParam(value = "companyId", required = false) Integer companyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CouponsList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CustomersList> getAllCustomers() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CustomersList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CouponType> getAvailableCoupons(@NotNull @ApiParam(value = "Id of the customer", required = true) @Valid @RequestParam(value = "customerId", required = true) Integer customerId,@ApiParam(value = "The Coupon type") @Valid @RequestParam(value = "couponType", required = false) CouponsList couponType,@ApiParam(value = "price of the coupon") @Valid @RequestParam(value = "price", required = false) Integer price) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CouponType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CompanyDetails> getCompanyAsAdmin(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "couponId", required = true) Integer couponId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CompanyDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CouponDetails> getCompanyCoupon(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "couponId", required = true) Integer couponId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CouponDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CouponsList> getCompanyCoupons() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CouponsList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CouponDetails> getCouponDetailsAsAdmin(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "couponId", required = true) Integer couponId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CouponDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CustomerDetails> getCustomerAsAdmin(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "customerId", required = true) Integer customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CustomerDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CouponsList> getCustomerCoupons(@ApiParam(value = "Id of the customer") @Valid @RequestParam(value = "customerId", required = false) Integer customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CouponsList>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CustomerDetails> getCustomerDetails(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "customerId", required = true) Integer customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<CustomerDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> removeComapny(@NotNull @ApiParam(value = "Id of the company", required = true) @Valid @RequestParam(value = "companyId", required = true) Integer companyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> removeCompanyCoupon(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "couponId", required = true) Integer couponId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> removeCoupon(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "couponId", required = true) Integer couponId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> removeCustomer(@NotNull @ApiParam(value = "Id of the customer", required = true) @Valid @RequestParam(value = "customerId", required = true) Integer customerId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> updateComapny(@NotNull @ApiParam(value = "Id of the company", required = true) @Valid @RequestParam(value = "companyId", required = true) Integer companyId,@ApiParam(value = "CompanyDetails"  )  @Valid @RequestBody CompanyDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> updateCoupon(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "couponId", required = true) Integer couponId,@ApiParam(value = "couponDetails"  )  @Valid @RequestBody CouponDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> updateCouponAsAdmin(@NotNull @ApiParam(value = "Id of the coupon", required = true) @Valid @RequestParam(value = "couponId", required = true) Integer couponId,@ApiParam(value = "couponDetails"  )  @Valid @RequestBody CouponDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> updateCustomer(@NotNull @ApiParam(value = "Id of the customer", required = true) @Valid @RequestParam(value = "customerId", required = true) Integer customerId,@ApiParam(value = "CustomerDetails"  )  @Valid @RequestBody ClientLoginDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

}
