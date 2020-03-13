/**
 * @program school-bus
 * @description: OrderDto
 * @author: mf
 * @create: 2020/03/04 22:10
 */

package com.stylefeng.guns.rest.order.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(description = "订单展示实体")
public class OrderDto implements Serializable {

    @ApiModelProperty(notes = "订单id")
    private Integer uuid;
    @ApiModelProperty(notes = "场次id")
    private Integer countId;
    @ApiModelProperty(notes = "0：沙河->清水河，1：清水河->沙河")
    private String busStatus;
    @ApiModelProperty(notes = "已选座位")
    private String seatsIds;
    @ApiModelProperty(notes = "场次价格")
    private Double countPrice;
    @ApiModelProperty(notes = "订单总价格")
    private Double orderPrice;
    @ApiModelProperty(notes = "下单时间")
    private String orderTime;
    @ApiModelProperty(notes = "下单用户")
    private Integer orderUser;
    @ApiModelProperty(notes = "订单状态，0-待支付,1-已支付,2-已关闭")
    private String orderStatus;
    @ApiModelProperty(notes = "0:未评价；1:已评价")
    private String evaluateStatus;
    @ApiModelProperty(notes = "评论内容")
    private String comment;
}
