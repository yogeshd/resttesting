package com.yogi.data.model;

public class OrderLine {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.line_number
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Integer lineNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.price
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Long price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.quantity
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Long quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_line.order_id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Integer orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.line_number
     *
     * @return the value of order_line.line_number
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.line_number
     *
     * @param lineNumber the value for order_line.line_number
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.price
     *
     * @return the value of order_line.price
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.price
     *
     * @param price the value for order_line.price
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.quantity
     *
     * @return the value of order_line.quantity
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.quantity
     *
     * @param quantity the value for order_line.quantity
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_line.order_id
     *
     * @return the value of order_line.order_id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_line.order_id
     *
     * @param orderId the value for order_line.order_id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}