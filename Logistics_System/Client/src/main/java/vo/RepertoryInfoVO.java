/**
 * 2015年10月23日
 *author:
 *description:仓库信息类 用于库存盘点使用
 */
package vo;

/**
 * @author 谭期友
 *
 */
public class RepertoryInfoVO {
	 
		/**
		 * 仓库号
		 */
		private String id;
		/**
		 * 区
		 */
		private String areaNumber;
		/**
		 * 排
		 */
		private String rowNumber;
		/**
		 * 架
		 */
		private String frameNumber;
		/**
		 * 位
		 */
		private String placeNumber;
		/**
		 * 订单号
		 */
		private String orderId;
		public String getId() {
			return id;
		}
		public String getAreaNumber() {
			return areaNumber;
		}
		public String getRowNumber() {
			return rowNumber;
		}
		public String getFrameNumber() {
			return frameNumber;
		}
		public String getPlaceNumber() {
			return placeNumber;
		}
		public String getOrderId() {
			return orderId;
		}
		public RepertoryInfoVO(String id, String areaNumber, String rowNumber,
				String frameNumber, String placeNumber, String orderId) {
			super();
			this.id = id;
			this.areaNumber = areaNumber;
			this.rowNumber = rowNumber;
			this.frameNumber = frameNumber;
			this.placeNumber = placeNumber;
			this.orderId = orderId;
		}
		

}
