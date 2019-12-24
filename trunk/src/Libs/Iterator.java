package Libs;

public class Iterator {
	protected int _id;
	protected static int max_id = 0;
	/**
	 * �R���X�g���N�^
	 */
	public Iterator() {
		_id = max_id++;
		next = null;
	}
	
	/**
	 * ID���擾
	 * @return int
	 */
	public int getId() {
		return _id;
	}
	
	/**
	 * ���̎Q�Ǝq���擾
	 * @return
	 */
	public Iterator getNext() {
		return next;
	}
	
	/**
	 * ���̎Q�Ǝq���Z�b�g
	 * @param it
	 */
	public void setNext( Iterator it ) {
		next = it;
	}
	
	/**
	 * ���̎Q�Ǝq�����邩���擾
	 * @return�@boolean
	 */
	public boolean hasNext() {
		return next != null;
	}
	
	/**
	 * ���̗v�f�̎Q�Ǝq
	 */
	protected Iterator next;
}