/*
 * YossiF93 - Coupons System (Server Side)
 * CRUD APIs for mangaging the Coupon System .
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The Coupon Types
 */
@JsonAdapter(CouponType.Adapter.class)
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

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CouponType fromValue(String text) {
    for (CouponType b : CouponType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CouponType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CouponType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CouponType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CouponType.fromValue(String.valueOf(value));
    }
  }
}