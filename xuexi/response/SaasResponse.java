package response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "SaaS返回参数")
public class SaasResponse {

    @Schema(description = "响应码")
    private String code;

    @Schema(description = "响应消息")
    private String message;

    @Schema(description = "响应数据")
    private ResponseData data;

    @Schema(description = "是否成功")
    private Boolean success;

    @Data
    @Schema(description = "响应数据")
    public static class ResponseData {
        @Schema(description = "门店对车型列表")
        private List<StorePairVehicleModel> storePairVehicleModelList;

        @Schema(description = "输出消息映射")
        private List<Object> outMsgMap;
    }

    @Data
    @Schema(description = "门店对车型")
    public static class StorePairVehicleModel {
        @Schema(description = "取车门店")
        private Store pickUpStore;

        @Schema(description = "还车门店")
        private Store returnStore;

        @Schema(description = "车型价格列表")
        private List<VehicleModelPrice> vehicleModelPriceList;
    }

    @Data
    @Schema(description = "门店信息")
    public static class Store {
        @Schema(description = "门店ID")
        private Integer id;

        @Schema(description = "门店名称")
        private String name;

        @Schema(description = "城市代码")
        private String cityCode;

        @Schema(description = "电话号码")
        private List<String> phones;

        @Schema(description = "是否24小时营业")
        private Integer allDay;

        @Schema(description = "距离")
        private Double distance;

        @Schema(description = "最小提前预订时间")
        private Double minAdvanceBookingTime;

        @Schema(description = "服务圈DTO列表")
        private List<ServiceCircleDTO> serviceCircleDTOList;
    }

    @Data
    @Schema(description = "服务圈DTO")
    public static class ServiceCircleDTO {
        @Schema(description = "服务圈ID")
        private Integer id;

        @Schema(description = "服务圈名称")
        private String name;

        @Schema(description = "价格")
        private Integer price;

        @Schema(description = "配送服务类型")
        private Integer deliveryServiceType;

        @Schema(description = "最小提前预订时间")
        private Double minAdvanceBookingTime;
    }

    @Data
    @Schema(description = "车型价格")
    public static class VehicleModelPrice {
        @Schema(description = "总金额")
        private Integer totalAmount;

        @Schema(description = "折扣金额")
        private Integer discountAmount;

        @Schema(description = "租金信息")
        private RentalPrice rentalPrice;

        @Schema(description = "服务项金额列表")
        private List<ServiceItemAmount> serviceItemAmountList;

        @Schema(description = "日价格列表")
        private List<DailyPrice> dailyPriceList;

        @Schema(description = "部分日价格列表")
        private List<Object> partDailyPriceList;

        @Schema(description = "车型ID")
        private Integer vehicleModelId;

        @Schema(description = "是否豪华车")
        private Boolean luxury;

        @Schema(description = "牌照类型")
        private String licenseType;

        @Schema(description = "免押金映射")
        private Object freeDepositMap;

        @Schema(description = "免押金类型")
        private Integer freeDepositType;

        @Schema(description = "服务价格")
        private Integer servicePrice;

        @Schema(description = "基本保险价格")
        private Integer basicInsurancePrice;

        @Schema(description = "预授权租金押金价格")
        private Integer preAuthRentDepositPrice;

        @Schema(description = "预授权违章押金价格")
        private Integer preAuthIllegalDepositPrice;

        @Schema(description = "里程数")
        private Integer mileage;

        @Schema(description = "是否不限里程")
        private Integer unlimitedMileage;

        @Schema(description = "超里程价格")
        private Integer overMileagePrice;

        @Schema(description = "无忧价格")
        private NoWorriedPrice noWorriedPrice;

        @Schema(description = "SKU调整注册标志")
        private Boolean skuAdjustSignUp;

        @Schema(description = "价格令牌")
        private String priceToken;

        @Schema(description = "车辆标签列表")
        private List<String> vehicleTags;

        @Schema(description = "是否收费押金")
        private Boolean feeDeposit;

        @Schema(description = "市场成本")
        private Integer marketCost;

        @Schema(description = "库存数量")
        private Integer stockNum;
    }

    @Data
    @Schema(description = "租金信息")
    public static class RentalPrice {
        @Schema(description = "天数")
        private Integer days;

        @Schema(description = "超时时间")
        private Integer overtime;

        @Schema(description = "超时金额")
        private Integer overtimeAmount;

        @Schema(description = "标准单价")
        private Integer standardUnitPrice;

        @Schema(description = "平均日价")
        private Integer averageDailyPrice;

        @Schema(description = "标准金额")
        private Integer standardAmount;

        @Schema(description = "标准总金额")
        private Integer standardTotalAmount;

        @Schema(description = "数量")
        private Double quantity;
    }

    @Data
    @Schema(description = "服务项金额")
    public static class ServiceItemAmount {
        @Schema(description = "服务项ID")
        private Integer id;

        @Schema(description = "设置ID")
        private Integer settingId;

        @Schema(description = "服务项代码")
        private String code;

        @Schema(description = "是否在最高价")
        private Integer onHighestPrice;

        @Schema(description = "类型")
        private Integer type;

        @Schema(description = "名称")
        private String name;

        @Schema(description = "是否收费")
        private Integer onCharge;

        @Schema(description = "价格")
        private Integer price;

        @Schema(description = "单位")
        private String unit;

        @Schema(description = "数量")
        private Integer count;

        @Schema(description = "描述")
        private String description;

        @Schema(description = "是否必填")
        private Integer required;

        @Schema(description = "计算比例")
        private Double calPer;

        @Schema(description = "数量")
        private Double quantity;

        @Schema(description = "金额")
        private Integer amount;

        @Schema(description = "状态")
        private Integer status;

        @Schema(description = "是否包含在总金额中")
        private Integer includeInTotalAmount;

        @Schema(description = "是否携程标准费用")
        private Boolean ctripStandardFee;
    }

    @Data
    @Schema(description = "日价格")
    public static class DailyPrice {
        @Schema(description = "日期")
        private String date;

        @Schema(description = "费用代码")
        private String feeCode;

        @Schema(description = "价格")
        private Integer price;

        @Schema(description = "小时数")
        private Integer hour;

        @Schema(description = "部分日价格")
        private Integer partDailyPrice;

        @Schema(description = "全日价格")
        private Integer wholeDailyPrice;

        @Schema(description = "比例")
        private Double per;

        @Schema(description = "无忧价格")
        private Integer worryFreePrice;

        @Schema(description = "无忧日价格")
        private Integer worryFreeDailyPrice;

        @Schema(description = "无忧上浮率")
        private Double noWorriedUpRate;

        @Schema(description = "是否全天")
        private Boolean allDay;
    }

    @Data
    @Schema(description = "无忧价格")
    public static class NoWorriedPrice {
        @Schema(description = "总金额")
        private Integer totalAmount;

        @Schema(description = "折扣金额")
        private Integer discountAmount;

        @Schema(description = "租金信息")
        private RentalPrice rentalPrice;

        @Schema(description = "服务项金额列表")
        private List<ServiceItemAmount> serviceItemAmountList;

        @Schema(description = "日价格列表")
        private List<DailyPrice> dailyPriceList;

        @Schema(description = "部分日价格列表")
        private List<Object> partDailyPriceList;
    }
}