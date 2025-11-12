package response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * 携程返回车型报价列表响应类
 */
@Data
@Schema(description = "携程返回车型报价列表响应类")
public class CtripCarPriceListResponse {
    
    @Schema(description = "取车信息")
    private RentalInfo pickupRentalInfo;
    
    @Schema(description = "还车信息")
    private RentalInfo dropoffRentalInfo;
    
    @Schema(description = "供应商列表")
    private List<Supplier> suppliers;
    
    /**
     * 租车信息类（取车/还车共用）
     */
    @Data
    @Schema(description = "租车信息类")
    public static class RentalInfo {
        
        @Schema(description = "日期时间")
        private String datetime;
        
        @Schema(description = "城市ID")
        private Integer cityId;
        
        @Schema(description = "位置编码")
        private String locationCode;
        
        @Schema(description = "位置类型")
        private Integer locationType;
        
        @Schema(description = "位置名称")
        private String locationName;
        
        @Schema(description = "POI信息")
        private POI poi;
    }
    
    /**
     * POI位置信息类
     */
    @Data
    @Schema(description = "POI位置信息类")
    public static class POI {
        
        @Schema(description = "纬度")
        private Double latitude;
        
        @Schema(description = "经度")
        private Double longitude;
    }
    
    /**
     * 供应商类
     */
    @Data
    @Schema(description = "供应商类")
    public static class Supplier {
        
        @Schema(description = "静态供应商信息")
        private StaticSupplier staticSupplier;
        
        @Schema(description = "车辆可用价格列表")
        private List<VehAvailRate> vehAvailRates;
    }
    
    /**
     * 静态供应商信息类
     */
    @Data
    @Schema(description = "静态供应商信息类")
    public static class StaticSupplier {
        
        @Schema(description = "供应商ID")
        private String id;
        
        @Schema(description = "供应商代码")
        private String code;
        
        @Schema(description = "供应商名称")
        private String name;
        
        @Schema(description = "供应商描述")
        private String description;
        
        @Schema(description = "Logo URL")
        private String logoUrl;
    }
    
    /**
     * 车辆可用价格类
     */
    @Data
    @Schema(description = "车辆可用价格类")
    public static class VehAvailRate {
        
        @Schema(description = "车辆ID")
        private Integer vehId;
        
        @Schema(description = "参考信息")
        private ReferenceInfo referenceInfo;
        
        @Schema(description = "是否特色车")
        private Boolean isSpecilized;
        
        @Schema(description = "是否有空调")
        private Boolean hasAirCondition;
        
        @Schema(description = "取车门店代码")
        private String pickupStoreCode;
        
        @Schema(description = "还车门店代码")
        private String dropoffStoreCode;
        
        @Schema(description = "是否需要航班号")
        private Boolean needFlightNo;
        
        @Schema(description = "原始货币代码")
        private String originalCurrencyCode;
        
        @Schema(description = "目标货币代码")
        private String targetCurrencyCode;
        
        @Schema(description = "总费用")
        private AmountInfo totalCharge;
        
        @Schema(description = "费用明细列表")
        private List<Charge> charges;
        
        @Schema(description = "确认政策")
        private ConfirmPolicy confirmPolicy;
        
        @Schema(description = "取消政策")
        private CancelPolicy cancelPolicy;
        
        @Schema(description = "是否取车上门服务")
        private Boolean isPickupDoorToDoor;
        
        @Schema(description = "是否还车上门服务")
        private Boolean isDropoffDoorToDoor;
        
        @Schema(description = "日租费用")
        private AmountInfo dailyCharge;
        
        @Schema(description = "车辆条款列表")
        private List<VehicleTerm> vehicleTerms;
        
        @Schema(description = "押金列表")
        private List<Deposit> deposits;
        
        @Schema(description = "免押类型")
        private Integer freeDepositType;
        
        @Schema(description = "取还车信息")
        private PickupReturnInfo pickupReturnInfo;
        
        @Schema(description = "促销列表")
        private List<String> promotions;
        
        @Schema(description = "是否支持后期免押")
        private Boolean supportPostFreeDeposit;
        
        @Schema(description = "是否支持门店免押")
        private Boolean supportStoreFreeDeposit;
        
        @Schema(description = "车牌标签")
        private String licenceTag;
        
        @Schema(description = "是否自营")
        private Boolean isSelf;
    }
    
    /**
     * 参考信息类
     */
    @Data
    @Schema(description = "参考信息类")
    public static class ReferenceInfo {
        
        @Schema(description = "参考ID")
        private String id;
        
        @Schema(description = "时间戳")
        private String timestamp;
    }
    
    /**
     * 金额信息类
     */
    @Data
    @Schema(description = "金额信息类")
    public static class AmountInfo {
        
        @Schema(description = "原始金额")
        private Integer originalAmount;
        
        @Schema(description = "目标金额")
        private Integer targetAmount;
    }
    
    /**
     * 费用明细类
     */
    @Data
    @Schema(description = "费用明细类")
    public static class Charge {
        
        @Schema(description = "费用类型")
        private Integer type;
        
        @Schema(description = "费用代码")
        private String code;
        
        @Schema(description = "费用名称")
        private String name;
        
        @Schema(description = "支付方式")
        private Integer payMode;
        
        @Schema(description = "费用描述")
        private String description;
        
        @Schema(description = "原始金额")
        private Integer originalAmount;
        
        @Schema(description = "目标金额")
        private Integer targetAmount;
        
        @Schema(description = "是否包含在报价中")
        private Boolean isIncludedInRate;
    }
    
    /**
     * 确认政策类
     */
    @Data
    @Schema(description = "确认政策类")
    public static class ConfirmPolicy {
        // 空对象，可根据实际需要添加字段
    }
    
    /**
     * 取消政策类
     */
    @Data
    @Schema(description = "取消政策类")
    public static class CancelPolicy {
        
        @Schema(description = "是否免费取消")
        private Boolean freeToCancel;
        
        @Schema(description = "免费取消日期")
        private String freeCancelDate;
    }
    
    /**
     * 车辆条款类
     */
    @Data
    @Schema(description = "车辆条款类")
    public static class VehicleTerm {
        
        @Schema(description = "条款类型")
        private Integer type;
        
        @Schema(description = "条款文本")
        private String text;
    }
    
    /**
     * 押金类
     */
    @Data
    @Schema(description = "押金类")
    public static class Deposit {
        
        @Schema(description = "押金类型")
        private Integer type;
        
        @Schema(description = "押金代码")
        private String code;
        
        @Schema(description = "押金名称")
        private String name;
        
        @Schema(description = "押金金额")
        private Integer amount;
    }
    
    /**
     * 取还车信息类
     */
    @Data
    @Schema(description = "取还车信息类")
    public static class PickupReturnInfo {
        
        @Schema(description = "取车服务类型")
        private Integer pickupServiceType;
        
        @Schema(description = "还车服务类型")
        private Integer returnServiceType;
        
        @Schema(description = "取车服务描述")
        private String pickupServiceDesc;
        
        @Schema(description = "还车服务描述")
        private String returnServiceDesc;
    }
}