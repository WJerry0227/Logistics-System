package vo;

import java.util.ArrayList;

import utility.CheckType;
import utility.GoodsState;



/**
 * @author 这菜咸了
 *营业厅到达单
 */
public class HallArrivalListVO extends ListVO{
	private String id;
	/**
	 * 到达日期
	 */
	private String date;

	/**
	 * 中转单编号（装车单编号）
	 */
	private String TransferNumber;
	
	/**
	 * 出发地
	 */
	private String from;
	
	/**
	 * 到达状态
	 */
	private GoodsState state;

	/**
	 * 货物托运条形码
	 */
	private ArrayList<String> barCodes;

	public HallArrivalListVO(String id,String date, String transferNumber, String from, GoodsState state,
			ArrayList<String> barCodes,CheckType type) {
		super();
		this.id=id;
		this.date = date;
		TransferNumber = transferNumber;
		this.from = from;
		this.state = state;
		this.barCodes = barCodes;
		this.setCheckType(type);
	}

	public String getDate() {
		return date;
	}

	public String getTransferNumber() {
		return TransferNumber;
	}

	public String getFrom() {
		return from;
	}

	public GoodsState getState() {
		return state;
	}

	public ArrayList<String> getBarCodes() {
		return barCodes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

