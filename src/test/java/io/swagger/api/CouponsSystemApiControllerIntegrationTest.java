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

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CouponsSystemApiControllerIntegrationTest {

    @Autowired
    private CouponsSystemApi api;

    @Test
    public void adminCreateCompanyTest() throws Exception {
        CompanyDetails body = new CompanyDetails();
        ResponseEntity<String> responseEntity = api.adminCreateCompany(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void adminCreateCustomerTest() throws Exception {
        ClientSigningDetails body = new ClientSigningDetails();
        ResponseEntity<String> responseEntity = api.adminCreateCustomer(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void clientLoginTest() throws Exception {
        ClientLoginDetails body = new ClientLoginDetails();
        ResponseEntity<String> responseEntity = api.clientLogin(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void clientSigningTest() throws Exception {
        ClientSigningDetails body = new ClientSigningDetails();
        ResponseEntity<String> responseEntity = api.clientSigning(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void createCompanyTest() throws Exception {
        CompanyDetails body = new CompanyDetails();
        ResponseEntity<String> responseEntity = api.createCompany(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void createCompanyCouponTest() throws Exception {
        CouponDetails body = new CouponDetails();
        ResponseEntity<String> responseEntity = api.createCompanyCoupon(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void createCouponTest() throws Exception {
        CouponDetails body = new CouponDetails();
        ResponseEntity<String> responseEntity = api.createCoupon(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void createCustomerTest() throws Exception {
        ClientSigningDetails body = new ClientSigningDetails();
        ResponseEntity<String> responseEntity = api.createCustomer(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllCompaniesTest() throws Exception {
        ResponseEntity<CompaniesList> responseEntity = api.getAllCompanies();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllCouponsTest() throws Exception {
        Integer companyId = 56;
        ResponseEntity<CouponsList> responseEntity = api.getAllCoupons(companyId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAllCustomersTest() throws Exception {
        ResponseEntity<CustomersList> responseEntity = api.getAllCustomers();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getAvailableCouponsTest() throws Exception {
        Integer customerId = 56;
        CouponsList couponType = new CouponsList();
        Integer price = 56;
        ResponseEntity<CouponType> responseEntity = api.getAvailableCoupons(customerId, couponType, price);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCompanyAsAdminTest() throws Exception {
        Integer couponId = 56;
        ResponseEntity<CompanyDetails> responseEntity = api.getCompanyAsAdmin(couponId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCompanyCouponTest() throws Exception {
        Integer couponId = 56;
        ResponseEntity<CouponDetails> responseEntity = api.getCompanyCoupon(couponId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCompanyCouponsTest() throws Exception {
        ResponseEntity<CouponsList> responseEntity = api.getCompanyCoupons();
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCouponDetailsAsAdminTest() throws Exception {
        Integer couponId = 56;
        ResponseEntity<CouponDetails> responseEntity = api.getCouponDetailsAsAdmin(couponId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCustomerAsAdminTest() throws Exception {
        Integer customerId = 56;
        ResponseEntity<CustomerDetails> responseEntity = api.getCustomerAsAdmin(customerId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCustomerCouponsTest() throws Exception {
        Integer customerId = 56;
        ResponseEntity<CouponsList> responseEntity = api.getCustomerCoupons(customerId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getCustomerDetailsTest() throws Exception {
        Integer customerId = 56;
        ResponseEntity<CustomerDetails> responseEntity = api.getCustomerDetails(customerId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void removeComapnyTest() throws Exception {
        Integer companyId = 56;
        ResponseEntity<String> responseEntity = api.removeComapny(companyId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void removeCompanyCouponTest() throws Exception {
        Integer couponId = 56;
        ResponseEntity<String> responseEntity = api.removeCompanyCoupon(couponId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void removeCouponTest() throws Exception {
        Integer couponId = 56;
        ResponseEntity<String> responseEntity = api.removeCoupon(couponId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void removeCustomerTest() throws Exception {
        Integer customerId = 56;
        ResponseEntity<String> responseEntity = api.removeCustomer(customerId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateComapnyTest() throws Exception {
        Integer companyId = 56;
        CompanyDetails body = new CompanyDetails();
        ResponseEntity<String> responseEntity = api.updateComapny(companyId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateCouponTest() throws Exception {
        Integer couponId = 56;
        CouponDetails body = new CouponDetails();
        ResponseEntity<String> responseEntity = api.updateCoupon(couponId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateCouponAsAdminTest() throws Exception {
        Integer couponId = 56;
        CouponDetails body = new CouponDetails();
        ResponseEntity<String> responseEntity = api.updateCouponAsAdmin(couponId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void updateCustomerTest() throws Exception {
        Integer customerId = 56;
        ClientLoginDetails body = new ClientLoginDetails();
        ResponseEntity<String> responseEntity = api.updateCustomer(customerId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
