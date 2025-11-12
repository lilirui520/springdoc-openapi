package request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "SaaS内部请求参数")
public class SaasInternalRequest {

    @Schema(description = "渠道ID")
    private Integer channelId;

    @Schema(description = "原始请求信息")
    private OriginReq originReq;

    @Schema(description = "取车日期")
    private String pickUpDate;

    @Schema(description = "取车地点")
    private Point pickUpPoint;

    @Schema(description = "还车日期")
    private String returnDate;

    @Schema(description = "还车地点")
    private Point returnPoint;

    @Schema(description = "门店对列表")
    private List<StorePair> storePairList;

    @Schema(description = "是否使用服务圈")
    private Integer useServiceCircle;

    @Data
    @Schema(description = "原始请求信息")
    public static class OriginReq {
        @Schema(description = "请求ID")
        private String requestId;

        @Schema(description = "取车日期")
        private String pickupDate;

        @Schema(description = "还车日期")
        private String returnDate;

        @Schema(description = "门店列表")
        private List<StoreInfo> storeList;

        @Schema(description = "取车上门地址")
        private Address pickupOndoorAddr;

        @Schema(description = "还车上门地址")
        private Address pickoffOndoorAddr;

        @Schema(description = "取车纬度")
        private Double pickUpLatitude;

        @Schema(description = "取车经度")
        private Double pickUpLongitude;

        @Schema(description = "还车纬度")
        private Double pickOffLatitude;

        @Schema(description = "还车经度")
        private Double pickOffLongitude;

        @Schema(description = "价格渠道")
        private Integer priceChannel;
    }

    @Data
    @Schema(description = "门店信息")
    public static class StoreInfo {
        @Schema(description = "取车城市代码")
        private String pickupCityCode;

        @Schema(description = "还车城市代码")
        private String returnCityCode;

        @Schema(description = "取车门牌号")
        private String pickupStoreCode;

        @Schema(description = "还车门牌号")
        private String returnStoreCode;

        @Schema(description = "取车门店服务圈ID列表")
        private List<Integer> pickUpStoreServiceCircleIdList;

        @Schema(description = "还车门店服务圈ID列表")
        private List<Integer> returnStoreServiceCircleIdList;
    }

    @Data
    @Schema(description = "地址信息")
    public static class Address {
        @Schema(description = "地址")
        private String address;

        @Schema(description = "经度")
        private Double longitude;

        @Schema(description = "纬度")
        private Double latitude;
    }

    @Data
    @Schema(description = "坐标点")
    public static class Point {
        @Schema(description = "纬度")
        private Double latitude;

        @Schema(description = "经度")
        private Double longitude;
    }

    @Data
    @Schema(description = "门店对")
    public static class StorePair {
        @Schema(description = "ID")
        private Integer id;

        @Schema(description = "取车门店")
        private Store pickUpStore;

        @Schema(description = "还车门店")
        private Store returnStore;
    }

    @Data
    @Schema(description = "门店信息")
    public static class Store {
        @Schema(description = "是否24小时营业")
        private Integer allDay;

        @Schema(description = "城市代码")
        private String cityCode;

        @Schema(description = "门店ID")
        private Integer id;

        @Schema(description = "服务圈ID列表")
        private List<Integer> serviceCircleIdList;
    }
}