package com.dimai.mybatis_plus_demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author mj
 * @since 2019-06-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("IMS5_SETT_PRE_DATA_7")
public class Ims5SettPreData7 implements Serializable {

private static final long serialVersionUID=1L;

    @TableId("PK_ID")
    private Double pkId;

    @TableField("BOSS_PK_ID")
    private String bossPkId;

    @TableField("BATCH_ID")
    private String batchId;

    @TableField("REQUEST_ID")
    private String requestId;

    /**
     * 任务实例ID
     */
    @TableField("INSTANCE_ID")
    private String instanceId;

    /**
     * 数据分片id
     */
    @TableField("SHARDING_ID")
    private String shardingId;

    /**
     * 业务大类ID
     */
    @TableField("BIZ_TYPE_ID")
    private String bizTypeId;

    /**
     * 业务大类,与结算渠道关联
     */
    @TableField("BIZ_TYPE_NAME")
    private String bizTypeName;

    @TableField("DATA_SOURCE")
    private String dataSource;

    /**
     * 服务分类
     */
    @TableField("SERVICE_TYPE")
    private String serviceType;

    /**
     * 业务分类
     */
    @TableField("BUSINESS_TYPE")
    private String businessType;

    /**
     * 结算单ID
     */
    @TableField("SETTLEMENT_ID")
    private String settlementId;

    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;

    /**
     * 警告信息
     */
    @TableField("ALERT_RESULT")
    private Double alertResult;

    @TableField("ALERT_MSG")
    private String alertMsg;

    /**
     * 校验信息
     */
    @TableField("CHECK_RESULT")
    private Double checkResult;

    @TableField("CHECK_MSG")
    private String checkMsg;

    @TableField("CREATE_DATE")
    private LocalDateTime createDate;

    @TableField("CREATE_BY")
    private Double createBy;

    @TableField("CREATE_BY_NAME")
    private String createByName;

    @TableField("UPDATE_DATE")
    private LocalDateTime updateDate;

    @TableField("UPDATE_BY")
    private Double updateBy;

    @TableField("UPDATE_BY_NAME")
    private String updateByName;

    /**
     * OU
     */
    @TableField("OU_ID")
    private Double ouId;

    @TableField("OU_NAME")
    private String ouName;

    /**
     * SP
     */
    @TableField("COMPANY_ID")
    private String companyId;

    @TableField("COMPANY_NAME")
    private String companyName;

    /**
     * 渠道
     */
    @TableField("CHANNEL_ID")
    private String channelId;

    @TableField("CHANNEL_NAME")
    private String channelName;

    @TableField("KPI_CHANNEL_ID")
    private String kpiChannelId;

    @TableField("KPI_CHANNEL_NAME")
    private String kpiChannelName;

    /**
     * 子渠道
     */
    @TableField("SUBCHANNEL_ID")
    private String subchannelId;

    @TableField("SUBCHANNEL_NAME")
    private String subchannelName;

    /**
     * 结算纬度
     */
    @TableField("PATTERN_ID")
    private String patternId;

    @TableField("PATTERN_NAME")
    private String patternName;

    /**
     * MDM客户ID
     */
    @TableField("MDM_CUSTOMER_ID")
    private Double mdmCustomerId;

    /**
     * MDM客户名称
     */
    @TableField("MDM_CUSTOMER_NAME")
    private String mdmCustomerName;

    /**
     * ERP客户ID
     */
    @TableField("CUSTOMER_ID")
    private Double customerId;

    /**
     * ERP客户名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

    /**
     * 客户类型
     */
    @TableField("CUSTOMER_TYPE")
    private String customerType;

    /**
     * 业务客户ID
     */
    @TableField("BIZ_CUSTOMER_ID")
    private String bizCustomerId;

    /**
     * 业务客户名称
     */
    @TableField("BIZ_CUSTOMER_NAME")
    private String bizCustomerName;

    /**
     * 客户地址ID
     */
    @TableField("CUSTOMER_ADDRESS_ID")
    private Double customerAddressId;

    /**
     * 客户地址名称
     */
    @TableField("CUSTOMER_ADDRESS_NAME")
    private String customerAddressName;

    /**
     * 标准通知单行ID
     */
    @TableField("CUSTOMER_DESCRIPTION_ID")
    private Double customerDescriptionId;

    /**
     * 标准通知单行名称
     */
    @TableField("CUSTOMER_DESCRIPTION_NAME")
    private String customerDescriptionName;

