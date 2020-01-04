package libs;

/**
 * 片方向リストクラス
 * @author Takemi
 */
public class List {
	/**
	 * 先頭の要素
	 */
	protected Iterator top;
	/**
	 * 最後の要素
	 */
	protected Iterator last;
	
	protected int length = 0;
	
	public List() {
		top = null;
		length = 0;
	}
	
	/**
	 * 最後に要素を追加
	 * @param it
	 */
	public void add( Iterator it ) {
		length ++;
		if( top == null ) {
			top = it;
			last= it;
		} else {
			Iterator tmp = top;
			
			//最後の要素を取得する
			while( tmp.hasNext() ) tmp = tmp.getNext();
			
			tmp.setNext( it );
			last = it;
		}
	}
	
	/**
	 * index番目に要素を追加
	 * @param index
	 * @param it
	 */
	public void insert( int index, Iterator it ) {
		length ++;
		if( index < 0 ) {
			Iterator tmp = top;
			top = it;
			it.setNext(tmp);
			return;
		}
		
		Iterator tmp = get(index);
		if( tmp == null ) {
			last.setNext(it);
			last = it;
			return;
		}
		
		Iterator next = tmp.getNext();
		tmp.setNext(it);
		it.setNext( next );
		// [1]->next [2]->next [it]->next [3]->next
	}
	
	/**
	 * index番目の要素を削除
	 * @param index
	 */
	public void remove( int index ) {
		
		if( top == null ) return ;
		length --;
		
		if( index == 0 ) {
			if( !top.hasNext() ) {
				top = null;
				return;
			}
			Iterator tmp = top.getNext();
			top = null;
			top = tmp;
			return;
		}
		Iterator tmp = top;
		Iterator befor= null;
		for( int n = 0; n < index; n ++ ) {
			if( tmp == null ) return;
			
			befor = tmp;
			tmp = tmp.getNext();
		}
		Iterator next = tmp.getNext();
		tmp = null;
		befor.setNext(next);
		// [1]->next [2]->next [3]->next
	}
	
	/**
	 * index番目の要素を取得
	 * @param index
	 * @return
	 */
	public Iterator get( int index ) {
		Iterator ret = top;
		if( index == 0 ) return top;
		for( int n = 0; n < index; n ++ ) {
			if( ret == null ) return null;
			ret = ret.getNext();
		}
		return ret;
	}
	
	/**
	 * 配列の長さを取得
	 * @return
	 */
	public int Size() { return length; }
}