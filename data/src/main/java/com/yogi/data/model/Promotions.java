package com.yogi.data.model;

public class Promotions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotions.id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promotions.promotion-description
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    private String promotionDescription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotions.id
     *
     * @return the value of promotions.id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotions.id
     *
     * @param id the value for promotions.id
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promotions.promotion-description
     *
     * @return the value of promotions.promotion-description
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public String getPromotionDescription() {
        return promotionDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promotions.promotion-description
     *
     * @param promotionDescription the value for promotions.promotion-description
     *
     * @mbggenerated Tue Feb 05 18:12:02 IST 2013
     */
    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }
}