    /**
     * 部门ID
     */
    @TableField("DEPT_ID")
    private Double deptId;

    /**
     * 部门名称
     */
    @TableField("DEPT_NAME")
    private String deptName;

    /**
     * 结算账期
     */
    @TableField("PERIOD_NAME")
    private String periodName;

    /**
     * 结算日期
     */
    @TableField("SETTLEMENT_DATE")
    private LocalDateTime settlementDate;

    /**
     * GL日期
     */
    @TableField("GL_DATE")
    private LocalDateTime glDate;

    /**
     * 预付/赊销
     */
    @TableField("PAID_TYPE")
    private String paidType;

    /**
     * 账期
     */
    @TableField("FINANCE_PERIOD")
    private Double financePeriod;

    @TableField("DUE_DATE")
    private LocalDateTime dueDate;

    @TableField("BALANCE")
    private Double balance;

    @TableField("WORK_COST")
    private Double workCost;

    @TableField("CURRENCY_CODE")
    private String currencyCode;

    @TableField("CURRENCY_RATE")
    private Double currencyRate;

    @TableField("ORI_BALANCE")
    private Double oriBalance;

    @TableField("ORI_WORK_COST")
    private Double oriWorkCost;

    @TableField("ORI_CURRENCY_CODE")
    private String oriCurrencyCode;

    @TableField("ORI_CURRENCY_RATE")
    private Double oriCurrencyRate;

    @TableField("RMB_BALANCE")
    private Double rmbBalance;

    @TableField("RMB_WORK_COST")
    private Double rmbWorkCost;

    @TableField("RMB_CURRENCY_CODE")
    private String rmbCurrencyCode;

    @TableField("RMB_CURRENCY_RATE")
    private Double rmbCurrencyRate;

    /**
     * 交易流水号
     */
    @TableField("ORDER_NUMBER")
    private String orderNumber;

    /**
     * 前端业务系统订单号
     */
    @TableField("INDENT_NUMBER")
    private String indentNumber;

    /**
     * 账单号
     */
    @TableField("BILL_NO")
    private String billNo;

    /**
     * 合同ID
     */
    @TableField("CONTRACT_ID")
    private String contractId;

    /**
     * 关联订单号
     */
    @TableField("REL_INDENT_NUMBER")
    private String relIndentNumber;

    /**
     * 关联账单号
     */
    @TableField("REL_BILL_NO")
    private String relBillNo;

    /**
     * BG标签
     */
    @TableField("BG_LABEL")
    private String bgLabel;

    /**
     * 结算类型id
     */
    @TableField("SETTLEMENT_TYPE_ID")
    private String settlementTypeId;

    /**
     * 结算类型
     */
    @TableField("SETTLEMENT_TYPE_NAME")
    private String settlementTypeName;

    /**
     * 操作主帐号类型。1/2/3(代理/子客/直客)
     */
    @TableField("MASTER_ACCOUNT_TYPE")
    private String masterAccountType;

    /**
     * 代理id
     */
    @TableField("AGENCY_ID")
    private String agencyId;

    /**
     * 代理名称
     */
    @TableField("AGENCY_NAME")
    private String agencyName;

    /**
     * 子客ID
     */
    @TableField("SUB_ACCOUNT_ID")
    private String subAccountId;

    /**
     * 子客名称
     */
    @TableField("SUB_ACCOUNT_NAME")
    private String subAccountName;

    /**
     * 广告id
     */
    @TableField("AD_ID")
    private String adId;

    /**
     * 排期ID
     */
    @TableField("PLAN_ID")
    private String planId;

    /**
     * 排期属性
     */
    @TableField("PLANNING_ATTRIBUTE")
    private String planningAttribute;

    /**
     * 资源位id
     */
    @TableField("RESOURCE_ID")
    private String resourceId;

    /**
     * 资源位
     */
    @TableField("RESOURCE_LOCATION")
    private String resourceLocation;

    /**
     * 片区id
     */
    @TableField("REGION_ID")
    private String regionId;

    /**
     * 片区名称
     */
    @TableField("REGION_NAME")
    private String regionName;

    /**
     * 广告平台GDT/MP
     */
    @TableField("AD_PLATFORM")
    private String adPlatform;

    /**
     * 渠道经理
     */
    @TableField("CHANNEL_MANAGER")
    private String channelManager;

    /**
     * 销售人员
     */
    @TableField("SALES_MANAGER")
    private String salesManager;

