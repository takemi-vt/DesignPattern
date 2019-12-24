package Libs;

public class Iterator {
	protected int _id;
	protected static int max_id = 0;
	/**
	 * コンストラクタ
	 */
	public Iterator() {
		_id = max_id++;
		next = null;
	}
	
	/**
	 * IDを取得
	 * @return int
	 */
	public int getId() {
		return _id;
	}
	
	/**
	 * 次の参照子を取得
	 * @return
	 */
	public Iterator getNext() {
		return next;
	}
	
	/**
	 * 次の参照子をセット
	 * @param it
	 */
	public void setNext( Iterator it ) {
		next = it;
	}
	
	/**
	 * 次の参照子があるかを取得
	 * @return　boolean
	 */
	public boolean hasNext() {
		return next != null;
	}
	
	/**
	 * 次の要素の参照子
	 */
	protected Iterator next;
}