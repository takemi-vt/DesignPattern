package Libs;

public class List {
	/**
	 * æ“ª‚Ì—v‘f
	 */
	protected Iterator top;
	/**
	 * ÅŒã‚Ì—v‘f
	 */
	protected Iterator last;
	
	public List() {
		top = null;
	}
	
	/**
	 * ÅŒã‚É—v‘f‚ğ’Ç‰Á
	 * @param it
	 */
	public void add( Iterator it ) {
		if( top == null ) {
			top = it;
			last= it;
		} else {
			Iterator tmp = top;
			
			//ÅŒã‚Ì—v‘f‚ğæ“¾‚·‚é
			while( tmp.hasNext() ) tmp = tmp.getNext();
			
			tmp.setNext( it );
			last = it;
		}
	}
	
	/**
	 * index”Ô–Ú‚É—v‘f‚ğ’Ç‰Á
	 * @param index
	 * @param it
	 */
	public void insert( int index, Iterator it ) {
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
	 * index”Ô–Ú‚Ì—v‘f‚ğíœ
	 * @param index
	 */
	public void remove( int index ) {
		if( top == null ) return ;
		
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
	 * index”Ô–Ú‚Ì—v‘f‚ğæ“¾
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
}