package libs;

/**
 * シングルトンパターンクラス
 * @author Takemi
 */
public class Singleton {
	protected static Singleton instance = null;
	protected static int max_id = 0;
	protected int id;
	/**
	 * コンストラクタ
	 */
	private Singleton() {
		id = GetID();
	}
	
	/*
	public static void Delete() {
		fooInstance = null;
	}
	*/
	protected static int GetID() {
		return ++ max_id;
	}
	
	/**
	 *  インスタンス取得
	 * @return
	 */
	public static Singleton getInstance() {
		if( instance == null ) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void Debug() {
		System.out.println("Singleton instance id :" + id );
	}
}
