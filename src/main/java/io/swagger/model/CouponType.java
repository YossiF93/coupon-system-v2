package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The Coupon Types
 */
public enum CouponType {
  
  RESTURANTS("RESTURANTS"),
  
  ELECTRICITY("ELECTRICITY"),
  
  FOOD("FOOD"),
  
  HEALTH("HEALTH"),
  
  SPORTS("SPORTS"),
  
  CAMPING("CAMPING"),
  
  TRAVELING("TRAVELING"),
  
  COURSES("COURSES"),
  
  CLOTHING("CLOTHING");

  private String value;

  CouponType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CouponType fromValue(String text) {
    for (CouponType b : CouponType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

