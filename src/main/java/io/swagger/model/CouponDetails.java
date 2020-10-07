package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CouponType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Coupon details
 */
@ApiModel(description = "Coupon details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-07T12:48:49.640227100+03:00[Asia/Jerusalem]")

public class CouponDetails   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("couponType")
  private CouponType couponType = null;

  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("price")
  private Integer price = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("expiryDate")
  private String expiryDate = null;

  @JsonProperty("image")
  private String image = null;

  public CouponDetails title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "Vacation voucher", value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CouponDetails couponType(CouponType couponType) {
    this.couponType = couponType;
    return this;
  }

  /**
   * Get couponType
   * @return couponType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CouponType getCouponType() {
    return couponType;
  }

  public void setCouponType(CouponType couponType) {
    this.couponType = couponType;
  }

  public CouponDetails amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "50", value = "")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public CouponDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "10% discount on the best vacation for you!", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CouponDetails price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "100", value = "")


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public CouponDetails startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "2019-05-17", value = "")

@Pattern(regexp="/([0-9]{4})-(?:[0-9]{2})-([0-9]{2})/") 
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CouponDetails expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(example = "2019-05-17", value = "")

@Pattern(regexp="/([0-9]{4})-(?:[0-9]{2})-([0-9]{2})/") 
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public CouponDetails image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(example = "www.image.com", value = "")


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponDetails couponDetails = (CouponDetails) o;
    return Objects.equals(this.title, couponDetails.title) &&
        Objects.equals(this.couponType, couponDetails.couponType) &&
        Objects.equals(this.amount, couponDetails.amount) &&
        Objects.equals(this.description, couponDetails.description) &&
        Objects.equals(this.price, couponDetails.price) &&
        Objects.equals(this.startDate, couponDetails.startDate) &&
        Objects.equals(this.expiryDate, couponDetails.expiryDate) &&
        Objects.equals(this.image, couponDetails.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, couponType, amount, description, price, startDate, expiryDate, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponDetails {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

