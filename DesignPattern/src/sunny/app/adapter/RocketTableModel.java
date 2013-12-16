/**
* File name£º RocketTableModel.java
* Author£º        wangpj
* Create Date£º 2013-12-11
* Description:
* 
 */

package sunny.app.adapter;

import javax.swing.table.AbstractTableModel;

import com.oozinoz.firework.Rocket;

/**
 * @author wangpj
 *
 */
public class RocketTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	
	private Rocket[] rockets;
	private String[] columnNames = new String[]{"name", "Price", "Apogee"};
	
	public RocketTableModel(Rocket[] rockets){
		this.rockets = rockets;
	}
	
	
	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	@Override
	public int getRowCount() {
		return rockets.length;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	/* (non-Javadoc)
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return rockets[rowIndex].getName();
		case 1:
			return rockets[rowIndex].getPrice();
		case 2:
			return rockets[rowIndex].getApogee();
		default:
			return null;
		}
	}

}