    /**
     * 媒介人员
     */
    @TableField("MEDIUM_MANAGER")
    private String mediumManager;

    /**
     * 结算组id
     */
    @TableField("SETTLEMENT_GROUP_ID")
    private String settlementGroupId;

    /**
     * 结算组
     */
    @TableField("SETTLEMENT_GROUP_NAME")
    private String settlementGroupName;

    /**
     * 结算平台id
     */
    @TableField("SETT_PLATFORM_ID")
    private String settPlatformId;

    /**
     * 结算平台
     */
    @TableField("SETT_PLATFORM_NAME")
    private String settPlatformName;

    /**
     * 递延类型id
     */
    @TableField("DEFERRED_TYPE_ID")
    private String deferredTypeId;

    /**
     * 递延类型
     */
    @TableField("DEFERRED_TYPE_NAME")
    private String deferredTypeName;

    /**
     * 账户类型id
     */
    @TableField("ACCOUNT_TYPE_ID")
    private String accountTypeId;

    /**
     * 账户类型
     */
    @TableField("ACCOUNT_TYPE_NAME")
    private String accountTypeName;

    /**
     * 售卖类型id
     */
    @TableField("BUYING_TYPE_ID")
    private String buyingTypeId;

    /**
     * 售卖类型
     */
    @TableField("BUYING_TYPE_NAME")
    private String buyingTypeName;

    /**
     * 是否需要核销。Y/N(需要/不需要)
     */
    @TableField("IS_NEED_CREATE_APPLY")
    private String isNeedCreateApply;

    /**
     * 是否需要开票。Y/N(需要/不需要)
     */
    @TableField("IS_NEED_CREATE_INVOICE")
    private String isNeedCreateInvoice;

    /**
     * (GDT/MP接入特有字段)。是否生成确认/应收。Y/N(需要生成/不需要生成)
     */
    @TableField("IS_NEED_CREATE_REC")
    private String isNeedCreateRec;

    /**
     * (GDT/MP接入特有字段)金额操作类别
     */
    @TableField("OPERATION_TYPE")
    private String operationType;

    /**
     * 交易金额
     */
    @TableField("PAY_FEE")
    private Double payFee;

    /**
     * 手续费率
     */
    @TableField("CHARGE_RATIO")
    private Double chargeRatio;

    /**
     * 平台商户号
     */
    @TableField("PLAT_ACCOUNT")
    private String platAccount;

    /**
     * 收入类型ID
     */
    @TableField("INCOME_TYPE_ID")
    private String incomeTypeId;

    /**
     * 收入类型
     */
    @TableField("INCOME_TYPE_NAME")
    private String incomeTypeName;

    /**
     * 国别
     */
    @TableField("COUNTRY")
    private String country;

    /**
     * 行业
     */
    @TableField("INDUSTRY")
    private String industry;

    /**
     * 计费金额
     */
    @TableField("INCOME_BEFORE")
    private Double incomeBefore;

    @TableField("ORI_INCOME_BEFORE")
    private Double oriIncomeBefore;

    @TableField("RMB_INCOME_BEFORE")
    private Double rmbIncomeBefore;

    @TableField("FINANCE_PERIOD_UNIT")
    private String financePeriodUnit;

    /**
     * 账单月份
     */
    @TableField("BILL_MONTH")
    private String billMonth;

    /**
     * 退款金额(结算币种)
     */
    @TableField("REFUND_BALANCE")
    private Double refundBalance;

    /**
     * 退款金额(RMB)
     */
    @TableField("RMB_REFUND_BALANCE")
    private Double rmbRefundBalance;

    /**
     * 汇率损失(结算币种)
     */
    @TableField("LOSS_BALANCE")
    private Double lossBalance;

    /**
     * 汇率损失(RMB)
     */
    @TableField("RMB_LOSS_BALANCE")
    private Double rmbLossBalance;

    /**
     * 汇率损失(原始币种)
     */
    @TableField("ORI_LOSS_BALANCE")
    private Double oriLossBalance;

    /**
     * 退款金额(原始币种)
     */
    @TableField("ORI_REFUND_BALANCE")
    private Double oriRefundBalance;

    /**
     * 初始金额
     */
    @TableField("LIMIT_AMOUNT")
    private Double limitAmount;

    /**
     * 计费日期
     */
    @TableField("BILLING_DATE")
    private String billingDate;


}
