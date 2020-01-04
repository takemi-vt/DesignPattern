package libs.draw;

import libs.List;

/**
 * ドキュメント
 * @author Takemi
 */
public class Document {
	protected List items = null;
	
	public Document() {
		items = new List();
		items.add( DrawFactory.factory("Label") );
		items.add( DrawFactory.factory("Text") );
		
		DrawObject tmp = (DrawObject) items.get(1);
		tmp.drawFlag = false;
	}
	
	/**
	 * 仮処理　描画処理
	 */
	public void Render() {
		for( int n = 0 ; n < items.Size(); n ++ ) {
			DrawObject tmp = (DrawObject)items.get(n);
			tmp.Render();
		}
	}
}
