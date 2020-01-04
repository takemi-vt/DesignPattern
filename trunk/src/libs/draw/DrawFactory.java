package libs.draw;

public class DrawFactory {
	
	/**
	 * 描画クラスインスタンスを作成してインスタンスを取得する
	 * @param objectName
	 * @return
	 */
	public static DrawObject factory( String objectName ) {
		DrawObject tmp = null;
		
		switch( objectName ) {
			case "Label":
				tmp = new Label();
				break;
				
			case "Text":
				tmp = new Text();
				break;
				
			default:
				tmp = new DrawObject();
		}
		
		//　必要であればクラスの初期化処理を行う
		
		return tmp;
	}
}
