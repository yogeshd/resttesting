package com.yogi.data.model;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.code
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Integer code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.description
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.order_line
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Integer orderLine;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.code
     *
     * @return the value of product.code
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.code
     *
     * @param code the value for product.code
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.description
     *
     * @return the value of product.description
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.description
     *
     * @param description the value for product.description
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.order_line
     *
     * @return the value of product.order_line
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Integer getOrderLine() {
        return orderLine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.order_line
     *
     * @param orderLine the value for product.order_line
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setOrderLine(Integer orderLine) {
        this.orderLine = orderLine;
    }
}