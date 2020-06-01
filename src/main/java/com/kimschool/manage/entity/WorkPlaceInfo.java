package com.kimschool.manage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "workplaceinfo")
@NamedQuery(
      name = "WorkPlaceInfo.findByu_no",
      query = "select w from WorkPlaceInfo w where w.u_no = :u_no"
      )

public class WorkPlaceInfo {

   @Id
   @GeneratedValue
   private int no;
   @Column(insertable = false)
   private String wp_name;
   @Column(insertable = false)
   private int min_time;
   @Column(insertable = false)
   private int max_time;
   @Column(insertable = false)
   private String u_no;
   @Column(insertable = false)
   private String reg_date;
   /**
    * @return the no
    */
   public int getNo() {
      return no;
   }
   /**
    * @param no the no to set
    */
   public void setNo(int no) {
      this.no = no;
   }
   /**
    * @return the wp_name
    */
   public String getWp_name() {
      return wp_name;
   }
   /**
    * @param wp_name the wp_name to set
    */
   public void setWp_name(String wp_name) {
      this.wp_name = wp_name;
   }
   /**
    * @return the min_time
    */
   public int getMin_time() {
      return min_time;
   }
   /**
    * @param min_time the min_time to set
    */
   public void setMin_time(int min_time) {
      this.min_time = min_time;
   }
   /**
    * @return the max_time
    */
   public int getMax_time() {
      return max_time;
   }
   /**
    * @param max_time the max_time to set
    */
   public void setMax_time(int max_time) {
      this.max_time = max_time;
   }
   /**
    * @return the u_no
    */
   public String getU_no() {
      return u_no;
   }
   /**
    * @param u_no the u_no to set
    */
   public void setU_no(String u_no) {
      this.u_no = u_no;
   }
   /**
    * @return the reg_date
    */
   public String getReg_date() {
      return reg_date;
   }
   /**
    * @param reg_date the reg_date to set
    */
   public void setReg_date(String reg_date) {
      this.reg_date = reg_date;
   }
   @Override
   public String toString() {
      return "Workplaceinfo [no=" + no + ", wp_name=" + wp_name + ", min_time=" + min_time + ", max_time=" + max_time
            + ", u_no=" + u_no + ", reg_date=" + reg_date + "]";
   }



}