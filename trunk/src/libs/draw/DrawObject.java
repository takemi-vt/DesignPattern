package libs.draw;

import libs.Iterator;

/**
 * 描画オブジェクトクラスの基底クラス
 * @author Takemi
 */
public class DrawObject extends Iterator {
	
		/**
	 * 描画開始X座標
	 */
	public int x;
	
	/**
	 * 描画開始Y座標
	 */
	public int y;
	
	/**
	 * 描画エリア幅
	 */
	public int width;
	
	/**
	 * 描画エリア高さ
	 */
	public int height;
	
	/**
	 * 描画フラグ
	 */
	public boolean drawFlag = true;
	
	protected String objectType;
	
	/**
	 * コンストラクタ
	 */
	public DrawObject() {
		super();
		x = 0;
		y = 0;
		width = 0;
		height= 0;
		objectType = "DrawObject";
	}
	
	public int getRight() { return x + width; }
	public int getLeft() { return x ; }
	public int getTop() { return y; }
	public int getBottom() { return y + height; }
	
	/**
	 * IF関数
	 */
	public void Render() {
		if( !drawFlag ) return;
		Draw();
	}
	
	/**
	 * 継承先で描画処理を実装
	 */
	protected void Draw() {
		System.out.println("DrawObject Draw関数: ID " + _id );
	}
}
