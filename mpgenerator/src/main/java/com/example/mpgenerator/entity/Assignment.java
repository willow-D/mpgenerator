package com.example.mpgenerator.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 权益包授予记录表
 * </p>
 *
 * @author lxd
 * @since 2021-01-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("equity_assignment")
public class Assignment implements Serializable {


    /**
     * 购买账号对应手机号
     */
    private String mobile;

    /**
     * 授予记录绑定的用户uid
     */
    private Long uid;

    /**
     * 授予记录绑定的车辆vin码(vin的长度固定是17位长度,不等于17肯定是有问题的车架号)
     */
    private String vin;

    /**
     * 授予记录绑定的权益包id
     */
    private Long packageId;

    /**
     * 权益包名称
     */
    private String packageName;

    /**
     * success(授予成功): 权益包授予成功状态记录;fail(授予失败)：权益包的授予 失败记录;revoke(已终止)：权益包已经被终止的状态
     */
    private String status;

    /**
     * 授予记录的来源, 当前支持: store(商城)
     */
    private String channel;

    /**
     * 授予渠道对应公司主体
     */
    private String channelCompany;

    /**
     * 授予渠道对应公司主体编码
     */
    private String channelCompanyCode;

    /**
     * 成本中心
     */
    private String costCenter;

    /**
     * 成本中心编码
     */
    private String costCenterCode;

    /**
     * 发送区域
     */
    private String channelRegion;

    /**
     * 费用归属部门
     */
    private String costDepartment;

    /**
     * 存放不同渠道时, 对应的标记信息, e.g. 当渠道为商城时，则为对应的订单号
     */
    private String channelRecordId;

    /**
     * 权益包销售价格
     */
    private BigDecimal sellPrice;

    /**
     * 权益包销售价格
     */
    private BigDecimal sellOriginalPrice;

    /**
     * 备注
     */
    private String remark;

    /**
     * 支付方式
     */
    private String payMode;

    /**
     * 财务内部订单号，替代成本中心
     */
    private String costOrderCode;

    /**
     * 业务类型描述，跟财务内部订单号对应
     */
    private String bizTypeDesc;

    /**
     * 自增ID
     */
    private Long id;

    /**
     * 是否删除：0：未删除；1：删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 更新者
     */
    private String updateBy;


}
